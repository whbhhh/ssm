package com.whb;

import com.whb.config.SpringConfig;
import com.whb.config.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 获取spring容器【根容器】
     *
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * 获取springmvc容器【子容器】
     *
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /**
     * 配置路径映射
     *
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
