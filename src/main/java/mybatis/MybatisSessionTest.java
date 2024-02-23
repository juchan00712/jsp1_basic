package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.CustomerDto;


public class MybatisSessionTest {
	
	public static void main(String[] args) {	
		
		testBuy();
		
	}
	
	// Buy
	public static void testBuy() {
				
		MybatisBuyDao dao = new MybatisBuyDao();
	
		System.out.println("dao 객체 : " + dao);
		
//		System.out.println("===== selectAll 테스트 =====");
//		List<BuyDto> list = dao.selectAll();
//		System.out.println(list);
	
//		System.out.println("===== insert 테스트 =====");
//		int result = dao.insert(new BuyDto(0, "mina012", "CJBAb12g", 3, null));
//		System.out.println("반영된 행 개수 : " + result);
		
//		System.out.println("===== update 테스트 =====");
//		Map<String,Integer> map = new HashMap<>();
//		map.put("buy_idx", 1081);
//		map.put("quantity", 5);
//		dao.update(map);
//		System.out.println(map);
		
//		System.out.println("===== delete 테스트 =====");
//		int result = dao.delete(1102);
//		System.out.println("삭제된 행 : " + result);
		
		
		System.out.println("===== selectCustomerBuyList 테스트 =====");
		String customid = "mina012";
		List<BuyDto> list1 = dao.selectCustomerBuyList(customid);
		System.out.println(list1);
		 
		
		
		
		
	}
	
	// Product
	public static void testProduct() {
		
		MybatisProductDao dao = new MybatisProductDao();
		System.out.println(dao);
				
	}
	
	// Customer
	public static void testCustomer() {
		
		MybatisCustomerDao dao = new MybatisCustomerDao();
		
		System.out.println(dao);
		
		System.out.println("===== allCustomers 테스트 =====");
		List<CustomerDto> list = dao.allCustomers();
		System.out.println(list);
	}
}















