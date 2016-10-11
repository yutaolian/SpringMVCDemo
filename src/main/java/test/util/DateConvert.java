package test.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {

	public Date convert(String stringDate) {
		System.out.println("date convert");
		   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            return simpleDateFormat.parse(stringDate);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	}

}
