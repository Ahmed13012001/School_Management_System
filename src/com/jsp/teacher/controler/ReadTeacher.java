package com.jsp.teacher.controler;

import com.jsp.teacher.dao.Teacherdao;

public class ReadTeacher {
	public static void main(String[] args) {
		Teacherdao teacherdao = new Teacherdao();
		teacherdao.readTeacher(1);
	}
}
