package com.exe.springdi4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//���� xml�� ��θ� ���� �ʰ� �� �������� ��ü�� �����Ͽ� ����� ����.
@Component("serviceConsumer")
public class ServiceConsumer {

	//�����ڷ� ������ ������ �ϴ� ��� @Autowired�� �̿��Ͽ� �ڵ����� ����
	@Autowired
	@Qualifier("messageService") 
	//�� �̸��� ��ġ�ϴ� �ָ� �����ͼ� ������ ������ ����
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
		
		//��ü������ sysout�� ������ ����
		js.getJob();
	}
	
}
