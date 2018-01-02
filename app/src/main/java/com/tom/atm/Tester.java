package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tester);
    }

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
        System.out.println(sdf.format(now));
        String s = "1998-07-10";
        try{
            Date birthday = sdf.parse(s);
            System.out.println(birthday);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
