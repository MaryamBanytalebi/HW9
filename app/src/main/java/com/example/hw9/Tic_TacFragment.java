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

public class Tic_TacFragment extends Fragment implements View.OnClickListener {
    private Button[][] buttons=new Button[3][3];
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
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                String buttonID="button_"+i+j;
                int resID=getResources().getIdentifier(buttonID,"id",getActivity().getPackageName());
                buttons[i][j]=view.findViewById(resID);
                buttons[i][j].setOnClickListener(Tic_TacFragment.this);
            }
        }
        return view;
    }

    private void findViews(View view) {
        mTxtPlayer1=view.findViewById(R.id.txt_player1);
        mTxtPlayer2=view.findViewById(R.id.txt_player2);
    }

    private boolean checkForWiner(){
        String[][] field = new String[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                field[i][j]=buttons[i][j].getText().toString();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2])&& !field[i][0].equals("")){
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i])&& !field[0][i].equals("")){
                return true;
            }
        }
        if (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2])&& !field[0][0].equals("")) {
            return true;
        }
        if (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0])&& !field[0][2].equals("")) {
            return true;
        }

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
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        mRoundCount=0;
        mPlayer1Turn=true;
    }

    @Override
    public void onClick(View view) {
            if (!((Button)view).getText().toString().equals("")){
                return;
            }
            if (mPlayer1Turn){
                ((Button)view).setText("X");
            }else{
                ((Button)view).setText("O");
            }
            mRoundCount++;

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
}