package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        findViewById(R.id.read_more_btn).setOnClickListener(v -> {
            Toast.makeText(this, "好耶！", Toast.LENGTH_SHORT).show();
            Intent rm_intent = new Intent(this, ReadmoreActivity.class);
            startActivity(rm_intent);
        });
        findViewById(R.id.left_btn).setOnClickListener(v -> {
            v.setRotation(0);
            v.animate().rotationBy(360).setDuration(10_000L).start();
            Toast.makeText(this, "打了左脸！不讲武德", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.right_btn).setOnClickListener(v -> {
            v.setRotation(0);
            v.animate().rotationBy(360).setDuration(10_000L).start();
            Toast.makeText(this, "打了右脸！耗子尾汁", Toast.LENGTH_SHORT).show();
        });
    }

}
