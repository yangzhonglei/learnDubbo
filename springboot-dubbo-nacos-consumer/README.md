

spring-boot    1.5.22.RELEASE

dubbo-spring-boot-starter  2.7.5  

 
dubbo  服务消费者测试



 
如果您现在使用的Dubbo版本低于2.7.0，请使用如下对应版本的Dubbo Spring Boot：
duoob Spring Boot		Dubbo	Spring Boot
0.2.1.RELEASE			2.6.5+	2.x
0.1.2.RELEASE			2.6.5+	1.x
 


感觉还是使用 yml 配置文件比较好     一组的配置按照层次放    显得集中 清晰   
而properties文件  一组相关的配置 有可能放的比较乱  




nacos-client  1.2.0

Nacos-1.1.4   作为 Dubbo的注册中心



配置依赖： 
```  
	   <dependency>
	        <groupId>org.apache.dubbo</groupId>
	        <artifactId>dubbo-spring-boot-starter</artifactId>
	        <version>${dubbo.version}</version>
	    </dependency>
		<dependency>
		    <groupId>com.alibaba.nacos</groupId>
		    <artifactId>nacos-client</artifactId>
		    <version>1.2.0</version>
		</dependency>
		<dependency>
		    <groupId>com.alibaba.boot</groupId>
		    <artifactId>nacos-config-spring-boot-starter</artifactId>
		    <version>0.1.7</version>
		</dependency>
```  		
		
配置属性 ：
` dubbo.registry.address = nacos://10.20.153.10:8848  `

使用 nacos 作为配置中心     见   NacosValueTestController  


可以使用  @NacosConfigurationProperties  绑定属性到spring bean  
设置了  autoRefreshed = true    spring bean的值也会自动功刷新  





