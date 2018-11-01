/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wb.menu;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Gold
 */
@ManagedBean(name = "temNav")
@SessionScoped
public class PageNavigation {

    private String page;
    private String titlePane;

    public PageNavigation() {

        setPage("/home.xhtml");

    }

    public void viewMakeOrder() {
        setPage("/Pages/MakeTransaction/transaction.xhtml");
        setTitlePane("Make Order");
    }

    public void viewProfile() {
        setPage("/Pages/ViewProfile/profile.xhtml");
        setTitlePane("Profile");
    }

    public void viewTransaction() {
        setPage("/Pages/ViewTransaction/viewTransaction.xhtml");
        setTitlePane("View Transaction");
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTitlePane() {
        return titlePane;
    }

    public void setTitlePane(String titlePane) {
        this.titlePane = titlePane;
    }

}
