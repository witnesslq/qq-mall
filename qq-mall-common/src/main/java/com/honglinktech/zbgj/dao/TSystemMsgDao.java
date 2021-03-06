package com.honglinktech.zbgj.dao;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.TSystemMsg;
/**
*系统消息Dao
**/
@Component
public class TSystemMsgDao extends BaseDao<TSystemMsg>{
	
	public Object[] getDBMapping(String filedName){
		for(TSystemMsg.DBMaping d:TSystemMsg.DBMaping.values()){
			if(d.toString().equals(filedName)){
				TSystemMsg.DBMaping dbMaping = TSystemMsg.DBMaping.valueOf(filedName);
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
	protected RowMapper<TSystemMsg> getRowMapper() {
		return new TSystemMsg.TSystemMsgRowMapper();
	}
	
}
