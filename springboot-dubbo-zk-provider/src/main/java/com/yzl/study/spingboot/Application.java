package com.yzl.study.spingboot;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yzl.study.spingboot.service.DemoService;

@SpringBootApplication
public class Application {
	
	

	
    public static void main (String[] args) {
    	
    	
        ApplicationContext ctx =SpringApplication.run(Application.class, args);
        

    }
    
    
    
    
    
    
    
    
    
}