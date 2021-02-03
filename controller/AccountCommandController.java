package com.cqrs.demo.cqrseventsourcingdemo.controller;

import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.AccountCreatedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyCreditedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyDebitedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.service.command.AccountCommandService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/accounts")
public class AccountCommandController {
    private final AccountCommandService accountCommandService;

    public AccountCommandController(AccountCommandService accountCommandService) {
        this.accountCommandService = accountCommandService;
    }

    @PostMapping
    public CompletableFuture<String> createAccount(@RequestBody AccountCreatedDTO accountCreatedDTO){
        return accountCommandService.createAccount(accountCreatedDTO);
    }

    @PutMapping(value = "/credits/{accountNumber}")
    public CompletableFuture<String> creditMoneyToAccount(@PathVariable(value = "accountNumber") String accountNumber,
                                                          @RequestBody MoneyCreditedDTO moneyCreditedDTO){
        return accountCommandService.creditMoneyToAccount(accountNumber, moneyCreditedDTO);
    }

    @PutMapping(value = "/debits/{accountNumber}")
    public CompletableFuture<String> debitMoneyFromAccount(@PathVariable(value = "accountNumber") String accountNumber,
                                                           @RequestBody MoneyDebitedDTO moneyDebitedDTO){
        return accountCommandService.debitMoneyFromAccount(accountNumber, moneyDebitedDTO);
    }
}
