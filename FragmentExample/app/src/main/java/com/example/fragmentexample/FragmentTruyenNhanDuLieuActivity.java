package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FragmentTruyenNhanDuLieuActivity extends AppCompatActivity {

    private Button btnAdd = null;
    private TextView txtTVNDL = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_truyen_nhan_du_lieu);

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btnAdd = (Button) findViewById(R.id.btnAddTVNDLActi);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment3 = new Fragment3();
                Bundle bundle = new Bundle();
                bundle.putString("HoVaTen", "Nguyên Văn asdsada");
                fragment3.setArguments(bundle);
                fragmentTransaction.add(R.id.actiTruyenNhanDuLieu, fragment3);
                fragmentTransaction.commit();
            }
        });
    }
}
