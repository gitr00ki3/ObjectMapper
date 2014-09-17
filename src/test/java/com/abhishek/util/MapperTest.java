package com.abhishek.util;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.abhishek.dto.StudentDto;
import com.abhishek.vo.Student;

public class MapperTest {
	private StudentDto studentDto;
	private Student student;
	private Mapper<StudentDto> mapper;
	private Map<String, String> fieldMap= new HashMap<String, String>();
	
	@Test
	public void testMapObjectFields() {
		fieldMap.put("rNumber", "rollNumber");
		fieldMap.put("fName", "firstName");
		fieldMap.put("lName", "lastName");
		fieldMap.put("phNumber", "phoneNumber");
		fieldMap.put("address", "address");
		
		studentDto= new StudentDto();
		studentDto.setrNumber("IWC2011020");
		studentDto.setfName("Abhishek");
		studentDto.setlName("Singh");
		studentDto.setPhNumber("9026288420");
		studentDto.setAddress("IIIT-A, UP");
		System.out.println(studentDto);
		
		mapper= new Mapper<StudentDto>();
		try {
			student= mapper.mapObjectFields(studentDto, Student.class, fieldMap);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		System.out.println(student);
		
		assertNotNull(studentDto);
		assertNotNull(student);
	}

}
