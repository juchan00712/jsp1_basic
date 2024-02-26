package day4.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductDto {
	    private String pcode;
		private String category;
		private String pname;
		private int price;
		
		
		
		@Override
		public String toString() {
			return "\nProductDto = " + pcode + ", " + category + ", " + pname + ", " + price;
		}
	
	
}
