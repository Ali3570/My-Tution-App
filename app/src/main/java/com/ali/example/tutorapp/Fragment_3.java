package com.ali.example.tutorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_3 extends Fragment implements View.OnClickListener {


    Button phys;
    Button chems;
    Button bios;
    Button maths;


    public Fragment_3() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, container, false);

        phys = view.findViewById(R.id.btnsol1);
        chems = view.findViewById(R.id.btnsol2);
        bios= view.findViewById(R.id.btnsol3);
        maths = view.findViewById(R.id.btnsol4);


        phys.setOnClickListener(this);
        chems.setOnClickListener(this);
        bios.setOnClickListener(this);
        maths.setOnClickListener(this);

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
            case R.id.btnsol1:
                Intent i = new Intent(getActivity(),Physolution.class);
                startActivity(i);
                break;
            case R.id.btnsol2:
                Intent i2 = new Intent(getActivity(),ChemSolution.class);
                startActivity(i2);
                break;
            case R.id.btnsol3:
                Intent i3 = new Intent(getActivity(),Biosolution.class);
                startActivity(i3);
                break;
            case R.id.btnsol4:
                Intent i4 = new Intent(getActivity(),Mathssolution.class);
                startActivity(i4);
                break;
            default:

        }

    }
}