package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import Util.LogUtil;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Create_Connector extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner Connector_Create_Spinner;
    LogUtil logUtil=new LogUtil();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_connector);
        init();
    }

    public void init()
    {
        Connector_Create_Spinner= (Spinner) findViewById(R.id.Connector_Create_Spinner);
        Connector_Create_Spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        logUtil.i("这是position"+position+"这是id"+id);
        logUtil.i(Connector_Create_Spinner.getSelectedItem().toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        logUtil.i("没有点击事件");
    }
}
