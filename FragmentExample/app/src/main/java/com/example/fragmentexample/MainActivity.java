package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTao = null;
    private Button btnGiaoTiep = null;
    private Button btnDemo = null;
    private Button btnTruyenNhanDuLieu = null;
    private Button btnRemoveAndPop = null;
    private Button btnListFragment = null;
    private Button btnDigLogFragment = null;
    private Button btnXuLyGiaoDien = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             btnTao = (Button) findViewById(R.id.btnAddFragmentManinActi);
                btnTao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, AddFragmentActivity.class);
                    startActivity(intent);
                }
            });

            btnDemo = (Button) findViewById(R.id.btnDemoMainActi);
            btnDemo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this , DemoActivity.class);
                    startActivity(intent);
                }
            });


            btnGiaoTiep = (Button) findViewById(R.id.btnGiaoTiepFragmentMainActi);
            btnGiaoTiep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, GiaoTiepFragmentActivity.class);
                    startActivity(intent);
                }
            });

            btnTruyenNhanDuLieu = (Button) findViewById(R.id.btnFragTruyenNhan);
            btnTruyenNhanDuLieu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, FragmentTruyenNhanDuLieuActivity.class);
                    startActivity(intent);
                }
            });

            btnRemoveAndPop = (Button) findViewById(R.id.btnRemoveAndPop);
            btnRemoveAndPop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, RemoveAndPopBackStackActivity.class);
                    startActivity(intent);
                }
            });

            btnListFragment = (Button) findViewById(R.id.btnListFragment);
            btnListFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ListFragmentActivity.class);
                    startActivity(intent);
                }
            });

            btnDigLogFragment = (Button) findViewById(R.id.btnDialogFragment);
            btnDigLogFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DialogFragmentActivity.class);
                    startActivity(intent);
                }
            });

            btnXuLyGiaoDien = (Button) findViewById(R.id.btnXuLyGiaoDien);
            btnXuLyGiaoDien.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, XuLyGiaoDienActivity.class);
                    startActivity(intent);
                }
            });
    }
}
