package com.jlkj.web.shopnew.pojo.entity;

import cc.s2m.web.utils.webUtils.pojo.BaseModelBean;
import org.springframework.format.annotation.DateTimeFormat;

public class StaffEntity extends BaseModelBean {
    private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer companyId;
	private String staffName;
	private String staffPosition;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date createTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date updateTime;
	
    public Integer getId() {
        return id;
    }
	public StaffEntity setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getCompanyId() {
        return companyId;
    }
	public StaffEntity setCompanyId(Integer companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getStaffName() {
        return staffName;
    }
	public StaffEntity setStaffName(String staffName) {
        this.staffName = staffName;
        return this;
    }
    public String getStaffPosition() {
        return staffPosition;
    }
	public StaffEntity setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
        return this;
    }
    public java.util.Date getCreateTime() {
        return createTime;
    }
	public StaffEntity setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }
    public java.util.Date getUpdateTime() {
        return updateTime;
    }
	public StaffEntity setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}