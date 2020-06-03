package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GiaoTiepFragmentActivity extends AppCompatActivity {
    Button btnChangeText ;
    TextView txtGiaoTiepFrag;
    Fragment1 fragment1;
    Fragment2 fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_tiep_fragment);

        btnChangeText = (Button) findViewById(R.id.btnGiaoTiepActi);
        txtGiaoTiepFrag = (TextView) findViewById(R.id.txtGiaoTiepActi);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.fragment1);
                fragment1.txtFrag1.setText(txtGiaoTiepFrag.getText().toString());
            }
        });


    }
}
