package com.weslaty.web.config.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import com.weslaty.data.access.config.PersistenceContext;
import com.weslaty.service.config.ServiceConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {
    public void onStartup(ServletContext ctx) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        //Register Spring MVC configuration
        webApplicationContext.register(SpringMvcConfig.class);
        //Register Spring persistence context configuration
        webApplicationContext.register(ServiceConfig.class);
        //Register Spring persistence context configuration
        webApplicationContext.register(PersistenceContext.class);
        webApplicationContext.setServletContext(ctx);
        ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
