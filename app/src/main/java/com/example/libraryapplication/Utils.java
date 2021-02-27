package com.example.libraryapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class Utils {
    /*This is the Database Class where data will be stored. There will be just one
    * Instance of this class in the entire App. Only this class will
    * interact with the static Array List*/

    /*Define static variables which will be used when storing data to sharedPreferences*/
    private static  final String ALL_BOOKS_KEY="all_books";
    private static final String ALREADY_READ_BOOKS="already_read";
    private static final String WANT_TO_READ_BOOKS="want_to_read";
    private static final String CURRENTLY_READING_BOOKS="currently_reading";
    private static final String FAVORITE_BOOKS="favorite_books";

    /*Define static instance of this class*/
    private static Utils instance;

    /*Using sharedPreference, we will serialize and deserialize the data*/
    private SharedPreferences sharedPreferences;

    /*Create getter for the Utils class instance*/
    public static Utils getInstance(Context context){
        /*Make sure to return the Singleton instance*/
        if(null!=instance){
            return instance;
        }else{
            instance=new Utils(context);
            return instance;
        }
    }

    /*Create private constructor for the Utils class*/
    private Utils(Context context){
        sharedPreferences=context.getSharedPreferences("alternate_db",Context.MODE_PRIVATE);//sharepref mode is private,i.e. it will be specific to our app only

        /*Initialize array of allBooks inside the constructor only if array does not exist*/

    }
}
