package com.example.amanp.myapplicationfragmentassignment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;// 6 different buttons used to perform action (2 for each city)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // reference of all the buttons is created here
        b1 = (Button) findViewById(R.id.TbuttonImage);
        b2 = (Button) findViewById(R.id.TbuttonTxt);
        b3 = (Button) findViewById(R.id.BbuttonImage);
        b4 = (Button) findViewById(R.id.BbuttonTxt);
        b5 = (Button) findViewById(R.id.NbuttonImage);
        b6 = (Button) findViewById(R.id.NbuttonTxt);

        // OnClick listener is created for all the buttons when user will click a button it will call performAction() function
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                performAction(view);// call user defined function to dispaly image and text
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAction(view);// call user defined function to dispaly image and text
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAction(view);//call user defined function to dispaly image and text
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAction(view);// call user defined function to dispaly image and text
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAction(view);// call user defined function to dispaly image and text
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performAction(view);// call user defined function to dispaly image and text
            }
        });

    }
// user defined function to display Image and Text
    public void performAction(View view)
    {

        if (view == findViewById(R.id.TbuttonImage))// check which button is pressed
        {
            Fragment fragment;// fragment class object
            fragment = new TFragment_image();// object to userdefined class for fragment is created
            FragmentManager fm  = getSupportFragmentManager();// predefined fragmentManager class is used
            FragmentTransaction ft = fm.beginTransaction();// FragmentTransaction to perform transaction
            ft.replace(R.id.fragment_area, fragment);//reference to <fragment> of main activity
            ft.commit();//final step
        }
        if (view == findViewById(R.id.TbuttonTxt))// check which button is pressed
        {
            Fragment fragment;
            fragment = new TFragment_text();
            FragmentManager fm  = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_area, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.BbuttonImage))// check which button is pressed
        {
            Fragment fragment;
            fragment = new BFragment_image();
            FragmentManager fm  = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_area, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.BbuttonTxt))// check which button is pressed
        {
            Fragment fragment;
            fragment = new BFragment_text();
            FragmentManager fm  = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_area, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.NbuttonImage))// check which button is pressed
        {
            Fragment fragment;
            fragment = new NFragment_image();
            FragmentManager fm  = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_area, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.NbuttonTxt))// check which button is pressed
        {
            Fragment fragment;
            fragment = new NFragment_text();
            FragmentManager fm  = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_area, fragment);
            ft.commit();
        }


    }
}


