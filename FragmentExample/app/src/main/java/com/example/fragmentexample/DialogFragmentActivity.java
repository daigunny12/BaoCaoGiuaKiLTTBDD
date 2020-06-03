package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DialogFragmentActivity extends AppCompatActivity implements DeleData {

    TextView txtActivity = null;
    Button btnXoa = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);

        btnXoa = (Button) findViewById(R.id.btnXoa);
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDialogFragment dialog = new FragmentDialogFragment();
                dialog.show(getSupportFragmentManager(), "dialog");
            }
        });
    }

    @Override
    public void DeleData(boolean gt) {
        if(gt){
            txtActivity = (TextView) findViewById(R.id.txtDigLogFragmentActivity);
            txtActivity.setText("");
        }
    }
}
