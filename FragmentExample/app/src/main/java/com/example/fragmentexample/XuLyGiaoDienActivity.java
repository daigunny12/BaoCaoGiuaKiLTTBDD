package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class XuLyGiaoDienActivity extends AppCompatActivity implements TruyenSinhVien {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xu_ly_giao_dien);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        FragmentSinhVienInfo fragmentSinhVienInfo = (FragmentSinhVienInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentInfoSV);

        Configuration configuration = getResources().getConfiguration();
        //&&  fragmentSinhVienInfo.isInLayout()
        if(fragmentSinhVienInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentSinhVienInfo.SetInfo(sinhVien);
        }else{
            Intent intent = new Intent(XuLyGiaoDienActivity.this, StudentInfomationActivity.class);
            intent.putExtra("ThongTinSinhVien", sinhVien);
            startActivity(intent);
        }
    }
}
