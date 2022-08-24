package com.example.myinfobook.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myinfobook.R;

public class viewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView t1;
    LinearLayout cardView;

    public viewHolder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imageView);
        t1 = itemView.findViewById(R.id.tVCountries);
        cardView = itemView.findViewById(R.id.cardview1);
    }
}
