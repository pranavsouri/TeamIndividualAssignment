package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before(value="execution(* com.example.service.EmployeeService.*(..)) and args(name,empId) ")
	public void beforeAdvice(JoinPoint joinpoint,String name,String empId) {
		System.out.println("Before method:" + joinpoint.getSignature());
	
		System.out.println("Creating Employee with name - "+name+"and id -"+empId);
	}

}
