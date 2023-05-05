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
 * Use the {@link Juz13Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz13Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz13Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz13Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz13Fragment newInstance(String param1, String param2) {
        Juz13Fragment fragment = new Juz13Fragment();
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
            R.drawable.yusuf8,
            R.drawable.yusuf9,
            R.drawable.yusuf10,
            R.drawable.yusuf11,
            R.drawable.yusuf12,
            R.drawable.yusuf13,
            R.drawable.yusuf14,
            R.drawable.arrad1,
            R.drawable.arrad2,
            R.drawable.arrad3,
            R.drawable.arrad4,
            R.drawable.arrad5,
            R.drawable.arrad6,
            R.drawable.ibrahim1,
            R.drawable.ibrahim2,
            R.drawable.ibrahim3,
            R.drawable.ibrahim4,
            R.drawable.ibrahim5,
            R.drawable.ibrahim6,
            R.drawable.ibrahim7,};

    private int [][] mp3ayat = {
            {R.raw.yusuf53,
                    R.raw.yusuf54,
                    R.raw.yusuf55,
                    R.raw.yusuf56,
                    R.raw.yusuf57,
                    R.raw.yusuf58,
                    R.raw.yusuf59,
                    R.raw.yusuf60,
                    R.raw.yusuf61,
                    R.raw.yusuf62,
                    R.raw.yusuf63,},
            {R.raw.yusuf64,
                    R.raw.yusuf64,
                    R.raw.yusuf66,
                    R.raw.yusuf67,
                    R.raw.yusuf68,
                    R.raw.yusuf69,},
            {R.raw.yusuf70,
                    R.raw.yusuf71,
                    R.raw.yusuf72,
                    R.raw.yusuf73,
                    R.raw.yusuf74,
                    R.raw.yusuf75,
                    R.raw.yusuf76,
                    R.raw.yusuf77,
                    R.raw.yusuf78,},
            {R.raw.yusuf79,
                    R.raw.yusuf80,
                    R.raw.yusuf81,
                    R.raw.yusuf82,
                    R.raw.yusuf83,
                    R.raw.yusuf84,
                    R.raw.yusuf85,
                    R.raw.yusuf86,},
            {R.raw.yusuf87,
                    R.raw.yusuf88,
                    R.raw.yusuf89,
                    R.raw.yusuf90,
                    R.raw.yusuf91,
                    R.raw.yusuf92,
                    R.raw.yusuf93,
                    R.raw.yusuf94,
                    R.raw.yusuf95,},
            {R.raw.yusuf96,
                    R.raw.yusuf97,
                    R.raw.yusuf98,
                    R.raw.yusuf99,
                    R.raw.yusuf100,
                    R.raw.yusuf101,
                    R.raw.yusuf102,
                    R.raw.yusuf103,},
            {R.raw.yusuf104,
                    R.raw.yusuf105,
                    R.raw.yusuf106,
                    R.raw.yusuf107,
                    R.raw.yusuf108,
                    R.raw.yusuf109,
                    R.raw.yusuf110,
                    R.raw.yusuf111,},
            {R.raw.arrad1,
                    R.raw.arrad2,
                    R.raw.arrad3,
                    R.raw.arrad4,
                    R.raw.arrad5,},
            {R.raw.arrad6,
                    R.raw.arrad7,
                    R.raw.arrad8,
                    R.raw.arrad9,
                    R.raw.arrad10,
                    R.raw.arrad11,
                    R.raw.arrad12,
                    R.raw.arrad13,},
            {R.raw.arrad14,
                    R.raw.arrad15,
                    R.raw.arrad16,
                    R.raw.arrad17,
                    R.raw.arrad18,},
            {R.raw.arrad19,
                    R.raw.arrad20,
                    R.raw.arrad21,
                    R.raw.arrad22,
                    R.raw.arrad23,
                    R.raw.arrad24,
                    R.raw.arrad25,
                    R.raw.arrad26,
                    R.raw.arrad27,
                    R.raw.arrad28,},
            {R.raw.arrad29,
                    R.raw.arrad30,
                    R.raw.arrad31,
                    R.raw.arrad32,
                    R.raw.arrad33,
                    R.raw.arrad34,},
            {R.raw.arrad35,
                    R.raw.arrad36,
                    R.raw.arrad37,
                    R.raw.arrad38,
                    R.raw.arrad39,
                    R.raw.arrad40,
                    R.raw.arrad41,
                    R.raw.arrad42,},
            {R.raw.arrad43,
                    R.raw.ibrahim1,
                    R.raw.ibrahim2,
                    R.raw.ibrahim3,
                    R.raw.ibrahim4,
                    R.raw.ibrahim5,},
            {R.raw.ibrahim6,
                    R.raw.ibrahim7,
                    R.raw.ibrahim8,
                    R.raw.ibrahim9,
                    R.raw.ibrahim10,},
            {R.raw.ibrahim11,
                    R.raw.ibrahim12,
                    R.raw.ibrahim13,
                    R.raw.ibrahim14,
                    R.raw.ibrahim15,
                    R.raw.ibrahim16,
                    R.raw.ibrahim17,
                    R.raw.ibrahim18,},
            {R.raw.ibrahim19,
                    R.raw.ibrahim20,
                    R.raw.ibrahim21,
                    R.raw.ibrahim22,
                    R.raw.ibrahim23,
                    R.raw.ibrahim24,},
            {R.raw.ibrahim25,
                    R.raw.ibrahim26,
                    R.raw.ibrahim27,
                    R.raw.ibrahim28,
                    R.raw.ibrahim29,
                    R.raw.ibrahim30,
                    R.raw.ibrahim31,
                    R.raw.ibrahim32,
                    R.raw.ibrahim33,},
            {R.raw.ibrahim34,
                    R.raw.ibrahim35,
                    R.raw.ibrahim36,
                    R.raw.ibrahim37,
                    R.raw.ibrahim38,
                    R.raw.ibrahim39,
                    R.raw.ibrahim40,
                    R.raw.ibrahim41,
                    R.raw.ibrahim42,},
            {R.raw.ibrahim43,
                    R.raw.ibrahim44,
                    R.raw.ibrahim45,
                    R.raw.ibrahim46,
                    R.raw.ibrahim47,
                    R.raw.ibrahim48,
                    R.raw.ibrahim49,
                    R.raw.ibrahim50,
                    R.raw.ibrahim51,
                    R.raw.ibrahim52,},
    };

    private String [][] judulayat = {
            {"Yusuf Ayat 53",
                    "Yusuf Ayat 54",
                    "Yusuf Ayat 55",
                    "Yusuf Ayat 56",
                    "Yusuf Ayat 57",
                    "Yusuf Ayat 58",
                    "Yusuf Ayat 59",
                    "Yusuf Ayat 60",
                    "Yusuf Ayat 61",
                    "Yusuf Ayat 62",
                    "Yusuf Ayat 63",},
            {"Yusuf Ayat 64",
                    "Yusuf Ayat 65",
                    "Yusuf Ayat 66",
                    "Yusuf Ayat 67",
                    "Yusuf Ayat 68",
                    "Yusuf Ayat 69",},
            {"Yusuf Ayat 70",
                    "Yusuf Ayat 71",
                    "Yusuf Ayat 72",
                    "Yusuf Ayat 73",
                    "Yusuf Ayat 74",
                    "Yusuf Ayat 75",
                    "Yusuf Ayat 76",
                    "Yusuf Ayat 77",
                    "Yusuf Ayat 78",},
            {"Yusuf Ayat 79",
                    "Yusuf Ayat 80",
                    "Yusuf Ayat 81",
                    "Yusuf Ayat 82",
                    "Yusuf Ayat 83",
                    "Yusuf Ayat 84",
                    "Yusuf Ayat 85",
                    "Yusuf Ayat 86",},
            {"Yusuf Ayat 87",
                    "Yusuf Ayat 88",
                    "Yusuf Ayat 89",
                    "Yusuf Ayat 90",
                    "Yusuf Ayat 91",
                    "Yusuf Ayat 92",
                    "Yusuf Ayat 93",
                    "Yusuf Ayat 94",
                    "Yusuf Ayat 95",},
            {"Yusuf Ayat 96",
                    "Yusuf Ayat 97",
                    "Yusuf Ayat 98",
                    "Yusuf Ayat 99",
                    "Yusuf Ayat 100",
                    "Yusuf Ayat 101",
                    "Yusuf Ayat 102",
                    "Yusuf Ayat 103",},
            {"Yusuf Ayat 104",
                    "Yusuf Ayat 105",
                    "Yusuf Ayat 106",
                    "Yusuf Ayat 107",
                    "Yusuf Ayat 108",
                    "Yusuf Ayat 109",
                    "Yusuf Ayat 110",
                    "Yusuf Ayat 111",},
            {"Ar - Ra'd Ayat 1",
                    "Ar - Ra'd Ayat 2",
                    "Ar - Ra'd Ayat 3",
                    "Ar - Ra'd Ayat 4",
                    "Ar - Ra'd Ayat 5",},
            {"Ar - Ra'd Ayat 6",
                    "Ar - Ra'd Ayat 7",
                    "Ar - Ra'd Ayat 8",
                    "Ar - Ra'd Ayat 9",
                    "Ar - Ra'd Ayat 10",
                    "Ar - Ra'd Ayat 11",
                    "Ar - Ra'd Ayat 12",
                    "Ar - Ra'd Ayat 13",},
            {"Ar - Ra'd Ayat 14",
                    "Ar - Ra'd Ayat 15",
                    "Ar - Ra'd Ayat 16",
                    "Ar - Ra'd Ayat 17",
                    "Ar - Ra'd Ayat 18",},
            {"Ar - Ra'd Ayat 19",
                    "Ar - Ra'd Ayat 20",
                    "Ar - Ra'd Ayat 21",
                    "Ar - Ra'd Ayat 22",
                    "Ar - Ra'd Ayat 23",
                    "Ar - Ra'd Ayat 24",
                    "Ar - Ra'd Ayat 25",
                    "Ar - Ra'd Ayat 26",
                    "Ar - Ra'd Ayat 27",
                    "Ar - Ra'd Ayat 28",},
            {"Ar - Ra'd Ayat 29",
                    "Ar - Ra'd Ayat 30",
                    "Ar - Ra'd Ayat 31",
                    "Ar - Ra'd Ayat 32",
                    "Ar - Ra'd Ayat 33",
                    "Ar - Ra'd Ayat 34",},
            {"Ar - Ra'd Ayat 35",
                    "Ar - Ra'd Ayat 36",
                    "Ar - Ra'd Ayat 37",
                    "Ar - Ra'd Ayat 38",
                    "Ar - Ra'd Ayat 39",
                    "Ar - Ra'd Ayat 40",
                    "Ar - Ra'd Ayat 41",
                    "Ar - Ra'd Ayat 42",},
            {"Ar - Ra'd Ayat 43",
                    "Ibrahim Ayat 1",
                    "Ibrahim Ayat 2",
                    "Ibrahim Ayat 3",
                    "Ibrahim Ayat 4",
                    "Ibrahim Ayat 5",},
            {"Ibrahim Ayat 6",
                    "Ibrahim Ayat 7",
                    "Ibrahim Ayat 8",
                    "Ibrahim Ayat 9",
                    "Ibrahim Ayat 10",},
            {"Ibrahim Ayat 11",
                    "Ibrahim Ayat 12",
                    "Ibrahim Ayat 13",
                    "Ibrahim Ayat 14",
                    "Ibrahim Ayat 15",
                    "Ibrahim Ayat 16",
                    "Ibrahim Ayat 17",
                    "Ibrahim Ayat 18",},
            {"Ibrahim Ayat 19",
                    "Ibrahim Ayat 20",
                    "Ibrahim Ayat 21",
                    "Ibrahim Ayat 22",
                    "Ibrahim Ayat 23",
                    "Ibrahim Ayat 24",},
            {"Ibrahim Ayat 25",
                    "Ibrahim Ayat 26",
                    "Ibrahim Ayat 27",
                    "Ibrahim Ayat 28",
                    "Ibrahim Ayat 29",
                    "Ibrahim Ayat 30",
                    "Ibrahim Ayat 31",
                    "Ibrahim Ayat 32",
                    "Ibrahim Ayat 33",},
            {"Ibrahim Ayat 34",
                    "Ibrahim Ayat 35",
                    "Ibrahim Ayat 36",
                    "Ibrahim Ayat 37",
                    "Ibrahim Ayat 38",
                    "Ibrahim Ayat 39",
                    "Ibrahim Ayat 40",
                    "Ibrahim Ayat 41",
                    "Ibrahim Ayat 42",},
            {"Ibrahim Ayat 43",
                    "Ibrahim Ayat 44",
                    "Ibrahim Ayat 45",
                    "Ibrahim Ayat 46",
                    "Ibrahim Ayat 47",
                    "Ibrahim Ayat 48",
                    "Ibrahim Ayat 49",
                    "Ibrahim Ayat 50",
                    "Ibrahim Ayat 51",
                    "Ibrahim Ayat 52",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz13, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz13 = (ImageView) view.findViewById(R.id.imageViewJuz13);
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
                imgjuz13.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 13 Halaman " + (halaman+1) );
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
                imgjuz13.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 13 Halaman " + (halaman+1) );
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