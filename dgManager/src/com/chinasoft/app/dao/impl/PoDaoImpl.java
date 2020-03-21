package com.chinasoft.app.dao.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.PoDao;
import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;

public class PoDaoImpl extends HibernateDaoSupport implements PoDao {   
	@Override
	public List<Po>  findAllByPid(Integer productId) {
		// TODO Auto-generated method stub
		List<Po>list =this.getHibernateTemplate().find("from Po where products.productId=?",productId);
		return list;
	}

	@Override
	public List<Orderinfo> SearchByPid(List<Po> list) {
		// TODO Auto-generated method stub
		//List<Orderinfo>list =this.getHibernateTemplate().find("from Po where products.productId=?",pid);
		//List<Orderinfo>list1=this.getHibernateTemplate().find("from Orderinfo where oid=")
		      List<Orderinfo>list1=new LinkedList<Orderinfo>();
				for(int i=0;i<list.size();i++)
				{
					list1.addAll(this.getHibernateTemplate().find("from Orderinfo where oid=?",list.get(i).getOrderinfo().getOid()));
				}
				return list1;
	}
}
