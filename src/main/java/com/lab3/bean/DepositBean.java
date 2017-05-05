package com.lab3.bean;

import com.lab3.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created by 985552 on 5/5/2017.
 */
@ManagedBean
@SessionScoped
public class DepositBean {
    @ManagedProperty(value = "#{accountService}")
    private AccountService accountService;
    private static final long serialVersionUID = 1L;

    private double depositAmt;
    private long accountNo;

    public String deposit(){
        accountService.deposit(accountNo, depositAmt);
        return "list_account.xhtml";
    }

    public double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
