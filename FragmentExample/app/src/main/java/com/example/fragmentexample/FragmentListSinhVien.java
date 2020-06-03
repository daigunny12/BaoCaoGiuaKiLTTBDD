package com.example.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentListSinhVien extends ListFragment {

    ArrayList<SinhVien> sinhVienArrayList;
    StudentAdapter adapter;

    TruyenSinhVien truyenSinhVien;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        sinhVienArrayList = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, sinhVienArrayList);
        setListAdapter(adapter);

        truyenSinhVien = (TruyenSinhVien)getActivity();

        return inflater.inflate(R.layout.fragment_list_sinhvien, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyenSinhVien.DataStudent(sinhVienArrayList.get(position));
    }

    private void  AddArraySV(){
        sinhVienArrayList.add(new SinhVien("Nguyễn Văn A", 1999, "HCM", "nva@gmail.com"));
        sinhVienArrayList.add(new SinhVien("Nguyễn Văn B", 1998, "HN", "nvb@gmail.com"));
        sinhVienArrayList.add(new SinhVien("Nguyễn Văn C", 1997, "VT", "nvc@gmail.com"));
        sinhVienArrayList.add(new SinhVien("Nguyễn Văn D", 1996, "BD", "nvd@gmail.com"));
        sinhVienArrayList.add(new SinhVien("Nguyễn Văn E", 1995, "KG", "nve@gmail.com"));
    }
}
