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
 * Use the {@link Juz10Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz10Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz10Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz10Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz10Fragment newInstance(String param1, String param2) {
        Juz10Fragment fragment = new Juz10Fragment();
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
            R.drawable.alanfal6,
            R.drawable.alanfal7,
            R.drawable.alanfal8,
            R.drawable.alanfal9,
            R.drawable.alanfal10,
            R.drawable.attaubah1,
            R.drawable.attaubah2,
            R.drawable.attaubah3,
            R.drawable.attaubah4,
            R.drawable.attaubah5,
            R.drawable.attaubah6,
            R.drawable.attaubah7,
            R.drawable.attaubah8,
            R.drawable.attaubah9,
            R.drawable.attaubah10,
            R.drawable.attaubah11,
            R.drawable.attaubah12,
            R.drawable.attaubah13,
            R.drawable.attaubah14,
            R.drawable.attaubah15,};

    private int [][] mp3ayat = {
            {R.raw.alanfal41,
                    R.raw.alanfal42,
                    R.raw.alanfal43,
                    R.raw.alanfal44,
                    R.raw.alanfal45,},
            {R.raw.alanfal46,
                    R.raw.alanfal47,
                    R.raw.alanfal48,
                    R.raw.alanfal49,
                    R.raw.alanfal50,
                    R.raw.alanfal51,
                    R.raw.alanfal52,},
            {R.raw.alanfal53,
                    R.raw.alanfal54,
                    R.raw.alanfal55,
                    R.raw.alanfal56,
                    R.raw.alanfal57,
                    R.raw.alanfal58,
                    R.raw.alanfal59,
                    R.raw.alanfal60,
                    R.raw.alanfal61,},
            {R.raw.alanfal62,
                    R.raw.alanfal63,
                    R.raw.alanfal64,
                    R.raw.alanfal65,
                    R.raw.alanfal66,
                    R.raw.alanfal67,
                    R.raw.alanfal68,
                    R.raw.alanfal69,},
            {R.raw.alanfal70,
                    R.raw.alanfal71,
                    R.raw.alanfal72,
                    R.raw.alanfal73,
                    R.raw.alanfal74,
                    R.raw.alanfal75,},
            {R.raw.attaubah1,
                    R.raw.attaubah2,
                    R.raw.attaubah3,
                    R.raw.attaubah4,
                    R.raw.attaubah5,
                    R.raw.attaubah6,},
            {R.raw.attaubah7,
                    R.raw.attaubah8,
                    R.raw.attaubah9,
                    R.raw.attaubah10,
                    R.raw.attaubah11,
                    R.raw.attaubah12,
                    R.raw.attaubah13,},
            {R.raw.attaubah14,
                    R.raw.attaubah15,
                    R.raw.attaubah16,
                    R.raw.attaubah17,
                    R.raw.attaubah18,
                    R.raw.attaubah19,
                    R.raw.attaubah20,},
            {R.raw.attaubah21,
                    R.raw.attaubah22,
                    R.raw.attaubah23,
                    R.raw.attaubah24,
                    R.raw.attaubah25,
                    R.raw.attaubah26,},
            {R.raw.attaubah27,
                    R.raw.attaubah28,
                    R.raw.attaubah29,
                    R.raw.attaubah30,
                    R.raw.attaubah31,},
            {R.raw.attaubah32,
                    R.raw.attaubah33,
                    R.raw.attaubah34,
                    R.raw.attaubah35,
                    R.raw.attaubah36,},
            {R.raw.attaubah37,
                    R.raw.attaubah38,
                    R.raw.attaubah39,
                    R.raw.attaubah40,},
            {R.raw.attaubah41,
                    R.raw.attaubah42,
                    R.raw.attaubah43,
                    R.raw.attaubah44,
                    R.raw.attaubah45,
                    R.raw.attaubah46,
                    R.raw.attaubah47,},
            {R.raw.attaubah48,
                    R.raw.attaubah49,
                    R.raw.attaubah50,
                    R.raw.attaubah51,
                    R.raw.attaubah52,
                    R.raw.attaubah53,
                    R.raw.attaubah54,},
            {R.raw.attaubah55,
                    R.raw.attaubah56,
                    R.raw.attaubah57,
                    R.raw.attaubah58,
                    R.raw.attaubah59,
                    R.raw.attaubah60,
                    R.raw.attaubah61,},
            {R.raw.attaubah62,
                    R.raw.attaubah63,
                    R.raw.attaubah64,
                    R.raw.attaubah65,
                    R.raw.attaubah66,
                    R.raw.attaubah67,
                    R.raw.attaubah68,},
            {R.raw.attaubah69,
                    R.raw.attaubah70,
                    R.raw.attaubah71,
                    R.raw.attaubah72,},
            {R.raw.attaubah73,
                    R.raw.attaubah74,
                    R.raw.attaubah75,
                    R.raw.attaubah76,
                    R.raw.attaubah77,
                    R.raw.attaubah78,
                    R.raw.attaubah79,},
            {R.raw.attaubah80,
                    R.raw.attaubah81,
                    R.raw.attaubah82,
                    R.raw.attaubah83,
                    R.raw.attaubah84,
                    R.raw.attaubah85,
                    R.raw.attaubah86,},
            {R.raw.attaubah87,
                    R.raw.attaubah88,
                    R.raw.attaubah89,
                    R.raw.attaubah90,
                    R.raw.attaubah91,
                    R.raw.attaubah92,
                    R.raw.attaubah93,},
    };

    private String [][] judulayat = {
            {"Al - Anfal Ayat 41",
                    "Al - Anfal Ayat 42",
                    "Al - Anfal Ayat 43",
                    "Al - Anfal Ayat 44",
                    "Al - Anfal Ayat 45",},
            {"Al - Anfal Ayat 46",
                    "Al - Anfal Ayat 47",
                    "Al - Anfal Ayat 48",
                    "Al - Anfal Ayat 49",
                    "Al - Anfal Ayat 50",
                    "Al - Anfal Ayat 51",
                    "Al - Anfal Ayat 52",},
            {"Al - Anfal Ayat 53",
                    "Al - Anfal Ayat 54",
                    "Al - Anfal Ayat 55",
                    "Al - Anfal Ayat 56",
                    "Al - Anfal Ayat 57",
                    "Al - Anfal Ayat 58",
                    "Al - Anfal Ayat 59",
                    "Al - Anfal Ayat 60",
                    "Al - Anfal Ayat 61",},
            {"Al - Anfal Ayat 62",
                    "Al - Anfal Ayat 63",
                    "Al - Anfal Ayat 64",
                    "Al - Anfal Ayat 65",
                    "Al - Anfal Ayat 66",
                    "Al - Anfal Ayat 67",
                    "Al - Anfal Ayat 68",
                    "Al - Anfal Ayat 69",},
            {"Al - Anfal Ayat 70",
                    "Al - Anfal Ayat 71",
                    "Al - Anfal Ayat 72",
                    "Al - Anfal Ayat 73",
                    "Al - Anfal Ayat 74",
                    "Al - Anfal Ayat 75",},
            {"At - Taubah Ayat 1",
                    "At - Taubah Ayat 2",
                    "At - Taubah Ayat 3",
                    "At - Taubah Ayat 4",
                    "At - Taubah Ayat 5",
                    "At - Taubah Ayat 6",},
            {"At - Taubah Ayat 7",
                    "At - Taubah Ayat 8",
                    "At - Taubah Ayat 9",
                    "At - Taubah Ayat 10",
                    "At - Taubah Ayat 11",
                    "At - Taubah Ayat 12",
                    "At - Taubah Ayat 13",},
            {"At - Taubah Ayat 14",
                    "At - Taubah Ayat 15",
                    "At - Taubah Ayat 16",
                    "At - Taubah Ayat 17",
                    "At - Taubah Ayat 18",
                    "At - Taubah Ayat 19",
                    "At - Taubah Ayat 20",},
            {"At - Taubah Ayat 21",
                    "At - Taubah Ayat 22",
                    "At - Taubah Ayat 23",
                    "At - Taubah Ayat 24",
                    "At - Taubah Ayat 25",
                    "At - Taubah Ayat 26",},
            {"At - Taubah Ayat 27",
                    "At - Taubah Ayat 28",
                    "At - Taubah Ayat 29",
                    "At - Taubah Ayat 30",
                    "At - Taubah Ayat 31",},
            {"At - Taubah Ayat 32",
                    "At - Taubah Ayat 33",
                    "At - Taubah Ayat 34",
                    "At - Taubah Ayat 35",
                    "At - Taubah Ayat 36",},
            {"At - Taubah Ayat 37",
                    "At - Taubah Ayat 38",
                    "At - Taubah Ayat 39",
                    "At - Taubah Ayat 40",},
            {"At - Taubah Ayat 41",
                    "At - Taubah Ayat 42",
                    "At - Taubah Ayat 43",
                    "At - Taubah Ayat 44",
                    "At - Taubah Ayat 45",
                    "At - Taubah Ayat 46",
                    "At - Taubah Ayat 47",},
            {"At - Taubah Ayat 48",
                    "At - Taubah Ayat 49",
                    "At - Taubah Ayat 50",
                    "At - Taubah Ayat 51",
                    "At - Taubah Ayat 52",
                    "At - Taubah Ayat 53",
                    "At - Taubah Ayat 54",},
            {"At - Taubah Ayat 55",
                    "At - Taubah Ayat 56",
                    "At - Taubah Ayat 57",
                    "At - Taubah Ayat 58",
                    "At - Taubah Ayat 59",
                    "At - Taubah Ayat 60",
                    "At - Taubah Ayat 61",},
            {"At - Taubah Ayat 62",
                    "At - Taubah Ayat 63",
                    "At - Taubah Ayat 64",
                    "At - Taubah Ayat 65",
                    "At - Taubah Ayat 66",
                    "At - Taubah Ayat 67",
                    "At - Taubah Ayat 68",},
            {"At - Taubah Ayat 69",
                    "At - Taubah Ayat 70",
                    "At - Taubah Ayat 71",
                    "At - Taubah Ayat 72",},
            {"At - Taubah Ayat 73",
                    "At - Taubah Ayat 74",
                    "At - Taubah Ayat 75",
                    "At - Taubah Ayat 76",
                    "At - Taubah Ayat 77",
                    "At - Taubah Ayat 78",
                    "At - Taubah Ayat 79",},
            {"At - Taubah Ayat 80",
                    "At - Taubah Ayat 81",
                    "At - Taubah Ayat 82",
                    "At - Taubah Ayat 83",
                    "At - Taubah Ayat 84",
                    "At - Taubah Ayat 85",
                    "At - Taubah Ayat 86",},
            {"At - Taubah Ayat 87",
                    "At - Taubah Ayat 88",
                    "At - Taubah Ayat 89",
                    "At - Taubah Ayat 90",
                    "At - Taubah Ayat 91",
                    "At - Taubah Ayat 92",
                    "At - Taubah Ayat 93",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz10, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz10 = (ImageView) view.findViewById(R.id.imageViewJuz10);
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
                imgjuz10.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 10 Halaman " + (halaman+1) );
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
                imgjuz10.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 10 Halaman " + (halaman+1) );
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