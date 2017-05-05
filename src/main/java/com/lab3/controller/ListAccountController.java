package com.lab3.controller;

import com.lab3.domain.Account;
import com.lab3.service.AccountService;
import com.lab3.service.IAccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Crawlers on 5/3/2017.
 */
@WebServlet(name = "listAccount")
public class ListAccountController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*List<Account> accounts = new ArrayList<Account>(AccountService.getAccountService().getAllAccounts());
        accounts.forEach(account-> System.out.println(account.getCustomer().getName()));
        request.setAttribute("accounts", accounts);
        request.getRequestDispatcher("/view/list_account.jsp").forward(request,response);*/
    }
}
