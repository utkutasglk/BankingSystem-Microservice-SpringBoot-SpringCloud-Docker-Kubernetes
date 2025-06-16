package com.banking.accounts.repository;

import com.banking.accounts.entity.Accounts;
import com.banking.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
