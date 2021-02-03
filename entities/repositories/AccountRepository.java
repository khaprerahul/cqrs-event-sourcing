package com.cqrs.demo.cqrseventsourcingdemo.entities.repositories;

import com.cqrs.demo.cqrseventsourcingdemo.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity,String> {

}
