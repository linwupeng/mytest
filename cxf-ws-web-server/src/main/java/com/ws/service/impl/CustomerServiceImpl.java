package com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ws.domain.Customer;
import com.ws.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	public void save(Customer customer) {
		System.out.println("客户保存了。。。");
	}

	public void delete(Long id) {
		System.out.println("客户删除了。。。");

	}

	public void update(Customer customer) {
		System.out.println("客户修改了。。。");

	}

	public List<Customer> findAll() {
		System.out.println("查询所有客户。。。");
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1L, "小苍", "135111111111"));
		list.add(new Customer(2L, "小林", "135222222222"));
		list.add(new Customer(3L, "小蔡", "135333333333"));
		return list;
	}

	public Customer findById(Long id) {
		System.out.println("查询了一个客户。。。");
		return new Customer(1L, "小泽", "13544444444444");
	}

}
