package project.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class BuyVo {
	private int buyIdx;
	//private int buy_idx;
	private String customid;
	private String pcode;
	private int quantity;
	private Date buyDate;
	//private Date buy_date;
}
// 필드값이 모두 값으면 equals 로 true 가 되도록 하고싶다.
// -> equals 와 hashcode 를 재정의해야 합니다. (vo 객체)
// -> 이러한 객체는 테스트 과정에서 객체를 비교할 때 사용할 수 있습니다.