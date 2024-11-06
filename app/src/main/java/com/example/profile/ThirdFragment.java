package com.example.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;





public class ThirdFragment extends Fragment {

    @Nullable
    @NonNull

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.third_fragment, container, false);
        view.setBackgroundResource(R.color.red);
        return view;
    }

}
