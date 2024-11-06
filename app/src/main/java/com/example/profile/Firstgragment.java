package com.example.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Firstgragment extends Fragment {

    private int clickCount = 0;
    private TextView counterText;
    @Nullable
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.firstfragment, container, false);


        Button buttonClick = view.findViewById(R.id.buttonClick);
        counterText = view.findViewById(R.id.counterText);


        counterText.setText("Кликнуто: 0");


        buttonClick.setOnClickListener(v -> {
            clickCount++;
            counterText.setText("Кликнуто: " + clickCount);
        });

        view.setBackgroundResource(R.color.red);
        return view;
    }
}
