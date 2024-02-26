package mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.CustomerBuyDto;
import day4.mybatis.dto.CustomerDto;
import day4.mybatis.dto.ProductDto;


public class MybatisSessionTest {
	
	public static void main(String[] args) {	
		
		//testBuy();
		//testProduct();
		testCustomer();
		
	}
	
	// Buy
	public static void testBuy() {
				
		MybatisBuyDao dao = new MybatisBuyDao();
		
		
		System.out.println("dao 객체 : " + dao);
		
//		System.out.println("===== selectAll 테스트 =====");
//		List<BuyDto> list = dao.selectAll();
//		System.out.println(list);

//		System.out.println("===== insert 테스트 =====");
//		int result = dao.insert(new BuyDto(0, "mina012", "JINRMn5", 6, null));
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
		List<CustomerBuyDto> list = dao.selectCustomerBuyList("mina012");
		System.out.println(list);
		
	}
	
	
	// Product
	public static void testProduct() {
		
		MybatisProductDao dao = new MybatisProductDao();
		System.out.println(dao);
		
		
//		List<ProductDto> list = dao.selectByCategory("B2");
//		System.out.println(list);
		
//		List<ProductDto> list = dao.productAll();
//		System.out.println(list);
		
//		List<ProductDto> list  = dao.selectByPname("새우깡");
//		System.out.println(list);
		
		System.out.println("===== insert 테스트 =====");
		ProductDto product = new ProductDto("SPAM", "C2", "스팸", 75000);
		int result = dao.Insert(product);
		System.out.println("반영된 행 개수 : " + result);
		
	}
	
	// Customer
	public static void testCustomer() {
		
		MybatisCustomerDao dao = new MybatisCustomerDao();
		
		System.out.println(dao);
		
//		System.out.println("===== allCustomers 테스트 =====");
//		List<CustomerDto> list = dao.allCustomers();
//		System.out.println(list);
		
		
//		List<CustomerDto> list = dao.getCustomer("mina012");
//		System.out.println(list);
		
//		int result = dao.delete("wonder");
//		System.out.println(result);
//		List<CustomerDto> list = dao.allCustomers();
//		System.out.println(list);
		
//		dao.update(new CustomerDto("wonder", null, "nana123@naver.com", 21, null));
//        List<CustomerDto> list = dao.allCustomers();
//        System.out.println(list);
		
		int result = dao.insert(new CustomerDto("chane", "강주찬", "juchan0712@naver.com", 25, null));
		System.out.println(result);
		List<CustomerDto> list = dao.allCustomers();
		System.out.println(list);
	}
}















