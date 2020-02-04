package com.transaction.programming.service.impl;

import com.transaction.programming.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class MyServiceImpl2 implements MyService {
    @Bean
    public void doService(PlatformTransactionManager manager){
        DefaultTransactionDefinition transaction = new DefaultTransactionDefinition();
        transaction.setName("txName");
        transaction.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = manager.getTransaction(transaction);
        try {
            update();
        }catch (Exception e){
            manager.rollback(status);
            throw e;
        }
        manager.commit(status);
    }


    @Override
    public int update() {
        return 1;
    }
}
