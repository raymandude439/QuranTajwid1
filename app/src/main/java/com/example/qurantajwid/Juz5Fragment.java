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
 * Use the {@link Juz5Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz5Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz5Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz5Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz5Fragment newInstance(String param1, String param2) {
        Juz5Fragment fragment = new Juz5Fragment();
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
            R.drawable.annisa6,
            R.drawable.annisa7,
            R.drawable.annisa8,
            R.drawable.annisa9,
            R.drawable.annisa10,
            R.drawable.annisa11,
            R.drawable.annisa12,
            R.drawable.annisa13,
            R.drawable.annisa14,
            R.drawable.annisa15,
            R.drawable.annisa16,
            R.drawable.annisa17,
            R.drawable.annisa18,
            R.drawable.annisa19,
            R.drawable.annisa20,
            R.drawable.annisa21,
            R.drawable.annisa22,
            R.drawable.annisa23,
            R.drawable.annisa24,
            R.drawable.annisa25,};

    private int [][] mp3ayat = {
            {R.raw.annisa24,
                    R.raw.annisa25,
                    R.raw.annisa26,},
            {R.raw.annisa27,
                    R.raw.annisa28,
                    R.raw.annisa29,
                    R.raw.annisa30,
                    R.raw.annisa31,
                    R.raw.annisa32,
                    R.raw.annisa33,},
            {R.raw.annisa34,
                    R.raw.annisa35,
                    R.raw.annisa36,
                    R.raw.annisa37,},
            {R.raw.annisa38,
                    R.raw.annisa39,
                    R.raw.annisa40,
                    R.raw.annisa41,
                    R.raw.annisa42,
                    R.raw.annisa43,
                    R.raw.annisa44,},
            {R.raw.annisa45,
                    R.raw.annisa46,
                    R.raw.annisa47,
                    R.raw.annisa48,
                    R.raw.annisa49,
                    R.raw.annisa50,
                    R.raw.annisa51,},
            {R.raw.annisa52,
                    R.raw.annisa53,
                    R.raw.annisa54,
                    R.raw.annisa55,
                    R.raw.annisa56,
                    R.raw.annisa57,
                    R.raw.annisa58,
                    R.raw.annisa59,},
            {R.raw.annisa60,
                    R.raw.annisa61,
                    R.raw.annisa62,
                    R.raw.annisa63,
                    R.raw.annisa64,
                    R.raw.annisa65,},
            {R.raw.annisa66,
                    R.raw.annisa67,
                    R.raw.annisa68,
                    R.raw.annisa69,
                    R.raw.annisa70,
                    R.raw.annisa71,
                    R.raw.annisa72,
                    R.raw.annisa73,
                    R.raw.annisa74,},
            {R.raw.annisa75,
                    R.raw.annisa76,
                    R.raw.annisa77,
                    R.raw.annisa78,
                    R.raw.annisa79,},
            {R.raw.annisa80,
                    R.raw.annisa81,
                    R.raw.annisa82,
                    R.raw.annisa83,
                    R.raw.annisa84,
                    R.raw.annisa85,
                    R.raw.annisa86,},
            {R.raw.annisa87,
                    R.raw.annisa88,
                    R.raw.annisa89,
                    R.raw.annisa90,
                    R.raw.annisa91,},
            {R.raw.annisa92,
                    R.raw.annisa93,
                    R.raw.annisa94,},
            {R.raw.annisa95,
                    R.raw.annisa96,
                    R.raw.annisa97,
                    R.raw.annisa98,
                    R.raw.annisa99,
                    R.raw.annisa100,
                    R.raw.annisa101,},
            {R.raw.annisa102,
                    R.raw.annisa103,
                    R.raw.annisa104,
                    R.raw.annisa105,},
            {R.raw.annisa106,
                    R.raw.annisa107,
                    R.raw.annisa108,
                    R.raw.annisa109,
                    R.raw.annisa110,
                    R.raw.annisa111,
                    R.raw.annisa112,
                    R.raw.annisa113,},
            {R.raw.annisa114,
                    R.raw.annisa115,
                    R.raw.annisa116,
                    R.raw.annisa117,
                    R.raw.annisa118,
                    R.raw.annisa119,
                    R.raw.annisa120,
                    R.raw.annisa121,},
            {R.raw.annisa122,
                    R.raw.annisa123,
                    R.raw.annisa124,
                    R.raw.annisa125,
                    R.raw.annisa126,
                    R.raw.annisa127,},
            {R.raw.annisa128,
                    R.raw.annisa129,
                    R.raw.annisa130,
                    R.raw.annisa131,
                    R.raw.annisa132,
                    R.raw.annisa133,
                    R.raw.annisa134,},
            {R.raw.annisa135,
                    R.raw.annisa136,
                    R.raw.annisa137,
                    R.raw.annisa138,
                    R.raw.annisa139,
                    R.raw.annisa140,},
            {R.raw.annisa141,
                    R.raw.annisa142,
                    R.raw.annisa143,
                    R.raw.annisa144,
                    R.raw.annisa145,
                    R.raw.annisa146,
                    R.raw.annisa147,},
    };

    private String [][] judulayat = {
            {"An - Nisa Ayat 24",
                    "An - Nisa Ayat 25",
                    "An - Nisa Ayat 26",},
            {"An - Nisa Ayat 27",
                    "An - Nisa Ayat 28",
                    "An - Nisa Ayat 29",
                    "An - Nisa Ayat 30",
                    "An - Nisa Ayat 31",
                    "An - Nisa Ayat 32",
                    "An - Nisa Ayat 33",},
            {"An - Nisa Ayat 34",
                    "An - Nisa Ayat 35",
                    "An - Nisa Ayat 36",
                    "An - Nisa Ayat 37",},
            {"An - Nisa Ayat 38",
                    "An - Nisa Ayat 39",
                    "An - Nisa Ayat 40",
                    "An - Nisa Ayat 41",
                    "An - Nisa Ayat 42",
                    "An - Nisa Ayat 43",
                    "An - Nisa Ayat 44",},
            {"An - Nisa Ayat 45",
                    "An - Nisa Ayat 46",
                    "An - Nisa Ayat 47",
                    "An - Nisa Ayat 48",
                    "An - Nisa Ayat 49",
                    "An - Nisa Ayat 50",
                    "An - Nisa Ayat 51",},
            {"An - Nisa Ayat 52",
                    "An - Nisa Ayat 53",
                    "An - Nisa Ayat 54",
                    "An - Nisa Ayat 55",
                    "An - Nisa Ayat 56",
                    "An - Nisa Ayat 57",
                    "An - Nisa Ayat 58",
                    "An - Nisa Ayat 59",},
            {"An - Nisa Ayat 60",
                    "An - Nisa Ayat 61",
                    "An - Nisa Ayat 62",
                    "An - Nisa Ayat 63",
                    "An - Nisa Ayat 64",
                    "An - Nisa Ayat 65",},
            {"An - Nisa Ayat 66",
                    "An - Nisa Ayat 67",
                    "An - Nisa Ayat 68",
                    "An - Nisa Ayat 69",
                    "An - Nisa Ayat 70",
                    "An - Nisa Ayat 71",
                    "An - Nisa Ayat 72",
                    "An - Nisa Ayat 73",
                    "An - Nisa Ayat 74",},
            {"An - Nisa Ayat 75",
                    "An - Nisa Ayat 76",
                    "An - Nisa Ayat 77",
                    "An - Nisa Ayat 78",
                    "An - Nisa Ayat 79",},
            {"An - Nisa Ayat 80",
                    "An - Nisa Ayat 81",
                    "An - Nisa Ayat 82",
                    "An - Nisa Ayat 83",
                    "An - Nisa Ayat 84",
                    "An - Nisa Ayat 85",
                    "An - Nisa Ayat 86",},
            {"An - Nisa Ayat 87",
                    "An - Nisa Ayat 88",
                    "An - Nisa Ayat 89",
                    "An - Nisa Ayat 90",
                    "An - Nisa Ayat 91",},
            {"An - Nisa Ayat 92",
                    "An - Nisa Ayat 93",
                    "An - Nisa Ayat 94",},
            {"An - Nisa Ayat 95",
                    "An - Nisa Ayat 96",
                    "An - Nisa Ayat 97",
                    "An - Nisa Ayat 98",
                    "An - Nisa Ayat 99",
                    "An - Nisa Ayat 100",
                    "An - Nisa Ayat 101",},
            {"An - Nisa Ayat 102",
                    "An - Nisa Ayat 103",
                    "An - Nisa Ayat 104",
                    "An - Nisa Ayat 105",},
            {"An - Nisa Ayat 106",
                    "An - Nisa Ayat 107",
                    "An - Nisa Ayat 108",
                    "An - Nisa Ayat 109",
                    "An - Nisa Ayat 110",
                    "An - Nisa Ayat 111",
                    "An - Nisa Ayat 112",
                    "An - Nisa Ayat 113",},
            {"An - Nisa Ayat 114",
                    "An - Nisa Ayat 115",
                    "An - Nisa Ayat 116",
                    "An - Nisa Ayat 117",
                    "An - Nisa Ayat 118",
                    "An - Nisa Ayat 119",
                    "An - Nisa Ayat 120",
                    "An - Nisa Ayat 121",},
            {"An - Nisa Ayat 122",
                    "An - Nisa Ayat 123",
                    "An - Nisa Ayat 124",
                    "An - Nisa Ayat 125",
                    "An - Nisa Ayat 126",
                    "An - Nisa Ayat 127",},
            {"An - Nisa Ayat 128",
                    "An - Nisa Ayat 129",
                    "An - Nisa Ayat 130",
                    "An - Nisa Ayat 131",
                    "An - Nisa Ayat 132",
                    "An - Nisa Ayat 133",
                    "An - Nisa Ayat 134",},
            {"An - Nisa Ayat 135",
                    "An - Nisa Ayat 136",
                    "An - Nisa Ayat 137",
                    "An - Nisa Ayat 138",
                    "An - Nisa Ayat 139",
                    "An - Nisa Ayat 140",},
            {"An - Nisa Ayat 141",
                    "An - Nisa Ayat 142",
                    "An - Nisa Ayat 143",
                    "An - Nisa Ayat 144",
                    "An - Nisa Ayat 145",
                    "An - Nisa Ayat 146",
                    "An - Nisa Ayat 147",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz5, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz5 = (ImageView) view.findViewById(R.id.imageViewJuz5);
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
                imgjuz5.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 5 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                ayattxt.setText(judulayat[halaman][ayat]);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                halaman ++;
                imgjuz5.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 5 Halaman " + (halaman+1) );
                ayat=0;
                sl.setVisibility(View.GONE);
                sr.setVisibility(View.VISIBLE);
                ayattxt.setText(judulayat[halaman][ayat]);
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
                ayattxt.setText(judulayat[halaman][ayat]);
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
                ayattxt.setText(judulayat[halaman][ayat]);
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