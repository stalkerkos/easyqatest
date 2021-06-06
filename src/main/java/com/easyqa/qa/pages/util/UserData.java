package com.easyqa.qa.pages.util;

public class UserData {
    private String userName;
    private String userPassword;

    public UserData(String userName, String userPassword){
        this.userName=userName;
        this.userPassword=userPassword;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getUserPassword(){
        return this.userPassword;
    }


}

