package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.NewsAdapter;
import com.example.recyclerview.Model.NewsModel;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        final RecyclerView recyclerView = findViewById(R.id.rv);

        ArrayList<NewsModel> data = new ArrayList<>();
        data.add(new NewsModel( 1,"Baseball", "News", R.drawable.baseball));
        data.add(new NewsModel( 2,"Badminton", "News", R.drawable.badminton));
        data.add(new NewsModel( 3,"Baseball", "News", R.drawable.baseball));
        data.add(new NewsModel( 4,"Badminton", "News", R.drawable.badminton));
        data.add(new NewsModel( 5,"Baseball", "News", R.drawable.baseball));
        data.add(new NewsModel( 6,"Badminton", "News", R.drawable.badminton));
        data.add(new NewsModel( 7,"Baseball", "News", R.drawable.baseball));
        data.add(new NewsModel( 8,"Badminton", "News", R.drawable.badminton));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        NewsAdapter newsAdapter= new NewsAdapter(this, data);
        recyclerView.setAdapter(newsAdapter);

    }
}