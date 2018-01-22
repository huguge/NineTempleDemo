package com.example.hanfl.ninetempledemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.hanfl.ninetempledemo.eventbus.MessageEvent;

import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Activity mActivity;

    @BindView(R.id.btn_lottery)
    Button btn_lottery;
    @BindView(R.id.btn_sign)
    Button btn_sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_lottery)
    void onLottery(View view) {
        startActivity(new Intent(this, LotteryActivity.class));
    }
    @OnClick(R.id.btn_sign)
    void onSign(View view) {
        startActivity(new Intent(this, SignCalenderActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Subscribe
    public void onMessageEvent(MessageEvent event) {

    }

}
