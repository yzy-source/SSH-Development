package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public interface CustomerDao {
	//���ӿͻ���Ϣ
	public void add(Customer customer);
	//ɾ���ͻ���Ϣ
	public void delele(int uid);
	//�޸Ŀͻ���Ϣ
	public void update(Customer customer);
	//ɾ���ͻ���Ϣ
	public void vipdelele(int uid);
	//ɾ���ͻ���Ϣ
	public void notvipdelele(int uid);
	//��ѯ���й˿�ע����Ϣ,����ҳ
	public List<Customer> search(int currentpage,int pagesize);
	//��ѯ���л�Ա��Ϣ������ҳ
	public List<Customer> vipSearch(int currentpage,int pagesize);
	//��ѯ���зǻ�Ա��Ϣ������ҳ
	public List<Customer> notVipSearch(int currentpage,int pagesize);
	//����uid���customer
	public Customer findcustomer(int uid);
	//��ѯ���й˿ͼ�¼����
	public int findtotalcount();
	public int findViptotalcount();
	public int findNViptotalcount();

}
