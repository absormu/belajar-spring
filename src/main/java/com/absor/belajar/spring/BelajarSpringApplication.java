package com.absor.belajar.spring;

import com.absor.belajar.spring.model.DataBean;
import com.absor.belajar.spring.model.SampleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


public class BelajarSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BelajarConfiguration.class, args);
//		DataBean dataBean = applicationContext.getBean(DataBean.class);
//		System.out.println(dataBean.getValue());

		SampleBean data = applicationContext.getBean(SampleBean.class);
		System.out.println(data.getDataBean().getValue());
	}

}
