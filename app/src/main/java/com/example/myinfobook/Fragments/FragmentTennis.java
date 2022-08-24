package com.example.myinfobook.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.myinfobook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentTennis extends Fragment {

    ImageView img;
    TextView t1;
    ProgressBar ProgressBarInd;


    public FragmentTennis() {
        // Required empty public constructor
    }

    public FragmentTennis newInstance()
    {
        return new FragmentTennis();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tennis, container, false);

        img = view.findViewById(R.id.imageViewNMC);
        t1 = view.findViewById(R.id.textViewNMC);
        ProgressBarInd = view.findViewById(R.id.progressBarNMC);


//        img.setImageResource(R.drawable.india);
//        ProgressBarInd.setVisibility(view.INVISIBLE);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/2013_" +
                "Australian_Open_-_Guillaume_Rufin.jpg/375px-2013_Australian_Open_-_Guillaume_Rufin.jpg").into(img, new Callback() {
            @Override
            public void onSuccess() {
                ProgressBarInd.setVisibility(view.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), "Unable to Load Image", Toast.LENGTH_SHORT).show();
                ProgressBarInd.setVisibility(view.INVISIBLE);
            }
        });
        return view;
    }
}