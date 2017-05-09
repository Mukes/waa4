package com.lab3.bean;

import com.lab3.domain.Account;
import com.lab3.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 985552 on 5/5/2017.
 */
@Named
@FlowScoped("register")
public class CreateAccountBean {
    @ManagedProperty(value = "#{accountService}")
    private AccountService accountService;
    private static final long serialVersionUID = 1L;

    private long account;
    private double balance;
    private String customerName;

    public String createAccount(){
        accountService.createAccount(account, customerName);
        accountService.deposit(account, balance);
        return "list_account.xhtml";
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /*public Account getAccount() {
        if (account==null)
            account = new Account();
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }*/

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReturnValue() {
        return "/list_account";
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
