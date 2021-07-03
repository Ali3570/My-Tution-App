package com.ali.example.tutorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment_2 extends Fragment implements View.OnClickListener{

    Button phyq;
    Button chemq;
    Button bioq;
    Button mathq;

    public Fragment_2(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        phyq = view.findViewById(R.id.btnquiz1);
        chemq = view.findViewById(R.id.btnquiz2);
        bioq = view.findViewById(R.id.btnquiz3);
        mathq = view.findViewById(R.id.btnquiz4);


        phyq.setOnClickListener(this);
        chemq.setOnClickListener(this);
        bioq.setOnClickListener(this);
        mathq.setOnClickListener(this);




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
            case R.id.btnquiz1:
                Intent i = new Intent(getActivity(),Phyquiz.class);
                startActivity(i);
                break;
            case R.id.btnquiz2:
                Intent i2 = new Intent(getActivity(),Chemquiz.class);
                startActivity(i2);
                break;
            case R.id.btnquiz3:
                Intent i3 = new Intent(getActivity(),Bioquiz.class);
                startActivity(i3);
                break;
            case R.id.btnquiz4:
                Intent i4 = new Intent(getActivity(),mathsquiz.class);
                startActivity(i4);
                break;


            default:

        }

    }
}