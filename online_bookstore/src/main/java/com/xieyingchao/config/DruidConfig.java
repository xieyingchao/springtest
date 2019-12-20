package com.xieyingchao.config;
import java.util.Arrays;
import java.util.HashMap;
import	java.util.Map;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @Description TODO
 * @Author 谢迎超
 * @Date 2019/11/16 20:53
 */

@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource Druid(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String, Object> properties = new HashMap();
        properties.put("loginUsername","admin");
        properties.put("loginPassword","123456");
        properties.put("allow","");

        bean.setInitParameters(properties);
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, Object> properties = new HashMap();
        properties.put("exclusions","*.js,*.css,/druid/*,*.png,*.gif");
        bean.setInitParameters(properties);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
