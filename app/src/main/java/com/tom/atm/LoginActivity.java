package com.tom.atm;

import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edUserid;
    private EditText edPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edUserid = (EditText) findViewById(R.id.userid);
        SharedPreferences setting = getSharedPreferences("ATM" , MODE_PRIVATE);
        edUserid.setText(setting.getString("PREF_USERID" , ""));
        edPasswd = (EditText) findViewById(R.id.passwd);
    }

    public void login(View view){

        String uid = edUserid.getText().toString();
        String pw = edPasswd.getText().toString();
        if(uid.equals("jack") && pw.equals("1234")){
                getSharedPreferences("ATM" , MODE_PRIVATE)
                .edit()
                .putString("PREF_USERID" , uid)
                .commit();
            Toast.makeText(this , "登入成功" , Toast.LENGTH_LONG).show();
            getIntent().putExtra("EXTRA_USERID" , uid);
            setResult(RESULT_OK , getIntent());
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("登入")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK" ,null)
                    .show();
        }
    }
}
