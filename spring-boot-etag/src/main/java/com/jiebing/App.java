package com.jiebing;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

/**
 * @ClassName: App 启动类
 * @Description: 加载配置信息及初始化项目
 * @author libb
 * @date 2019年2月14日
 */
@SpringBootApplication
@ComponentScan // Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute
public class App {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);            // it wil start application
    }
	
	@Bean
    public Filter filter(){
        ShallowEtagHeaderFilter filter=new ShallowEtagHeaderFilter();
        return filter;
    }
}
