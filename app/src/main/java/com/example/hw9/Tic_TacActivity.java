package com.example.hw9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tic_TacActivity extends AppCompatActivity {
    private Button mBtn_Tic_Toc,mBtn_Row;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac);

        findViews();

        setListeners();

    }

    private void setListeners() {
        mBtn_Tic_Toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container_TicToc);

                if (fragment == null) {
                    Tic_TacFragment cheatFragment = new Tic_TacFragment();
                    fragmentManager
                            .beginTransaction()
                            .add(R.id.fragment_container_TicToc, cheatFragment)
                            .commit();
                }
            }
        });
        mBtn_Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container_TicToc);

                if (fragment == null) {
                    Tic_TacFragment cheatFragment = new Tic_TacFragment();
                    fragmentManager
                            .beginTransaction()
                            .add(R.id.fragment_container_TicToc, cheatFragment)
                            .commit();
                }

            }
        });
    }

    private void findViews() {
        mBtn_Tic_Toc=findViewById(R.id.btn_Tic_Toc);
        mBtn_Row=findViewById(R.id.btn_row);
    }
}