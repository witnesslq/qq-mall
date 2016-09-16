package com.honglinktech.zbgj.entity;

import com.honglinktech.zbgj.base.BaseEntity;
import com.honglinktech.zbgj.annotation.FieldMeta;
import java.io.Serializable;
import java.math.BigDecimal; 

import java.util.Date; 


/**
*订单详情
**/
public class TOrderItem extends BaseEntity implements Serializable{

	@FieldMeta(primaryKey = true,fieldName = "订单项Id",dbName = "id",length = 10,allowNull=false)
	private Integer id=null;
	@FieldMeta(primaryKey = false,fieldName = "主订单ID",dbName = "order_id",length = 10,allowNull=false)
	private Integer orderId=null;
	@FieldMeta(primaryKey = false,fieldName = "产品单品ID",dbName = "goods_id",length = 10,allowNull=false)
	private Integer goodsId=null;
	@FieldMeta(primaryKey = false,fieldName = "单品名称",dbName = "goods_name",length = 64,allowNull=false)
	private String goodsName=null;
	@FieldMeta(primaryKey = false,fieldName = "",dbName = "goods_img",length = 128,allowNull=true)
	private String goodsImg=null;
	@FieldMeta(primaryKey = false,fieldName = "规格ID",dbName = "format_id",length = 10,allowNull=true)
	private Integer formatId=null;
	@FieldMeta(primaryKey = false,fieldName = "商品规格名称",dbName = "format_name",length = 100,allowNull=true)
	private String formatName=null;
	@FieldMeta(primaryKey = false,fieldName = "购买数量",dbName = "number",length = 10,allowNull=true)
	private Integer number=null;
	@FieldMeta(primaryKey = false,fieldName = "成交价格",dbName = "price",length = 10,allowNull=true)
	private BigDecimal price=null;
	@FieldMeta(primaryKey = false,fieldName = "市场价格",dbName = "market_price",length = 10,allowNull=true)
	private BigDecimal marketPrice=null;
	@FieldMeta(primaryKey = false,fieldName = "备注",dbName = "remark",length = 225,allowNull=true)
	private String remark=null;
	@FieldMeta(primaryKey = false,fieldName = "是否已经评论(0未评论,1已评论)",dbName = "dis_is",length = 10,allowNull=true)
	private Integer disIs=null;
	@FieldMeta(primaryKey = false,fieldName = "修改时间",dbName = "update_time",length = 19,allowNull=true)
	private Date updateTime=null;
	@FieldMeta(primaryKey = false,fieldName = "创建时间",dbName = "create_time",length = 19,allowNull=true)
	private Date createTime=null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TOrderItem(){
 	}
 	public TOrderItem(Integer id,Integer orderId,Integer goodsId,String goodsName,String goodsImg,Integer formatId,String formatName,Integer number,BigDecimal price,BigDecimal marketPrice,String remark,Integer disIs){
 		this.id = id;
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsImg = goodsImg;
		this.formatId = formatId;
		this.formatName = formatName;
		this.number = number;
		this.price = price;
		this.marketPrice = marketPrice;
		this.remark = remark;
		this.disIs = disIs;
		
 	}
 	
		/*订单项Id*/
	public Integer getId(){
		 return this.id; 
	}
	public void setId(Integer id){
		  this.id = id; 
	}
	/*主订单ID*/
	public Integer getOrderId(){
		 return this.orderId; 
	}
	public void setOrderId(Integer orderId){
		  this.orderId = orderId; 
	}
	/*产品单品ID*/
	public Integer getGoodsId(){
		 return this.goodsId; 
	}
	public void setGoodsId(Integer goodsId){
		  this.goodsId = goodsId; 
	}
	/*单品名称*/
	public String getGoodsName(){
		 return this.goodsName; 
	}
	public void setGoodsName(String goodsName){
		  this.goodsName = goodsName; 
	}
	/**/
	public String getGoodsImg(){
		 return this.goodsImg; 
	}
	public void setGoodsImg(String goodsImg){
		  this.goodsImg = goodsImg; 
	}
	/*规格ID*/
	public Integer getFormatId(){
		 return this.formatId; 
	}
	public void setFormatId(Integer formatId){
		  this.formatId = formatId; 
	}
	/*商品规格名称*/
	public String getFormatName(){
		 return this.formatName; 
	}
	public void setFormatName(String formatName){
		  this.formatName = formatName; 
	}
	/*购买数量*/
	public Integer getNumber(){
		 return this.number; 
	}
	public void setNumber(Integer number){
		  this.number = number; 
	}
	/*成交价格*/
	public BigDecimal getPrice(){
		 return this.price; 
	}
	public void setPrice(BigDecimal price){
		  this.price = price; 
	}
	/*市场价格*/
	public BigDecimal getMarketPrice(){
		 return this.marketPrice; 
	}
	public void setMarketPrice(BigDecimal marketPrice){
		  this.marketPrice = marketPrice; 
	}
	/*备注*/
	public String getRemark(){
		 return this.remark; 
	}
	public void setRemark(String remark){
		  this.remark = remark; 
	}
	/*是否已经评论(0未评论,1已评论)*/
	public Integer getDisIs(){
		 return this.disIs; 
	}
	public void setDisIs(Integer disIs){
		  this.disIs = disIs; 
	}
	/*修改时间*/
	public Date getUpdateTime(){
		 return this.updateTime; 
	}
	public void setUpdateTime(Date updateTime){
		  this.updateTime = updateTime; 
	}
	/*创建时间*/
	public Date getCreateTime(){
		 return this.createTime; 
	}
	public void setCreateTime(Date createTime){
		  this.createTime = createTime; 
	}

}
