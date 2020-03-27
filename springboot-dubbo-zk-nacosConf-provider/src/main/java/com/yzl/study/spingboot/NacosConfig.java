package com.yzl.study.spingboot;

import org.springframework.context.annotation.Configuration;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.EnableNacos;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;

@Configuration
@EnableNacos( globalProperties =@NacosProperties(serverAddr = "${nacos.server-addr:192.168.1.3:8848}"))
@NacosPropertySource(dataId = "testDataId", autoRefreshed = true)
@EnableNacosDiscovery(globalProperties = @NacosProperties(serverAddr = "${nacos.server-addr:192.168.1.3:8848}"))
public class NacosConfig {
	
	

}
