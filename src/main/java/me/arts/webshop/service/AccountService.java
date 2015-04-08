package me.arts.webshop.service;

import me.arts.webshop.entity.Account;

public interface AccountService {
    Account createAccount(String login, String password, String email);

    Account getAccountById(Long id);
    Account getAccountByLogin(String login);
    Account getAccountByEmail(String email);
    Account authByLoginPassword(String login, String password);

    boolean updateAccount(Account account);
}
