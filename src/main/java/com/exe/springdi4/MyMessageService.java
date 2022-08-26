package com.exe.springdi4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageService")
@Scope(value = "prototype")
//영역을 지정해주는 역할. 

public class MyMessageService implements MessageService{
//인터페이스를 구현한 클래스임
//객체를 생성한 다음에 의존성을 주입하는 것임.
//xml에	경로를 적을것이 아니기 때문에 객체를 생성해주어야한다.	
	
	public String getMessage() {
		
		return "안녕 오늘은 금요일~!!";
		
	}
	
	
}
