package com.example.qurantajwid;

import static com.example.qurantajwid.R.id.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
//        implements View.OnClickListener
{

//    private ImageButton mLoadFragmentOne;
//    private ImageButton mLoadFragmentTwo;
//    private ImageButton mLoadFragmentThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton btnMenu = findViewById(R.id.btnMenu);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragmentFrame, MenuFragment.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name")
                .commit();
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, MenuFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                setHeadline("Menu");
            }
        });
//        mLoadFragmentOne = (ImageButton)findViewById(btnQuran);
//        mLoadFragmentTwo = (ImageButton)findViewById(btnTajwid);
//        mLoadFragmentThree = (ImageButton)findViewById(btnAU);
//
//        mLoadFragmentOne.setOnClickListener(this);
//        mLoadFragmentTwo.setOnClickListener(this);
//        mLoadFragmentThree.setOnClickListener(this);
    }

    MediaPlayer player;

    public void play(int x) {
        if (player == null) {
            player = MediaPlayer.create(this, x);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(){
        if(player!=null){
            player.pause();
        }
    }

    public void stopPlayer(){
        if (player!=null) {
            player.release();
            player=null;
            Toast.makeText(this, "Media telah dimainkan", Toast.LENGTH_SHORT).show();
        }
    }

    public void setHeadline(String txt){
        TextView editHeadline = findViewById(R.id.headline);
        editHeadline.setText(txt);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

    //    @Override
////    public void onClick(View view)
////    {
////        switch(view.getId())
////        {
////            case btnQuran:
////                Fragment fragmentOne = new Fragment();
////
////                loadFragment(fragmentOne, "fragmentOne");
////
////                break;
////            case btnTajwid:
////                Fragment fragmentTwo = new Fragment();
////
////                loadFragment(fragmentTwo, "fragmentTwo");
////
////                break;
////            case btnAU:
////                Fragment fragmentThree = new Fragment();
////
////                loadFragment(fragmentThree, "fragmentThree");
////
////                break;
////            default:
////                break;
////        }
////    }
//
//    /**
//     * This fragment container will be part of the main view.
//     */
//
////    public void loadFragment(Fragment frag, String tag)
////    {
////        FragmentManager fm = getSupportFragmentManager();
////        fm.beginTransaction()
////                .replace(R.id.fragmentFrame, frag, tag)
////                .setReorderingAllowed(true)
////                .addToBackStack("name")
////                .commit();
////
////
//////        FragmentManager fm = getSupportFragmentManager();
//////        FragmentTransaction ft = fm.beginTransaction();
//////
//////        Fragment fragment = getFragmentManager().findFragmentById(R.id.fragmentFrame);
//////        if(fragment == null)
//////        {
//////            ft.add(R.id.fragmentFrame, frag, tag);
//////        } else
//////        {
//////            ft.replace(R.id.fragmentFrame, frag, tag);
//////        }
//////        ft.addToBackStack(null);
//////
//////        ft.commit();
////    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
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