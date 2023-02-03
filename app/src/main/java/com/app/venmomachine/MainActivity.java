package com.app.venmomachine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;
import android.graphics.Color;
import androidx.annotation.Nullable;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText CashAmount;
    int productPrice1 = 17;
    int productPrice2 = 17;
    int productPrice3 = 17;
    int productPrice4 = 34;
    int productPrice5 = 20;
    int productPrice6 = 17;

    private CardView card1, card2, card3, card4, card5, card6;
    ImageView image1, image2, image3, image4, image5, image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CashAmount = findViewById(R.id.CashAmountEdit);

        image1 = findViewById(R.id.coke);
        image2 = findViewById(R.id.sprite);
        image3 = findViewById(R.id.mountain_dew);
        image4 = findViewById(R.id.tropicana);
        image5 = findViewById(R.id.mineral_water);
        image6 = findViewById(R.id.pepsi);

        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);

        card1.setClickable(false);
        card2.setClickable(false);
        card3.setClickable(false);
        card4.setClickable(false);
        card5.setClickable(false);
        card6.setClickable(false);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                i.putExtra("image","image1");
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                int change = cashOnHand - productPrice1;
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                i.putExtra("image","image2");
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                int change = cashOnHand - productPrice2;
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                i.putExtra("image","image3");
                int change = cashOnHand - productPrice3;
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                i.putExtra("image","image4");
                int change = cashOnHand - productPrice4;
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                int change = cashOnHand - productPrice5;
                i.putExtra("image","image5");
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@Nullable View view) {
                Intent i = new Intent(MainActivity.this, receiptActivity.class);
                int cashOnHand = Integer.parseInt(CashAmount.getText().toString());
                i.putExtra("image","image6");
                int change = cashOnHand - productPrice6;
                i.putExtra("change", change);
                startActivity(i);
            }
        });

        EditText editText;

        editText = findViewById(R.id.CashAmountEdit);
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);
        card5 = (CardView) findViewById(R.id.card5);
        card6 = (CardView) findViewById(R.id.card6);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // Do nothing
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int enteredAmount = 0;
                int productPrice1 = 17;
                int productPrice2 = 17;
                int productPrice3 = 17;
                int productPrice4 = 34;
                int productPrice5 = 20;
                int productPrice6 = 17;

                try {
                    enteredAmount = Integer.parseInt(editable.toString());
                } catch (NumberFormatException e) {
                    editText.setText("0");
                    Toast.makeText(getApplicationContext(),"No number",Toast.LENGTH_SHORT).show();
                }

                if (enteredAmount >= productPrice1) {
                    card1.setCardBackgroundColor(Color.GREEN);
                    card1.setClickable(true);
                    image1.setClickable(true);
                }
                if (enteredAmount >= productPrice2) {
                    card2.setCardBackgroundColor(Color.GREEN);
                    card2.setClickable(true);
                    image2.setClickable(true);
                }
                if (enteredAmount >= productPrice3) {
                    card3.setCardBackgroundColor(Color.GREEN);
                    card3.setClickable(true);
                    image3.setClickable(true);
                }
                if (enteredAmount >= productPrice4) {
                    card4.setCardBackgroundColor(Color.GREEN);
                    card4.setClickable(true);
                    image4.setClickable(true);
                }
                if (enteredAmount >= productPrice5) {
                    card5.setCardBackgroundColor(Color.GREEN);
                    card5.setClickable(true);
                    image5.setClickable(true);
                }
                if (enteredAmount >= productPrice6) {
                    card6.setCardBackgroundColor(Color.GREEN);
                    card6.setClickable(true);
                    image6.setClickable(true);
                }
                else {
                    card1.setCardBackgroundColor(Color.LTGRAY);
                    card1.setClickable(false);
                    image1.setClickable(false);
                    card2.setCardBackgroundColor(Color.LTGRAY);
                    card2.setClickable(false);
                    image2.setClickable(false);
                    card3.setCardBackgroundColor(Color.LTGRAY);
                    card3.setClickable(false);
                    image3.setClickable(false);
                    card4.setCardBackgroundColor(Color.LTGRAY);
                    card4.setClickable(false);
                    image4.setClickable(false);
                    card5.setCardBackgroundColor(Color.LTGRAY);
                    card5.setClickable(false);
                    image5.setClickable(false);
                    card6.setCardBackgroundColor(Color.LTGRAY);
                    card6.setClickable(false);
                    image6.setClickable(false);
                }
            }
        });
    }
}






