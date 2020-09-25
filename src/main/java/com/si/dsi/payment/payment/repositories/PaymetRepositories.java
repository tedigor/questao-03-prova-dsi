package com.si.dsi.payment.payment.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.si.dsi.payment.payment.models.Payment;

@RepositoryRestResource(collectionResourceRel = "payment", path = "payment")
public interface PaymetRepositories extends JpaRepository<Payment, Long>{

	Payment findByDate(Date date);
	
}
