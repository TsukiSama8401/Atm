package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Area2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView area2;
    private String[] areas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);

        area2 = (ListView) findViewById(R.id.area2);
        areas = new String[]{"中正區" , "暖暖區" ,"八堵區"};
        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 , areas);
        area2.setAdapter(adapter);
        area2.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch(position){
            case 0:
                Toast.makeText(this , "中正區" , Toast.LENGTH_LONG).show();
                finish();
                break;
            case 1:
                Toast.makeText(this , "暖暖區" , Toast.LENGTH_LONG).show();
                finish();
                break;
            case 2:
                Toast.makeText(this , "八堵區" , Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}
