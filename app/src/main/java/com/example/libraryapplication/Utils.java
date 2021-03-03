package com.example.libraryapplication;

import android.content.Context;
import android.content.SharedPreferences;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


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
        //if(null==)

    }
    //Add Getters for the different list of books
    public ArrayList<Book> getAllBooks(){
        /*convert the data received from Shared Preferences to "Book" type using JSON*/
        Type type=new TypeToken<ArrayList<Book>>(){}.getType();
        Gson gson=new Gson();
        ArrayList<Book> books=gson.fromJson(sharedPreferences.getString(ALL_BOOKS_KEY,null),type);
        return books;
    }
    public ArrayList<Book> getAlreadyReadBooks(){
        /*convert the data received from Shared Preferences to "Book" type using JSON*/
        Type type=new TypeToken<ArrayList<Book>>(){}.getType();
        Gson gson=new Gson();
        ArrayList<Book> books=gson.fromJson(sharedPreferences.getString(ALREADY_READ_BOOKS,null),type);
        return books;
    }

    public ArrayList<Book> getWantToReadBooks(){
        /*convert the data received from Shared Preferences to "Book" type using JSON*/
        Type type=new TypeToken<ArrayList<Book>>(){}.getType();
        Gson gson=new Gson();
        ArrayList<Book> books=gson.fromJson(sharedPreferences.getString(WANT_TO_READ_BOOKS,null),type);
        return books;
    }
    public ArrayList<Book> getFavoriteBooks(){
        /*convert the data received from Shared Preferences to "Book" type using JSON*/
        Type type=new TypeToken<ArrayList<Book>>(){}.getType();
        Gson gson=new Gson();
        ArrayList<Book> books=gson.fromJson(sharedPreferences.getString(FAVORITE_BOOKS,null),type);
        return books;
    }
    public ArrayList<Book> getCurrentlyReadingBooks(){
        /*convert the data received from Shared Preferences to "Book" type using JSON*/
        Type type=new TypeToken<ArrayList<Book>>(){}.getType();
        Gson gson=new Gson();
        ArrayList<Book> books=gson.fromJson(sharedPreferences.getString(CURRENTLY_READING_BOOKS,null),type);
        return books;
    }
}
