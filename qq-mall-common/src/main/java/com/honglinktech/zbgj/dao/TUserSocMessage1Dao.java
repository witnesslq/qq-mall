package com.honglinktech.zbgj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.TUserSocMessage1;
/**
*Dao
**/
@Component
public class TUserSocMessage1Dao extends BaseDao<TUserSocMessage1>{
	public enum DBMaping{
		tableName("t_user_soc_message_1",0,false,false,false),
		id("id",Types.INTEGER,true,true,false),
		societyNoteId("society_note_id",Types.INTEGER,false,false,true),
		userId("user_id",Types.INTEGER,false,false,false),
		type("type",Types.INTEGER,false,false,true),
		content("content",Types.VARCHAR,false,false,true),
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
	
	public class TUserSocMessage1RowMapper implements RowMapper<TUserSocMessage1> {  
        @Override  
        public TUserSocMessage1 mapRow(ResultSet rs, int rowNum) throws SQLException {  

			TUserSocMessage1 tUserSocMessage1 = new TUserSocMessage1();
			tUserSocMessage1.setId(rs.getInt("id"));
			tUserSocMessage1.setSocietyNoteId(rs.getInt("society_note_id"));
			tUserSocMessage1.setUserId(rs.getInt("user_id"));
			tUserSocMessage1.setType(rs.getInt("type"));
			tUserSocMessage1.setContent(rs.getString("content"));
			tUserSocMessage1.setCreateTime(rs.getTimestamp("create_time"));
			tUserSocMessage1.setUpdateTime(rs.getTimestamp("update_time"));
			return tUserSocMessage1; 
        }  
          
    }  
	@Override
	protected RowMapper<TUserSocMessage1> getRowMapper() {
		return new TUserSocMessage1RowMapper();
	}
}
