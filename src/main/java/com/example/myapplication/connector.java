package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adapter.Connector_Adapter;


/**
 * Created by Administrator on 2016/7/31.
 */
public class connector extends Activity implements AdapterView.OnItemClickListener,View.OnClickListener{

    ListView listView;
    Button addconnector;
    List<String> list;
    Connector_Adapter adapter;

    String[] str=new String[]{"first","second","third","four","fifth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connector);
        init();
    }

    public void init()
    {
        addconnector= (Button) findViewById(R.id.addconnector);
        addconnector.setOnClickListener(this);
        listView= (ListView) findViewById(R.id.connector_listview);
        listView.setOnItemClickListener(this);
        list=new ArrayList<>();
        for (int i=0;i<str.length;i++)
        {
            list.add(str[i]);
        }
        adapter=new Connector_Adapter(connector.this,list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(connector.this,Device.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.addconnector:
                Intent intent = new Intent(connector.this,Create_Connector.class);
                startActivity(intent);
            break;

        }
    }
}
