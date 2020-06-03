package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentexample.R;

import java.util.ArrayList;

public class FragmentSinhVienInfo extends Fragment {
    private TextView txtHoVaTen;
    private TextView txtNamSinh;
    private TextView txtDiaChi;
    private TextView txtEmail;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sinh_vien_info, container, false);
        AnhXa();


        return view;
    }
    public void  SetInfo(SinhVien sinhVien){
        txtHoVaTen.setText("Họ và Tên: "+sinhVien.getName().toString());
        txtNamSinh.setText("Năm sinh: "+sinhVien.getNamSinh());
        txtDiaChi.setText("Địa chỉ: "+sinhVien.getDiaChi().toString());
        txtEmail.setText("Email: "+sinhVien.getEmail().toString());
    }

    private void  AnhXa(){
        txtHoVaTen = (TextView) view.findViewById(R.id.txtHoVaTen);
        txtNamSinh = (TextView) view.findViewById(R.id.txtNamSinh);
        txtDiaChi = (TextView) view.findViewById(R.id.txtDiaChi);
        txtEmail = (TextView) view.findViewById(R.id.txtEmail);

    }
}
