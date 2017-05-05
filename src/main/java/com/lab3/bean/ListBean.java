package com.lab3.bean;

import com.lab3.domain.Account;
import com.lab3.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Crawlers on 5/4/2017.
 */
@ManagedBean
@SessionScoped
public class ListBean implements Serializable{
    @ManagedProperty(value = "#{accountService}")
    private AccountService accountService;
    private static final long serialVersionUID = 1L;

    List<Account> accounts;

    private Account account;


    public String listAccount(){
        return "list_account.xhtml";
    }

    public List<Account> getAccounts() {
        accounts = new ArrayList<Account>(accountService.getAllAccounts());
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
