package com.ali.example.tutorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_1 extends Fragment implements View.OnClickListener {

    Button Phyn;
    Button chemn;
    Button bion;
    Button Mathn;

    public Fragment_1() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_1, container, false);
        Phyn = view.findViewById(R.id.btnsubj1);
        chemn = view.findViewById(R.id.btnsubj2);
        bion = view.findViewById(R.id.btnsubj3);
        Mathn = view.findViewById(R.id.btnsubj4);


        Phyn.setOnClickListener(this);
        chemn.setOnClickListener(this);
        bion.setOnClickListener(this);
        Mathn.setOnClickListener(this);




        //       Phyn.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//            Intent i = new Intent(getActivity(),Phynotes.class);
//            startActivity(i);
//           }
//       });
       return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnsubj1:
            Intent i = new Intent(getActivity(),Phynotes.class);
            startActivity(i);
            break;
            case R.id.btnsubj2:
                Intent i2 = new Intent(getActivity(),Chemnotes.class);
                startActivity(i2);
                break;
            case R.id.btnsubj3:
                Intent i3 = new Intent(getActivity(),Bionotes.class);
                startActivity(i3);
                break;
            case R.id.btnsubj4:
                Intent i4 = new Intent(getActivity(),Mathsnotes.class);
                startActivity(i4);
                break;


            default:

        }

    }
}