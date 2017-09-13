package com.libertymutual.goforcode.invoicify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.invoicify.models.RateBasedBillingRecord;

public interface RateBasedBillingRecordRepository extends JpaRepository<RateBasedBillingRecord, Long> {

}
