package com.example.firstproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        //frameLayout.setBackgroundResource(R.mipmap.qr);
        setContentView(frameLayout);
        TextView textView = new TextView(this);
        textView.setText("开始游戏");
        textView.setTextColor(Color.rgb(100,10,30));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        textView.setLayoutParams(params);
        textView.setOnClickListener(new View.OnClickListener() {
            //            @Override
//            public  void  onClick(View v) {
//                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示").setMessage("游戏又风险").setPositiveButton("确定",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                            }
//                        }).setNegativeButton("退出", new DialogInterface.OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        //Log.i("1234");
//                        finish();
//                    }
//                }).show();
//            }
            @Override
            public  void  onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AudioPlayActivity.class);
                startActivity(intent);
            }


        });
        frameLayout.addView(textView);
    }
}