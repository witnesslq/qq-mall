package com.honglinktech.zbgj.dao;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.TSocietyReward;
/**
*社区打赏Dao
**/
@Component
public class TSocietyRewardDao extends BaseDao<TSocietyReward>{
	
	public Object[] getDBMapping(String filedName){
		for(TSocietyReward.DBMaping d:TSocietyReward.DBMaping.values()){
			if(d.toString().equals(filedName)){
				TSocietyReward.DBMaping dbMaping = TSocietyReward.DBMaping.valueOf(filedName);
				Object[] values = {dbMaping.getDbName(),dbMaping.getDbType(),dbMaping.getPrimaryKey(),dbMaping.isAotuIn(),dbMaping.isAllowNull()};
				return values;
			}
		}
		return null;
	}
	@Resource
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		super.jdbcTemplate = jdbcTemplate;
	}
	public JdbcTemplate jdbcTemplate(){
		return jdbcTemplate;
	}
	 
	@Override
	protected RowMapper<TSocietyReward> getRowMapper() {
		return new TSocietyReward.TSocietyRewardRowMapper();
	}
	
}
