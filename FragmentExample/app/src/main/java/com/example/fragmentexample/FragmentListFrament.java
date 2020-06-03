package com.example.fragmentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class FragmentListFrament extends ListFragment {

    String[] arrayName= {"Nguyễn Văn A", "Lê Văn B", "Tạ Thị C", "Phan Xuân D" };
    ArrayAdapter arrayAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        arrayAdapter = new ArrayAdapter(getActivity(), R.layout.support_simple_spinner_dropdown_item, arrayName );
        setListAdapter(arrayAdapter);

        return inflater.inflate(R.layout.fragment_list_fragment, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Toast.makeText(getActivity(),arrayName[position], Toast.LENGTH_SHORT).show();
        
        super.onListItemClick(l, v, position, id);
    }
}
