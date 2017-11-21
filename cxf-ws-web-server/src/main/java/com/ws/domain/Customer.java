package com.ws.domain;

/**
 * 客户模块实体类
 * @author Administrator
 *
 */
public class Customer {

	private Long id;
	private String custName;
	private String custPhone;
	
	
	public Customer() {
		super();
	}
	public Customer(Long id, String custName, String custPhone) {
		super();
		this.id = id;
		this.custName = custName;
		this.custPhone = custPhone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custName=" + custName + ", custPhone=" + custPhone + "]";
	}
	
	
}
