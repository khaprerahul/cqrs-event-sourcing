package com.cqrs.demo.cqrseventsourcingdemo.service.command;

import com.cqrs.demo.cqrseventsourcingdemo.commands.CreateAccountCommand;
import com.cqrs.demo.cqrseventsourcingdemo.commands.CreditMoneyCommand;
import com.cqrs.demo.cqrseventsourcingdemo.commands.DebitMoneyCommand;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.AccountCreatedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyCreditedDTO;
import com.cqrs.demo.cqrseventsourcingdemo.dto.commands.MoneyDebitedDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class AccountCommandServiceImpl  implements  AccountCommandService{

    private final CommandGateway commandGateway;

    public AccountCommandServiceImpl(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @Override
    public CompletableFuture<String> createAccount(AccountCreatedDTO accountCreatedDTO) {
        return commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(), accountCreatedDTO.getStartingBalance(), accountCreatedDTO.getCurrency()));
    }

    @Override
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditedDTO moneyCreditedDTO) {
        return commandGateway.send(new CreditMoneyCommand(accountNumber, moneyCreditedDTO.getCreditAmount(), moneyCreditedDTO.getCurrency()));
    }

    @Override
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitedDTO moneyDebitedDTO) {
        return commandGateway.send(new DebitMoneyCommand(accountNumber, moneyDebitedDTO.getDebitAmount(), moneyDebitedDTO.getCurrency()));
    }
}
