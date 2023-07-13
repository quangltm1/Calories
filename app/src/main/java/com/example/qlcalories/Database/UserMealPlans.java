package com.example.qlcalories.Database;

public class UserMealPlans {
    private int UserMealPlanID;
    private int UserID;
    private int MealPlanID;

    public UserMealPlans() {
    }

    public UserMealPlans(int userMealPlanID, int userID, int mealPlanID) {
        UserMealPlanID = userMealPlanID;
        UserID = userID;
        MealPlanID = mealPlanID;
    }

    public UserMealPlans(int userID, int mealPlanID) {
        UserID = userID;
        MealPlanID = mealPlanID;
    }

    public UserMealPlans(int userMealPlanID) {
        UserMealPlanID = userMealPlanID;
    }

    public int getUserMealPlanID() {
        return UserMealPlanID;
    }

    public void setUserMealPlanID(int userMealPlanID) {
        UserMealPlanID = userMealPlanID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }
}
