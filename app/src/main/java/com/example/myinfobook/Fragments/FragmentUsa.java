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

public class FragmentUsa extends Fragment {

    ImageView img;
    TextView t1;
    ProgressBar ProgressBarInd;


    public FragmentUsa() {
        // Required empty public constructor
    }

    public FragmentUsa newInstance()
    {
        return new FragmentUsa();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_usa, container, false);

        img = view.findViewById(R.id.imageViewNMC);
        t1 = view.findViewById(R.id.textViewNMC);
        ProgressBarInd = view.findViewById(R.id.progressBarNMC);


//        img.setImageResource(R.drawable.usa);
//        ProgressBarInd.setVisibility(view.INVISIBLE);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/" +
                "Flag_of_the_United_States.svg/1920px-Flag_of_the_United_States.svg.png").into(img, new Callback() {
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