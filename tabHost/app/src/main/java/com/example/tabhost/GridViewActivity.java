package com.example.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList<Item> animalList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        simpleList = (GridView) findViewById(R.id.simpleGridView);
        animalList.add(new Item("Lion",R.drawable.lion));
        animalList.add(new Item("Tiger",R.drawable.tiger));
        animalList.add(new Item("Monkey",R.drawable.monkey));
        animalList.add(new Item("Elephant",R.drawable.elephant));
        animalList.add(new Item("Dog",R.drawable.dog));
        animalList.add(new Item("Cat",R.drawable.cat));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,animalList);
        simpleList.setAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}