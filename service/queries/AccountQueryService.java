package com.cqrs.demo.cqrseventsourcingdemo.service.queries;

import com.cqrs.demo.cqrseventsourcingdemo.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
