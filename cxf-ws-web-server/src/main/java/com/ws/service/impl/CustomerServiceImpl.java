package com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ws.domain.Customer;
import com.ws.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	public void save(Customer customer) {
		System.out.println("�ͻ������ˡ�����");
	}

	public void delete(Long id) {
		System.out.println("�ͻ�ɾ���ˡ�����");

	}

	public void update(Customer customer) {
		System.out.println("�ͻ��޸��ˡ�����");

	}

	public List<Customer> findAll() {
		System.out.println("��ѯ���пͻ�������");
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1L, "С��", "135111111111"));
		list.add(new Customer(2L, "С��", "135222222222"));
		list.add(new Customer(3L, "С��", "135333333333"));
		return list;
	}

	public Customer findById(Long id) {
		System.out.println("��ѯ��һ���ͻ�������");
		return new Customer(1L, "С��", "13544444444444");
	}

}
