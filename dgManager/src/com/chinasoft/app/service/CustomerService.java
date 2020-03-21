package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.vo.CustomerPage;
import com.chinasoft.app.vo.NotVipPage;
import com.chinasoft.app.vo.VipPage;

public interface CustomerService {
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
		public CustomerPage search(int currentpage,int pagesize);
		//��ѯ���л�Ա��Ϣ������ҳ
		public VipPage vipSearch(int currentpage,int pagesize);
		//��ѯ���зǻ�Ա��Ϣ������ҳ
		public NotVipPage notVipSearch(int currentpage,int pagesize);
		//����uid���customer
		public Customer findcustomer(int uid);

}
