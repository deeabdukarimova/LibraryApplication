package com.example.libraryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        /*Navigate user to AllBooks Activity*/
        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllBooksActivity.class);
                startActivity(intent);
            }
        });

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