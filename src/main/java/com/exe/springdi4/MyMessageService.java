package com.exe.springdi4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageService")
@Scope(value = "prototype")
//������ �������ִ� ����. 

public class MyMessageService implements MessageService{
//�������̽��� ������ Ŭ������
//��ü�� ������ ������ �������� �����ϴ� ����.
//xml��	��θ� �������� �ƴϱ� ������ ��ü�� �������־���Ѵ�.	
	
	public String getMessage() {
		
		return "�ȳ� ������ �ݿ���~!!";
		
	}
	
	
}
