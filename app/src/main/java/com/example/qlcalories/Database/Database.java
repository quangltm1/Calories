package com.example.qlcalories.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Database {
    SQLiteDatabase database;
    DBHelper dbHelper;

    public Database(Context context) {
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public Cursor GetData(String sql) {
        return database.rawQuery(sql, null);
    }

    public void QueryData(String sql) {
        database.execSQL(sql);
    }

    public void InsertUser(String username, String password, int height, int weight) {
        String sql = "INSERT INTO User VALUES(null, '" + username + "', '" + password + "', " + height + ", " + weight + ")";
        QueryData(sql);
    }

    public void InsertFood(String foodname, int calories) {
        String sql = "INSERT INTO Food VALUES(null, '" + foodname + "', " + calories + ")";
        QueryData(sql);
    }

    public void InsertMealPlans(int userid, int foodid, String date, int goal) {
        String sql = "INSERT INTO MealPlans VALUES(null, " + userid + ", " + foodid + ", '" + date + "', " + goal + ")";
        QueryData(sql);
    }

    public void InsertUserMealPlans(int userid, int mealplansid, int foodid) {
        String sql = "INSERT INTO UserMealPlans VALUES(null, " + userid + ", " + mealplansid + ", " + foodid + ")";
        QueryData(sql);
    }

    public void UpdateUser(int userid, String username, String password, int height, int weight) {
        String sql = "UPDATE User SET UserName = '" + username + "', Password = '" + password + "', Height = " + height + ", Weight = " + weight + " WHERE UserID = " + userid;
        QueryData(sql);
    }

    public void UpdateFood(int foodid, String foodname, int calories) {
        String sql = "UPDATE Food SET FoodName = '" + foodname + "', Calories = " + calories + " WHERE FoodID = " + foodid;
        QueryData(sql);
    }

    public void UpdateMealPlans(int mealplansid, int userid, int foodid, String date, int goal) {
        String sql = "UPDATE MealPlans SET UserID = " + userid + ", FoodID = " + foodid + ", Date = '" + date + "', Goal = " + goal + " WHERE MealPlansID = " + mealplansid;
        QueryData(sql);
    }

    public void UpdateUserMealPlans(int usermealplansid, int userid, int mealplansid, int foodid) {
        String sql = "UPDATE UserMealPlans SET UserID = " + userid + ", MealPlansID = " + mealplansid + ", FoodID = " + foodid + " WHERE UserMealPlansID = " + usermealplansid;
        QueryData(sql);
    }

    public void DeleteUser(int userid) {
        String sql = "DELETE FROM User WHERE UserID = " + userid;
        QueryData(sql);
    }

    public void DeleteFood(int foodid) {
        String sql = "DELETE FROM Food WHERE FoodID = " + foodid;
        QueryData(sql);
    }

    public void DeleteMealPlans(int mealplansid) {
        String sql = "DELETE FROM MealPlans WHERE MealPlansID = " + mealplansid;
        QueryData(sql);
    }

    public void DeleteUserMealPlans(int usermealplansid) {
        String sql = "DELETE FROM UserMealPlans WHERE UserMealPlansID = " + usermealplansid;
        QueryData(sql);
    }

}
