package com.exe.springdi4;

import org.springframework.stereotype.Component;

//()안에 이름은 내 맘대로 지정해도 된다.
@Component("dummyService")
public class MyJobService implements JobService{
	
	public void getJob() {
		
		System.out.println("나는 프로그래머 입니다.");
		
	}
	
}
