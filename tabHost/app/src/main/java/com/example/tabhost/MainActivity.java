package com.example.tabhost;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends TabActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec;
        Intent intent;

        spec = tabHost.newTabSpec("List");
        spec.setIndicator("List View");

        intent = new Intent(this, ListViewActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);



        spec = tabHost.newTabSpec("Tab Host");
        spec.setIndicator("Tab Host");

        intent = new Intent(this, ContactActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Grid view");
        spec.setIndicator("Grid View");

        intent = new Intent(this, GridViewActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(1);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
            }
        });


    }


}