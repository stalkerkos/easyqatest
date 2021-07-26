package com.easyqa.qa.pages.util;

import io.qameta.allure.Step;

public class UserData {
    private String userName;
    private String userPassword;

    public UserData(String userName, String userPassword){
        this.userName=userName;
        this.userPassword=userPassword;
    }

    @Step
    public String getUserName(){
        return this.userName;
    }
    @Step
    public String getUserPassword(){
        return this.userPassword;
    }


}

