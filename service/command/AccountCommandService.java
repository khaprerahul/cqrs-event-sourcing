package com.cqrs.demo.cqrseventsourcingdemo.service.command;

import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.AccountCreatedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyCreditedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyDebitedDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    public CompletableFuture<String> createAccount(AccountCreatedDTO accountCreatedDTO);

    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditedDTO moneyCreditedDTO);

    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitedDTO moneyDebitedDTO);
}
