package com.example.qlcalories.Database;

public class MealPlans {
    private int MealPlanID;
    private String MealPlanName;
    private int Calories;

    public MealPlans() {
    }

    public MealPlans(int mealPlanID, String mealPlanName, int calories) {
        MealPlanID = mealPlanID;
        MealPlanName = mealPlanName;
        Calories = calories;
    }

    public MealPlans(String mealPlanName, int calories) {
        MealPlanName = mealPlanName;
        Calories = calories;
    }

    public MealPlans(int mealPlanID, String mealPlanName) {
        MealPlanID = mealPlanID;
        MealPlanName = mealPlanName;
    }

    public MealPlans(int mealPlanID) {
        MealPlanID = mealPlanID;
    }

    public MealPlans(String mealPlanName) {
        MealPlanName = mealPlanName;
    }

    public int getMealPlanID() {
        return MealPlanID;
    }

    public void setMealPlanID(int mealPlanID) {
        MealPlanID = mealPlanID;
    }

    public String getMealPlanName() {
        return MealPlanName;
    }

    public void setMealPlanName(String mealPlanName) {
        MealPlanName = mealPlanName;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }
}
