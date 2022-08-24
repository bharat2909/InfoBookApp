package com.example.myinfobook;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myinfobook.Adapters.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec = (RecyclerView) findViewById(R.id.recView);
        rec.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(data(),this);
        rec.setAdapter(adapter);
    }

    public ArrayList<ModelClass> data()
    {
        ArrayList<ModelClass> data = new ArrayList<>();

        ModelClass model = new ModelClass();
        model.setDesc("The Countries");
        model.setImg(R.drawable.country);
        data.add(model);

        ModelClass model1 = new ModelClass();
        model1.setDesc("The Museums");
        model1.setImg(R.drawable.museums);
        data.add(model1);

        ModelClass model2 = new ModelClass();
        model2.setDesc("Sports");
        model2.setImg(R.drawable.sports);
        data.add(model2);

        ModelClass model3 = new ModelClass();
        model3.setDesc("The Wonders");
        model3.setImg(R.drawable.wonders);
        data.add(model3);


        return data;
    }
}