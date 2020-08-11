package com.myapp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

	@Pointcut("execution(* com.myapp.dao.DaoImpl.listAllEmployees(..))")
	public void afterList() {}
	
	
}
