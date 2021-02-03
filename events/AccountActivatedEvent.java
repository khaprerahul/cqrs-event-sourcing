package com.cqrs.demo.cqrseventsourcingdemo.events;

import com.cqrs.demo.cqrseventsourcingdemo.aggregates.Status;

public class AccountActivatedEvent extends BaseEvent<String>{
    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
