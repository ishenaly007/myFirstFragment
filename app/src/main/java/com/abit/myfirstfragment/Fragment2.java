package com.abit.myfirstfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    TextView text;
    Button plus;
    Button minus;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        plus=requireActivity().findViewById(R.id.btn_plus);
        minus=requireActivity().findViewById(R.id.btn_minus);
        text=requireActivity().findViewById(R.id.num);

        plus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Integer number= Integer.valueOf(text.getText().toString());
                number++;
                text.setText(number.toString());
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Integer number= Integer.valueOf(text.getText().toString());
                number--;
                text.setText(number.toString());
            }
        });
    }
}