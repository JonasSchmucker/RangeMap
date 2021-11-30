package com.rangemap.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.rangemap.R;
import com.rangemap.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();

        list.add("Lotte");
        list.add("Bernd");
        list.add("Lisa");
        list.add("Guenther");
        list.add("Hubert");
        list.add("Emma");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i){
                            case 0:

                                startActivity(new Intent(MainActivity.this, AddFriendActivity.class));
                                break;
                            case 1:

                                startActivity(new Intent(MainActivity.this, OverviewActivity.class));
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                // default
                                break;
                        }
                    }
                });
    }

}