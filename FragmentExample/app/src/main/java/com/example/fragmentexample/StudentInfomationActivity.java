package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfomationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("ThongTinSinhVien");
        FragmentSinhVienInfo fragmentSinhVienInfo = (FragmentSinhVienInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentSVInfo);

        fragmentSinhVienInfo.SetInfo(sinhVien);
    }
}
