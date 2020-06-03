package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemoActivity extends AppCompatActivity {
    Button btndemo = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btndemo.findViewById(R.id.buttonDEmofragment);
        btndemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDeMoFragment fragmentDeMoFragment = new FragmentDeMoFragment();
                fragmentTransaction.add(R.id.RelayDemo, fragmentDeMoFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
