package com.example.qurantajwid;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Juz1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz1Fragment newInstance(String param1, String param2) {
        Juz1Fragment fragment = new Juz1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    int halaman = 0;
    private int [] imghal = {
            R.drawable.alfatihah1,
            R.drawable.albaqarah1,
            R.drawable.albaqarah2,
            R.drawable.albaqarah3,
            R.drawable.albaqarah4,
            R.drawable.albaqarah5,
            R.drawable.albaqarah6,
            R.drawable.albaqarah7,
            R.drawable.albaqarah8,
            R.drawable.albaqarah9,
            R.drawable.albaqarah10,
            R.drawable.albaqarah11,
            R.drawable.albaqarah12,
            R.drawable.albaqarah13,
            R.drawable.albaqarah14,
            R.drawable.albaqarah15,
            R.drawable.albaqarah16,
            R.drawable.albaqarah17,
            R.drawable.albaqarah18,
            R.drawable.albaqarah19,
            R.drawable.albaqarah20};

    private int [][] mp3ayat = {
            {R.raw.fatihah1,
                    R.raw.fatihah2,
                    R.raw.fatihah3,
                    R.raw.fatihah4,
                    R.raw.fatihah5,
                    R.raw.fatihah6,
                    R.raw.fatihah7},
            {R.raw.fatihah1,
                    R.raw.baqarah1,
                    R.raw.baqarah2,
                    R.raw.baqarah3,
                    R.raw.baqarah4,
                    R.raw.baqarah5},
            {R.raw.baqarah6,
                    R.raw.baqarah7,
                    R.raw.baqarah8,
                    R.raw.baqarah9,
                    R.raw.baqarah10,
                    R.raw.baqarah11,
                    R.raw.baqarah12,
                    R.raw.baqarah13,
                    R.raw.baqarah14,
                    R.raw.baqarah15,
                    R.raw.baqarah16},
            {R.raw.baqarah17,
                    R.raw.baqarah18,
                    R.raw.baqarah19,
                    R.raw.baqarah20,
                    R.raw.baqarah21,
                    R.raw.baqarah22,
                    R.raw.baqarah23,
                    R.raw.baqarah24},
            {R.raw.baqarah25,
                    R.raw.baqarah26,
                    R.raw.baqarah27,
                    R.raw.baqarah28,
                    R.raw.baqarah29},
            {R.raw.baqarah30,
                    R.raw.baqarah31,
                    R.raw.baqarah32,
                    R.raw.baqarah33,
                    R.raw.baqarah34,
                    R.raw.baqarah35,
                    R.raw.baqarah36,
                    R.raw.baqarah37},
            {R.raw.baqarah38,
                    R.raw.baqarah39,
                    R.raw.baqarah40,
                    R.raw.baqarah41,
                    R.raw.baqarah42,
                    R.raw.baqarah43,
                    R.raw.baqarah44,
                    R.raw.baqarah45,
                    R.raw.baqarah46,
                    R.raw.baqarah47,
                    R.raw.baqarah48},
            {R.raw.baqarah49,
                    R.raw.baqarah50,
                    R.raw.baqarah51,
                    R.raw.baqarah52,
                    R.raw.baqarah53,
                    R.raw.baqarah54,
                    R.raw.baqarah55,
                    R.raw.baqarah56,
                    R.raw.baqarah57},
            {R.raw.baqarah58,
                    R.raw.baqarah59,
                    R.raw.baqarah60,
                    R.raw.baqarah61},
            {R.raw.baqarah62,
                    R.raw.baqarah63,
                    R.raw.baqarah64,
                    R.raw.baqarah65,
                    R.raw.baqarah66,
                    R.raw.baqarah67,
                    R.raw.baqarah68,
                    R.raw.baqarah69},
            {R.raw.baqarah70,
                    R.raw.baqarah71,
                    R.raw.baqarah72,
                    R.raw.baqarah73,
                    R.raw.baqarah74,
                    R.raw.baqarah75,
                    R.raw.baqarah76},
            {R.raw.baqarah77,
                    R.raw.baqarah78,
                    R.raw.baqarah79,
                    R.raw.baqarah80,
                    R.raw.baqarah81,
                    R.raw.baqarah82,
                    R.raw.baqarah83},
            {R.raw.baqarah84,
                    R.raw.baqarah85,
                    R.raw.baqarah86,
                    R.raw.baqarah87,
                    R.raw.baqarah88},
            {R.raw.baqarah89,
                    R.raw.baqarah90,
                    R.raw.baqarah91,
                    R.raw.baqarah92,
                    R.raw.baqarah93},
            {R.raw.baqarah94,
                    R.raw.baqarah95,
                    R.raw.baqarah96,
                    R.raw.baqarah97,
                    R.raw.baqarah98,
                    R.raw.baqarah99,
                    R.raw.baqarah100,
                    R.raw.baqarah101},
            {R.raw.baqarah102,
                    R.raw.baqarah103,
                    R.raw.baqarah104,
                    R.raw.baqarah105},
            {R.raw.baqarah106,
                    R.raw.baqarah107,
                    R.raw.baqarah108,
                    R.raw.baqarah109,
                    R.raw.baqarah110,
                    R.raw.baqarah111,
                    R.raw.baqarah112},
            {R.raw.baqarah113,
                    R.raw.baqarah114,
                    R.raw.baqarah115,
                    R.raw.baqarah116,
                    R.raw.baqarah117,
                    R.raw.baqarah118,
                    R.raw.baqarah119},
            {R.raw.baqarah120,
                    R.raw.baqarah121,
                    R.raw.baqarah122,
                    R.raw.baqarah123,
                    R.raw.baqarah124,
                    R.raw.baqarah125,
                    R.raw.baqarah126},
            {R.raw.baqarah127,
                    R.raw.baqarah128,
                    R.raw.baqarah129,
                    R.raw.baqarah130,
                    R.raw.baqarah131,
                    R.raw.baqarah132,
                    R.raw.baqarah133,
                    R.raw.baqarah134},
            {R.raw.baqarah135,
                    R.raw.baqarah136,
                    R.raw.baqarah137,
                    R.raw.baqarah138,
                    R.raw.baqarah139,
                    R.raw.baqarah140,
                    R.raw.baqarah141}
    };

    int ayat = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz1, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz1 = (ImageView) view.findViewById(R.id.imageViewJuz1);
        TextView ayattxt = (TextView) view.findViewById(R.id.textView);

        ImageButton play = (ImageButton)view.findViewById(R.id.play);
        ImageButton pause = (ImageButton)view.findViewById(R.id.pause);
        ImageButton stop = (ImageButton)view.findViewById(R.id.stop);
        ImageButton sr = (ImageButton)view.findViewById(R.id.seekright);
        ImageButton sl = (ImageButton)view.findViewById(R.id.seekleft);

        if(halaman == 0){
            prev.setVisibility(View.GONE);
        }
        if(halaman == 20){
            next.setVisibility(View.GONE);
        }
        int x = mp3ayat[halaman].length;
        if(ayat == 0){
            sl.setVisibility(View.GONE);
        }
        if(ayat == x-1){
            sr.setVisibility(View.GONE);
        }
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halaman --;
                imgjuz1.setImageResource(imghal[halaman]);
                if(halaman==0){
                    prev.setVisibility(View.GONE);
                }else{
                    prev.setVisibility(View.VISIBLE);
                }
                if(halaman==20){
                    next.setVisibility(View.GONE);
                }else{
                    next.setVisibility(View.VISIBLE);
                }
                ma.setHeadline("Juz 1 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                if(halaman==0){
                    ayattxt.setText("Al Fatihah Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halaman ++;
                imgjuz1.setImageResource(imghal[halaman]);

                if(halaman==0){
                    prev.setVisibility(View.GONE);
                }else{
                    prev.setVisibility(View.VISIBLE);
                }
                if(halaman==20){
                    next.setVisibility(View.GONE);
                }else{
                    next.setVisibility(View.VISIBLE);
                }
                ma.setHeadline("Juz 1 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                if(halaman==0){
                    ayattxt.setText("Al Fatihah Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
                }
            }
        });



        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayat--;
                int x = mp3ayat[halaman].length;
                if(ayat == 0){
                    sl.setVisibility(View.GONE);
                }else{
                    sl.setVisibility(View.VISIBLE);
                }
                if(ayat == x-1){
                    sr.setVisibility(View.GONE);
                }else{
                    sr.setVisibility(View.VISIBLE);
                }
                if(halaman==0){
                    ayattxt.setText("Al Fatihah Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
                }
            }
        });

        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = mp3ayat[halaman].length;
                ayat++;
                if(ayat == 0){
                    sl.setVisibility(View.GONE);
                }else{
                    sl.setVisibility(View.VISIBLE);
                }
                if(ayat == x-1){
                    sr.setVisibility(View.GONE);
                }else{
                    sr.setVisibility(View.VISIBLE);
                }
                if(halaman==0){
                    ayattxt.setText("Al Fatihah Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
                }
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma.play(mp3ayat[halaman][ayat]);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma.stopPlayer();
            }
        });

        return view;
    }
}