package com.ioc.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例bean与非单例bean联合使用
 */
public class MethodDI implements ApplicationContextAware {
    private ApplicationContext context;
    public Object process(Map commandState){
        Command command = createCommand();
        command.setState(commandState);
        return command.execute();
    }

    private Command createCommand() {
        return this.context.getBean(Command.class);
    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MethodDI methodDI = new MethodDI();
            Map<Object, Object> map = new HashMap<>();
            map.put("hello"+i, "world"+i);
            ApplicationContext context = new ClassPathXmlApplicationContext("spring/command.xml");
            methodDI.setApplicationContext(context);
            System.out.println(methodDI.process(map) + " " + methodDI);
        }
    }
}
