package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adapter.Device_Adapter;
import Model.DeviceModel;

/**
 * Created by Administrator on 2016/8/1.
 */
public class Device extends Activity implements View.OnClickListener{

    ListView Device_List;
    Device_Adapter adapter;
    List<DeviceModel> list;
    DeviceModel deviceModel;
    Button Device_Create;
    Button Device_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device);
        init();
    }

    public void init()
    {
        Device_Create= (Button) findViewById(R.id.Device_Create);
        Device_Back= (Button) findViewById(R.id.Device_Back);
        Device_List= (ListView) findViewById(R.id.Device_List);
        Device_Create.setOnClickListener(this);
        Device_Back.setOnClickListener(this);


        list=new ArrayList<>();

        AddData();
        adapter=new Device_Adapter(this,list);
        Device_List.setAdapter(adapter);
    }

    public void AddData()
    {
        deviceModel=new DeviceModel();
        deviceModel.setControl(true);
        deviceModel.setName("123");
        deviceModel.setStatus("离线");
        deviceModel.setType("灯泡");
        list.add(deviceModel);
        deviceModel=new DeviceModel();
        deviceModel.setControl(true);
        deviceModel.setName("123");
        deviceModel.setStatus("离线");
        deviceModel.setType("灯泡");
        list.add(deviceModel);
        deviceModel=new DeviceModel();
        deviceModel.setControl(true);
        deviceModel.setName("123");
        deviceModel.setStatus("离线");
        deviceModel.setType("灯泡");
        list.add(deviceModel);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Device_Back:
                Intent intent=new Intent(Device.this,connector.class);
                startActivity(intent);
                break;
            case  R.id.Device_Create:
                Intent intent1=new Intent(Device.this,Create_Device.class);
                startActivity(intent1);
                break;
        }
    }
}
