package com.tom.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void ok (View view){
        EditText edName = (EditText)findViewById(R.id.edName);
        EditText edPhone = (EditText)findViewById(R.id.edPhone);
        String name = edName.getText().toString();
        String phone = edPhone.getText().toString();
        getIntent().putExtra("EXTRA_NAME" , name);
        getIntent().putExtra("EXTRA_PHONE" , phone);
        setResult(RESULT_OK , getIntent());
        finish();
    }
}
