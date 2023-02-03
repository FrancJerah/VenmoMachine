package com.app.venmomachine;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class receiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        TextView changeTextView;
        changeTextView = findViewById(R.id.priceNum);
        double change = getIntent().getIntExtra("change", 0);
        changeTextView.setText("Php "+ change);

        ImageView imageView;
        String imageName = getIntent().getStringExtra("image");
        imageView = findViewById(R.id.productView);

        TextView bname;
        bname = findViewById(R.id.brandName);

        TextView pname;
        pname = findViewById(R.id.priceName);
        switch (imageName) {
            case "image1":
                imageView.setImageResource(R.drawable.coke_can);
                bname.setText(R.string.product_name_1);
                pname.setText(R.string.product_price_1);
                break;
            case "image2":
                imageView.setImageResource(R.drawable.sprite_can);
                bname.setText(R.string.product_name_2);
                pname.setText(R.string.product_price_2);
                break;
            case "image3":
                imageView.setImageResource(R.drawable.mountain_dew_can);
                bname.setText(R.string.product_name_3);
                pname.setText(R.string.product_price_3);
                break;
            case "image4":
                imageView.setImageResource(R.drawable.tropicana_bottle);
                bname.setText(R.string.product_name_4);
                pname.setText(R.string.product_price_4);
                break;
            case "image5":
                imageView.setImageResource(R.drawable.mineral_water);
                bname.setText(R.string.product_name_5);
                pname.setText(R.string.product_price_5);
                break;
            case "image6":
                imageView.setImageResource(R.drawable.pepsi_can);
                bname.setText(R.string.product_name_6);
                pname.setText(R.string.product_price_6);
                break;
        }

        Button back;
        back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(receiptActivity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}