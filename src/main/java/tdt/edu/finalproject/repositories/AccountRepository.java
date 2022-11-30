package tdt.edu.finalproject.repositories;

import org.springframework.data.repository.CrudRepository;

import tdt.edu.finalproject.models.Account;

public interface AccountRepository extends CrudRepository<Account, String> {
    Iterable<Account> findAccountByUsername(String username);
    Iterable<Account> findAccountByEmail(String email);
}
