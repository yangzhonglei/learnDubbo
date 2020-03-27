package com.yzl.study.spingboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.yzl.study.spingboot.service.DemoService;

@SpringBootApplication
@NacosPropertySource(dataId = "${nacosDataId}",groupId = "DEFAULT_GROUP",autoRefreshed = true)
public class Application {
	
	

	
    public static void main (String[] args) {
    	
    	
        ApplicationContext ctx =SpringApplication.run(Application.class, args);
        

    }
    
    
    
}