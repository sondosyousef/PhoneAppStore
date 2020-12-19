package com.example.phoneappstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Button b = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("phone_id");

        Phone phone = Phone.phones[id];

        ImageView image = (ImageView)findViewById(R.id.image1);
        image.setImageResource(phone.getImageID());

        TextView txtName= (TextView)findViewById(R.id.namePhone);
        TextView txtDesc= (TextView)findViewById(R.id.description_phone);

        txtName.setText(phone.getName());
        txtDesc.setText(phone.getDescription());
    }
    public void setGoBack(View view){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }
}