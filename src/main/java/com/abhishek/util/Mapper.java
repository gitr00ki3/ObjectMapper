package com.abhishek.util;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.DirectFieldAccessor;

public class Mapper<T1> {

	public <T> T mapObjectFields (T1 sourceFields, Class<T> destinationClass, Map<String, String> fieldMap) throws IllegalAccessException, InstantiationException {
		T destinationFields= destinationClass.newInstance();
		DirectFieldAccessor sourceFieldAccessor= new DirectFieldAccessor(sourceFields);
		DirectFieldAccessor destinationFieldAccessor= new DirectFieldAccessor(destinationFields);
		Object sourceValue;
		
		for(Entry<String, String> eachField: fieldMap.entrySet()) {
			sourceValue= sourceFieldAccessor.getPropertyValue(eachField.getKey());
			destinationFieldAccessor.setPropertyValue(eachField.getValue(), sourceValue);
		}
		return destinationFields;
	}
}
