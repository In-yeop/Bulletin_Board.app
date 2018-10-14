package com.cs.bulletinboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.content.Intent;


public class MainActivity extends Activity {

    static final String[] LIST_MENU = {"게시글1","게시글2","게시글3","게시글4","게시글5","게시글6","게시글7","게시글8","게시글9","게시글10","게시글11","게시글12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.write);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simpleitem,LIST_MENU);

        ListView listview = (ListView) findViewById(R.id.List_view) ;
        listview.setAdapter(adapter) ;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,writing.class);
                startActivity(intent);
            }
        });

    }


}
