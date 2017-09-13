package com.libertymutual.goforcode.invoicify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.invoicify.models.FlatFeeBillingRecord;

public interface FlatFeeBillingRecordRepository extends JpaRepository<FlatFeeBillingRecord, Long>{

}
