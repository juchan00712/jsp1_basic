package servlet.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import project.dao.TblProductDao;
import project.vo.ProductVo;


@WebServlet({"/productReg.cc"})
public class productReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger Logger = LoggerFactory.getLogger(productReg.class);
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Logger.info("[Myinfo]상품등록 화면 요청되었습니다!");
	      
	    RequestDispatcher dispatcher = req.getRequestDispatcher("/day3/productReg.jsp");
	    dispatcher.forward(req, resp);
	}
	
	// register.jsp 화면에서 입력된 값을 post 방식으로 전달받기
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		Logger.info("[Myinfo]고객등록 데이터 저장이 요청되었습니다!");
		String pcode = req.getParameter("pcode");
		String ctg = req.getParameter("ctg");
		String pname = req.getParameter("pname");
		String temp = req.getParameter("price");
		
		int price = 0;
		
		if(temp.length() != 0) price = Integer.parseInt(temp);
		
		
		ProductVo vo = new ProductVo(pcode, ctg, pname, price);
		Logger.info("\t 입력값 vo : {}", vo);
		TblProductDao dao = new TblProductDao();
		int result = dao.insert(vo);
		
		String message = "상품 등록이 완료되었습니다.";
		if (result == 0)
			message = "상품 등록 오류가 생겼습니다.";
		
		resp.setContentType("text/html; charset= UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<script>");
		out.print("alert('"+message+"');");
		out.print("location.href='Products.cc';");
		out.print("</script>");
		
		
	}
}













