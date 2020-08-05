package com.example.baithikethucmonad;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        final EditText editText1 = (EditText)
                findViewById(R.id.editTextTextPersonName);
        String myString = editText1.getText().toString();
        i.putExtra("qString", myString);
        //startActivity(i);
        startActivityForResult(i, REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        String returnString;
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK)
        {
            if (data.hasExtra("returnString1"))
            {
                returnString = data.getExtras().getString("returnString1");
            }
        }
    }
}