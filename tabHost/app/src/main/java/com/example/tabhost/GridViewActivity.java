package com.example.tabhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList<Item> itemsList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        simpleList = (GridView) findViewById(R.id.simpleGridView);
        itemsList.add(new Item("it1",R.drawable.lion));
        itemsList.add(new Item("it2",R.drawable.tiger));
        itemsList.add(new Item("it3",R.drawable.monkey));
        itemsList.add(new Item("it4",R.drawable.elephant));
        itemsList.add(new Item("it6",R.drawable.dog));
        itemsList.add(new Item("it7",R.drawable.cat));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,itemsList);
        simpleList.setAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}