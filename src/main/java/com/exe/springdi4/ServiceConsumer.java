package com.exe.springdi4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//이제 xml에 경로를 적지 않고 이 페이지에 객체를 생성하여 사용할 것임.
@Component("serviceConsumer")
public class ServiceConsumer {

	//생성자로 의존성 주입을 하는 대신 @Autowired를 이용하여 자동으로 주입
	@Autowired
	@Qualifier("messageService") 
	//이 이름과 일치하는 애를 데려와서 의존성 주입을 해줘
	MessageService ms;
	
	@Autowired
	TimeService ts;
	
	@Autowired
	JobService js;
	
	
	
	public void consumerService() {
		
		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
		
		//자체적으로 sysout을 가지고 있음
		js.getJob();
	}
	
}
