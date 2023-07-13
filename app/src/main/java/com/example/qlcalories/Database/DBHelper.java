package com.example.qlcalories.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "QLPhongTro.db";
    private static final int DATABASE_VERSION = 1;

    // Table User
    public static final String TABLE_USER = "User";
    public static final String COLUMN_USER_ID = "UserID";
    public static final String COLUMN_USER_NAME = "UserName";
    public static final String COLUMN_USER_PASSWORD = "Password";
    public static final String COLUMN_USER_HEIGHT = "Height";
    public static final String COLUMN_USER_WEIGHT = "Weight";

    // Table Food
    public static final String TABLE_FOOD = "Food";
    public static final String COLUMN_FOOD_ID = "FoodID";
    public static final String COLUMN_FOOD_NAME = "FoodName";
    public static final String COLUMN_FOOD_CALORIES = "Calories";

    //Table MealPlans
    public static final String TABLE_MEAL_PLANS = "MealPlans";
    public static final String COLUMN_MEAL_PLANS_ID = "MealPlansID";
    public static final String COLUMN_MEAL_PLANS_USER_ID = "UserID";
    public static final String COLUMN_MEAL_PLANS_FOOD_ID = "FoodID";
    public static final String COLUMN_MEAL_PLANS_DATE = "Date";
    public static final String COLUMN_MEAL_PLANS_GOAL = "Goal";

    //Table UserMealPlans
    public static final String TABLE_USER_MEAL_PLANS = "UserMealPlans";
    public static final String COLUMN_USER_MEAL_PLANS_ID = "UserMealPlansID";
    public static final String COLUMN_USER_MEAL_PLANS_USER_ID = "UserID";
    public static final String COLUMN_USER_MEAL_PLANS_MEAL_PLANS_ID = "MealPlansID";
    public static final String COLUMN_USER_MEAL_PLANS_FOOD_ID = "FoodID";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
                + COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_USER_NAME + " TEXT,"
                + COLUMN_USER_PASSWORD + " TEXT,"
                + COLUMN_USER_HEIGHT + " INTEGER,"
                + COLUMN_USER_WEIGHT + " INTEGER"
                + ")";
        db.execSQL(USER_TABLE);

        String FOOD_TABLE = "CREATE TABLE " + TABLE_FOOD + "("
                + COLUMN_FOOD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_FOOD_NAME + " TEXT,"
                + COLUMN_FOOD_CALORIES + " INTEGER"
                + ")";
        db.execSQL(FOOD_TABLE);

        String MEAL_PLANS_TABLE = "CREATE TABLE " + TABLE_MEAL_PLANS + "("
                + COLUMN_MEAL_PLANS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_MEAL_PLANS_USER_ID + " INTEGER,"
                + COLUMN_MEAL_PLANS_FOOD_ID + " INTEGER,"
                + COLUMN_MEAL_PLANS_DATE + " TEXT,"
                + COLUMN_MEAL_PLANS_GOAL + " INTEGER"
                + ")";
        db.execSQL(MEAL_PLANS_TABLE);

        String USER_MEAL_PLANS_TABLE = "CREATE TABLE " + TABLE_USER_MEAL_PLANS + "("
                + COLUMN_USER_MEAL_PLANS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_USER_MEAL_PLANS_USER_ID + " INTEGER,"
                + COLUMN_USER_MEAL_PLANS_MEAL_PLANS_ID + " INTEGER,"
                + COLUMN_USER_MEAL_PLANS_FOOD_ID + " INTEGER"
                + ")";
        db.execSQL(USER_MEAL_PLANS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String USER_TABLE = "DROP TABLE IF EXISTS " + TABLE_USER;
        db.execSQL(USER_TABLE);

        String FOOD_TABLE = "DROP TABLE IF EXISTS " + TABLE_FOOD;
        db.execSQL(FOOD_TABLE);

        String MEAL_PLANS_TABLE = "DROP TABLE IF EXISTS " + TABLE_MEAL_PLANS;
        db.execSQL(MEAL_PLANS_TABLE);

        String USER_MEAL_PLANS_TABLE = "DROP TABLE IF EXISTS " + TABLE_USER_MEAL_PLANS;
        db.execSQL(USER_MEAL_PLANS_TABLE);

        onCreate(db);
    }


}
