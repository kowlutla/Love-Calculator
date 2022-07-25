package com.ks.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	public void setText(String text){
		
		String myConvertedStringValue=text.toUpperCase();
		setValue(myConvertedStringValue);
	}
}
