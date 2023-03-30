package com.java.class28;
class Page{
    void loadPage(){
        System.out.println("Load Page");
    }
    void isPageLoaded(){
        System.out.println("Is Page Loaded");
    }
    Page(){ System.out.println("Message from class Page"); }
}
class LoginPage extends Page{
    void doLogin() { System.out.println("Do login"); }
    void logout() {
        System.out.println("Logout");
    }
}
class HomePage extends Page{
    void openHomePage() { System.out.println("Open Home Page"); }
    void verifyLogo() {
        System.out.println("Verify Logo");
    }
}
public class Homework {

    public static void main(String[] args) {
        LoginPage lp = new LoginPage();
        lp.doLogin();
        lp.logout();
        System.out.println();
        HomePage hp = new HomePage();
        hp.openHomePage();
        hp.verifyLogo();
    }
}
