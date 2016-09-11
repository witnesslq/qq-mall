package com.honglinktech.zbgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.TSocietySubUser;
/**
*用户关注的主题Dao
**/
@Component
public class TSocietySubUserDao extends BaseDao<TSocietySubUser>{
	public enum DBMaping{
		tableName("t_society_sub_user",0,false,false,false),
		societySubjectId("society_subject_id",Types.INTEGER,true,true,false),
		userId("user_id",Types.INTEGER,true,false,false),
		val("val",Types.INTEGER,false,false,true),
		type("type",Types.INTEGER,false,false,true),
		createTime("create_time",Types.TIMESTAMP,false,false,true),
		updateTime("update_time",Types.TIMESTAMP,false,false,true);
		private String dbName;
		private int dbType;
		private boolean primaryKey;
		private boolean isAotuIn;
		private boolean isAllowNull;
	    public String getDbName(){
	    	 return this.dbName;
	    }
	    public int getDbType(){
	    	 return this.dbType;
	    }
	    public boolean getPrimaryKey(){
	    	 return this.primaryKey;
	    }
	    public boolean isAotuIn(){
	    	 return this.isAotuIn;
	    }
	    public boolean isAllowNull(){
	    	 return this.isAllowNull;
	    }
	    private DBMaping(String dbName,int dbType,boolean primaryKey,boolean isAotuIn,boolean isAllowNull){
	    	 this.dbName = dbName;
	    	 this.dbType = dbType;
	    	 this.primaryKey = primaryKey;
	    	 this.isAotuIn = isAotuIn;
	    	 this.isAllowNull = isAllowNull;
	    }
	}
	public Object[] getDBMapping(String filedName){
		for(DBMaping d:DBMaping.values()){
			if(d.toString().equals(filedName)){
				DBMaping dbMaping = DBMaping.valueOf(filedName);
				Object[] values = {dbMaping.dbName,dbMaping.dbType,dbMaping.primaryKey,dbMaping.isAotuIn,dbMaping.isAllowNull};
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
	
	public class TSocietySubUserRowMapper implements RowMapper<TSocietySubUser> {  
        @Override  
        public TSocietySubUser mapRow(ResultSet rs, int rowNum) throws SQLException {  

			TSocietySubUser tSocietySubUser = new TSocietySubUser();
			tSocietySubUser.setSocietySubjectId(rs.getInt("society_subject_id"));
			tSocietySubUser.setUserId(rs.getInt("user_id"));
			tSocietySubUser.setVal(rs.getInt("val"));
			tSocietySubUser.setType(rs.getInt("type"));
			tSocietySubUser.setCreateTime(rs.getTimestamp("create_time"));
			tSocietySubUser.setUpdateTime(rs.getTimestamp("update_time"));
			return tSocietySubUser; 
        }  
          
    }  
	@Override
	protected RowMapper<TSocietySubUser> getRowMapper() {
		return new TSocietySubUserRowMapper();
	}
}