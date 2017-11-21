package com.ws.service;

import java.util.List;

import javax.jws.WebService;

import com.ws.domain.Customer;

/**
 * 客户模块业务层接口
 * @author Administrator
 *
 */

@WebService
public interface CustomerService {

	
	// 添加客户
	public void save(Customer customer);
	
	// 删除客户
	public void delete(Long id);
	
	// 修改客户
	public void update(Customer customer);
	
	// 查询所有客户
	public List<Customer> findAll();
	
	// 根据id查询一个客户
	public Customer findById(Long id);
}
