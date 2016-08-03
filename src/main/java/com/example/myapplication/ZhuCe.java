package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/8/2.
 */
public class ZhuCe extends Activity implements View.OnFocusChangeListener, View.OnClickListener {

    Button register_Button_register;
    Button register_Button_Back;
    Button register_Verification_Code_Button;
    EditText register_Name;
    EditText register_Password;
    EditText register_Confirm_Password;
    EditText register_Email;
    EditText register_Verification_Code;
    TextView register_Name_Text;
    TextView register_Password_Text;
    TextView register_Confirm_Password_Text;
    TextView register_Email_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce);
        init();
    }

    public void init() {
        register_Button_register = (Button) findViewById(R.id.register_Button_register);
        register_Button_Back = (Button) findViewById(R.id.register_Button_Back);
        register_Verification_Code_Button = (Button) findViewById(R.id.register_Verification_Code_Button);
        register_Name = (EditText) findViewById(R.id.register_Name);
        register_Password = (EditText) findViewById(R.id.register_Password);
        register_Confirm_Password = (EditText) findViewById(R.id.register_Confirm_Password);
        register_Email = (EditText) findViewById(R.id.register_Email);
        register_Verification_Code = (EditText) findViewById(R.id.register_Verification_Code);
        register_Name_Text = (TextView) findViewById(R.id.register_Name_Text);
        register_Password_Text = (TextView) findViewById(R.id.register_Password_Text);
        register_Confirm_Password_Text = (TextView) findViewById(R.id.register_Confirm_Password_Text);
        register_Email_Text = (TextView) findViewById(R.id.register_Email_Text);

        register_Name.setOnFocusChangeListener(this);
        register_Password.setOnFocusChangeListener(this);
        register_Confirm_Password.setOnFocusChangeListener(this);
        register_Email.setOnFocusChangeListener(this);
        register_Verification_Code.setOnFocusChangeListener(this);

        register_Button_register.setOnClickListener(this);
        register_Button_Back.setOnClickListener(this);
        register_Verification_Code_Button.setOnClickListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch (v.getId()) {
            case R.id.register_Name:
                String Name_date = register_Name.getText().toString();
                if (Name_date == null) {
                    register_Name_Text.setText("请输入用户名");
                } else if (Name_date.length() < 3 || Name_date.length() > 6) {
                    register_Name_Text.setText("长度是3到6个字符");
                } else {
                    register_Name_Text.setText("输入正确");
                }
                break;
            case R.id.register_Password:
                String Password_date = register_Password.getText().toString();
                if (Password_date == null) {
                    register_Password_Text.setText("请输入密码");
                } else if (Password_date.length() < 6 || Password_date.length() > 12) {
                    register_Password_Text.setText("密码必须在6到12位之间");
                } else {
                    register_Password_Text.setText("输入正确");
                }
                break;
            case R.id.register_Confirm_Password:
                String Confirm_Password_date = register_Confirm_Password.getText().toString();
                if (Confirm_Password_date == null) {
                    register_Confirm_Password_Text.setText("请输入密码");
                } else if (!Confirm_Password_date.equals(register_Password.getText().toString())) {
                    register_Confirm_Password_Text.setText("两次密码不一致");
                } else {
                    register_Confirm_Password_Text.setText("输入正确");
                }
                break;
            case R.id.register_Email:
                String register_Email_data = register_Email.getText().toString();
                String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
                if (!register_Email_data.matches(regex)) {
                    register_Email_Text.setText("请填写正确的邮箱");
                } else {
                    register_Email_Text.setText("输入正确");
                }
                break;
            case R.id.register_Verification_Code:

                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register_Button_register:

                break;
            case R.id.register_Button_Back:
                Intent intent=new Intent(ZhuCe.this,Login.class);
                startActivity(intent);
                break;
            case R.id.register_Verification_Code_Button:

                break;
        }
    }
}
