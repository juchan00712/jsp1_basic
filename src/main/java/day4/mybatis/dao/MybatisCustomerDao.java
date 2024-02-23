package day4.mybatis.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class MybatisCustomerDao {
	
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	public MybatisCustomerDao() {
		
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println("db 연결 및 sql 실행 객체 : " + sqlSession);
	}
	
	public List<CustomerDto> allCustomers() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.allCustomers");
		sqlSession.close();
		return list;
	}
}
