package com.ioc.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class MyScope implements Scope {
    private final ThreadLocal <Map<String,Object>> local = new ThreadLocal<Map<String, Object>>(){
        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<>();
        }
    };
    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        Map<String,Object> scope = local.get();
        Object obj = scope.get(s);
        System.out.println("Get " + s);
        if (obj == null){
            System.out.println("Not exists " + s);
            obj = objectFactory.getObject();
            scope.put(s,obj);
        }
        return obj;
    }

    @Override
    public Object remove(String s) {
        Map<String,Object> scope = local.get();
        System.out.println("Remove " + s);
        return scope.remove(s);
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
