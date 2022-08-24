package com.example.myinfobook.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myinfobook.Activity.CountryActivity;
import com.example.myinfobook.Activity.MuseumsActivity;
import com.example.myinfobook.Activity.SportsActivity;
import com.example.myinfobook.Activity.WondersActivity;
import com.example.myinfobook.ModelClass;
import com.example.myinfobook.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<viewHolder> {
    ArrayList<ModelClass> list;
    Context context;


    public MyAdapter(ArrayList<ModelClass> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardview,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.img.setImageResource(list.get(position).getImg());
        holder.t1.setText(list.get(position).getDesc());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(position==0)
                {
                    Intent intent  = new Intent(context, CountryActivity.class);
                    context.startActivity(intent);
                }else if(position==1)
                {
                    Intent intent  = new Intent(context, MuseumsActivity.class);
                    context.startActivity(intent);
                }else if(position==2)
                {
                    Intent intent  = new Intent(context, SportsActivity.class);
                    context.startActivity(intent);
                }else if(position==3){
                    Intent intent  = new Intent(context, WondersActivity.class);
                    context.startActivity(intent);
                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
