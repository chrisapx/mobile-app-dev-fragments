package com.chris.fragmentnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chris.fragmentnavigation.fragments.Fragment1;
import com.chris.fragmentnavigation.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display Fragment1 in the top container
        Fragment1 fragmentOne = new Fragment1();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_display, fragmentOne)
                .commit();

        // Display Fragment2 in the bottom container
        Fragment2 fragmentTwo = new Fragment2();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_buttons, fragmentTwo)
                .commit();
    }
}