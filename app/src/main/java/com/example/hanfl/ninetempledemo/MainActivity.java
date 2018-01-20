package com.example.hanfl.ninetempledemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hanfl.ninetempledemo.adapter.DemoAdapter;
import com.example.hanfl.ninetempledemo.data.PrizeData;
import com.example.hanfl.ninetempledemo.eventbus.MessageEvent;
import com.example.hanfl.ninetempledemo.utils.AppJsonFileReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

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
        Toast.makeText(mActivity, "进入签到", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Subscribe
    public void onMessageEvent(MessageEvent event) {

    }

}
