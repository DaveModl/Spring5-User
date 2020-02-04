package com.transaction.programming.service.impl;

import com.transaction.programming.service.MyService;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


public class MyServiceImpl implements MyService {
    private final TransactionTemplate template;

    public MyServiceImpl(PlatformTransactionManager transactionManager) {
        this.template = new TransactionTemplate(transactionManager);
    }

    public Object doService() {
        return template.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                Object res =update();
                return res;
            }
        });
    }

    @Override
    public int update() {
        return 1;
    }
}
