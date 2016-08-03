package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import CallBack.HttpCallBack;
import Model.UserModel;
import Util.HttpParamsUtils;
import Util.HttpUrl;
import Util.HttpUtil;

public class Login extends Activity implements View.OnClickListener {

    EditText Login_UserName, Login_Password;
    Button Login_DengLu;
    HttpUtil httpUtil;
    UserModel userModel;
    Button Login_register;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
    }

    public void init() {
        Login_register = (Button) findViewById(R.id.Login_register);
        Login_UserName = (EditText) findViewById(R.id.Login_UserName);
        Login_Password = (EditText) findViewById(R.id.Login_Password);
        Login_DengLu = (Button) findViewById(R.id.Login_DengLu);

        Login_register.setOnClickListener(this);
        Login_DengLu.setOnClickListener(this);
    }

    public void SendHttp(UserModel userModel) {
        httpUtil = new HttpUtil();
        httpUtil.HttpPost(HttpUrl.BaseUrl + HttpUrl.DengLu, new HttpCallBack() {
            @Override
            public void Response(String response) {

            }

            @Override
            public void error(Exception e) {

            }
        }, HttpParamsUtils.GetUserParams(userModel));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Login_DengLu:
                String UserNameDate = Login_UserName.getText().toString();
                String PasswordDate = Login_Password.getText().toString();

                userModel = new UserModel();
                userModel.setUserName(UserNameDate);
                userModel.setPassword(PasswordDate);
//                SendHttp(userModel);
                Intent intent = new Intent(Login.this, connector.class);
                startActivity(intent);
                break;
            case R.id.Login_register:
                Intent intent1 = new Intent(Login.this, ZhuCe.class);
                startActivity(intent1);
                break;
        }
    }
}
