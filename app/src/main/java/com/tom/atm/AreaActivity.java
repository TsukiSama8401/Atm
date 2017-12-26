package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AreaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView area;
    private String[] areas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        area = (ListView) findViewById(R.id.area);
        areas = new String[]{"永和區" , "板橋區" , "新莊區"};
        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 , areas);
        area.setAdapter(adapter);
        area.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch(position){
            case 0:
                Toast.makeText(this , "永和區" , Toast.LENGTH_LONG).show();
                finish();
                break;
            case 1:
                Toast.makeText(this , "板橋區" , Toast.LENGTH_LONG).show();
                finish();
                break;
            case 2:
                Toast.makeText(this , "新莊區" , Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}
