package com.yzl.study.spingboot;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.yzl.study.spingboot.service.DemoService;

@RestController
public class NacosValueTestController {

	@NacosValue(value = "${name}", autoRefreshed = true)
	String name;

	@NacosInjected
	private ConfigService configService;

	@Autowired
	User user;

	@Reference(version = "${demo.service.version}")
	private DemoService demoService;

	
	
	
	@GetMapping("/dubboTest")
	public String dubboTest() {

		return demoService.sayHello(" tomcat ");

	}

	@GetMapping("/nacosValueTest")
	public String nacosValueTest() {

		return "name:" + name;
	}

	@GetMapping("/publishConfigToNacosTest")
	public void publishConfigToNacosTest() throws NacosException {
		configService.publishConfig("testDataId", "DEFAULT_GROUP", "name=" + System.currentTimeMillis() + "");
	}

	@GetMapping("/nacosConfigurationPropertiesBindTest")
	public Object nacosConfigurationPropertiesBindTest() {

		return user;
	}

	// 监听 配置变化
	@NacosConfigListener(dataId = "testDataId")
	public void onMessage(String config) {

		System.out.println("nacos config changed:" + config);
	}

	
}
