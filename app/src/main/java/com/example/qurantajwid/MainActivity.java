package com.example.qurantajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view) {

    }

//    public void onBtnClick (View view){
//        TextView helloBye = findViewById(R.id.outFName);
//        TextView helloBye1 = findViewById(R.id.outLName);
//        TextView helloBye2 = findViewById(R.id.outEmail);
//        EditText edtTxtName = findViewById(R.id.edtTxtFName);
//        EditText edtTxtName1 = findViewById(R.id.edtTxtLName);
//        EditText edtTxtName2 = findViewById(R.id.edtTxtEmail);
//
//        helloBye.setText(edtTxtName.getText().toString());
//        helloBye1.setText(edtTxtName1.getText().toString());
//        helloBye2.setText(edtTxtName2.getText().toString());
//    }
}
//TODO: complete this