package com.example.asrani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        String value;
        Float actual_value;
        Double value1;
        String final_value;
        EditText inr = (EditText) findViewById(R.id.editText);
        TextView dollar = (TextView) findViewById(R.id.textView4);

        value = inr.getText().toString();
        actual_value = Float.valueOf(value);
        value1 = actual_value*0.015;
        final_value=value1.toString();
        dollar.setText(final_value);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
