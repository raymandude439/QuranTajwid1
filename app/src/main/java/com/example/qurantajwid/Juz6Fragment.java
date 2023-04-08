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
 * Use the {@link Juz6Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz6Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz6Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz6Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz6Fragment newInstance(String param1, String param2) {
        Juz6Fragment fragment = new Juz6Fragment();
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
            R.drawable.annisa26,
            R.drawable.annisa27,
            R.drawable.annisa28,
            R.drawable.annisa29,
            R.drawable.almaidah1,
            R.drawable.almaidah2,
            R.drawable.almaidah3,
            R.drawable.almaidah4,
            R.drawable.almaidah5,
            R.drawable.almaidah6,
            R.drawable.almaidah7,
            R.drawable.almaidah8,
            R.drawable.almaidah9,
            R.drawable.almaidah10,
            R.drawable.almaidah11,
            R.drawable.almaidah12,
            R.drawable.almaidah13,
            R.drawable.almaidah14,
            R.drawable.almaidah15,
            R.drawable.almaidah16,};

    private int [][] mp3ayat = {
            {R.raw.annisa148,
                    R.raw.annisa149,
                    R.raw.annisa150,
                    R.raw.annisa151,
                    R.raw.annisa152,
                    R.raw.annisa153,
                    R.raw.annisa154,},
            {R.raw.annisa155,
                    R.raw.annisa156,
                    R.raw.annisa157,
                    R.raw.annisa158,
                    R.raw.annisa159,
                    R.raw.annisa160,
                    R.raw.annisa161,
                    R.raw.annisa162,},
            {R.raw.annisa163,
                    R.raw.annisa164,
                    R.raw.annisa165,
                    R.raw.annisa166,
                    R.raw.annisa167,
                    R.raw.annisa168,
                    R.raw.annisa169,
                    R.raw.annisa170,},
            {R.raw.annisa171,
                    R.raw.annisa172,
                    R.raw.annisa173,
                    R.raw.annisa174,
                    R.raw.annisa175,},
            {R.raw.annisa176,
                    R.raw.fatihah1,
                    R.raw.almaidah1,
                    R.raw.almaidah2,},
            {R.raw.almaidah3,
                    R.raw.almaidah4,
                    R.raw.almaidah5,},
            {R.raw.almaidah6,
                    R.raw.almaidah7,
                    R.raw.almaidah8,
                    R.raw.almaidah9,},
            {R.raw.almaidah10,
                    R.raw.almaidah11,
                    R.raw.almaidah12,
                    R.raw.almaidah13,},
            {R.raw.almaidah14,
                    R.raw.almaidah15,
                    R.raw.almaidah16,
                    R.raw.almaidah17,},
            {R.raw.almaidah18,
                    R.raw.almaidah19,
                    R.raw.almaidah20,
                    R.raw.almaidah21,
                    R.raw.almaidah22,
                    R.raw.almaidah23,},
            {R.raw.almaidah24,
                    R.raw.almaidah25,
                    R.raw.almaidah26,
                    R.raw.almaidah27,
                    R.raw.almaidah28,
                    R.raw.almaidah29,
                    R.raw.almaidah30,
                    R.raw.almaidah31,},
            {R.raw.almaidah32,
                    R.raw.almaidah33,
                    R.raw.almaidah34,
                    R.raw.almaidah35,
                    R.raw.almaidah36,},
            {R.raw.almaidah37,
                    R.raw.almaidah38,
                    R.raw.almaidah39,
                    R.raw.almaidah40,
                    R.raw.almaidah41,},
            {R.raw.almaidah42,
                    R.raw.almaidah43,
                    R.raw.almaidah44,
                    R.raw.almaidah45,},
            {R.raw.almaidah46,
                    R.raw.almaidah47,
                    R.raw.almaidah48,
                    R.raw.almaidah49,
                    R.raw.almaidah50,},
            {R.raw.almaidah51,
                    R.raw.almaidah52,
                    R.raw.almaidah53,
                    R.raw.almaidah54,
                    R.raw.almaidah55,
                    R.raw.almaidah56,
                    R.raw.almaidah57,},
            {R.raw.almaidah58,
                    R.raw.almaidah59,
                    R.raw.almaidah60,
                    R.raw.almaidah61,
                    R.raw.almaidah62,
                    R.raw.almaidah63,
                    R.raw.almaidah64,},
            {R.raw.almaidah65,
                    R.raw.almaidah66,
                    R.raw.almaidah67,
                    R.raw.almaidah68,
                    R.raw.almaidah69,
                    R.raw.almaidah70,},
            {R.raw.almaidah71,
                    R.raw.almaidah72,
                    R.raw.almaidah73,
                    R.raw.almaidah74,
                    R.raw.almaidah75,
                    R.raw.almaidah76,},
            {R.raw.almaidah77,
                    R.raw.almaidah78,
                    R.raw.almaidah79,
                    R.raw.almaidah80,
                    R.raw.almaidah81,
                    R.raw.almaidah82,},
    };

    private String [][] judulayat = {
            {"An - Nisa Ayat 148",
                    "An - Nisa Ayat 149",
                    "An - Nisa Ayat 150",
                    "An - Nisa Ayat 151",
                    "An - Nisa Ayat 152",
                    "An - Nisa Ayat 153",
                    "An - Nisa Ayat 154",},
            {"An - Nisa Ayat 155",
                    "An - Nisa Ayat 156",
                    "An - Nisa Ayat 157",
                    "An - Nisa Ayat 158",
                    "An - Nisa Ayat 159",
                    "An - Nisa Ayat 160",
                    "An - Nisa Ayat 161",
                    "An - Nisa Ayat 162",},
            {"An - Nisa Ayat 163",
                    "An - Nisa Ayat 164",
                    "An - Nisa Ayat 165",
                    "An - Nisa Ayat 166",
                    "An - Nisa Ayat 167",
                    "An - Nisa Ayat 168",
                    "An - Nisa Ayat 169",
                    "An - Nisa Ayat 170",},
            {"An - Nisa Ayat 171",
                    "An - Nisa Ayat 172",
                    "An - Nisa Ayat 173",
                    "An - Nisa Ayat 174",
                    "An - Nisa Ayat 175",},
            {"An - Nisa Ayat 176",
                    "Ucapan Bismillah",
                    "Al - Maidah Ayat 1",
                    "Al - Maidah Ayat 2",},
            {"Al - Maidah Ayat 3",
                    "Al - Maidah Ayat 4",
                    "Al - Maidah Ayat 5",},
            {"Al - Maidah Ayat 6",
                    "Al - Maidah Ayat 7",
                    "Al - Maidah Ayat 8",
                    "Al - Maidah Ayat 9",},
            {"Al - Maidah Ayat 10",
                    "Al - Maidah Ayat 11",
                    "Al - Maidah Ayat 12",
                    "Al - Maidah Ayat 13",},
            {"Al - Maidah Ayat 14",
                    "Al - Maidah Ayat 15",
                    "Al - Maidah Ayat 16",
                    "Al - Maidah Ayat 17",},
            {"Al - Maidah Ayat 18",
                    "Al - Maidah Ayat 19",
                    "Al - Maidah Ayat 20",
                    "Al - Maidah Ayat 21",
                    "Al - Maidah Ayat 22",
                    "Al - Maidah Ayat 23",},
            {"Al - Maidah Ayat 24",
                    "Al - Maidah Ayat 25",
                    "Al - Maidah Ayat 26",
                    "Al - Maidah Ayat 27",
                    "Al - Maidah Ayat 28",
                    "Al - Maidah Ayat 29",
                    "Al - Maidah Ayat 30",
                    "Al - Maidah Ayat 31",},
            {"Al - Maidah Ayat 32",
                    "Al - Maidah Ayat 33",
                    "Al - Maidah Ayat 34",
                    "Al - Maidah Ayat 35",
                    "Al - Maidah Ayat 36",},
            {"Al - Maidah Ayat 37",
                    "Al - Maidah Ayat 38",
                    "Al - Maidah Ayat 39",
                    "Al - Maidah Ayat 40",
                    "Al - Maidah Ayat 41",},
            {"Al - Maidah Ayat 42",
                    "Al - Maidah Ayat 43",
                    "Al - Maidah Ayat 44",
                    "Al - Maidah Ayat 45",},
            {"Al - Maidah Ayat 46",
                    "Al - Maidah Ayat 47",
                    "Al - Maidah Ayat 48",
                    "Al - Maidah Ayat 49",
                    "Al - Maidah Ayat 50",},
            {"Al - Maidah Ayat 51",
                    "Al - Maidah Ayat 52",
                    "Al - Maidah Ayat 53",
                    "Al - Maidah Ayat 54",
                    "Al - Maidah Ayat 55",
                    "Al - Maidah Ayat 56",
                    "Al - Maidah Ayat 57",},
            {"Al - Maidah Ayat 58",
                    "Al - Maidah Ayat 59",
                    "Al - Maidah Ayat 60",
                    "Al - Maidah Ayat 61",
                    "Al - Maidah Ayat 62",
                    "Al - Maidah Ayat 63",
                    "Al - Maidah Ayat 64",},
            {"Al - Maidah Ayat 65",
                    "Al - Maidah Ayat 66",
                    "Al - Maidah Ayat 67",
                    "Al - Maidah Ayat 68",
                    "Al - Maidah Ayat 69",
                    "Al - Maidah Ayat 70",},
            {"Al - Maidah Ayat 71",
                    "Al - Maidah Ayat 72",
                    "Al - Maidah Ayat 73",
                    "Al - Maidah Ayat 74",
                    "Al - Maidah Ayat 75",
                    "Al - Maidah Ayat 76",},
            {"Al - Maidah Ayat 77",
                    "Al - Maidah Ayat 78",
                    "Al - Maidah Ayat 79",
                    "Al - Maidah Ayat 80",
                    "Al - Maidah Ayat 81",
                    "Al - Maidah Ayat 82",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz6, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz6 = (ImageView) view.findViewById(R.id.imageViewJuz6);
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
                imgjuz6.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 6 Halaman " + (halaman+1) );
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
                imgjuz6.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 6 Halaman " + (halaman+1) );
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