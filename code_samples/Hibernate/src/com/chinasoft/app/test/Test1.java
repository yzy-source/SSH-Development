package com.chinasoft.app.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chinasoft.app.domain.Classinfo;
import com.chinasoft.app.domain.Student;

public class Test1 {

	public static void main(String[] args) {
		//1.加载配置文件
		Configuration config = new Configuration().configure();
		//2.构建session工厂
		SessionFactory sessionFactory = config.buildSessionFactory();
		//3.通过session工厂创建session
		Session session = sessionFactory.openSession();
		//4.开启事务
		Transaction tran = session.beginTransaction();
		//5.操作
		//查询计算机1班都有谁
		Classinfo classinfo = new Classinfo();
		List<Classinfo> classinfoList = session.createQuery("from Classinfo").list();
		for(Classinfo classin:classinfoList){
			System.out.println("班级名称："+classin.getCname());
			Iterator<Student> it = classin.getStudents().iterator();
			while(it.hasNext()){
				System.out.println(it.next().getSname());
			}
		}
		
		//查询guohua在 哪里班级
		
		
		//6.事务提交
		tran.commit();
		//7.释放资源
		session.close();
		sessionFactory.close();

	}

}
