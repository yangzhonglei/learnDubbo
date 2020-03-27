package com.yzl.study.spingboot;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.yzl.study.spingboot.service.DemoService;

@RestController
public class TestController {
	
	
//    @Autowired
//    private DemoService demoService;
	
    @NacosValue(value = "${name}", autoRefreshed = true)
    private String name;
	
    
    @NacosInjected
    private NamingService namingService;
    
    
    
	@GetMapping("/")
	public  String hello() {
		
//		return demoService.sayHello(" tomcat ") ;
		return "name"+name;
		 
	}
//	算了 测试了     这个总是测试获取不到 
//	 	@GetMapping(value = "/get")
//	    public List<Instance> get() throws NacosException {
//	        return namingService.getAllInstances("");
//	    }
	
	
	
}
