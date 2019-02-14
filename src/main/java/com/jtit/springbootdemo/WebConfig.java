package com.jtit.springbootdemo;

import javax.annotation.Resource;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 
/**
 * @ClassName: WebConfig  拦截器配置
 * @Description:
 * @author weiyb
 * @date 2018年5月7日 上午11:30:58
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Resource
	private FileUploadInterceptor fileUploadInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 自定义拦截器，添加拦截路径和排除拦截路径
		registry.addInterceptor(fileUploadInterceptor)
				.addPathPatterns("/**")
				//放行
				.excludePathPatterns("/book/login")
				//放行静态资源
				.excludePathPatterns("/img/**","/css/**","/fonts/**","/js/**");
	}
}
