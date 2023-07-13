package com.example.qlcalories.Database;

public class Food {
    private int FoodID;
    private String FoodName;
    private int Calories;

    public Food() {
    }

    public Food(int foodID, String foodName, int calories) {
        FoodID = foodID;
        FoodName = foodName;
        Calories = calories;
    }

    public Food(String foodName, int calories) {
        FoodName = foodName;
        Calories = calories;
    }

    public Food(int foodID, String foodName) {
        FoodID = foodID;
        FoodName = foodName;
    }

    public Food(int foodID) {
        FoodID = foodID;
    }

    public Food(String foodName) {
        FoodName = foodName;
    }

    public int getFoodID() {
        return FoodID;
    }

    public void setFoodID(int foodID) {
        FoodID = foodID;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }
}
