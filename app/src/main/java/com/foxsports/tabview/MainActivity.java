package com.foxsports.tabview;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout slidingTabs = (TabLayout) findViewById(R.id.sliding_tabs);
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 1"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 2"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 3"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 4"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 5"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 6"));
        slidingTabs.addTab(slidingTabs.newTab().setText("Tab 7"));
    }
}
