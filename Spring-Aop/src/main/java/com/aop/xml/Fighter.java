package com.aop.xml;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义切面
 */

public class Fighter {

    public void foundBefore(){
        System.out.println("Fighter wait for tiger...");
    }

    public void foundAfter(){
        System.out.println("Fighter fight with tiger...");
    }
}

