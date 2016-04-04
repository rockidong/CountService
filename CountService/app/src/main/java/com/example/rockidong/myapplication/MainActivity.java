package com.example.rockidong.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCurNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        switch ((v.getId()))
        {
            case R.id.start_btn:
            {
                while(mCurNum <= 10000)
                {
                    mCurNum ++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }
            case R.id.stop_btn:
            {
                mCurNum = 0;
                break;
            }
            case R.id.show_btn:
            {
                Toast.makeText(this,"Current Number : " + mCurNum,Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
