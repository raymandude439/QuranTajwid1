package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Juz2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz2Fragment newInstance(String param1, String param2) {
        Juz2Fragment fragment = new Juz2Fragment();
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
            R.drawable.albaqarah21,
            R.drawable.albaqarah22,
            R.drawable.albaqarah23,
            R.drawable.albaqarah24,
            R.drawable.albaqarah25,
            R.drawable.albaqarah26,
            R.drawable.albaqarah27,
            R.drawable.albaqarah28,
            R.drawable.albaqarah29,
            R.drawable.albaqarah30,
            R.drawable.albaqarah31,
            R.drawable.albaqarah32,
            R.drawable.albaqarah33,
            R.drawable.albaqarah34,
            R.drawable.albaqarah35,
            R.drawable.albaqarah36,
            R.drawable.albaqarah37,
            R.drawable.albaqarah38,
            R.drawable.albaqarah39,
            R.drawable.albaqarah40};

    private int [][] mp3ayat = {
            {R.raw.baqarah142,
                    R.raw.baqarah143,
                    R.raw.baqarah144,
                    R.raw.baqarah145,},
            {R.raw.baqarah146,
                    R.raw.baqarah147,
                    R.raw.baqarah148,
                    R.raw.baqarah149,
                    R.raw.baqarah150,
                    R.raw.baqarah151,
                    R.raw.baqarah152,
                    R.raw.baqarah153,},
            {R.raw.baqarah154,
                    R.raw.baqarah155,
                    R.raw.baqarah156,
                    R.raw.baqarah157,
                    R.raw.baqarah158,
                    R.raw.baqarah159,
                    R.raw.baqarah160,
                    R.raw.baqarah161,
                    R.raw.baqarah162,
                    R.raw.baqarah163,},
            {R.raw.baqarah164,
                    R.raw.baqarah165,
                    R.raw.baqarah166,
                    R.raw.baqarah167,
                    R.raw.baqarah168,
                    R.raw.baqarah169,},
            {R.raw.baqarah170,
                    R.raw.baqarah171,
                    R.raw.baqarah172,
                    R.raw.baqarah173,
                    R.raw.baqarah174,
                    R.raw.baqarah175,
                    R.raw.baqarah176,},
            {R.raw.baqarah177,
                    R.raw.baqarah178,
                    R.raw.baqarah179,
                    R.raw.baqarah180,
                    R.raw.baqarah181,},
            {R.raw.baqarah182,
                    R.raw.baqarah183,
                    R.raw.baqarah184,
                    R.raw.baqarah185,
                    R.raw.baqarah186,},
            {R.raw.baqarah187,
                    R.raw.baqarah188,
                    R.raw.baqarah189,
                    R.raw.baqarah190,},
            {R.raw.baqarah191,
                    R.raw.baqarah192,
                    R.raw.baqarah193,
                    R.raw.baqarah194,
                    R.raw.baqarah195,
                    R.raw.baqarah196,},
            {R.raw.baqarah197,
                    R.raw.baqarah198,
                    R.raw.baqarah199,
                    R.raw.baqarah200,
                    R.raw.baqarah201,
                    R.raw.baqarah202,},
            {R.raw.baqarah203,
                    R.raw.baqarah204,
                    R.raw.baqarah205,
                    R.raw.baqarah206,
                    R.raw.baqarah207,
                    R.raw.baqarah208,
                    R.raw.baqarah209,
                    R.raw.baqarah210,},
            {R.raw.baqarah211,
                    R.raw.baqarah212,
                    R.raw.baqarah213,
                    R.raw.baqarah214,
                    R.raw.baqarah215,},
            {R.raw.baqarah216,
                    R.raw.baqarah217,
                    R.raw.baqarah218,
                    R.raw.baqarah219,},
            {R.raw.baqarah220,
                    R.raw.baqarah221,
                    R.raw.baqarah222,
                    R.raw.baqarah223,
                    R.raw.baqarah224,},
            {R.raw.baqarah225,
                    R.raw.baqarah226,
                    R.raw.baqarah227,
                    R.raw.baqarah228,
                    R.raw.baqarah229,
                    R.raw.baqarah230,},
            {R.raw.baqarah231,
                    R.raw.baqarah232,
                    R.raw.baqarah233,},
            {R.raw.baqarah234,
                    R.raw.baqarah235,
                    R.raw.baqarah236,
                    R.raw.baqarah237,},
            {R.raw.baqarah238,
                    R.raw.baqarah239,
                    R.raw.baqarah240,
                    R.raw.baqarah241,
                    R.raw.baqarah242,
                    R.raw.baqarah243,
                    R.raw.baqarah244,
                    R.raw.baqarah245,},
            {R.raw.baqarah246,
                    R.raw.baqarah247,
                    R.raw.baqarah248,},
            {R.raw.baqarah249,
                    R.raw.baqarah250,
                    R.raw.baqarah251,
                    R.raw.baqarah252,},
    };

    int ayat = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz2, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz2 = (ImageView) view.findViewById(R.id.imageViewJuz2);
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
                imgjuz2.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 2 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halaman ++;
                imgjuz2.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 2 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
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
                ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
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
                ayattxt.setText("Al Baqarah Ayat " + (ayat+1));
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