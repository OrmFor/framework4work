package com.jlkj.web.shopnew.pojo.entity;

import cc.s2m.web.utils.webUtils.pojo.BaseModelBean;
import org.springframework.format.annotation.DateTimeFormat;

public class CustomerEntity extends BaseModelBean {
    private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer customerId;
	private String belongUid;
	private Boolean customerType;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date updateTime;
	
    public Integer getId() {
        return id;
    }
	public CustomerEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getCustomerId() {
        return customerId;
    }
	public CustomerEntity setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getBelongUid() {
        return belongUid;
    }
	public CustomerEntity setBelongUid(String belongUid) {
        this.belongUid = belongUid;
        return this;
    }
    public Boolean getCustomerType() {
        return customerType;
    }
	public CustomerEntity setCustomerType(Boolean customerType) {
        this.customerType = customerType;
        return this;
    }
    public java.util.Date getCreateTime() {
        return createTime;
    }
	public CustomerEntity setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }
    public java.util.Date getUpdateTime() {
        return updateTime;
    }
	public CustomerEntity setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}