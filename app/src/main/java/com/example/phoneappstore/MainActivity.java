package com.example.phoneappstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //test comment
            setContentView(R.layout.activity_main);

            RecyclerView recycler = (RecyclerView) findViewById(R.id.phone_recycler);


            String[] captions = new String[Phone.phones.length];
            int[] ids = new int[Phone.phones.length];
            String[] desc = new String[Phone.phones.length];

            for (int i = 0; i < captions.length; i++) {
                captions[i] = Phone.phones[i].getName();
                ids[i] = Phone.phones[i].getImageID();
                desc[i] = Phone.phones[i].getDescription();
            }
            recycler.setLayoutManager(new LinearLayoutManager(this));
            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
            recycler.setAdapter(adapter);


        }


    }
