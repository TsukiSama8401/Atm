package com.tom.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    private Spinner addr;
    private Spinner block;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);

        addr = (Spinner) findViewById(R.id.addr_array);
        block = (Spinner) findViewById(R.id.block_array);
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , new String[]{"基隆市" ,"新北市" , "台北市"});
        addr.setAdapter(adapter);

        addr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[]data = null;
                if (position == 0){
                    data = new String[]{"中正區" , "暖暖區" , "八堵區"};
                }
                if (position == 1){
                    data = new String[]{"永和區" , "板橋區" , "新莊區"};
                }
                if (position == 2){
                    data = new String[]{"信義區" , "大安區" ,"士林區"};
                }
                ArrayAdapter adapter1 = new ArrayAdapter(AddrActivity.this , android.R.layout.simple_list_item_1 , data);
                block.setAdapter(adapter1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


}
