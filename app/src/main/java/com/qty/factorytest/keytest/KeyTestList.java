package com.qty.factorytest.keytest;

import android.app.Activity;
import android.os.Bundle;

import com.qty.factorytest.BaseListActivity;

public class KeyTestList extends BaseListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mApplication.updateKeyTestList();
        setTestList(mApplication.getKeyTestList());
    }
}
