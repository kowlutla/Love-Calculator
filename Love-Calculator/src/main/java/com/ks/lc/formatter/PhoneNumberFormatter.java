package com.ks.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.ks.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		return object.getCountryCode() + "-" + object.getNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {

		// Check - is there or not
		int index = text.indexOf('-');
		String countryCode;
		String number;
		if (index != -1) {
			String[] arr = text.split("-");
			countryCode = arr[0];
			if(countryCode.length()==0) {
				countryCode="91";
			}
			number = arr[1];
		} else {
			countryCode = "91";
			number = text;
		}
		Phone phone = new Phone();
		phone.setCountryCode(countryCode);
		phone.setNumber(number);

		return phone;
	}

}
