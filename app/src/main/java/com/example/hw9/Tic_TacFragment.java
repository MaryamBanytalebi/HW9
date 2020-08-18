package com.example.hw9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tic_TacFragment extends Fragment {
    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,mButton8,mButton9;
    private TextView mTxtPlayer1,mTxtPlayer2;

    public Tic_TacFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tic__tac, container, false);
        findViews(view);
        setListeners();
        return view;
    }

    private void setListeners() {
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void findViews(View view) {
        mButton1=view.findViewById(R.id.button1);
        mButton2=view.findViewById(R.id.button2);
        mButton3=view.findViewById(R.id.button3);
        mButton4=view.findViewById(R.id.button4);
        mButton5=view.findViewById(R.id.button5);
        mButton6=view.findViewById(R.id.button6);
        mButton7=view.findViewById(R.id.button7);
        mButton8=view.findViewById(R.id.button8);
        mButton9=view.findViewById(R.id.button9);
        mTxtPlayer1=view.findViewById(R.id.txt_player1);
        mTxtPlayer2=view.findViewById(R.id.txt_player2);
    }
}