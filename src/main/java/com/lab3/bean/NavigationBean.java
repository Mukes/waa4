package com.lab3.bean;

import com.lab3.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 * Created by 985552 on 5/5/2017.
 */
@ManagedBean
@ViewScoped
public class NavigationBean {
    private static final long serialVersionUID = 1L;

    public String createAccount(){
        return "create_account.xhtml";
    }

    public String withdraw(){
        return "withdraw.xhtml";
    }

    public String view() {
        return "view.xhtml";
    }
}
