package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import Util.LogUtil;

/**
 * Created by Administrator on 2016/8/1.
 */
public class Create_Device extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner Device_Create_Spinner;
    LogUtil logUtil=new LogUtil();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_device);
        init();
    }

    public void init()
    {
        Device_Create_Spinner= (Spinner) findViewById(R.id.Device_Create_Spinner);
        Device_Create_Spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        logUtil.i(Device_Create_Spinner.getSelectedItem().toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
