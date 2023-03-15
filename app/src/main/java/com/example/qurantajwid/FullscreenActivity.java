package com.example.qurantajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
    }

    public void changeImage(View view, int x){
        ImageView fullscreenImageView = (ImageView) view.findViewById(R.id.fullScreenImageView);
        if(fullscreenImageView.getDrawable().getConstantState() == getResources().getDrawable(x).getConstantState()){
            fullscreenImageView.setImageResource(x);
        }else{
            fullscreenImageView.setImageResource(x);
        }
    }

}