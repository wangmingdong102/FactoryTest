package com.android.factorytest.keytest;

import android.app.Activity;
import android.os.Bundle;

    import com.android.factorytest.BaseActivity;
import com.android.factorytest.R;

public class KeyTest extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.key_test);
    }
}