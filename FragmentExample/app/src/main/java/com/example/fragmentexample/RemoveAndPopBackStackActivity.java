package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RemoveAndPopBackStackActivity extends AppCompatActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_and_pop_back_stack);

    }

    public void Add1(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layoutRemoveAndPop, new Fragment1(),"frag1");
        fragmentTransaction.addToBackStack("1");
        fragmentTransaction.commit();
    }

    public void Add2(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layoutRemoveAndPop, new Fragment2(), "frag2");
        fragmentTransaction.addToBackStack("2");
        fragmentTransaction.commit();
    }

    public void Add3(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layoutRemoveAndPop, new Fragment3(), "frag3");
        fragmentTransaction.addToBackStack("3");
        fragmentTransaction.commit();
    }

    public  void Remove1(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment1 fragment1 = (Fragment1) getSupportFragmentManager().findFragmentByTag("frag1");
        if(fragment1 != null) {
            fragmentTransaction.remove(fragment1);
            fragmentTransaction.commit();
        }else{
            Toast.makeText(this, "fragment 1 không tồn tại", Toast.LENGTH_SHORT).show();
        }
    }

    public  void Remove2(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentByTag("frag2");
        if(fragment2 != null) {
            fragmentTransaction.remove(fragment2);
            fragmentTransaction.commit();
        }else{
            Toast.makeText(this, "fragment 2 không tồn tại", Toast.LENGTH_SHORT).show();
        }
    }

    public  void Remove3(View v){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment3 fragment3 = (Fragment3) getSupportFragmentManager().findFragmentByTag("frag3");
        if(fragment3 != null) {
            fragmentTransaction.remove(fragment3);
            fragmentTransaction.commit();
        }else{
            Toast.makeText(this, "fragment 3 không tồn tại", Toast.LENGTH_SHORT).show();
        }
    }

    public  void BackStack(View v){
        getSupportFragmentManager().popBackStack();
    }

    public void Pop(View v){
        getSupportFragmentManager().popBackStack("1", 0);
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getBackStackEntryCount() > 0){
            getSupportFragmentManager().popBackStack();
        }else{
            super.onBackPressed();
        }
    }
}
