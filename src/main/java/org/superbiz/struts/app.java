package org.superbiz.struts;

import com.opensymphony.module.sitemesh.filter.PageFilter;
import org.apache.struts2.dispatcher.ActionContextCleanUp;
import org.apache.struts2.dispatcher.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
public class app {

    @Bean
    public Filter ActionContextCleanUp() {
        ActionContextCleanUp actionContextCleanUp = new ActionContextCleanUp();
    }

    @Bean
    public PageFilter pageFilter(){
        PageFilter pageFilter = new PageFilter();
        return pageFilter;
    }

    @Bean
    public FilterRegistrationBean filterRegistratonBean(){

        return null;
    }
}
