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

public class AddFriendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();

        list.add("Scan QR code");
        list.add("Show QR code");
        list.add("Add by Username");
        list.add("Invite link");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i){
                            case 0:
                                // Scan qr code
                                startActivity(new Intent(AddFriendActivity.this, ScanQRCodeActivity.class));
                                break;
                            case 1:
                                // Show qr code
                                startActivity(new Intent(AddFriendActivity.this, ShowQRCodeActivity.class));
                                break;
                            case 2:
                                // Add by Username
                                startActivity(new Intent(AddFriendActivity.this, AddByUsernameActivity.class));
                                break;
                            case 3:
                                // invite link
                                startActivity(new Intent(AddFriendActivity.this, AddByInviteLinkActivity.class));
                                break;
                            default:
                                // default
                                break;
                        }
                    }
                });
    }
}