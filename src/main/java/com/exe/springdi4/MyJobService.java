package com.exe.springdi4;

import org.springframework.stereotype.Component;

//()�ȿ� �̸��� �� ����� �����ص� �ȴ�.
@Component("dummyService")
public class MyJobService implements JobService{
	
	public void getJob() {
		
		System.out.println("���� ���α׷��� �Դϴ�.");
		
	}
	
}
