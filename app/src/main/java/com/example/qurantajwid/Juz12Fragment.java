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
 * Use the {@link Juz12Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz12Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz12Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz12Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz12Fragment newInstance(String param1, String param2) {
        Juz12Fragment fragment = new Juz12Fragment();
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
            R.drawable.hud2,
            R.drawable.hud3,
            R.drawable.hud4,
            R.drawable.hud5,
            R.drawable.hud6,
            R.drawable.hud7,
            R.drawable.hud8,
            R.drawable.hud9,
            R.drawable.hud10,
            R.drawable.hud11,
            R.drawable.hud12,
            R.drawable.hud13,
            R.drawable.hud14,
            R.drawable.yusuf1,
            R.drawable.yusuf2,
            R.drawable.yusuf3,
            R.drawable.yusuf4,
            R.drawable.yusuf5,
            R.drawable.yusuf6,
            R.drawable.yusuf7,};

    private int [][] mp3ayat = {
            {R.raw.hud6,
                    R.raw.hud7,
                    R.raw.hud8,
                    R.raw.hud9,
                    R.raw.hud10,
                    R.raw.hud11,
                    R.raw.hud12,},
            {R.raw.hud13,
                    R.raw.hud14,
                    R.raw.hud15,
                    R.raw.hud16,
                    R.raw.hud17,
                    R.raw.hud18,
                    R.raw.hud19,},
            {R.raw.hud20,
                    R.raw.hud21,
                    R.raw.hud22,
                    R.raw.hud23,
                    R.raw.hud24,
                    R.raw.hud25,
                    R.raw.hud26,
                    R.raw.hud27,
                    R.raw.hud28,},
            {R.raw.hud29,
                    R.raw.hud30,
                    R.raw.hud31,
                    R.raw.hud32,
                    R.raw.hud33,
                    R.raw.hud34,
                    R.raw.hud35,
                    R.raw.hud36,
                    R.raw.hud37,},
            {R.raw.hud38,
                    R.raw.hud39,
                    R.raw.hud40,
                    R.raw.hud41,
                    R.raw.hud42,
                    R.raw.hud43,
                    R.raw.hud44,
                    R.raw.hud45,},
            {R.raw.hud46,
                    R.raw.hud47,
                    R.raw.hud48,
                    R.raw.hud49,
                    R.raw.hud50,
                    R.raw.hud51,
                    R.raw.hud52,
                    R.raw.hud53,},
            {R.raw.hud54,
                    R.raw.hud55,
                    R.raw.hud56,
                    R.raw.hud57,
                    R.raw.hud58,
                    R.raw.hud59,
                    R.raw.hud60,
                    R.raw.hud61,
                    R.raw.hud62,},
            {R.raw.hud63,
                    R.raw.hud64,
                    R.raw.hud65,
                    R.raw.hud66,
                    R.raw.hud67,
                    R.raw.hud68,
                    R.raw.hud69,
                    R.raw.hud70,
                    R.raw.hud71,},
            {R.raw.hud72,
                    R.raw.hud73,
                    R.raw.hud74,
                    R.raw.hud75,
                    R.raw.hud76,
                    R.raw.hud77,
                    R.raw.hud78,
                    R.raw.hud79,
                    R.raw.hud80,
                    R.raw.hud81,},
            {R.raw.hud82,
                    R.raw.hud83,
                    R.raw.hud84,
                    R.raw.hud85,
                    R.raw.hud86,
                    R.raw.hud87,
                    R.raw.hud88,},
            {R.raw.hud89,
                    R.raw.hud90,
                    R.raw.hud91,
                    R.raw.hud92,
                    R.raw.hud93,
                    R.raw.hud94,
                    R.raw.hud95,
                    R.raw.hud96,
                    R.raw.hud97,},
            {R.raw.hud98,
                    R.raw.hud99,
                    R.raw.hud100,
                    R.raw.hud101,
                    R.raw.hud102,
                    R.raw.hud103,
                    R.raw.hud104,
                    R.raw.hud105,
                    R.raw.hud106,
                    R.raw.hud107,
                    R.raw.hud108,},
            {R.raw.hud109,
                    R.raw.hud110,
                    R.raw.hud111,
                    R.raw.hud112,
                    R.raw.hud113,
                    R.raw.hud114,
                    R.raw.hud115,
                    R.raw.hud116,
                    R.raw.hud117,},
            {R.raw.hud118,
                    R.raw.hud119,
                    R.raw.hud120,
                    R.raw.hud121,
                    R.raw.hud122,
                    R.raw.hud123,
                    R.raw.yusuf1,
                    R.raw.yusuf2,
                    R.raw.yusuf3,
                    R.raw.yusuf4,},
            {R.raw.yusuf5,
                    R.raw.yusuf6,
                    R.raw.yusuf7,
                    R.raw.yusuf8,
                    R.raw.yusuf9,
                    R.raw.yusuf10,
                    R.raw.yusuf11,
                    R.raw.yusuf12,
                    R.raw.yusuf13,
                    R.raw.yusuf14,},
            {R.raw.yusuf15,
                    R.raw.yusuf16,
                    R.raw.yusuf17,
                    R.raw.yusuf18,
                    R.raw.yusuf19,
                    R.raw.yusuf20,
                    R.raw.yusuf21,
                    R.raw.yusuf22,},
            {R.raw.yusuf23,
                    R.raw.yusuf24,
                    R.raw.yusuf25,
                    R.raw.yusuf26,
                    R.raw.yusuf27,
                    R.raw.yusuf28,
                    R.raw.yusuf29,
                    R.raw.yusuf30,},
            {R.raw.yusuf31,
                    R.raw.yusuf32,
                    R.raw.yusuf33,
                    R.raw.yusuf34,
                    R.raw.yusuf35,
                    R.raw.yusuf36,
                    R.raw.yusuf37,},
            {R.raw.yusuf38,
                    R.raw.yusuf39,
                    R.raw.yusuf40,
                    R.raw.yusuf41,
                    R.raw.yusuf42,
                    R.raw.yusuf43,},
            {R.raw.yusuf44,
                    R.raw.yusuf45,
                    R.raw.yusuf46,
                    R.raw.yusuf47,
                    R.raw.yusuf48,
                    R.raw.yusuf49,
                    R.raw.yusuf50,
                    R.raw.yusuf51,
                    R.raw.yusuf52,},
    };

    private String [][] judulayat = {
            {"Hud Ayat 6",
                    "Hud Ayat 7",
                    "Hud Ayat 8",
                    "Hud Ayat 9",
                    "Hud Ayat 10",
                    "Hud Ayat 11",
                    "Hud Ayat 12",},
            {"Hud Ayat 13",
                    "Hud Ayat 14",
                    "Hud Ayat 15",
                    "Hud Ayat 16",
                    "Hud Ayat 17",
                    "Hud Ayat 18",
                    "Hud Ayat 19",},
            {"Hud Ayat 20",
                    "Hud Ayat 21",
                    "Hud Ayat 22",
                    "Hud Ayat 23",
                    "Hud Ayat 24",
                    "Hud Ayat 25",
                    "Hud Ayat 26",
                    "Hud Ayat 27",
                    "Hud Ayat 28",},
            {"Hud Ayat 29",
                    "Hud Ayat 30",
                    "Hud Ayat 31",
                    "Hud Ayat 32",
                    "Hud Ayat 33",
                    "Hud Ayat 34",
                    "Hud Ayat 35",
                    "Hud Ayat 36",
                    "Hud Ayat 37",},
            {"Hud Ayat 38",
                    "Hud Ayat 39",
                    "Hud Ayat 40",
                    "Hud Ayat 41",
                    "Hud Ayat 42",
                    "Hud Ayat 43",
                    "Hud Ayat 44",
                    "Hud Ayat 45",},
            {"Hud Ayat 46",
                    "Hud Ayat 47",
                    "Hud Ayat 48",
                    "Hud Ayat 49",
                    "Hud Ayat 50",
                    "Hud Ayat 51",
                    "Hud Ayat 52",
                    "Hud Ayat 53",},
            {"Hud Ayat 54",
                    "Hud Ayat 55",
                    "Hud Ayat 56",
                    "Hud Ayat 57",
                    "Hud Ayat 58",
                    "Hud Ayat 59",
                    "Hud Ayat 60",
                    "Hud Ayat 61",
                    "Hud Ayat 62",},
            {"Hud Ayat 63",
                    "Hud Ayat 64",
                    "Hud Ayat 65",
                    "Hud Ayat 66",
                    "Hud Ayat 67",
                    "Hud Ayat 68",
                    "Hud Ayat 69",
                    "Hud Ayat 70",
                    "Hud Ayat 71",},
            {"Hud Ayat 72",
                    "Hud Ayat 73",
                    "Hud Ayat 74",
                    "Hud Ayat 75",
                    "Hud Ayat 76",
                    "Hud Ayat 77",
                    "Hud Ayat 78",
                    "Hud Ayat 79",
                    "Hud Ayat 80",
                    "Hud Ayat 81",},
            {"Hud Ayat 82",
                    "Hud Ayat 83",
                    "Hud Ayat 84",
                    "Hud Ayat 85",
                    "Hud Ayat 86",
                    "Hud Ayat 87",
                    "Hud Ayat 88",},
            {"Hud Ayat 89",
                    "Hud Ayat 90",
                    "Hud Ayat 91",
                    "Hud Ayat 92",
                    "Hud Ayat 93",
                    "Hud Ayat 94",
                    "Hud Ayat 95",
                    "Hud Ayat 96",
                    "Hud Ayat 97",},
            {"Hud Ayat 98",
                    "Hud Ayat 99",
                    "Hud Ayat 100",
                    "Hud Ayat 101",
                    "Hud Ayat 102",
                    "Hud Ayat 103",
                    "Hud Ayat 104",
                    "Hud Ayat 105",
                    "Hud Ayat 106",
                    "Hud Ayat 107",
                    "Hud Ayat 108",},
            {"Hud Ayat 109",
                    "Hud Ayat 110",
                    "Hud Ayat 111",
                    "Hud Ayat 112",
                    "Hud Ayat 113",
                    "Hud Ayat 114",
                    "Hud Ayat 115",
                    "Hud Ayat 116",
                    "Hud Ayat 117",},
            {"Hud Ayat 118",
                    "Hud Ayat 119",
                    "Hud Ayat 120",
                    "Hud Ayat 121",
                    "Hud Ayat 122",
                    "Hud Ayat 123",
                    "Yusuf Ayat 1",
                    "Yusuf Ayat 2",
                    "Yusuf Ayat 3",
                    "Yusuf Ayat 4",},
            {"Yusuf Ayat 5",
                    "Yusuf Ayat 6",
                    "Yusuf Ayat 7",
                    "Yusuf Ayat 8",
                    "Yusuf Ayat 9",
                    "Yusuf Ayat 10",
                    "Yusuf Ayat 11",
                    "Yusuf Ayat 12",
                    "Yusuf Ayat 13",
                    "Yusuf Ayat 14",},
            {"Yusuf Ayat 15",
                    "Yusuf Ayat 16",
                    "Yusuf Ayat 17",
                    "Yusuf Ayat 18",
                    "Yusuf Ayat 19",
                    "Yusuf Ayat 20",
                    "Yusuf Ayat 21",
                    "Yusuf Ayat 22",},
            {"Yusuf Ayat 23",
                    "Yusuf Ayat 24",
                    "Yusuf Ayat 25",
                    "Yusuf Ayat 26",
                    "Yusuf Ayat 27",
                    "Yusuf Ayat 28",
                    "Yusuf Ayat 29",
                    "Yusuf Ayat 30",},
            {"Yusuf Ayat 31",
                    "Yusuf Ayat 32",
                    "Yusuf Ayat 33",
                    "Yusuf Ayat 34",
                    "Yusuf Ayat 35",
                    "Yusuf Ayat 36",
                    "Yusuf Ayat 37",},
            {"Yusuf Ayat 38",
                    "Yusuf Ayat 39",
                    "Yusuf Ayat 40",
                    "Yusuf Ayat 41",
                    "Yusuf Ayat 42",
                    "Yusuf Ayat 43",},
            {"Yusuf Ayat 44",
                    "Yusuf Ayat 45",
                    "Yusuf Ayat 46",
                    "Yusuf Ayat 47",
                    "Yusuf Ayat 48",
                    "Yusuf Ayat 49",
                    "Yusuf Ayat 50",
                    "Yusuf Ayat 51",
                    "Yusuf Ayat 52",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz12, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz12 = (ImageView) view.findViewById(R.id.imageViewJuz12);
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
                imgjuz12.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 12 Halaman " + (halaman+1) );
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
                imgjuz12.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 12 Halaman " + (halaman+1) );
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