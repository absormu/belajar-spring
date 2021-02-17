package com.absor.belajar.spring;


import com.absor.belajar.spring.model.DataBean;
import com.absor.belajar.spring.model.SampleBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class BelajarConfiguration {

    @Bean
    @Primary
    public DataBean createDataBean(){
        DataBean dataBean = new DataBean("Muhamad");
        return dataBean;
    }

    @Bean
    public DataBean createDataBean2(){
        DataBean dataBean = new DataBean("Absor");
        return dataBean;
    }

    @Bean
    public SampleBean createSampleBean(DataBean dataBean){
        SampleBean sampleBean = new SampleBean(dataBean);
        return sampleBean;
    }
}
