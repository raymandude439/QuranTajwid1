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
 * Use the {@link Juz8Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz8Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz8Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz8Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz8Fragment newInstance(String param1, String param2) {
        Juz8Fragment fragment = new Juz8Fragment();
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
            R.drawable.alanam15,
            R.drawable.alanam16,
            R.drawable.alanam17,
            R.drawable.alanam18,
            R.drawable.alanam19,
            R.drawable.alanam20,
            R.drawable.alanam21,
            R.drawable.alanam22,
            R.drawable.alanam23,
            R.drawable.alaraf1,
            R.drawable.alaraf2,
            R.drawable.alaraf3,
            R.drawable.alaraf4,
            R.drawable.alaraf5,
            R.drawable.alaraf6,
            R.drawable.alaraf7,
            R.drawable.alaraf8,
            R.drawable.alaraf9,
            R.drawable.alaraf10,
            R.drawable.alaraf11,};

    private int [][] mp3ayat = {
            {R.raw.alanam111,
                    R.raw.alanam112,
                    R.raw.alanam113,
                    R.raw.alanam114,
                    R.raw.alanam115,
                    R.raw.alanam116,
                    R.raw.alanam117,
                    R.raw.alanam118,},
            {R.raw.alanam119,
                    R.raw.alanam120,
                    R.raw.alanam121,
                    R.raw.alanam122,
                    R.raw.alanam123,
                    R.raw.alanam124,},
            {R.raw.alanam125,
                    R.raw.alanam126,
                    R.raw.alanam127,
                    R.raw.alanam128,
                    R.raw.alanam129,
                    R.raw.alanam130,
                    R.raw.alanam131,},
            {R.raw.alanam132,
                    R.raw.alanam133,
                    R.raw.alanam134,
                    R.raw.alanam135,
                    R.raw.alanam136,
                    R.raw.alanam137,},
            {R.raw.alanam138,
                    R.raw.alanam139,
                    R.raw.alanam140,
                    R.raw.alanam141,
                    R.raw.alanam142,},
            {R.raw.alanam143,
                    R.raw.alanam144,
                    R.raw.alanam145,
                    R.raw.alanam146,},
            {R.raw.alanam147,
                    R.raw.alanam148,
                    R.raw.alanam149,
                    R.raw.alanam150,
                    R.raw.alanam151,},
            {R.raw.alanam152,
                    R.raw.alanam153,
                    R.raw.alanam154,
                    R.raw.alanam155,
                    R.raw.alanam156,
                    R.raw.alanam157,},
            {R.raw.alanam158,
                    R.raw.alanam159,
                    R.raw.alanam160,
                    R.raw.alanam161,
                    R.raw.alanam162,
                    R.raw.alanam163,
                    R.raw.alanam164,
                    R.raw.alanam165,},
            {R.raw.fatihah1,
                    R.raw.alaraf1,
                    R.raw.alaraf2,
                    R.raw.alaraf3,
                    R.raw.alaraf4,
                    R.raw.alaraf5,
                    R.raw.alaraf6,
                    R.raw.alaraf7,
                    R.raw.alaraf8,
                    R.raw.alaraf9,
                    R.raw.alaraf10,
                    R.raw.alaraf11,},
            {R.raw.alaraf12,
                    R.raw.alaraf13,
                    R.raw.alaraf14,
                    R.raw.alaraf15,
                    R.raw.alaraf16,
                    R.raw.alaraf17,
                    R.raw.alaraf18,
                    R.raw.alaraf19,
                    R.raw.alaraf20,
                    R.raw.alaraf21,
                    R.raw.alaraf22,},
            {R.raw.alaraf23,
                    R.raw.alaraf24,
                    R.raw.alaraf25,
                    R.raw.alaraf26,
                    R.raw.alaraf27,
                    R.raw.alaraf28,
                    R.raw.alaraf29,
                    R.raw.alaraf30,},
            {R.raw.alaraf31,
                    R.raw.alaraf32,
                    R.raw.alaraf33,
                    R.raw.alaraf34,
                    R.raw.alaraf35,
                    R.raw.alaraf36,
                    R.raw.alaraf37,},
            {R.raw.alaraf38,
                    R.raw.alaraf39,
                    R.raw.alaraf40,
                    R.raw.alaraf41,
                    R.raw.alaraf42,
                    R.raw.alaraf43,},
            {R.raw.alaraf44,
                    R.raw.alaraf45,
                    R.raw.alaraf46,
                    R.raw.alaraf47,
                    R.raw.alaraf48,
                    R.raw.alaraf49,
                    R.raw.alaraf50,
                    R.raw.alaraf51,},
            {R.raw.alaraf52,
                    R.raw.alaraf53,
                    R.raw.alaraf54,
                    R.raw.alaraf55,
                    R.raw.alaraf56,
                    R.raw.alaraf57,},
            {R.raw.alaraf58,
                    R.raw.alaraf59,
                    R.raw.alaraf60,
                    R.raw.alaraf61,
                    R.raw.alaraf62,
                    R.raw.alaraf63,
                    R.raw.alaraf64,
                    R.raw.alaraf65,
                    R.raw.alaraf66,
                    R.raw.alaraf67,},
            {R.raw.alaraf68,
                    R.raw.alaraf69,
                    R.raw.alaraf70,
                    R.raw.alaraf71,
                    R.raw.alaraf72,
                    R.raw.alaraf73,},
            {R.raw.alaraf74,
                    R.raw.alaraf75,
                    R.raw.alaraf76,
                    R.raw.alaraf77,
                    R.raw.alaraf78,
                    R.raw.alaraf79,
                    R.raw.alaraf80,
                    R.raw.alaraf81,},
            {R.raw.alaraf82,
                    R.raw.alaraf83,
                    R.raw.alaraf84,
                    R.raw.alaraf85,
                    R.raw.alaraf86,
                    R.raw.alaraf87,},
    };

    private String [][] judulayat = {
            {"Al - An'am Ayat 111",
                    "Al - An'am Ayat 112",
                    "Al - An'am Ayat 113",
                    "Al - An'am Ayat 114",
                    "Al - An'am Ayat 115",
                    "Al - An'am Ayat 116",
                    "Al - An'am Ayat 117",
                    "Al - An'am Ayat 118",},
            {"Al - An'am Ayat 119",
                    "Al - An'am Ayat 120",
                    "Al - An'am Ayat 121",
                    "Al - An'am Ayat 122",
                    "Al - An'am Ayat 123",
                    "Al - An'am Ayat 124",},
            {"Al - An'am Ayat 125",
                    "Al - An'am Ayat 126",
                    "Al - An'am Ayat 127",
                    "Al - An'am Ayat 128",
                    "Al - An'am Ayat 129",
                    "Al - An'am Ayat 130",
                    "Al - An'am Ayat 131",},
            {"Al - An'am Ayat 132",
                    "Al - An'am Ayat 133",
                    "Al - An'am Ayat 134",
                    "Al - An'am Ayat 135",
                    "Al - An'am Ayat 136",
                    "Al - An'am Ayat 137",},
            {"Al - An'am Ayat 138",
                    "Al - An'am Ayat 139",
                    "Al - An'am Ayat 140",
                    "Al - An'am Ayat 141",
                    "Al - An'am Ayat 142",},
            {"Al - An'am Ayat 143",
                    "Al - An'am Ayat 144",
                    "Al - An'am Ayat 145",
                    "Al - An'am Ayat 146",},
            {"Al - An'am Ayat 147",
                    "Al - An'am Ayat 148",
                    "Al - An'am Ayat 149",
                    "Al - An'am Ayat 150",
                    "Al - An'am Ayat 151",},
            {"Al - An'am Ayat 152",
                    "Al - An'am Ayat 153",
                    "Al - An'am Ayat 154",
                    "Al - An'am Ayat 155",
                    "Al - An'am Ayat 156",
                    "Al - An'am Ayat 157",},
            {"Al - An'am Ayat 158",
                    "Al - An'am Ayat 159",
                    "Al - An'am Ayat 160",
                    "Al - An'am Ayat 161",
                    "Al - An'am Ayat 162",
                    "Al - An'am Ayat 163",
                    "Al - An'am Ayat 164",
                    "Al - An'am Ayat 165",},
            {"Ucapan Bismillah",
                    "Al - A'raf Ayat 1",
                    "Al - A'raf Ayat 2",
                    "Al - A'raf Ayat 3",
                    "Al - A'raf Ayat 4",
                    "Al - A'raf Ayat 5",
                    "Al - A'raf Ayat 6",
                    "Al - A'raf Ayat 7",
                    "Al - A'raf Ayat 8",
                    "Al - A'raf Ayat 9",
                    "Al - A'raf Ayat 10",
                    "Al - A'raf Ayat 11",},
            {"Al - A'raf Ayat 12",
                    "Al - A'raf Ayat 13",
                    "Al - A'raf Ayat 14",
                    "Al - A'raf Ayat 15",
                    "Al - A'raf Ayat 16",
                    "Al - A'raf Ayat 17",
                    "Al - A'raf Ayat 18",
                    "Al - A'raf Ayat 19",
                    "Al - A'raf Ayat 20",
                    "Al - A'raf Ayat 21",
                    "Al - A'raf Ayat 22",},
            {"Al - A'raf Ayat 23",
                    "Al - A'raf Ayat 24",
                    "Al - A'raf Ayat 25",
                    "Al - A'raf Ayat 26",
                    "Al - A'raf Ayat 27",
                    "Al - A'raf Ayat 28",
                    "Al - A'raf Ayat 29",
                    "Al - A'raf Ayat 30",},
            {"Al - A'raf Ayat 31",
                    "Al - A'raf Ayat 32",
                    "Al - A'raf Ayat 33",
                    "Al - A'raf Ayat 34",
                    "Al - A'raf Ayat 35",
                    "Al - A'raf Ayat 36",
                    "Al - A'raf Ayat 37",},
            {"Al - A'raf Ayat 38",
                    "Al - A'raf Ayat 39",
                    "Al - A'raf Ayat 40",
                    "Al - A'raf Ayat 41",
                    "Al - A'raf Ayat 42",
                    "Al - A'raf Ayat 43",},
            {"Al - A'raf Ayat 44",
                    "Al - A'raf Ayat 45",
                    "Al - A'raf Ayat 46",
                    "Al - A'raf Ayat 47",
                    "Al - A'raf Ayat 48",
                    "Al - A'raf Ayat 49",
                    "Al - A'raf Ayat 50",
                    "Al - A'raf Ayat 51",},
            {"Al - A'raf Ayat 52",
                    "Al - A'raf Ayat 53",
                    "Al - A'raf Ayat 54",
                    "Al - A'raf Ayat 55",
                    "Al - A'raf Ayat 56",
                    "Al - A'raf Ayat 57",},
            {"Al - A'raf Ayat 58",
                    "Al - A'raf Ayat 59",
                    "Al - A'raf Ayat 60",
                    "Al - A'raf Ayat 61",
                    "Al - A'raf Ayat 62",
                    "Al - A'raf Ayat 63",
                    "Al - A'raf Ayat 64",
                    "Al - A'raf Ayat 65",
                    "Al - A'raf Ayat 66",
                    "Al - A'raf Ayat 67",},
            {"Al - A'raf Ayat 68",
                    "Al - A'raf Ayat 69",
                    "Al - A'raf Ayat 70",
                    "Al - A'raf Ayat 71",
                    "Al - A'raf Ayat 72",
                    "Al - A'raf Ayat 73",},
            {"Al - A'raf Ayat 74",
                    "Al - A'raf Ayat 75",
                    "Al - A'raf Ayat 76",
                    "Al - A'raf Ayat 77",
                    "Al - A'raf Ayat 78",
                    "Al - A'raf Ayat 79",
                    "Al - A'raf Ayat 80",
                    "Al - A'raf Ayat 81",},
            {"Al - A'raf Ayat 82",
                    "Al - A'raf Ayat 83",
                    "Al - A'raf Ayat 84",
                    "Al - A'raf Ayat 85",
                    "Al - A'raf Ayat 86",
                    "Al - A'raf Ayat 87",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz8, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz8 = (ImageView) view.findViewById(R.id.imageViewJuz8);
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
                imgjuz8.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 8 Halaman " + (halaman+1) );
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
                imgjuz8.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 8 Halaman " + (halaman+1) );
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