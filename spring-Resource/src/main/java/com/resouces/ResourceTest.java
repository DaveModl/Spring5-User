package com.resouces;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * 资源处理
 */
public class ResourceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext();
        Resource template = cxc.getResource("classpath:templates/template.txt");
        System.out.println(template.getFilename());
    }
}
