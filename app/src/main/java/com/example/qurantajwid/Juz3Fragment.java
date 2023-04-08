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
 * Use the {@link Juz3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz3Fragment newInstance(String param1, String param2) {
        Juz3Fragment fragment = new Juz3Fragment();
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
            R.drawable.albaqarah41,
            R.drawable.albaqarah42,
            R.drawable.albaqarah43,
            R.drawable.albaqarah44,
            R.drawable.albaqarah45,
            R.drawable.albaqarah46,
            R.drawable.albaqarah47,
            R.drawable.albaqarah48,
            R.drawable.aliimran1,
            R.drawable.aliimran2,
            R.drawable.aliimran3,
            R.drawable.aliimran4,
            R.drawable.aliimran5,
            R.drawable.aliimran6,
            R.drawable.aliimran7,
            R.drawable.aliimran8,
            R.drawable.aliimran9,
            R.drawable.aliimran10,
            R.drawable.aliimran11,
            R.drawable.aliimran12};

    private int [][] mp3ayat = {
            {R.raw.baqarah253,
                    R.raw.baqarah254,
                    R.raw.baqarah255,
                    R.raw.baqarah256,},
            {R.raw.baqarah257,
                    R.raw.baqarah258,
                    R.raw.baqarah259,},
            {R.raw.baqarah260,
                    R.raw.baqarah261,
                    R.raw.baqarah262,
                    R.raw.baqarah263,
                    R.raw.baqarah264,},
            {R.raw.baqarah265,
                    R.raw.baqarah266,
                    R.raw.baqarah267,
                    R.raw.baqarah268,
                    R.raw.baqarah269,},
            {R.raw.baqarah270,
                    R.raw.baqarah271,
                    R.raw.baqarah272,
                    R.raw.baqarah273,
                    R.raw.baqarah274,},
            {R.raw.baqarah275,
                    R.raw.baqarah276,
                    R.raw.baqarah277,
                    R.raw.baqarah278,
                    R.raw.baqarah279,
                    R.raw.baqarah280,
                    R.raw.baqarah281,},
            {R.raw.baqarah282,},
            {R.raw.baqarah283,
                    R.raw.baqarah284,
                    R.raw.baqarah285,
                    R.raw.baqarah286,},
            {R.raw.fatihah1,
                    R.raw.imran1,
                    R.raw.imran2,
                    R.raw.imran3,
                    R.raw.imran4,
                    R.raw.imran5,
                    R.raw.imran6,
                    R.raw.imran7,
                    R.raw.imran8,
                    R.raw.imran9,},
            {R.raw.imran10,
                    R.raw.imran11,
                    R.raw.imran12,
                    R.raw.imran13,
                    R.raw.imran14,
                    R.raw.imran15,},
            {R.raw.imran16,
                    R.raw.imran17,
                    R.raw.imran18,
                    R.raw.imran19,
                    R.raw.imran20,
                    R.raw.imran21,
                    R.raw.imran22,},
            {R.raw.imran23,
                    R.raw.imran24,
                    R.raw.imran25,
                    R.raw.imran26,
                    R.raw.imran27,
                    R.raw.imran28,
                    R.raw.imran29,},
            {R.raw.imran30,
                    R.raw.imran31,
                    R.raw.imran32,
                    R.raw.imran33,
                    R.raw.imran34,
                    R.raw.imran35,
                    R.raw.imran36,
                    R.raw.imran37,},
            {R.raw.imran38,
                    R.raw.imran39,
                    R.raw.imran40,
                    R.raw.imran41,
                    R.raw.imran42,
                    R.raw.imran43,
                    R.raw.imran44,
                    R.raw.imran45,},
            {R.raw.imran46,
                    R.raw.imran47,
                    R.raw.imran48,
                    R.raw.imran49,
                    R.raw.imran50,
                    R.raw.imran51,
                    R.raw.imran52,},
            {R.raw.imran53,
                    R.raw.imran54,
                    R.raw.imran55,
                    R.raw.imran56,
                    R.raw.imran57,
                    R.raw.imran58,
                    R.raw.imran59,
                    R.raw.imran60,
                    R.raw.imran61,},
            {R.raw.imran62,
                    R.raw.imran63,
                    R.raw.imran64,
                    R.raw.imran65,
                    R.raw.imran66,
                    R.raw.imran67,
                    R.raw.imran68,
                    R.raw.imran69,
                    R.raw.imran70,},
            {R.raw.imran71,
                    R.raw.imran72,
                    R.raw.imran73,
                    R.raw.imran74,
                    R.raw.imran75,
                    R.raw.imran76,
                    R.raw.imran77,},
            {R.raw.imran78,
                    R.raw.imran79,
                    R.raw.imran80,
                    R.raw.imran81,
                    R.raw.imran82,
                    R.raw.imran83,},
            {R.raw.imran84,
                    R.raw.imran85,
                    R.raw.imran86,
                    R.raw.imran87,
                    R.raw.imran88,
                    R.raw.imran89,
                    R.raw.imran90,
                    R.raw.imran91,},
    };

    private String [][] judulayat = {
            {"Al - Baqarah Ayat 253",
                    "Al - Baqarah Ayat 254",
                    "Al - Baqarah Ayat 255",
                    "Al - Baqarah Ayat 256",},
            {"Al - Baqarah Ayat 257",
                    "Al - Baqarah Ayat 258",
                    "Al - Baqarah Ayat 259",},
            {"Al - Baqarah Ayat 260",
                    "Al - Baqarah Ayat 261",
                    "Al - Baqarah Ayat 262",
                    "Al - Baqarah Ayat 263",
                    "Al - Baqarah Ayat 264",},
            {"Al - Baqarah Ayat 265",
                    "Al - Baqarah Ayat 266",
                    "Al - Baqarah Ayat 267",
                    "Al - Baqarah Ayat 268",
                    "Al - Baqarah Ayat 269",},
            {"Al - Baqarah Ayat 270",
                    "Al - Baqarah Ayat 271",
                    "Al - Baqarah Ayat 272",
                    "Al - Baqarah Ayat 273",
                    "Al - Baqarah Ayat 274",},
            {"Al - Baqarah Ayat 275",
                    "Al - Baqarah Ayat 276",
                    "Al - Baqarah Ayat 277",
                    "Al - Baqarah Ayat 278",
                    "Al - Baqarah Ayat 279",
                    "Al - Baqarah Ayat 280",
                    "Al - Baqarah Ayat 281",},
            {"Al - Baqarah Ayat 282",},
            {"Al - Baqarah Ayat 283",
                    "Al - Baqarah Ayat 284",
                    "Al - Baqarah Ayat 285",
                    "Al - Baqarah Ayat 286",},
            {"Ucapan Bismillah",
                    "Ali - Imran Ayat 1",
                    "Ali - Imran Ayat 2",
                    "Ali - Imran Ayat 3",
                    "Ali - Imran Ayat 4",
                    "Ali - Imran Ayat 5",
                    "Ali - Imran Ayat 6",
                    "Ali - Imran Ayat 7",
                    "Ali - Imran Ayat 8",
                    "Ali - Imran Ayat 9",},
            {"Ali - Imran Ayat 10",
                    "Ali - Imran Ayat 11",
                    "Ali - Imran Ayat 12",
                    "Ali - Imran Ayat 13",
                    "Ali - Imran Ayat 14",
                    "Ali - Imran Ayat 15",},
            {"Ali - Imran Ayat 16",
                    "Ali - Imran Ayat 17",
                    "Ali - Imran Ayat 18",
                    "Ali - Imran Ayat 19",
                    "Ali - Imran Ayat 20",
                    "Ali - Imran Ayat 21",
                    "Ali - Imran Ayat 22",},
            {"Ali - Imran Ayat 23",
                    "Ali - Imran Ayat 24",
                    "Ali - Imran Ayat 25",
                    "Ali - Imran Ayat 26",
                    "Ali - Imran Ayat 27",
                    "Ali - Imran Ayat 28",
                    "Ali - Imran Ayat 29",},
            {"Ali - Imran Ayat 30",
                    "Ali - Imran Ayat 31",
                    "Ali - Imran Ayat 32",
                    "Ali - Imran Ayat 33",
                    "Ali - Imran Ayat 34",
                    "Ali - Imran Ayat 35",
                    "Ali - Imran Ayat 36",
                    "Ali - Imran Ayat 37",},
            {"Ali - Imran Ayat 38",
                    "Ali - Imran Ayat 39",
                    "Ali - Imran Ayat 40",
                    "Ali - Imran Ayat 41",
                    "Ali - Imran Ayat 42",
                    "Ali - Imran Ayat 43",
                    "Ali - Imran Ayat 44",
                    "Ali - Imran Ayat 45",},
            {"Ali - Imran Ayat 46",
                    "Ali - Imran Ayat 47",
                    "Ali - Imran Ayat 48",
                    "Ali - Imran Ayat 49",
                    "Ali - Imran Ayat 50",
                    "Ali - Imran Ayat 51",
                    "Ali - Imran Ayat 52",},
            {"Ali - Imran Ayat 53",
                    "Ali - Imran Ayat 54",
                    "Ali - Imran Ayat 55",
                    "Ali - Imran Ayat 56",
                    "Ali - Imran Ayat 57",
                    "Ali - Imran Ayat 58",
                    "Ali - Imran Ayat 59",
                    "Ali - Imran Ayat 60",
                    "Ali - Imran Ayat 61",},
            {"Ali - Imran Ayat 62",
                    "Ali - Imran Ayat 63",
                    "Ali - Imran Ayat 64",
                    "Ali - Imran Ayat 65",
                    "Ali - Imran Ayat 66",
                    "Ali - Imran Ayat 67",
                    "Ali - Imran Ayat 68",
                    "Ali - Imran Ayat 69",
                    "Ali - Imran Ayat 70",},
            {"Ali - Imran Ayat 71",
                    "Ali - Imran Ayat 72",
                    "Ali - Imran Ayat 73",
                    "Ali - Imran Ayat 74",
                    "Ali - Imran Ayat 75",
                    "Ali - Imran Ayat 76",
                    "Ali - Imran Ayat 77",},
            {"Ali - Imran Ayat 78",
                    "Ali - Imran Ayat 79",
                    "Ali - Imran Ayat 80",
                    "Ali - Imran Ayat 81",
                    "Ali - Imran Ayat 82",
                    "Ali - Imran Ayat 83",},
            {"Ali - Imran Ayat 84",
                    "Ali - Imran Ayat 85",
                    "Ali - Imran Ayat 86",
                    "Ali - Imran Ayat 87",
                    "Ali - Imran Ayat 88",
                    "Ali - Imran Ayat 89",
                    "Ali - Imran Ayat 90",
                    "Ali - Imran Ayat 91",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz3, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz3 = (ImageView) view.findViewById(R.id.imageViewJuz3);
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
                imgjuz3.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 3 Halaman " + (halaman+1) );
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
                imgjuz3.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 3 Halaman " + (halaman+1) );
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