package com.jsp.teacher.controler;

import com.jsp.teacher.dao.Teacherdao;

public class UpdateTeacher {
	public static void main(String[] args) {
		Teacherdao teacherdao = new Teacherdao();
		teacherdao.updateStuden("osama", 3);
	}
}
