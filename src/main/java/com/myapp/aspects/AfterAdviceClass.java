package com.myapp.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceClass {

	@Pointcut("execution(* com.myapp.dao.DaoImpl.listAllEmployees(..))")
	public void afterList() {}
	
	@AfterReturning(pointcut = "afterList()",returning = "result")
	public void afterAdvice(Object result) {
		System.out.println("After list advice:\n"+ result);
	}
}
