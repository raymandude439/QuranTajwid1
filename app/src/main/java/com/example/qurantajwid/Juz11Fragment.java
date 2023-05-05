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
 * Use the {@link Juz11Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz11Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz11Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz11Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz11Fragment newInstance(String param1, String param2) {
        Juz11Fragment fragment = new Juz11Fragment();
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
            R.drawable.attaubah16,
            R.drawable.attaubah17,
            R.drawable.attaubah18,
            R.drawable.attaubah19,
            R.drawable.attaubah20,
            R.drawable.attaubah21,
            R.drawable.yunus1,
            R.drawable.yunus2,
            R.drawable.yunus3,
            R.drawable.yunus4,
            R.drawable.yunus5,
            R.drawable.yunus6,
            R.drawable.yunus7,
            R.drawable.yunus8,
            R.drawable.yunus9,
            R.drawable.yunus10,
            R.drawable.yunus11,
            R.drawable.yunus12,
            R.drawable.yunus13,
            R.drawable.hud1,};

    private int [][] mp3ayat = {
            {R.raw.attaubah94,
                    R.raw.attaubah95,
                    R.raw.attaubah96,
                    R.raw.attaubah97,
                    R.raw.attaubah98,
                    R.raw.attaubah99,},
            {R.raw.attaubah100,
                    R.raw.attaubah101,
                    R.raw.attaubah102,
                    R.raw.attaubah103,
                    R.raw.attaubah104,
                    R.raw.attaubah105,
                    R.raw.attaubah106,},
            {R.raw.attaubah107,
                    R.raw.attaubah108,
                    R.raw.attaubah109,
                    R.raw.attaubah110,
                    R.raw.attaubah111,},
            {R.raw.attaubah112,
                    R.raw.attaubah113,
                    R.raw.attaubah114,
                    R.raw.attaubah115,
                    R.raw.attaubah116,
                    R.raw.attaubah117,},
            {R.raw.attaubah118,
                    R.raw.attaubah119,
                    R.raw.attaubah120,
                    R.raw.attaubah121,
                    R.raw.attaubah122,},
            {R.raw.attaubah123,
                    R.raw.attaubah124,
                    R.raw.attaubah125,
                    R.raw.attaubah126,
                    R.raw.attaubah127,
                    R.raw.attaubah128,
                    R.raw.attaubah129,},
            {R.raw.yunus1,
                    R.raw.yunus2,
                    R.raw.yunus3,
                    R.raw.yunus4,
                    R.raw.yunus5,
                    R.raw.yunus6,},
            {R.raw.yunus7,
                    R.raw.yunus8,
                    R.raw.yunus9,
                    R.raw.yunus10,
                    R.raw.yunus11,
                    R.raw.yunus12,
                    R.raw.yunus13,
                    R.raw.yunus14,},
            {R.raw.yunus15,
                    R.raw.yunus16,
                    R.raw.yunus17,
                    R.raw.yunus18,
                    R.raw.yunus19,
                    R.raw.yunus20,},
            {R.raw.yunus21,
                    R.raw.yunus22,
                    R.raw.yunus23,
                    R.raw.yunus24,
                    R.raw.yunus25,},
            {R.raw.yunus26,
                    R.raw.yunus27,
                    R.raw.yunus28,
                    R.raw.yunus29,
                    R.raw.yunus30,
                    R.raw.yunus31,
                    R.raw.yunus32,
                    R.raw.yunus33,},
            {R.raw.yunus34,
                    R.raw.yunus35,
                    R.raw.yunus36,
                    R.raw.yunus37,
                    R.raw.yunus38,
                    R.raw.yunus39,
                    R.raw.yunus40,
                    R.raw.yunus41,
                    R.raw.yunus42,},
            {R.raw.yunus43,
                    R.raw.yunus44,
                    R.raw.yunus45,
                    R.raw.yunus46,
                    R.raw.yunus47,
                    R.raw.yunus48,
                    R.raw.yunus49,
                    R.raw.yunus50,
                    R.raw.yunus51,
                    R.raw.yunus52,
                    R.raw.yunus53,},
            {R.raw.yunus54,
                    R.raw.yunus55,
                    R.raw.yunus56,
                    R.raw.yunus57,
                    R.raw.yunus58,
                    R.raw.yunus59,
                    R.raw.yunus60,
                    R.raw.yunus61,},
            {R.raw.yunus62,
                    R.raw.yunus63,
                    R.raw.yunus64,
                    R.raw.yunus65,
                    R.raw.yunus66,
                    R.raw.yunus67,
                    R.raw.yunus68,
                    R.raw.yunus69,
                    R.raw.yunus70,},
            {R.raw.yunus71,
                    R.raw.yunus72,
                    R.raw.yunus73,
                    R.raw.yunus74,
                    R.raw.yunus75,
                    R.raw.yunus76,
                    R.raw.yunus77,
                    R.raw.yunus78,},
            {R.raw.yunus79,
                    R.raw.yunus80,
                    R.raw.yunus81,
                    R.raw.yunus82,
                    R.raw.yunus83,
                    R.raw.yunus84,
                    R.raw.yunus85,
                    R.raw.yunus86,
                    R.raw.yunus87,
                    R.raw.yunus88,},
            {R.raw.yunus89,
                    R.raw.yunus90,
                    R.raw.yunus91,
                    R.raw.yunus92,
                    R.raw.yunus93,
                    R.raw.yunus94,
                    R.raw.yunus95,
                    R.raw.yunus96,
                    R.raw.yunus97,},
            {R.raw.yunus98,
                    R.raw.yunus99,
                    R.raw.yunus100,
                    R.raw.yunus101,
                    R.raw.yunus102,
                    R.raw.yunus103,
                    R.raw.yunus104,
                    R.raw.yunus105,
                    R.raw.yunus106,},
            {R.raw.yunus107,
                    R.raw.yunus108,
                    R.raw.yunus108,
                    R.raw.hud1,
                    R.raw.hud2,
                    R.raw.hud3,
                    R.raw.hud4,
                    R.raw.hud5,},
    };

    private String [][] judulayat = {
            {"At - Taubah Ayat 94",
                    "At - Taubah Ayat 95",
                    "At - Taubah Ayat 96",
                    "At - Taubah Ayat 97",
                    "At - Taubah Ayat 98",
                    "At - Taubah Ayat 99",},
            {"At - Taubah Ayat 100",
                    "At - Taubah Ayat 101",
                    "At - Taubah Ayat 102",
                    "At - Taubah Ayat 103",
                    "At - Taubah Ayat 104",
                    "At - Taubah Ayat 105",
                    "At - Taubah Ayat 106",},
            {"At - Taubah Ayat 107",
                    "At - Taubah Ayat 108",
                    "At - Taubah Ayat 109",
                    "At - Taubah Ayat 110",
                    "At - Taubah Ayat 111",},
            {"At - Taubah Ayat 112",
                    "At - Taubah Ayat 113",
                    "At - Taubah Ayat 114",
                    "At - Taubah Ayat 115",
                    "At - Taubah Ayat 116",
                    "At - Taubah Ayat 117",},
            {"At - Taubah Ayat 118",
                    "At - Taubah Ayat 119",
                    "At - Taubah Ayat 120",
                    "At - Taubah Ayat 121",
                    "At - Taubah Ayat 122",},
            {"At - Taubah Ayat 123",
                    "At - Taubah Ayat 124",
                    "At - Taubah Ayat 125",
                    "At - Taubah Ayat 126",
                    "At - Taubah Ayat 127",
                    "At - Taubah Ayat 128",
                    "At - Taubah Ayat 129",},
            {"Yunus Ayat 1",
                    "Yunus Ayat 2",
                    "Yunus Ayat 3",
                    "Yunus Ayat 4",
                    "Yunus Ayat 5",
                    "Yunus Ayat 6",},
            {"Yunus Ayat 7",
                    "Yunus Ayat 8",
                    "Yunus Ayat 9",
                    "Yunus Ayat 10",
                    "Yunus Ayat 11",
                    "Yunus Ayat 12",
                    "Yunus Ayat 13",
                    "Yunus Ayat 14",},
            {"Yunus Ayat 15",
                    "Yunus Ayat 16",
                    "Yunus Ayat 17",
                    "Yunus Ayat 18",
                    "Yunus Ayat 19",
                    "Yunus Ayat 20",},
            {"Yunus Ayat 21",
                    "Yunus Ayat 22",
                    "Yunus Ayat 23",
                    "Yunus Ayat 24",
                    "Yunus Ayat 25",},
            {"Yunus Ayat 26",
                    "Yunus Ayat 27",
                    "Yunus Ayat 28",
                    "Yunus Ayat 29",
                    "Yunus Ayat 30",
                    "Yunus Ayat 31",
                    "Yunus Ayat 32",
                    "Yunus Ayat 33",},
            {"Yunus Ayat 34",
                    "Yunus Ayat 35",
                    "Yunus Ayat 36",
                    "Yunus Ayat 37",
                    "Yunus Ayat 38",
                    "Yunus Ayat 39",
                    "Yunus Ayat 40",
                    "Yunus Ayat 41",
                    "Yunus Ayat 42",},
            {"Yunus Ayat 43",
                    "Yunus Ayat 44",
                    "Yunus Ayat 45",
                    "Yunus Ayat 46",
                    "Yunus Ayat 47",
                    "Yunus Ayat 48",
                    "Yunus Ayat 49",
                    "Yunus Ayat 50",
                    "Yunus Ayat 51",
                    "Yunus Ayat 52",
                    "Yunus Ayat 53",},
            {"Yunus Ayat 54",
                    "Yunus Ayat 55",
                    "Yunus Ayat 56",
                    "Yunus Ayat 57",
                    "Yunus Ayat 58",
                    "Yunus Ayat 59",
                    "Yunus Ayat 60",
                    "Yunus Ayat 61",},
            {"Yunus Ayat 62",
                    "Yunus Ayat 63",
                    "Yunus Ayat 64",
                    "Yunus Ayat 65",
                    "Yunus Ayat 66",
                    "Yunus Ayat 67",
                    "Yunus Ayat 68",
                    "Yunus Ayat 69",
                    "Yunus Ayat 70",},
            {"Yunus Ayat 71",
                    "Yunus Ayat 72",
                    "Yunus Ayat 73",
                    "Yunus Ayat 74",
                    "Yunus Ayat 75",
                    "Yunus Ayat 76",
                    "Yunus Ayat 77",
                    "Yunus Ayat 78",},
            {"Yunus Ayat 79",
                    "Yunus Ayat 80",
                    "Yunus Ayat 81",
                    "Yunus Ayat 82",
                    "Yunus Ayat 83",
                    "Yunus Ayat 84",
                    "Yunus Ayat 85",
                    "Yunus Ayat 86",
                    "Yunus Ayat 87",
                    "Yunus Ayat 88",},
            {"Yunus Ayat 89",
                    "Yunus Ayat 90",
                    "Yunus Ayat 91",
                    "Yunus Ayat 92",
                    "Yunus Ayat 93",
                    "Yunus Ayat 94",
                    "Yunus Ayat 95",
                    "Yunus Ayat 96",
                    "Yunus Ayat 97",},
            {"Yunus Ayat 98",
                    "Yunus Ayat 99",
                    "Yunus Ayat 100",
                    "Yunus Ayat 101",
                    "Yunus Ayat 102",
                    "Yunus Ayat 103",
                    "Yunus Ayat 104",
                    "Yunus Ayat 105",
                    "Yunus Ayat 106",},
            {"Yunus Ayat 107",
                    "Yunus Ayat 108",
                    "Yunus Ayat 109",
                    "Hud Ayat 1",
                    "Hud Ayat 2",
                    "Hud Ayat 3",
                    "Hud Ayat 4",
                    "Hud Ayat 5",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz11, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz11 = (ImageView) view.findViewById(R.id.imageViewJuz11);
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
                imgjuz11.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 11 Halaman " + (halaman+1) );
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
                imgjuz11.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 11 Halaman " + (halaman+1) );
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