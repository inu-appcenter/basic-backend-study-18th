package com.myapp.mylib.repository;

import com.myapp.mylib.domain.Loan;
import com.myapp.mylib.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUser(User user);

    List<Loan> findByReturnDateIsNull();
}
