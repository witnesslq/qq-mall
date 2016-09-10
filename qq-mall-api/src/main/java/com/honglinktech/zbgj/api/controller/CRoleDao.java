package com.honglinktech.zbgj.api.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.honglinktech.zbgj.base.BaseDao;
import com.honglinktech.zbgj.entity.CRole;
/**
*系统角色表Dao
**/
@Component
public class CRoleDao extends BaseDao<CRole>{
	public enum DBMaping{
		tableName("c_role",0,false,false,false),
		id("id",Types.INTEGER,true,true,false),
		type("type",Types.INTEGER,false,false,true),
		name("name",Types.VARCHAR,false,false,true),
		description("description",Types.VARCHAR,false,false,true);
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
	
	public class CRoleRowMapper implements RowMapper<CRole> {  
        @Override  
        public CRole mapRow(ResultSet rs, int rowNum) throws SQLException {  

			CRole cRole = new CRole();
			cRole.setId(rs.getInt("id"));
			cRole.setType(rs.getInt("type"));
			cRole.setName(rs.getString("name"));
			cRole.setDescription(rs.getString("description"));
			return cRole; 
        }  
          
    }  
	@Override
	protected RowMapper<CRole> getRowMapper() {
		return new CRoleRowMapper();
	}
}
