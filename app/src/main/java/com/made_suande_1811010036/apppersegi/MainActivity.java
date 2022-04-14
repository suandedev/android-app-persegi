package com.made_suande_1811010036.apppersegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView sisi, tv_luas, tv_kell;
    private Button btn_luas, btn_kell;

    int luas, kell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sisi = findViewById(R.id.sisi);
        tv_luas = findViewById(R.id.tv_luas);
        tv_kell = findViewById(R.id.tv_kell);
        btn_kell = findViewById(R.id.btn_kell);
        btn_luas = findViewById(R.id.btn_luas);

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luas(sisi.getText().toString());
            }
        });

        btn_kell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keliling(sisi.getText().toString());
            }
        });

    }

    private void keliling(String sisi) {
        if (sisi.equals("")) {
            Toast.makeText(this, "input should number", Toast.LENGTH_SHORT).show();
            tv_luas.setText("");
            tv_kell.setText("");
        } else {
            kell = 4 * Integer.parseInt(sisi);
            tv_kell.setText(String.valueOf(kell));
            Toast.makeText(this, "success get keliling persegi", Toast.LENGTH_SHORT).show();
        }
    }

    private void luas(String sisi) {
        if (sisi.equals("")) {
            Toast.makeText(this, "input should number", Toast.LENGTH_SHORT).show();
            tv_luas.setText("");
            tv_kell.setText("");
        } else {
            luas = (Integer.parseInt(sisi) * Integer.parseInt(sisi));
            tv_luas.setText(String.valueOf(luas));
            Toast.makeText(this, "success get luas persegi", Toast.LENGTH_SHORT).show();
        }

    }
}