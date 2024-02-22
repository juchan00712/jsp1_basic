package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/first.cc"}, description = "처음 만드는 서블릿")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger Logger = LoggerFactory.getLogger(FirstServlet.class);
    
    public FirstServlet() {
        super();
    }

    // Get 요청을 처리하는 메소드 - 인자 타입 2개 xxxRequest, xxxResponse
    //						  요청과 응답에 대한 처리를 할 수 있습니다.
    // 사용자 요청을 request 객체에 저장하면서 동시에 응답을 전달할 객체 response가 만들어집니다.
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //사용자 요청에 대한 정보 출력 (request 객체의 속성값) : 로그 출력에서 {}는 결과값 표시
        Logger.info("\n[MyInfo]: request URL : {}, URL : {}, 컨텍스트패스 : {} ",
                 req.getRequestURL(),req.getRequestURI(),req.getContextPath());
        
        // 테스트 : 서블릿에서 html 출력 응답도 만들어 봅니다.
        // out은 jsp는 내장객체(선언없이 사용), 서블릿은 직접 생성(response 객체로 생성합니다.)
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();	// response 객체의 출력 스트림 생성
          out.println("<HTML>");
          out.println("<HEAD><meta charset=\"UTF-8\"><TITLE>WELCOME</TITLE></HEAD>");
          out.println("<BODY>");
          out.println("<h2>HELLO world!!</h2>");
          out.println("<SPAN>");
          out.println("현재 날짜와 시간 : " + LocalDateTime.now());
          out.println("</BODY>");
          out.println("<HTML>");
          out.close();
     }

}
