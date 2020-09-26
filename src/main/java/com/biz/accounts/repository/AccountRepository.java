package com.biz.accounts.repository;

import com.biz.accounts.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.*;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT a FROM Account a WHERE a.tenantId = :tenantId AND a.accountId = :accountId")
    Optional<Account> findAccount(@Param("tenantId") String tenantId, @Param("accountId") String accountId);
}
