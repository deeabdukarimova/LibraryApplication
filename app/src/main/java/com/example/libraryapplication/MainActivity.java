package com.example.libraryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //initialize all buttons
    private Button btnAllBooks,btnFavorites,btnAlreadyRead,btnWantToead,btnCurrentlyReading,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize Views/Buttons
        initViews();

    }

    private void initViews() {
        btnAllBooks=findViewById(R.id.btnallBooks);
        btnFavorites=findViewById(R.id.btnFavorite);
        btnAlreadyRead=findViewById(R.id.btnAlreadyRead);
        btnWantToead=findViewById(R.id.btnWantToRead);
        btnCurrentlyReading=findViewById(R.id.btnCurrentlyReading);
        btnAbout=findViewById(R.id.btnAbout);
    }
}