package com.portfolio.api.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
    private static final Logger logger = LogManager.getLogger(LogAspect.class);	
    
	@Pointcut("execution(* com.portfolio.api.services.ITechService.findAll())")
	public void pointCut() {}
	
	@Before("pointCut()")
    public void logBefore() {
        logger.info("Llamando a método findAll() para obtener tecnologías");
    }
	
	@AfterReturning("pointCut()")
	public void logAfter() {
		 logger.info("Finalizada la llamada a método findAll() para obtener tecnologías");
	}

}
