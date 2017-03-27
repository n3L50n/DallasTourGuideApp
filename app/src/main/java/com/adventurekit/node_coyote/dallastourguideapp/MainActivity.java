package com.adventurekit.node_coyote.dallastourguideapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find View Pager to allow user to swipe between fragment views
        ViewPager viewPager = (ViewPager) findViewById(R.id.main_view_pager);

        //Create adapter to display correct fragment
        TourAdapter adapter = new TourAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
