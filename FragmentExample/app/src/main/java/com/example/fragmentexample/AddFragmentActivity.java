package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class AddFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_fragment);
    }

    public void addFragment(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        switch (view.getId()){
            case R.id.btnAddFragment1:  fragment = new Fragment3();
                fragmentTransaction.add(R.id.layoutdemo, fragment, "fragment1");
                break;
            case R.id.btnAddFragment2:  fragment = new Fragment4();
                fragmentTransaction.add(R.id.layoutdemo, fragment, "fragment2");
                break;
        }
        fragmentTransaction.replace(R.id.layoutdemo, fragment);
        fragmentTransaction.commit();
    }
}
