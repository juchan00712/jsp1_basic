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
	
	public int delete(String customid){
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.delete("tblcustomer.delete",customid);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public List<CustomerDto> update(CustomerDto dto){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.update",dto);
		sqlSession.commit();
		sqlSession.close();
		return list;
		
	}
	
	public int insert(CustomerDto dto){
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblcustomer.insert",dto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public List<CustomerDto> getCustomer(String customid){
		SqlSession sqlSession = sessionFactory.openSession();
		List<CustomerDto> list = sqlSession.selectList("tblcustomer.getCustomer",customid);
		sqlSession.close();
		return list;
	}
	
	
	
	
}
