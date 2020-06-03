package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    TextView txtFragment3 = null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        txtFragment3 = (TextView) view.findViewById(R.id.txtFragment3);
        Bundle bundle = getArguments();

        if (bundle != null){
            txtFragment3.setText(bundle.getString("HoVaTen"));
        }

        return view;
    }
}
