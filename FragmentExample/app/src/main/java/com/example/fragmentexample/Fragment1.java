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

public class Fragment1 extends Fragment {
    Button btnClickFrag1;
    TextView txtFrag1;
    EditText editFrag1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
       View view = inflater.inflate(R.layout.fragment_1 , container, false);

       btnClickFrag1 = (Button) view.findViewById(R.id.btnClickFrga1);
       txtFrag1 = (TextView) view.findViewById(R.id.txtFragment1);
       editFrag1 = (EditText) view.findViewById(R.id.editFragment1);

       btnClickFrag1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TextView txtGiaoTiepActi = (TextView) getActivity().findViewById(R.id.txtGiaoTiepActi);
               txtGiaoTiepActi.setText(editFrag1.getText().toString());
           }
       });

        return view;
    }
}
