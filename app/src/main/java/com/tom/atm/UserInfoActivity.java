package com.tom.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfoActivity extends AppCompatActivity {

    public static final int INFO = 1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == INFO){
            Toast.makeText(this , "" , Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Button button =(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edName = (EditText)findViewById(R.id.edName);
                EditText edPhone = (EditText)findViewById(R.id.edPhone);
                String name = edName.getText().toString();
                String phone = edPhone.getText().toString();
                getIntent().putExtra("EXRA_NAME" , name);
                getIntent().putExtra("EXRA_PHONE" , phone);
                Intent intent = new Intent();
                intent.setClass(UserInfoActivity.this , MainActivity.class);
                startActivityForResult(intent , INFO);
            }
        });
    }
}
