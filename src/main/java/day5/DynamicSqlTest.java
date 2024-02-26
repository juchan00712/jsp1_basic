package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.ProductDto;

public class DynamicSqlTest {
	
	public static void main(String[] args) {
		// testNoFilter();
		// testCateFilter();
		// testPnameFilter();
		// testAllFilter();
		testOrderBy();
	}
	
	public static void testNoFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		List<ProductDto> list = dao.search(null);
		System.out.println("검색 필터 없음 : " + list);
	}
	
	public static void testOrderBy() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("column", "price");		// 컬럼명 price로 정렬하기
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 : " + list);
	}
	
	public static void testCateFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("category", "B1");	// key는 파라미터 이름, value는 검색하고 싶은 컬럼값.
									// key는 매퍼 xml 확인, value는 변경해서 테스트하기.
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 : " + list);		// 전체 조회
	}
	
	public static void testPnameFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "사과");	// key는 파라미터 이름, value는 검색하고 싶은 컬럼값.
									// key는 매퍼 xml 확인, value는 변경해서 테스트하기.
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 : " + list);		// 전체 조회
	}
	
	public static void testAllFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("category", "B1");	
		map.put("keyword", "사과");	
		map.put("from", 10000);	
		map.put("to", 40000);	
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -상품명과 카테고리 그리고 가격 : " + list);
	}
}






















