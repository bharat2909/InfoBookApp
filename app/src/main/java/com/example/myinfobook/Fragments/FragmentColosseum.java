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

public class FragmentColosseum extends Fragment {

    ImageView img;
    TextView t1;
    ProgressBar ProgressBarTajMahal;


    public FragmentColosseum() {
        // Required empty public constructor
    }

    public FragmentColosseum newInstance()
    {
        return new FragmentColosseum();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_colosseum, container, false);

        img = view.findViewById(R.id.imageViewNMC);
        t1 = view.findViewById(R.id.textViewNMC);
        ProgressBarTajMahal = view.findViewById(R.id.progressBarNMC);


//        img.setImageResource(R.drawable.india);
//        ProgressBarInd.setVisibility(view.INVISIBLE);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/" +
                "Colosseo_2020.jpg/405px-Colosseo_2020.jpg").into(img, new Callback() {
            @Override
            public void onSuccess() {
                ProgressBarTajMahal.setVisibility(view.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), "Unable to Load Image", Toast.LENGTH_SHORT).show();
                ProgressBarTajMahal.setVisibility(view.INVISIBLE);
            }
        });
        return view;
    }
}