package com.example.fragmentexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentDialogFragment extends DialogFragment {

    DeleData deleData ;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        deleData = (DeleData) getActivity();

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("Xác nhận");
        dialog.setMessage("Bạn chắc chắn muốn xóa không");
        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(getActivity(), "Có", Toast.LENGTH_SHORT).show();
                deleData.DeleData(true);
            }
        });
        dialog.setNegativeButton("không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(getActivity(), "Không", Toast.LENGTH_SHORT).show();
                deleData.DeleData(false);
            }
        });

        Dialog dl = dialog.create();

        return dl;
    }
}
