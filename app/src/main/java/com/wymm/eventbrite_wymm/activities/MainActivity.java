package com.wymm.eventbrite_wymm.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.wymm.eventbrite_wymm.R;
import com.wymm.eventbrite_wymm.adapters.HomeListRecyclerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView tvCity;
    private RecyclerView rv;
    private HomeListRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpFindViewById();
        setUpToolbar();

        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new HomeListRecyclerAdapter();
        rv.setAdapter(adapter);
    }

    private void setUpToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    private void setUpFindViewById() {
        toolbar = findViewById(R.id.toolbar);
        tvCity = findViewById(R.id.tv_city);
        rv = findViewById(R.id.rv);
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
        if (id == R.id.menu_notification) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
