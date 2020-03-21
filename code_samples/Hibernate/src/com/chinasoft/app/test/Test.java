package com.chinasoft.app.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chinasoft.app.domain.User;
import com.chinasoft.app.vo.QueryPropertise;

public class Test {

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
		//1.HQL查询
//		String hql="from User where username = ? and password = ?";
//		Query query = session.createQuery(hql);
//		query.setString(0, "zhangsan");
//		query.setString(1, "123");
//		List<User> list = query.list();
//		for(User user :list){
//			System.out.println(user.getUsername());
//		}
		//查询出年龄在20-30岁之间的人
//		String hql="from User where age between ? and ?";
//		Query query = session.createQuery(hql);
//		query.setInteger(0, 20);
//		query.setInteger(1, 30);
//		List<User> list = query.list();
//		for(User user :list){
//			System.out.println(user.getUsername());
//		}
		//封装实体
//		QueryPropertise q = new QueryPropertise(20,30);
//		String hql="select u from User u where age between :a and :b";
//		Query query = session.createQuery(hql);
//		query.setProperties(q);
//		
//		List<User> list = query.list();
//		for(User user :list){
//			System.out.println(user.getUsername());
//		}
		//单属性投影
//		String hql="select u.username,u.age from User u ";
//		Query query = session.createQuery(hql);
//		List<Object[]> list = query.list();
//		for(Object[] o :list){
//			System.out.println(o[0]+"---------"+o[1]);
//		}
		//聚合函数count query.uniqueResult();
		String hql="select count(*) from User u";
		Query query = session.createQuery(hql);
		Long coun = (Long) query.uniqueResult();
		System.out.println("总数："+coun);
		//6.事务提交
				tran.commit();
				//7.释放资源
				session.close();
				sessionFactory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		//2.增加
		//创建一个user对象
//		User user = new User();
//		user.setUsername("zhangsan");
//		user.setPassword("123");
//		session.save(user);
		//3.修改
		//先查询：查询uid为1的用户在数据库中是否存在
//		User user = (User) session.get(User.class, 1);
//		user.setUsername("lisi");
//		session.update(user);
		//4.删除：删除uid为1的用户
//		User user = (User) session.get(User.class, 1);
//		session.delete(user);
		//session.load(User.class, 1);
		
		
		
	}

}
