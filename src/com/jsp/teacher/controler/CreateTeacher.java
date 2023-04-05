package com.jsp.teacher.controler;

import java.sql.Connection;

import com.jsp.teacher.dao.Teacherdao;
import com.jsp.teacher.dto.Teacher;
import com.jsp.teacher.utility.HelperClass;

public class CreateTeacher {
	public static void main(String[] args) {
		
		Teacherdao teacherdao = new Teacherdao();
		Teacher teacher = new Teacher();
		teacher.setName("Naushad");
		teacher.setId(4);
		teacher.setEmail("naushad@gmail.com");
		teacherdao.saveTeacher(teacher);
		
			
	}
}
