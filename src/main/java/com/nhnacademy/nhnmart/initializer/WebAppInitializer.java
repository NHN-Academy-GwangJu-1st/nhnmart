package com.nhnacademy.nhnmart.initializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({
        javax.servlet.http.HttpServlet.class,
        javax.servlet.Filter.class,
        javax.servlet.ServletContextListener.class,
        javax.servlet.http.HttpSessionListener.class
})
public class WebAppInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("양파", "1000");
        servletContext.setInitParameter("계란", "2000");
        servletContext.setInitParameter("파", "500");
        servletContext.setInitParameter("사과", "2000");

        /* ID and Password*/
        servletContext.setInitParameter("id", "admin");
        servletContext.setInitParameter("password", "1234");
    }
}
