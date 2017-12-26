package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Area3Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView area3;
    private String[] areas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area3);

        area3 = (ListView) findViewById(R.id.area3);
        areas = new String[] {"信義區" , "大安區" ,"士林區"};
        ArrayAdapter adapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 , areas);
        area3.setAdapter(adapter);
        area3.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        switch(position) {
            case 0:
                Toast.makeText(this, "信義區", Toast.LENGTH_LONG).show();
                finish();
                break;
            case 1:
                Toast.makeText(this, "大安區", Toast.LENGTH_LONG).show();
                finish();
                break;
            case 2:
                Toast.makeText(this, "士林區", Toast.LENGTH_LONG).show();
                finish();
                break;
        }
    }
}
