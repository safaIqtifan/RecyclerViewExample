package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.recyclerview.Model.NewsModel;

public class NewsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        Bundle bundle = getIntent().getExtras();
        NewsModel newsModel = bundle.getParcelable("news");

        final TextView tvTitle = findViewById(R.id.tvTitle);
        final TextView category = findViewById(R.id.tvCategory);

        tvTitle.setText(newsModel.getTitle());
        tvTitle.setBackgroundResource(newsModel.getImag());

        category.setText(newsModel.getCategory());
    }
}