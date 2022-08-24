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

public class FragmentLouvre extends Fragment {

    ImageView img;
    TextView t1;
    ProgressBar ProgressBarInd;


    public FragmentLouvre() {
        // Required empty public constructor
    }

    public FragmentLouvre newInstance()
    {
        return new FragmentLouvre();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_louvre, container, false);

        img = view.findViewById(R.id.imageViewNMC);
        t1 = view.findViewById(R.id.textViewNMC);
        ProgressBarInd = view.findViewById(R.id.progressBarNMC);


//        img.setImageResource(R.drawable.india);
//        ProgressBarInd.setVisibility(view.INVISIBLE);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/" +
                "Louvre_Museum_Wikimedia_Commons.jpg/420px-Louvre_Museum_Wikimedia_Commons.jpg").into(img, new Callback() {
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