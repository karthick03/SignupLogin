package com.example.karthickramjee.testing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by karthickramjee on 09/07/16.
 */
public class AnotherActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.newlayout);
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();
    }
}
