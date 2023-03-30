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
 * Use the {@link Juz4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz4Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz4Fragment newInstance(String param1, String param2) {
        Juz4Fragment fragment = new Juz4Fragment();
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
            R.drawable.aliimran13,
            R.drawable.aliimran14,
            R.drawable.aliimran15,
            R.drawable.aliimran16,
            R.drawable.aliimran17,
            R.drawable.aliimran18,
            R.drawable.aliimran19,
            R.drawable.aliimran20,
            R.drawable.aliimran21,
            R.drawable.aliimran22,
            R.drawable.aliimran23,
            R.drawable.aliimran24,
            R.drawable.aliimran25,
            R.drawable.aliimran26,
            R.drawable.aliimran27,
            R.drawable.annisa1,
            R.drawable.annisa2,
            R.drawable.annisa3,
            R.drawable.annisa4,
            R.drawable.annisa5,};

    private int [][] mp3ayat = {
            {R.raw.imran92,
                    R.raw.imran93,
                    R.raw.imran94,
                    R.raw.imran95,
                    R.raw.imran96,
                    R.raw.imran97,
                    R.raw.imran98,
                    R.raw.imran99,
                    R.raw.imran100,},
            {R.raw.imran101,
                    R.raw.imran102,
                    R.raw.imran103,
                    R.raw.imran104,
                    R.raw.imran105,
                    R.raw.imran106,
                    R.raw.imran107,
                    R.raw.imran108,},
            {R.raw.imran109,
                    R.raw.imran110,
                    R.raw.imran111,
                    R.raw.imran112,
                    R.raw.imran113,
                    R.raw.imran114,
                    R.raw.imran115,},
            {R.raw.imran116,
                    R.raw.imran117,
                    R.raw.imran118,
                    R.raw.imran119,
                    R.raw.imran120,
                    R.raw.imran121,},
            {R.raw.imran122,
                    R.raw.imran123,
                    R.raw.imran124,
                    R.raw.imran125,
                    R.raw.imran126,
                    R.raw.imran127,
                    R.raw.imran128,
                    R.raw.imran129,
                    R.raw.imran130,
                    R.raw.imran131,
                    R.raw.imran132,},
            {R.raw.imran133,
                    R.raw.imran134,
                    R.raw.imran135,
                    R.raw.imran136,
                    R.raw.imran137,
                    R.raw.imran138,
                    R.raw.imran139,
                    R.raw.imran140,},
            {R.raw.imran141,
                    R.raw.imran142,
                    R.raw.imran143,
                    R.raw.imran144,
                    R.raw.imran145,
                    R.raw.imran146,
                    R.raw.imran147,
                    R.raw.imran148,},
            {R.raw.imran149,
                    R.raw.imran150,
                    R.raw.imran151,
                    R.raw.imran152,
                    R.raw.imran153,},
            {R.raw.imran154,
                    R.raw.imran155,
                    R.raw.imran156,
                    R.raw.imran157,},
            {R.raw.imran158,
                    R.raw.imran159,
                    R.raw.imran160,
                    R.raw.imran161,
                    R.raw.imran162,
                    R.raw.imran163,
                    R.raw.imran164,
                    R.raw.imran165,},
            {R.raw.imran166,
                    R.raw.imran167,
                    R.raw.imran168,
                    R.raw.imran169,
                    R.raw.imran170,
                    R.raw.imran171,
                    R.raw.imran172,
                    R.raw.imran173,},
            {R.raw.imran174,
                    R.raw.imran175,
                    R.raw.imran176,
                    R.raw.imran177,
                    R.raw.imran178,
                    R.raw.imran179,
                    R.raw.imran180,},
            {R.raw.imran181,
                    R.raw.imran182,
                    R.raw.imran183,
                    R.raw.imran184,
                    R.raw.imran185,
                    R.raw.imran186,},
            {R.raw.imran187,
                    R.raw.imran188,
                    R.raw.imran189,
                    R.raw.imran190,
                    R.raw.imran191,
                    R.raw.imran192,
                    R.raw.imran193,
                    R.raw.imran194,},
            {R.raw.imran195,
                    R.raw.imran196,
                    R.raw.imran197,
                    R.raw.imran198,
                    R.raw.imran199,
                    R.raw.imran200,},
            {R.raw.fatihah1,
                    R.raw.annisa1,
                    R.raw.annisa2,
                    R.raw.annisa3,
                    R.raw.annisa4,
                    R.raw.annisa5,
                    R.raw.annisa6,},
            {R.raw.annisa7,
                    R.raw.annisa8,
                    R.raw.annisa9,
                    R.raw.annisa10,
                    R.raw.annisa11,},
            {R.raw.annisa12,
                    R.raw.annisa13,
                    R.raw.annisa14,},
            {R.raw.annisa15,
                    R.raw.annisa16,
                    R.raw.annisa17,
                    R.raw.annisa18,
                    R.raw.annisa19,},
            {R.raw.annisa20,
                    R.raw.annisa21,
                    R.raw.annisa22,
                    R.raw.annisa23,},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz4, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz4 = (ImageView) view.findViewById(R.id.imageViewJuz4);
        TextView ayattxt = (TextView) view.findViewById(R.id.textView);

        ImageButton play = (ImageButton)view.findViewById(R.id.play);
        ImageButton pause = (ImageButton)view.findViewById(R.id.pause);
        ImageButton stop = (ImageButton)view.findViewById(R.id.stop);
        ImageButton sr = (ImageButton)view.findViewById(R.id.seekright);
        ImageButton sl = (ImageButton)view.findViewById(R.id.seekleft);

        if(halaman == 0){
            prev.setVisibility(View.GONE);
        }
        if(halaman == 19){
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
                imgjuz4.setImageResource(imghal[halaman]);
                if(halaman==0){
                    prev.setVisibility(View.GONE);
                }else{
                    prev.setVisibility(View.VISIBLE);
                }
                if(halaman==19){
                    next.setVisibility(View.GONE);
                }else{
                    next.setVisibility(View.VISIBLE);
                }
                ma.setHeadline("Juz 4 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                if(halaman >= 0 && halaman <= 14){
                    ayattxt.setText("Ali Imran Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("An Nisa Ayat " + (ayat+1));
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halaman ++;
                imgjuz4.setImageResource(imghal[halaman]);

                if(halaman==0){
                    prev.setVisibility(View.GONE);
                }else{
                    prev.setVisibility(View.VISIBLE);
                }
                if(halaman==19){
                    next.setVisibility(View.GONE);
                }else{
                    next.setVisibility(View.VISIBLE);
                }
                ma.setHeadline("Juz 4 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                if(halaman >= 0 && halaman <= 14){
                    ayattxt.setText("Ali Imran Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("An Nisa Ayat " + (ayat+1));
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
                if(halaman >= 0 && halaman <= 14){
                    ayattxt.setText("Ali Imran Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("An Nisa Ayat " + (ayat+1));
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
                if(halaman >= 0 && halaman <= 14){
                    ayattxt.setText("Ali Imran Ayat " + (ayat+1));
                }else{
                    ayattxt.setText("An Nisa Ayat " + (ayat+1));
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