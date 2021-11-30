package com.rangemap.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.rangemap.R;

import java.util.ArrayList;
import java.util.List;

public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();

        list.add("My Account");
        list.add("Contacts");
        list.add("Settings");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i){
                            case 0:
                                startActivity(new Intent(OverviewActivity.this, AccountSettingsActivity.class));
                                break;
                            case 1:
                                startActivity(new Intent(OverviewActivity.this, ShowContactsActivity.class));
                                break;
                            case 2:
                                startActivity(new Intent(OverviewActivity.this, SettingsActivity.class));
                                break;
                            default:
                                // default
                                break;
                        }
                    }
                });
    }
}