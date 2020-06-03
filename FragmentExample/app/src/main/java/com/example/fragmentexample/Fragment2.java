package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    Button btnClickFrag2;
    TextView txtFrag2;
    EditText editFrag2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_2 ,container, false) ;

        btnClickFrag2 = (Button) view.findViewById(R.id.btnClickFragment2);
        txtFrag2 = (TextView) view.findViewById(R.id.txtFragment2);
        editFrag2 = (EditText) view.findViewById(R.id.edtFragment2);

        btnClickFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtFragment1 = (TextView) getActivity().findViewById(R.id.txtFragment1);
                txtFragment1.setText(editFrag2.getText().toString());
            }
        });

        return view;
    }

}
