package com.nguyenminhngan.hocalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.nguyenminhngan.hocalertdialog.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        addEvents();
    }

    private void addEvents() {
        binding.btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyThoat();
            }
        });
    }

    private void xuLyThoat() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Xác nhận thoát ");
        builder.setMessage("Muốn thoát hả");
        builder.setNegativeButton("không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
