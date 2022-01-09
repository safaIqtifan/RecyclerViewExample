package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.NewsModel;
import com.example.recyclerview.NewsDetailsActivity;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{

    Context context;
    ArrayList<NewsModel> data;

    public NewsAdapter(Context context, ArrayList<NewsModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);

        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(data.get(position).getTitle());
        holder.category.setText(data.get(position).getCategory());

        holder.title.setBackgroundResource(data.get(position).getImag());
        holder.constraintLayout.setOnClickListener(v -> {

            Intent i= new Intent(context, NewsDetailsActivity.class);
            i.putExtra("news", data.get(position));
            context.startActivity(i);

        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView category;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tvTitle);
            category = itemView.findViewById(R.id.tvCategory);
            constraintLayout = itemView.findViewById(R.id.layout);

        }
    }
}
