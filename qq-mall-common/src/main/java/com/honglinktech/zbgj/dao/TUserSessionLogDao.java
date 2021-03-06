package com.honglinktech.zbgj.dao;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.TUserSessionLog;
/**
*登录日志表Dao
**/
@Component
public class TUserSessionLogDao extends BaseDao<TUserSessionLog>{
	
	public Object[] getDBMapping(String filedName){
		for(TUserSessionLog.DBMaping d:TUserSessionLog.DBMaping.values()){
			if(d.toString().equals(filedName)){
				TUserSessionLog.DBMaping dbMaping = TUserSessionLog.DBMaping.valueOf(filedName);
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
	protected RowMapper<TUserSessionLog> getRowMapper() {
		return new TUserSessionLog.TUserSessionLogRowMapper();
	}
	
}
