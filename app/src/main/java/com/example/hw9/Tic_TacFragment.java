package com.example.hw9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tic_TacFragment extends Fragment {
    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,mButton8,mButton9;
    private TextView mTxtPlayer1,mTxtPlayer2;
    private boolean mPlayer1Turn=true;
    private int mRoundCount;
    private int mPlayer1Points;
    private int mPlayer2Points;


    public Tic_TacFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*mRoundCount=savedInstanceState.getInt("roundCount");
        mPlayer1Points=savedInstanceState.getInt("player1Points");
        mPlayer2Points=savedInstanceState.getInt("player2Points");
        mPlayer1Turn=savedInstanceState.getBoolean("player1Turn");*/

    }
    /*@Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("roundCount", mRoundCount);
        outState.putInt("player1Points",mPlayer1Points);
        outState.putInt("player2Points",mPlayer2Points);
        outState.putBoolean("player1turn",mPlayer1Turn);
    }*/

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
                if (!(mButton1).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton1.setText("X");
                }else {
                    mButton1.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton2).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton2.setText("X");
                }else {
                    mButton2.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton3).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton3.setText("X");
                }else {
                    mButton3.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton4).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton4.setText("X");
                }else {
                    mButton4.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton5).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton5.setText("X");
                }else {
                    mButton5.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton6).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton6.setText("X");
                }else {
                    mButton6.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton7).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton7.setText("X");
                }else {
                    mButton7.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton8).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton8.setText("X");
                }else {
                    mButton8.setText("O");
                }
                mRoundCount++;

            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(mButton9).getText().toString().equals("")){
                    return;
                }
                if (mPlayer1Turn){
                    mButton9.setText("X");
                }else {
                    mButton9.setText("O");
                }
                mRoundCount++;

            }
        });
        if (checkForWiner()){
            if (mPlayer1Turn){
                player1Wins();
            }
            else{
                player2Wins();
            }
        }
       else if (mRoundCount == 9){
            draw();
        }
        else{
            mPlayer1Turn = !mPlayer1Turn;
        }
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

    private boolean checkForWiner(){
        String field1 = mButton1.getText().toString();
        String field2 = mButton2.getText().toString();
        String field3 = mButton3.getText().toString();
        String field4 = mButton4.getText().toString();
        String field5 = mButton5.getText().toString();
        String field6 = mButton6.getText().toString();
        String field7 = mButton7.getText().toString();
        String field8 = mButton8.getText().toString();
        String field9 = mButton9.getText().toString();
        if (field1.equals(field2) && field1.equals(field3))
            return true;
        if (field4.equals(field5) && field4.equals(field6))
            return true;
        if (field7.equals(field8) && field7.equals(field9))
            return true;
        if (field1.equals(field4) && field4.equals(field7))
            return true;
        if (field2.equals(field5) && field2.equals(field8))
            return true;
        if (field3.equals(field6)  && field3.equals(field9))
            return true;
        if (field1.equals(field5) && field1.equals(field9))
            return true;
        if (field3.equals(field5) && field3.equals(field7))
            return true;
        return false;
    }
    private void player1Wins(){
        mPlayer1Points++;
        Toast.makeText(getActivity()," بازیکن شماره 1 برنده شد",Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();
    }
    private void player2Wins(){
        mPlayer2Points++;
        Toast.makeText(getActivity(),"بازیکن شماره 2 برنده شد",Toast.LENGTH_SHORT).show();
        updatePointsText();
        resetBoard();

    }
    private void draw(){
        Toast.makeText(getActivity(),"draw",Toast.LENGTH_SHORT).show();
        resetBoard();

    }
    private void updatePointsText(){
        mTxtPlayer1.setText("امتیاز شرکت کننده اول"+mPlayer1Points);
        mTxtPlayer2.setText("امتیاز شرکت کننده دوم"+mPlayer2Points);
    }
    private void resetBoard(){
        mButton1.setText("");
        mButton2.setText("");
        mButton3.setText("");
        mButton4.setText("");
        mButton5.setText("");
        mButton6.setText("");
        mButton7.setText("");
        mButton8.setText("");
        mButton9.setText("");
        mRoundCount=0;
        mPlayer1Turn=true;
    }
}