package com.msp.bo;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * MSPAttributes.java
 * 
 * Bean class which includes all the attributs of Accruals
 * @author Arun.Verma
 *
 */

@Entity
@Table(name="combinedaccruals")
public class MSPAttributes {
	
	@Id
	@GeneratedValue
	@Column(name="index", unique=true, nullable=false)
	private int id;
	
	@Column(name="resourceId",nullable=false)
	private int resourceId;
	
	@Column(name="modified")
	private String modified;
	
	@Column(name="resourceName",nullable=false)
	private String resourceName;
	
	@Column(name="resourceType",nullable=false)
	private String resourceType;
	
	@Column(name="role",nullable=false)
	private String role;
	
	@Column(name="rate",nullable=false)
	private int rate;
	
	@Column(name="projectId",nullable=false)
	private String projectId;
	
	@Column(name="projectName")
	private String projectName;
	
	@Column(name="projectType",nullable=false)
	private String projectType;
	
	@Column(name="accountManager",nullable=false)
	private String accountManager;
	
	@Column(name="trackName",nullable=false)
	private String trackName;
	
	@Column(name="trackManager",nullable=false)
	private String trackManager;
	
	@Column(name="domain",nullable=false)
	private String domain;
	
	@Column(name="weekNum",nullable=false)
	private int weekNum;
	
	@Column(name="weekEnd",nullable=true)
	private String weekEnd;
	
	@Column(name="hours",nullable=true)
	private int hours;
	
	@Column(name="amount",nullable=false)
	private int amount;
	
	@Column(name="costCenter",nullable=false)
	private int costCenter;
	
	@Column(name="vendorName",nullable=false)
	private String vendorName;
	
	@Column(name="accountType",nullable=false)
	private String accountType;
	
	@Column(name="account",nullable=false)
	private int account;
	
	@Column(name="period",nullable=false)
	private Date period;
	
	@Column(name="vendorNumber",nullable=false)
	private int vendorNumber;
	
	@Column(name="vendorSite",nullable=false)
	private String vendorSite;
	
	@Column(name="PO",nullable=false)
	private int PO;
	
	@Column(name="invoiceNumber",nullable=false)
	private int invoiceNumber;
	
	@Column(name="invoiceDate",nullable=false)
	private Date invoiceDate;
	
	@Column(name="changeWorkOrderNumber",nullable=false)
	private String changeWorkOrderNumber;
	
	@Column(name="comments",nullable=false)
	private String comments;
	
	@Column(name="reviewed",nullable=false)
	private String reviewed;
	
	@Column(name="reviewedBy",nullable=false)
	private String reviewedBy;
	
	@Column(name="DateReviewed",nullable=false)
	private Date reviewDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getAccountManager() {
		return accountManager;
	}
	public void setAccountManager(String accountManager) {
		this.accountManager = accountManager;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getTrackManager() {
		return trackManager;
	}
	public void setTrackManager(String trackManager) {
		this.trackManager = trackManager;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getWeekNum() {
		return weekNum;
	}
	public void setWeekNum(int weekNum) {
		this.weekNum = weekNum;
	}
	public String getWeekEnd() {
		return weekEnd;
	}
	public void setWeekEnd(String weekEnd) {
		this.weekEnd = weekEnd;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(int costCenter) {
		this.costCenter = costCenter;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	public int getVendorNumber() {
		return vendorNumber;
	}
	public void setVendorNumber(int vendorNumber) {
		this.vendorNumber = vendorNumber;
	}
	public String getVendorSite() {
		return vendorSite;
	}
	public void setVendorSite(String vendorSite) {
		this.vendorSite = vendorSite;
	}
	public int getPO() {
		return PO;
	}
	public void setPO(int pO) {
		PO = pO;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getChangeWorkOrderNumber() {
		return changeWorkOrderNumber;
	}
	public void setChangeWorkOrderNumber(String changeWorkOrderNumber) {
		this.changeWorkOrderNumber = changeWorkOrderNumber;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String isReviewed() {
		return reviewed;
	}
	public void setReviewed(String reviewed) {
		this.reviewed = reviewed;
	}
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
