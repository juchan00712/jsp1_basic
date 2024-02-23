package day4.mybatis.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor		
@EqualsAndHashCode

public class CustomerDto {
	  private String customId;
	    private String name;
	    private String email;
	    private int age;
	    private Date reg_date;
}
