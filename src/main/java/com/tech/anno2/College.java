package com.tech.anno2;

public class College {
	private Principal principal;
	private Teacher teacher;
//	public College(Principal principal) {
//		this.principal = principal;
//	}
	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("testing is call method!!!");
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
