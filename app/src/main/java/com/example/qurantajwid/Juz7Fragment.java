package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Juz7Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz7Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz7Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz7Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz7Fragment newInstance(String param1, String param2) {
        Juz7Fragment fragment = new Juz7Fragment();
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
            R.drawable.almaidah17,
            R.drawable.almaidah18,
            R.drawable.almaidah19,
            R.drawable.almaidah20,
            R.drawable.almaidah21,
            R.drawable.almaidah22,
            R.drawable.alanam1,
            R.drawable.alanam2,
            R.drawable.alanam3,
            R.drawable.alanam4,
            R.drawable.alanam5,
            R.drawable.alanam6,
            R.drawable.alanam7,
            R.drawable.alanam8,
            R.drawable.alanam9,
            R.drawable.alanam10,
            R.drawable.alanam11,
            R.drawable.alanam12,
            R.drawable.alanam13,
            R.drawable.alanam14,};

    private int [][] mp3ayat = {
            {R.raw.almaidah83,
                    R.raw.almaidah84,
                    R.raw.almaidah85,
                    R.raw.almaidah86,
                    R.raw.almaidah87,
                    R.raw.almaidah88,
                    R.raw.almaidah89,},
            {R.raw.almaidah90,
                    R.raw.almaidah91,
                    R.raw.almaidah92,
                    R.raw.almaidah93,
                    R.raw.almaidah94,
                    R.raw.almaidah95,},
            {R.raw.almaidah96,
                    R.raw.almaidah97,
                    R.raw.almaidah98,
                    R.raw.almaidah99,
                    R.raw.almaidah100,
                    R.raw.almaidah101,
                    R.raw.almaidah102,
                    R.raw.almaidah103,},
            {R.raw.almaidah104,
                    R.raw.almaidah105,
                    R.raw.almaidah106,
                    R.raw.almaidah107,
                    R.raw.almaidah108,},
            {R.raw.almaidah109,
                    R.raw.almaidah110,
                    R.raw.almaidah111,
                    R.raw.almaidah112,
                    R.raw.almaidah113,},
            {R.raw.almaidah114,
                    R.raw.almaidah115,
                    R.raw.almaidah116,
                    R.raw.almaidah117,
                    R.raw.almaidah118,
                    R.raw.almaidah120,},
            {R.raw.fatihah1,
                    R.raw.alanam1,
                    R.raw.alanam2,
                    R.raw.alanam3,
                    R.raw.alanam4,
                    R.raw.alanam5,
                    R.raw.alanam6,
                    R.raw.alanam7,
                    R.raw.alanam8,},
            {R.raw.alanam9,
                    R.raw.alanam10,
                    R.raw.alanam11,
                    R.raw.alanam12,
                    R.raw.alanam13,
                    R.raw.alanam14,
                    R.raw.alanam15,
                    R.raw.alanam16,
                    R.raw.alanam17,
                    R.raw.alanam18,},
            {R.raw.alanam19,
                    R.raw.alanam20,
                    R.raw.alanam21,
                    R.raw.alanam22,
                    R.raw.alanam23,
                    R.raw.alanam24,
                    R.raw.alanam25,
                    R.raw.alanam26,
                    R.raw.alanam27,},
            {R.raw.alanam28,
                    R.raw.alanam29,
                    R.raw.alanam30,
                    R.raw.alanam31,
                    R.raw.alanam32,
                    R.raw.alanam33,
                    R.raw.alanam34,
                    R.raw.alanam35,},
            {R.raw.alanam36,
                    R.raw.alanam37,
                    R.raw.alanam38,
                    R.raw.alanam39,
                    R.raw.alanam40,
                    R.raw.alanam41,
                    R.raw.alanam42,
                    R.raw.alanam43,
                    R.raw.alanam44,},
            {R.raw.alanam45,
                    R.raw.alanam46,
                    R.raw.alanam47,
                    R.raw.alanam48,
                    R.raw.alanam49,
                    R.raw.alanam50,
                    R.raw.alanam51,
                    R.raw.alanam52,},
            {R.raw.alanam53,
                    R.raw.alanam54,
                    R.raw.alanam55,
                    R.raw.alanam56,
                    R.raw.alanam57,
                    R.raw.alanam58,
                    R.raw.alanam59,},
            {R.raw.alanam60,
                    R.raw.alanam61,
                    R.raw.alanam62,
                    R.raw.alanam63,
                    R.raw.alanam64,
                    R.raw.alanam65,
                    R.raw.alanam66,
                    R.raw.alanam67,
                    R.raw.alanam68,},
            {R.raw.alanam69,
                    R.raw.alanam70,
                    R.raw.alanam71,
                    R.raw.alanam72,
                    R.raw.alanam73,},
            {R.raw.alanam74,
                    R.raw.alanam75,
                    R.raw.alanam76,
                    R.raw.alanam77,
                    R.raw.alanam78,
                    R.raw.alanam79,
                    R.raw.alanam80,
                    R.raw.alanam81,},
            {R.raw.alanam82,
                    R.raw.alanam83,
                    R.raw.alanam84,
                    R.raw.alanam85,
                    R.raw.alanam86,
                    R.raw.alanam87,
                    R.raw.alanam88,
                    R.raw.alanam89,
                    R.raw.alanam90,},
            {R.raw.alanam91,
                    R.raw.alanam92,
                    R.raw.alanam93,
                    R.raw.alanam94,},
            {R.raw.alanam95,
                    R.raw.alanam96,
                    R.raw.alanam97,
                    R.raw.alanam98,
                    R.raw.alanam99,
                    R.raw.alanam100,
                    R.raw.alanam101,},
            {R.raw.alanam102,
                    R.raw.alanam103,
                    R.raw.alanam104,
                    R.raw.alanam105,
                    R.raw.alanam106,
                    R.raw.alanam107,
                    R.raw.alanam108,
                    R.raw.alanam109,
                    R.raw.alanam110,},
    };

    private String [][] judulayat = {
            {"Al - Maidah Ayat 83",
                    "Al - Maidah Ayat 84",
                    "Al - Maidah Ayat 85",
                    "Al - Maidah Ayat 86",
                    "Al - Maidah Ayat 87",
                    "Al - Maidah Ayat 88",
                    "Al - Maidah Ayat 89",},
            {"Al - Maidah Ayat 90",
                    "Al - Maidah Ayat 91",
                    "Al - Maidah Ayat 92",
                    "Al - Maidah Ayat 93",
                    "Al - Maidah Ayat 94",
                    "Al - Maidah Ayat 95",},
            {"Al - Maidah Ayat 96",
                    "Al - Maidah Ayat 97",
                    "Al - Maidah Ayat 98",
                    "Al - Maidah Ayat 99",
                    "Al - Maidah Ayat 100",
                    "Al - Maidah Ayat 101",
                    "Al - Maidah Ayat 102",
                    "Al - Maidah Ayat 103",},
            {"Al - Maidah Ayat 104",
                    "Al - Maidah Ayat 105",
                    "Al - Maidah Ayat 106",
                    "Al - Maidah Ayat 107",
                    "Al - Maidah Ayat 108",},
            {"Al - Maidah Ayat 109",
                    "Al - Maidah Ayat 110",
                    "Al - Maidah Ayat 111",
                    "Al - Maidah Ayat 112",
                    "Al - Maidah Ayat 113",},
            {"Al - Maidah Ayat 114",
                    "Al - Maidah Ayat 115",
                    "Al - Maidah Ayat 116",
                    "Al - Maidah Ayat 117",
                    "Al - Maidah Ayat 118",
                    "Al - Maidah Ayat 119",
                    "Al - Maidah Ayat 120",},
            {"Ucapan Bismillah",
                    "Al - An'am Ayat 1",
                    "Al - An'am Ayat 2",
                    "Al - An'am Ayat 3",
                    "Al - An'am Ayat 4",
                    "Al - An'am Ayat 5",
                    "Al - An'am Ayat 6",
                    "Al - An'am Ayat 7",
                    "Al - An'am Ayat 8",},
            {"Al - An'am Ayat 9",
                    "Al - An'am Ayat 10",
                    "Al - An'am Ayat 11",
                    "Al - An'am Ayat 12",
                    "Al - An'am Ayat 13",
                    "Al - An'am Ayat 14",
                    "Al - An'am Ayat 15",
                    "Al - An'am Ayat 16",
                    "Al - An'am Ayat 17",
                    "Al - An'am Ayat 18",},
            {"Al - An'am Ayat 19",
                    "Al - An'am Ayat 20",
                    "Al - An'am Ayat 21",
                    "Al - An'am Ayat 22",
                    "Al - An'am Ayat 23",
                    "Al - An'am Ayat 24",
                    "Al - An'am Ayat 25",
                    "Al - An'am Ayat 26",
                    "Al - An'am Ayat 27",},
            {"Al - An'am Ayat 28",
                    "Al - An'am Ayat 29",
                    "Al - An'am Ayat 30",
                    "Al - An'am Ayat 31",
                    "Al - An'am Ayat 32",
                    "Al - An'am Ayat 33",
                    "Al - An'am Ayat 34",
                    "Al - An'am Ayat 35",},
            {"Al - An'am Ayat 36",
                    "Al - An'am Ayat 37",
                    "Al - An'am Ayat 38",
                    "Al - An'am Ayat 39",
                    "Al - An'am Ayat 40",
                    "Al - An'am Ayat 41",
                    "Al - An'am Ayat 42",
                    "Al - An'am Ayat 43",
                    "Al - An'am Ayat 44",},
            {"Al - An'am Ayat 45",
                    "Al - An'am Ayat 46",
                    "Al - An'am Ayat 47",
                    "Al - An'am Ayat 48",
                    "Al - An'am Ayat 49",
                    "Al - An'am Ayat 50",
                    "Al - An'am Ayat 51",
                    "Al - An'am Ayat 52",},
            {"Al - An'am Ayat 53",
                    "Al - An'am Ayat 54",
                    "Al - An'am Ayat 55",
                    "Al - An'am Ayat 56",
                    "Al - An'am Ayat 57",
                    "Al - An'am Ayat 58",
                    "Al - An'am Ayat 59",},
            {"Al - An'am Ayat 60",
                    "Al - An'am Ayat 61",
                    "Al - An'am Ayat 62",
                    "Al - An'am Ayat 63",
                    "Al - An'am Ayat 64",
                    "Al - An'am Ayat 65",
                    "Al - An'am Ayat 66",
                    "Al - An'am Ayat 67",
                    "Al - An'am Ayat 68",},
            {"Al - An'am Ayat 69",
                    "Al - An'am Ayat 70",
                    "Al - An'am Ayat 71",
                    "Al - An'am Ayat 72",
                    "Al - An'am Ayat 73",},
            {"Al - An'am Ayat 74",
                    "Al - An'am Ayat 75",
                    "Al - An'am Ayat 76",
                    "Al - An'am Ayat 77",
                    "Al - An'am Ayat 78",
                    "Al - An'am Ayat 79",
                    "Al - An'am Ayat 80",
                    "Al - An'am Ayat 81",},
            {"Al - An'am Ayat 82",
                    "Al - An'am Ayat 83",
                    "Al - An'am Ayat 84",
                    "Al - An'am Ayat 85",
                    "Al - An'am Ayat 86",
                    "Al - An'am Ayat 87",
                    "Al - An'am Ayat 88",
                    "Al - An'am Ayat 89",
                    "Al - An'am Ayat 90",},
            {"Al - An'am Ayat 91",
                    "Al - An'am Ayat 92",
                    "Al - An'am Ayat 93",
                    "Al - An'am Ayat 94",},
            {"Al - An'am Ayat 95",
                    "Al - An'am Ayat 96",
                    "Al - An'am Ayat 97",
                    "Al - An'am Ayat 98",
                    "Al - An'am Ayat 99",
                    "Al - An'am Ayat 100",
                    "Al - An'am Ayat 101",},
            {"Al - An'am Ayat 102",
                    "Al - An'am Ayat 103",
                    "Al - An'am Ayat 104",
                    "Al - An'am Ayat 105",
                    "Al - An'am Ayat 105",
                    "Al - An'am Ayat 106",
                    "Al - An'am Ayat 107",
                    "Al - An'am Ayat 108",
                    "Al - An'am Ayat 109",
                    "Al - An'am Ayat 110",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz7, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz7 = (ImageView) view.findViewById(R.id.imageViewJuz7);
        TextView ayattxt = (TextView) view.findViewById(R.id.textView);

        ImageButton play = (ImageButton)view.findViewById(R.id.play);
        ImageButton pause = (ImageButton)view.findViewById(R.id.pause);
        ImageButton stop = (ImageButton)view.findViewById(R.id.stop);
        ImageButton sr = (ImageButton)view.findViewById(R.id.seekright);
        ImageButton sl = (ImageButton)view.findViewById(R.id.seekleft);

        Button idzhar = (Button) view.findViewById(R.id.idzhar);
        Button idgam = (Button) view.findViewById(R.id.idgam);
        Button ikhfa = (Button) view.findViewById(R.id.ikhfa);
        Button iqlab = (Button) view.findViewById(R.id.iqlab);
        Button qalqalah = (Button) view.findViewById(R.id.qalqalah);
        Button gunnah = (Button) view.findViewById(R.id.gunnah);

        idzhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Idzhar");
            }
        });

        idgam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Idgam");
            }
        });

        ikhfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Ikhfa'");
            }
        });

        iqlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Iqlab");
            }
        });
        qalqalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Qalqalah");
            }
        });

        gunnah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Gunnah");
            }
        });

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
                imgjuz7.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 7 Halaman " + (halaman+1) );
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
                imgjuz7.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 7 Halaman " + (halaman+1) );
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