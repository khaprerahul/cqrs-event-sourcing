package com.cqrs.demo.cqrseventsourcingdemo.events;

import com.cqrs.demo.cqrseventsourcingdemo.aggregates.Status;

public class AccountHeldEvent extends BaseEvent<String>{
    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
