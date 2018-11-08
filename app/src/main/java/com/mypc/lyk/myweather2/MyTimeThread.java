package com.mypc.lyk.myweather2;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeThread extends Thread {
    public TextView tvDate;
    private int msgKey1 = 22;

    public MyTimeThread(TextView tvDate) {
        this.tvDate = tvDate;
    }
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);  //时间间隔
                Message msg = new Message();
                msg.what = msgKey1;
                mHandler.sendMessage(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 22:
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    String date = sdf.format(new Date());
                    tvDate.setText(date);
                    break;
                default:
                    break;
            }
        }
    };
}
