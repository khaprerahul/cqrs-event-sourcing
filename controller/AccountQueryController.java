package com.cqrs.demo.cqrseventsourcingdemo.controller;

import com.cqrs.demo.cqrseventsourcingdemo.entities.AccountQueryEntity;
import com.cqrs.demo.cqrseventsourcingdemo.service.queries.AccountQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/accounts")
public class AccountQueryController {
    private final AccountQueryService accountQueryService;

    public AccountQueryController(AccountQueryService accountQueryService) {
        this.accountQueryService = accountQueryService;
    }

    @GetMapping("/{accountNumber}")
    public AccountQueryEntity getAccount(@PathVariable(value = "accountNumber") String accountNumber) {
        return accountQueryService.getAccount(accountNumber);
    }

    @GetMapping("/{accountNumber}/events")
    public List<Object> listEventsForAccount(@PathVariable(value = "accountNumber") String accountNumber) {
        return accountQueryService.listEventsForAccount(accountNumber);
    }
}
