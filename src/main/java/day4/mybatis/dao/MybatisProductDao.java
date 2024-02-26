package day4.mybatis.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.CateDto;
import day4.mybatis.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {
	
private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();
	
	public MybatisProductDao() {
		// 테스트 db 연결 : 나중에는 지웁니다.
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println("db 연결 및 sql 실행 객체 : " + sqlSession);
	}
	
	public List<ProductDto> productAll(){
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.productAll");
		sqlSession.close();
		return list;
	}
	
	public List<ProductDto> selectByCategory(String category){
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.selectByCategory",category);
		sqlSession.close();
		return list;
	}
	
	public List<ProductDto> selectByPname(String pname){
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.selectByPname",pname);
		sqlSession.close();
		return list;
	}
	
	public int Insert(ProductDto vo) {
		SqlSession sqlSession = sessionFactory.openSession();
		int result = sqlSession.insert("tblproduct.Insert",vo);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public List<ProductDto> search(Map<String, Object> map) {
		SqlSession sqlSession = sessionFactory.openSession();
		List<ProductDto> list = sqlSession.selectList("tblproduct.search", map);
		sqlSession.close();
		return list;
	}
	
	public List<CateDto> getCategories() {
		SqlSession sqlSession = sessionFactory.openSession();
		List<CateDto> list = sqlSession.selectList("tblproduct.getCategories");
		sqlSession.close();
		return list;
	}
	
//	public Map<String, Integer> getPriceTable(){
//		Map<String, Integer> result = new HashMap<>();
//		SqlSession sqlSession = sessionFactory.openSession();
//		List<ProductDto> list = sqlSession.selectList("tblproduct.getPriceTable");
//		sqlSession.close();
//		return result;
//	} 
	
}
