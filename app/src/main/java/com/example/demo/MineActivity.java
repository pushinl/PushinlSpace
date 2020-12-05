package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MineActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        Button readmore_btn = findViewById(R.id.read_more_btn);
        readmore_btn.setOnClickListener(this);
        Button left_btn = findViewById(R.id.left_btn);
        left_btn.setOnClickListener(this);
        Button right_btn = findViewById(R.id.right_btn);
        right_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.read_more_btn) {
            Toast.makeText(this, "好耶！", Toast.LENGTH_SHORT).show();
            Intent rm_intent = new Intent(this, ReadmoreActivity.class);
            startActivity(rm_intent);
        } else if (v.getId() == R.id.left_btn) {
            Toast.makeText(this, "打了左脸！不讲武德", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.right_btn) {
            Toast.makeText(this, "打了右脸！耗子尾汁", Toast.LENGTH_SHORT).show();
        }
    }

}
