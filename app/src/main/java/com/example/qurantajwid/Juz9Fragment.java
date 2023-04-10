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
 * Use the {@link Juz9Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz9Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz9Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz9Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz9Fragment newInstance(String param1, String param2) {
        Juz9Fragment fragment = new Juz9Fragment();
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
            R.drawable.alaraf12,
            R.drawable.alaraf13,
            R.drawable.alaraf14,
            R.drawable.alaraf15,
            R.drawable.alaraf16,
            R.drawable.alaraf17,
            R.drawable.alaraf18,
            R.drawable.alaraf19,
            R.drawable.alaraf20,
            R.drawable.alaraf21,
            R.drawable.alaraf22,
            R.drawable.alaraf23,
            R.drawable.alaraf24,
            R.drawable.alaraf25,
            R.drawable.alaraf26,
            R.drawable.alanfal1,
            R.drawable.alanfal2,
            R.drawable.alanfal3,
            R.drawable.alanfal4,
            R.drawable.alanfal5,};

    private int [][] mp3ayat = {
            {R.raw.alaraf88,
                    R.raw.alaraf89,
                    R.raw.alaraf90,
                    R.raw.alaraf91,
                    R.raw.alaraf92,
                    R.raw.alaraf93,
                    R.raw.alaraf94,
                    R.raw.alaraf95,},
            {R.raw.alaraf96,
                    R.raw.alaraf97,
                    R.raw.alaraf98,
                    R.raw.alaraf99,
                    R.raw.alaraf100,
                    R.raw.alaraf101,
                    R.raw.alaraf102,
                    R.raw.alaraf103,
                    R.raw.alaraf104,},
            {R.raw.alaraf105,
                    R.raw.alaraf106,
                    R.raw.alaraf107,
                    R.raw.alaraf108,
                    R.raw.alaraf109,
                    R.raw.alaraf110,
                    R.raw.alaraf111,
                    R.raw.alaraf112,
                    R.raw.alaraf113,
                    R.raw.alaraf114,
                    R.raw.alaraf115,
                    R.raw.alaraf116,
                    R.raw.alaraf117,
                    R.raw.alaraf118,
                    R.raw.alaraf119,
                    R.raw.alaraf120,},
            {R.raw.alaraf121,
                    R.raw.alaraf122,
                    R.raw.alaraf123,
                    R.raw.alaraf124,
                    R.raw.alaraf125,
                    R.raw.alaraf126,
                    R.raw.alaraf127,
                    R.raw.alaraf128,
                    R.raw.alaraf129,
                    R.raw.alaraf130,},
            {R.raw.alaraf131,
                    R.raw.alaraf132,
                    R.raw.alaraf133,
                    R.raw.alaraf134,
                    R.raw.alaraf135,
                    R.raw.alaraf136,
                    R.raw.alaraf137,},
            {R.raw.alaraf138,
                    R.raw.alaraf139,
                    R.raw.alaraf140,
                    R.raw.alaraf141,
                    R.raw.alaraf142,
                    R.raw.alaraf143,},
            {R.raw.alaraf144,
                    R.raw.alaraf145,
                    R.raw.alaraf146,
                    R.raw.alaraf147,
                    R.raw.alaraf148,
                    R.raw.alaraf149,},
            {R.raw.alaraf150,
                    R.raw.alaraf151,
                    R.raw.alaraf152,
                    R.raw.alaraf153,
                    R.raw.alaraf154,
                    R.raw.alaraf155,},
            {R.raw.alaraf156,
                    R.raw.alaraf157,
                    R.raw.alaraf158,
                    R.raw.alaraf159,},
            {R.raw.alaraf160,
                    R.raw.alaraf161,
                    R.raw.alaraf162,
                    R.raw.alaraf163,},
            {R.raw.alaraf164,
                    R.raw.alaraf165,
                    R.raw.alaraf166,
                    R.raw.alaraf167,
                    R.raw.alaraf168,
                    R.raw.alaraf169,
                    R.raw.alaraf170,},
            {R.raw.alaraf171,
                    R.raw.alaraf172,
                    R.raw.alaraf173,
                    R.raw.alaraf174,
                    R.raw.alaraf175,
                    R.raw.alaraf176,
                    R.raw.alaraf177,
                    R.raw.alaraf178,},
            {R.raw.alaraf179,
                    R.raw.alaraf180,
                    R.raw.alaraf181,
                    R.raw.alaraf182,
                    R.raw.alaraf183,
                    R.raw.alaraf184,
                    R.raw.alaraf185,
                    R.raw.alaraf186,
                    R.raw.alaraf187,},
            {R.raw.alaraf188,
                    R.raw.alaraf189,
                    R.raw.alaraf190,
                    R.raw.alaraf191,
                    R.raw.alaraf192,
                    R.raw.alaraf193,
                    R.raw.alaraf194,
                    R.raw.alaraf195,},
            {R.raw.alaraf196,
                    R.raw.alaraf197,
                    R.raw.alaraf198,
                    R.raw.alaraf199,
                    R.raw.alaraf200,
                    R.raw.alaraf201,
                    R.raw.alaraf202,
                    R.raw.alaraf203,
                    R.raw.alaraf204,
                    R.raw.alaraf205,
                    R.raw.alaraf206,},
            {R.raw.fatihah1,
                    R.raw.alanfal1,
                    R.raw.alanfal2,
                    R.raw.alanfal3,
                    R.raw.alanfal4,
                    R.raw.alanfal5,
                    R.raw.alanfal6,
                    R.raw.alanfal7,
                    R.raw.alanfal8,},
            {R.raw.alanfal9,
                    R.raw.alanfal10,
                    R.raw.alanfal11,
                    R.raw.alanfal12,
                    R.raw.alanfal13,
                    R.raw.alanfal14,
                    R.raw.alanfal15,
                    R.raw.alanfal16,},
            {R.raw.alanfal17,
                    R.raw.alanfal18,
                    R.raw.alanfal19,
                    R.raw.alanfal20,
                    R.raw.alanfal21,
                    R.raw.alanfal22,
                    R.raw.alanfal23,
                    R.raw.alanfal24,
                    R.raw.alanfal25,},
            {R.raw.alanfal26,
                    R.raw.alanfal27,
                    R.raw.alanfal28,
                    R.raw.alanfal29,
                    R.raw.alanfal30,
                    R.raw.alanfal31,
                    R.raw.alanfal32,
                    R.raw.alanfal33,},
            {R.raw.alanfal34,
                    R.raw.alanfal35,
                    R.raw.alanfal36,
                    R.raw.alanfal37,
                    R.raw.alanfal38,
                    R.raw.alanfal39,
                    R.raw.alanfal40,},
    };

    private String [][] judulayat = {
            {"Al - A'raf Ayat 88",
                    "Al - A'raf Ayat 89",
                    "Al - A'raf Ayat 90",
                    "Al - A'raf Ayat 91",
                    "Al - A'raf Ayat 92",
                    "Al - A'raf Ayat 93",
                    "Al - A'raf Ayat 94",
                    "Al - A'raf Ayat 95",},
            {"Al - A'raf Ayat 96",
                    "Al - A'raf Ayat 97",
                    "Al - A'raf Ayat 98",
                    "Al - A'raf Ayat 99",
                    "Al - A'raf Ayat 100",
                    "Al - A'raf Ayat 101",
                    "Al - A'raf Ayat 102",
                    "Al - A'raf Ayat 103",
                    "Al - A'raf Ayat 104",},
            {"Al - A'raf Ayat 105",
                    "Al - A'raf Ayat 106",
                    "Al - A'raf Ayat 107",
                    "Al - A'raf Ayat 108",
                    "Al - A'raf Ayat 109",
                    "Al - A'raf Ayat 110",
                    "Al - A'raf Ayat 111",
                    "Al - A'raf Ayat 112",
                    "Al - A'raf Ayat 113",
                    "Al - A'raf Ayat 114",
                    "Al - A'raf Ayat 115",
                    "Al - A'raf Ayat 116",
                    "Al - A'raf Ayat 117",
                    "Al - A'raf Ayat 118",
                    "Al - A'raf Ayat 119",
                    "Al - A'raf Ayat 120",},
            {"Al - A'raf Ayat 121",
                    "Al - A'raf Ayat 122",
                    "Al - A'raf Ayat 123",
                    "Al - A'raf Ayat 124",
                    "Al - A'raf Ayat 125",
                    "Al - A'raf Ayat 126",
                    "Al - A'raf Ayat 127",
                    "Al - A'raf Ayat 128",
                    "Al - A'raf Ayat 129",
                    "Al - A'raf Ayat 130",},
            {"Al - A'raf Ayat 131",
                    "Al - A'raf Ayat 132",
                    "Al - A'raf Ayat 133",
                    "Al - A'raf Ayat 134",
                    "Al - A'raf Ayat 135",
                    "Al - A'raf Ayat 136",
                    "Al - A'raf Ayat 137",},
            {"Al - A'raf Ayat 138",
                    "Al - A'raf Ayat 139",
                    "Al - A'raf Ayat 140",
                    "Al - A'raf Ayat 141",
                    "Al - A'raf Ayat 142",
                    "Al - A'raf Ayat 143",},
            {"Al - A'raf Ayat 144",
                    "Al - A'raf Ayat 145",
                    "Al - A'raf Ayat 146",
                    "Al - A'raf Ayat 147",
                    "Al - A'raf Ayat 148",
                    "Al - A'raf Ayat 149",},
            {"Al - A'raf Ayat 150",
                    "Al - A'raf Ayat 151",
                    "Al - A'raf Ayat 152",
                    "Al - A'raf Ayat 153",
                    "Al - A'raf Ayat 154",
                    "Al - A'raf Ayat 155",},
            {"Al - A'raf Ayat 156",
                    "Al - A'raf Ayat 157",
                    "Al - A'raf Ayat 158",
                    "Al - A'raf Ayat 159",},
            {"Al - A'raf Ayat 160",
                    "Al - A'raf Ayat 161",
                    "Al - A'raf Ayat 162",
                    "Al - A'raf Ayat 163",},
            {"Al - A'raf Ayat 164",
                    "Al - A'raf Ayat 165",
                    "Al - A'raf Ayat 166",
                    "Al - A'raf Ayat 167",
                    "Al - A'raf Ayat 168",
                    "Al - A'raf Ayat 169",
                    "Al - A'raf Ayat 170",},
            {"Al - A'raf Ayat 171",
                    "Al - A'raf Ayat 172",
                    "Al - A'raf Ayat 173",
                    "Al - A'raf Ayat 174",
                    "Al - A'raf Ayat 175",
                    "Al - A'raf Ayat 176",
                    "Al - A'raf Ayat 177",
                    "Al - A'raf Ayat 178",},
            {"Al - A'raf Ayat 179",
                    "Al - A'raf Ayat 180",
                    "Al - A'raf Ayat 181",
                    "Al - A'raf Ayat 182",
                    "Al - A'raf Ayat 183",
                    "Al - A'raf Ayat 184",
                    "Al - A'raf Ayat 185",
                    "Al - A'raf Ayat 186",
                    "Al - A'raf Ayat 187",},
            {"Al - A'raf Ayat 188",
                    "Al - A'raf Ayat 189",
                    "Al - A'raf Ayat 190",
                    "Al - A'raf Ayat 191",
                    "Al - A'raf Ayat 192",
                    "Al - A'raf Ayat 193",
                    "Al - A'raf Ayat 194",
                    "Al - A'raf Ayat 195",},
            {"Al - A'raf Ayat 196",
                    "Al - A'raf Ayat 197",
                    "Al - A'raf Ayat 198",
                    "Al - A'raf Ayat 199",
                    "Al - A'raf Ayat 200",
                    "Al - A'raf Ayat 201",
                    "Al - A'raf Ayat 202",
                    "Al - A'raf Ayat 203",
                    "Al - A'raf Ayat 204",
                    "Al - A'raf Ayat 205",
                    "Al - A'raf Ayat 206",},
            {"Ucapan Bismillah",
                    "Al - Anfal Ayat 1",
                    "Al - Anfal Ayat 2",
                    "Al - Anfal Ayat 3",
                    "Al - Anfal Ayat 4",
                    "Al - Anfal Ayat 5",
                    "Al - Anfal Ayat 6",
                    "Al - Anfal Ayat 7",
                    "Al - Anfal Ayat 8",},
            {"Al - Anfal Ayat 9",
                    "Al - Anfal Ayat 10",
                    "Al - Anfal Ayat 11",
                    "Al - Anfal Ayat 12",
                    "Al - Anfal Ayat 13",
                    "Al - Anfal Ayat 14",
                    "Al - Anfal Ayat 15",
                    "Al - Anfal Ayat 16",},
            {"Al - Anfal Ayat 17",
                    "Al - Anfal Ayat 18",
                    "Al - Anfal Ayat 19",
                    "Al - Anfal Ayat 20",
                    "Al - Anfal Ayat 21",
                    "Al - Anfal Ayat 22",
                    "Al - Anfal Ayat 23",
                    "Al - Anfal Ayat 24",
                    "Al - Anfal Ayat 25",},
            {"Al - Anfal Ayat 26",
                    "Al - Anfal Ayat 27",
                    "Al - Anfal Ayat 28",
                    "Al - Anfal Ayat 29",
                    "Al - Anfal Ayat 30",
                    "Al - Anfal Ayat 31",
                    "Al - Anfal Ayat 32",
                    "Al - Anfal Ayat 33",},
            {"Al - Anfal Ayat 34",
                    "Al - Anfal Ayat 35",
                    "Al - Anfal Ayat 36",
                    "Al - Anfal Ayat 37",
                    "Al - Anfal Ayat 38",
                    "Al - Anfal Ayat 39",
                    "Al - Anfal Ayat 40",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz9, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz9 = (ImageView) view.findViewById(R.id.imageViewJuz9);
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
                imgjuz9.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 9 Halaman " + (halaman+1) );
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
                imgjuz9.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 9 Halaman " + (halaman+1) );
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