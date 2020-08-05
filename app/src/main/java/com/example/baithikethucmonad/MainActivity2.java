package com.example.baithikethucmonad;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }

        String qString = extras.getString("qString");
        final TextView textView = (TextView)
                findViewById(R.id.textView2);
        textView.setText(qString);
    }

    public void finish() {
        Intent data = new Intent();
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String returnString = editText1.getText().toString();
        data.putExtra("returnData", returnString);
        setResult(RESULT_OK, data);
        super.finish();
    }

    public void onClick (View view)
    {
        finish();
    }
}