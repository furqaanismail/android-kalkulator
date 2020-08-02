package com.esc.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edit_nil1, edit_nil2;
    private TextView text_hasil;
    private Button btn_tambah, btn_kurang;
    private int nil1,nil2,hsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_nil1 = findViewById(R.id.edit_nilai1);
        edit_nil2 = findViewById(R.id.edit_nilai2);
        text_hasil = findViewById(R.id.text_hasil);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_kurang = findViewById(R.id.btn_kurang);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nil1 = Integer.parseInt(edit_nil1.getText().toString());
                nil2 = Integer.parseInt(edit_nil2.getText().toString());
                hsl = nil1+nil2;
                text_hasil.setText(String.valueOf(hsl));
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nil1 = Integer.parseInt(edit_nil1.getText().toString());
                nil2 = Integer.parseInt(edit_nil2.getText().toString());
                hsl = nil1-nil2;
                text_hasil.setText(String.valueOf(hsl));
            }
        });
    }
}