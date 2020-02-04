package com.transaction.declarative.anno.service.impl;

import com.transaction.declarative.anno.entity.Foo;
import com.transaction.declarative.anno.service.FooService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FooServiceImpl implements FooService {
    @Override
    public Foo setFoo(String fooName) {
        return new Foo(fooName);
    }
}
