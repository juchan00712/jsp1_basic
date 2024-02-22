package servlet.day3;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import project.dao.TblBuyDao;
import project.vo.BuyVo;

@WebServlet(urlPatterns = {"/Buys.cc"}, description = "구매 전체 조회")
public class Buysservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger Logger = LoggerFactory.getLogger(CustomerServlet.class);
 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		TblBuyDao dao = new TblBuyDao();
		List<BuyVo> list = dao.selectAll();
		Logger.info("[@.,@] 구매 전체 조회 : {} ", list);
				
		req.setAttribute("list", list);
				
		RequestDispatcher dispatcher = req.getRequestDispatcher("/day3/Buys.jsp");
		dispatcher.forward(req, res);
	}

}
