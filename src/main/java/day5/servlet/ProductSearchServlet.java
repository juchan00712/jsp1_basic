package day5.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.CateDto;
import day4.mybatis.dto.ProductDto;

import org.slf4j.Logger;

@WebServlet(urlPatterns = { "/search.cc" }, description = "상품 검색")
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger Logger = LoggerFactory.getLogger(ProductSearchServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String category = req.getParameter("category");
		String keyword = req.getParameter("keyword");
		String from = req.getParameter("from");
		String to = req.getParameter("to");
		Logger.info("파라미터 확인:{},{},{},{}", category, keyword, from, to);

		Map<String, Object> map = new HashMap<>();
		if (category != null && category.trim().length() != 0) {
			map.put("category", category);
			req.setAttribute("cate", category);
			// 애트리뷰트 이름을 자바스크립트에서 사용가능합니다.
		}
		if (keyword != null && keyword.trim().length() != 0) {
			map.put("keyword", keyword);
			req.setAttribute("keyword", keyword);
		}
		if (from != null && from.trim().length() != 0 && to != null && to.trim().length() != 0) {
			map.put("from", from.trim());
			map.put("to", to.trim());
			req.setAttribute("from", from.trim());
			req.setAttribute("to", to.trim());
		}
		Logger.info("[MyInfo]파라미터 map : {}", map);

		MybatisProductDao dao = new MybatisProductDao();
		List<ProductDto> list = dao.search(map);
		req.setAttribute("list", list);

		// List<String> cateList = List.of("A1", "A2", "B1", "B2", "C1");
		List<CateDto> cateList = dao.getCategories();
		req.setAttribute("cateList", cateList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/day5/search.jsp");
		dispatcher.forward(req, resp);

	}

}