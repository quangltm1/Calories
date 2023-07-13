package com.example.qlcalories.Database;

public class User {
    private int UserID;
    private String UserName;
    private String Password;
    private int Height;
    private int Weight;

    public User() {
    }

    public User(int userID, String userName, String password, int height, int weight) {
        UserID = userID;
        UserName = userName;
        Password = password;
        Height = height;
        Weight = weight;
    }

    public User(String userName, String password, int height, int weight) {
        UserName = userName;
        Password = password;
        Height = height;
        Weight = weight;
    }


    public User(int userID, String userName, int height, int weight) {
        UserID = userID;
        UserName = userName;
        Height = height;
        Weight = weight;
    }

    public User(int userID, String userName, String password) {
        UserID = userID;
        UserName = userName;
        Password = password;
    }

    public User(int userID, String userName) {
        UserID = userID;
        UserName = userName;
    }

    public User(String userName) {
        UserName = userName;
    }

    public User(int userID) {
        UserID = userID;
    }

    public User(int userID, int height, int weight) {
        UserID = userID;
        Height = height;
        Weight = weight;
    }

    public User(int userID, int height) {
        UserID = userID;
        Height = height;
    }

    public User(int userID, int height, String userName) {
        UserID = userID;
        Height = height;
        UserName = userName;
    }

    public User(int userID, int height, String userName, String password) {
        UserID = userID;
        Height = height;
        UserName = userName;
        Password = password;
    }

    public User(int userID, int height, String userName, String password, int weight) {
        UserID = userID;
        Height = height;
        UserName = userName;
        Password = password;
        Weight = weight;
    }

    public User(int height, String userName, String password, int weight) {
        Height = height;
        UserName = userName;
        Password = password;
        Weight = weight;
    }

    public User(String userName, String password, int height) {
        UserName = userName;
        Password = password;
        Height = height;
    }

    public User(String userName, String password) {
        UserName = userName;
        Password = password;
    }
}
