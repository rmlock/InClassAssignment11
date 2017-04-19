package com.example.android.inclassassignment11_rachell;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MyActivity extends AppCompatActivity {
    TextView display;
    ArrayList<jokes> randomJokeArrayList;
    String TAG = "JokeList";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        randomJokeArrayList = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(randomJokeArrayList);
        mRecyclerView.setAdapter(mAdapter);




    }

    public void newJoke(MenuItem item) {
        jokes joke = new jokes();
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();


        int  n = rand1.nextInt(2) + 1;
        int  n2 = rand2.nextInt(2) + 1;
        int  n3 = rand3.nextInt(10) + 2;

        if (n==1){
            joke.setProfession("Doctors walk into a bar, they ask why such a long wait?");

        }else {
            joke.setProfession("Lawyers get into a cab, and don't leave a tip- when the cab driver asks why they answer- ");
        }if (n2==1){
            joke.setPunchline(" because no soap Radio!");
        } else {
            joke.setPunchline(" because the aristocrats!!");
        }
        joke.setNumber(n3);


        randomJokeArrayList.add(joke);
        mAdapter.notifyDataSetChanged();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.addjokes, menu);

        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection

                return super.onOptionsItemSelected(item);
        }
    }



