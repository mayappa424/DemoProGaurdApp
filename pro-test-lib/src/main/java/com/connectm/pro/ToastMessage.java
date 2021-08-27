package com.connectm.pro;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public void showToastToMe(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    private int getCurrentYear() {
        return 2021;
    }

    protected int addTwoNumber(int a, int b) {
        return a + b;
    }
}
