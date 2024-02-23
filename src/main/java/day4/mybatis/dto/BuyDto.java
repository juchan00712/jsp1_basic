package day4.mybatis.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 웹에서는 vo 단어 대신 dto 많이 씁니다.
// data transfer object. db, 서블릿(컨트롤러), jsp(뷰) 사이에서 데이털를 전달해주는 역할.

// 마이바티스에서 매핑 할 때 객체는 기본생성자가 있으면 기본생성자로 없으면 커스텀 생성자로 객체 생성.
@Getter
@ToString
@AllArgsConstructor		// ***커스텀생성자*** : 컬럼명과 변수명 일치 안해도 된다.
						//                   변수선언 순서와 컬럼순서는 일치해야 합니다.
//@NoArgsConstructor	// 기본생성자 : 객체 생성 후 setter로 동작하므로 컬럼명과 변수명 일치 해야함.
@EqualsAndHashCode
public class BuyDto {
	private int buyIdx;
	private String customid;
	private String pcode;
	private int quantity;
	private Date buyDate;
}
