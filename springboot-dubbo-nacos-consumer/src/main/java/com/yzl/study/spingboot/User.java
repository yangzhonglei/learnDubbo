package com.yzl.study.spingboot;

import org.springframework.stereotype.Component;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;

@NacosConfigurationProperties(dataId = "testDataId",autoRefreshed = true)
@Component
public class User {

	private String name;
	private Integer age;
	private String add;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
