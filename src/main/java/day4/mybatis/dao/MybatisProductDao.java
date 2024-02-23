package day4.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlSessionBean;

public class MybatisProductDao {
	
private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisProductDao() {
		// 테스트 db 연결 : 나중에는 지웁니다.
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println("db 연결 및 sql 실행 객체 : " + sqlSession);
	}
	
	
}
