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
 * Use the {@link Juz14Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz14Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz14Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz14Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz14Fragment newInstance(String param1, String param2) {
        Juz14Fragment fragment = new Juz14Fragment();
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
            R.drawable.alhijr1,
            R.drawable.alhijr2,
            R.drawable.alhijr3,
            R.drawable.alhijr4,
            R.drawable.alhijr5,
            R.drawable.annahl1,
            R.drawable.annahl2,
            R.drawable.annahl3,
            R.drawable.annahl4,
            R.drawable.annahl5,
            R.drawable.annahl6,
            R.drawable.annahl7,
            R.drawable.annahl8,
            R.drawable.annahl9,
            R.drawable.annahl10,
            R.drawable.annahl11,
            R.drawable.annahl12,
            R.drawable.annahl13,
            R.drawable.annahl14,
            R.drawable.annahl15,};

    private int [][] mp3ayat = {
            {R.raw.alhijr1,
                    R.raw.alhijr2,
                    R.raw.alhijr3,
                    R.raw.alhijr4,
                    R.raw.alhijr5,
                    R.raw.alhijr6,
                    R.raw.alhijr7,
                    R.raw.alhijr8,
                    R.raw.alhijr9,
                    R.raw.alhijr10,
                    R.raw.alhijr11,
                    R.raw.alhijr12,
                    R.raw.alhijr13,
                    R.raw.alhijr14,
                    R.raw.alhijr15,},
            {R.raw.alhijr16,
                    R.raw.alhijr17,
                    R.raw.alhijr18,
                    R.raw.alhijr19,
                    R.raw.alhijr20,
                    R.raw.alhijr21,
                    R.raw.alhijr22,
                    R.raw.alhijr23,
                    R.raw.alhijr24,
                    R.raw.alhijr25,
                    R.raw.alhijr26,
                    R.raw.alhijr27,
                    R.raw.alhijr28,
                    R.raw.alhijr29,
                    R.raw.alhijr30,
                    R.raw.alhijr31,},
            {R.raw.alhijr32,
                    R.raw.alhijr33,
                    R.raw.alhijr34,
                    R.raw.alhijr35,
                    R.raw.alhijr36,
                    R.raw.alhijr37,
                    R.raw.alhijr38,
                    R.raw.alhijr39,
                    R.raw.alhijr40,
                    R.raw.alhijr41,
                    R.raw.alhijr42,
                    R.raw.alhijr43,
                    R.raw.alhijr44,
                    R.raw.alhijr45,
                    R.raw.alhijr46,
                    R.raw.alhijr47,
                    R.raw.alhijr48,
                    R.raw.alhijr49,
                    R.raw.alhijr50,
                    R.raw.alhijr51,},
            {R.raw.alhijr52,
                    R.raw.alhijr53,
                    R.raw.alhijr54,
                    R.raw.alhijr55,
                    R.raw.alhijr56,
                    R.raw.alhijr57,
                    R.raw.alhijr58,
                    R.raw.alhijr59,
                    R.raw.alhijr60,
                    R.raw.alhijr61,
                    R.raw.alhijr62,
                    R.raw.alhijr63,
                    R.raw.alhijr64,
                    R.raw.alhijr65,
                    R.raw.alhijr66,
                    R.raw.alhijr67,
                    R.raw.alhijr68,
                    R.raw.alhijr69,
                    R.raw.alhijr70,},
            {R.raw.alhijr71,
                    R.raw.alhijr72,
                    R.raw.alhijr73,
                    R.raw.alhijr74,
                    R.raw.alhijr75,
                    R.raw.alhijr76,
                    R.raw.alhijr77,
                    R.raw.alhijr78,
                    R.raw.alhijr79,
                    R.raw.alhijr80,
                    R.raw.alhijr81,
                    R.raw.alhijr82,
                    R.raw.alhijr83,
                    R.raw.alhijr84,
                    R.raw.alhijr85,
                    R.raw.alhijr86,
                    R.raw.alhijr87,
                    R.raw.alhijr88,
                    R.raw.alhijr89,
                    R.raw.alhijr90,},
            {R.raw.alhijr91,
                    R.raw.alhijr92,
                    R.raw.alhijr93,
                    R.raw.alhijr94,
                    R.raw.alhijr95,
                    R.raw.alhijr96,
                    R.raw.alhijr97,
                    R.raw.alhijr98,
                    R.raw.alhijr99,
                    R.raw.annahl1,
                    R.raw.annahl2,
                    R.raw.annahl3,
                    R.raw.annahl4,
                    R.raw.annahl5,
                    R.raw.annahl6,},
            {R.raw.annahl7,
                    R.raw.annahl8,
                    R.raw.annahl9,
                    R.raw.annahl10,
                    R.raw.annahl11,
                    R.raw.annahl12,
                    R.raw.annahl13,
                    R.raw.annahl14,},
            {R.raw.annahl15,
                    R.raw.annahl16,
                    R.raw.annahl17,
                    R.raw.annahl18,
                    R.raw.annahl19,
                    R.raw.annahl20,
                    R.raw.annahl21,
                    R.raw.annahl22,
                    R.raw.annahl23,
                    R.raw.annahl24,
                    R.raw.annahl25,
                    R.raw.annahl26,},
            {R.raw.annahl27,
                    R.raw.annahl28,
                    R.raw.annahl29,
                    R.raw.annahl30,
                    R.raw.annahl31,
                    R.raw.annahl32,
                    R.raw.annahl33,
                    R.raw.annahl34,},
            {R.raw.annahl35,
                    R.raw.annahl36,
                    R.raw.annahl37,
                    R.raw.annahl38,
                    R.raw.annahl39,
                    R.raw.annahl40,
                    R.raw.annahl41,
                    R.raw.annahl42,},
            {R.raw.annahl43,
                    R.raw.annahl44,
                    R.raw.annahl45,
                    R.raw.annahl46,
                    R.raw.annahl47,
                    R.raw.annahl48,
                    R.raw.annahl49,
                    R.raw.annahl50,
                    R.raw.annahl51,
                    R.raw.annahl52,
                    R.raw.annahl53,
                    R.raw.annahl54,},
            {R.raw.annahl55,
                    R.raw.annahl56,
                    R.raw.annahl57,
                    R.raw.annahl58,
                    R.raw.annahl59,
                    R.raw.annahl60,
                    R.raw.annahl61,
                    R.raw.annahl62,
                    R.raw.annahl63,
                    R.raw.annahl64,},
            {R.raw.annahl65,
                    R.raw.annahl66,
                    R.raw.annahl67,
                    R.raw.annahl68,
                    R.raw.annahl69,
                    R.raw.annahl70,
                    R.raw.annahl71,
                    R.raw.annahl72,},
            {R.raw.annahl73,
                    R.raw.annahl74,
                    R.raw.annahl75,
                    R.raw.annahl76,
                    R.raw.annahl77,
                    R.raw.annahl78,
                    R.raw.annahl79,},
            {R.raw.annahl80,
                    R.raw.annahl81,
                    R.raw.annahl82,
                    R.raw.annahl83,
                    R.raw.annahl84,
                    R.raw.annahl85,
                    R.raw.annahl86,
                    R.raw.annahl87,},
            {R.raw.annahl88,
                    R.raw.annahl89,
                    R.raw.annahl90,
                    R.raw.annahl91,
                    R.raw.annahl92,
                    R.raw.annahl93,},
            {R.raw.annahl94,
                    R.raw.annahl95,
                    R.raw.annahl96,
                    R.raw.annahl97,
                    R.raw.annahl98,
                    R.raw.annahl99,
                    R.raw.annahl100,
                    R.raw.annahl101,
                    R.raw.annahl102,},
            {R.raw.annahl103,
                    R.raw.annahl104,
                    R.raw.annahl105,
                    R.raw.annahl106,
                    R.raw.annahl107,
                    R.raw.annahl108,
                    R.raw.annahl109,
                    R.raw.annahl110,},
            {R.raw.annahl111,
                    R.raw.annahl112,
                    R.raw.annahl113,
                    R.raw.annahl114,
                    R.raw.annahl115,
                    R.raw.annahl116,
                    R.raw.annahl117,
                    R.raw.annahl118,},
            {R.raw.annahl119,
                    R.raw.annahl120,
                    R.raw.annahl121,
                    R.raw.annahl122,
                    R.raw.annahl123,
                    R.raw.annahl124,
                    R.raw.annahl125,
                    R.raw.annahl126,
                    R.raw.annahl127,
                    R.raw.annahl128,},
    };

    private String [][] judulayat = {
            {"Al - Hijr Ayat 1",
                    "Al - Hijr Ayat 2",
                    "Al - Hijr Ayat 3",
                    "Al - Hijr Ayat 4",
                    "Al - Hijr Ayat 5",
                    "Al - Hijr Ayat 6",
                    "Al - Hijr Ayat 7",
                    "Al - Hijr Ayat 8",
                    "Al - Hijr Ayat 9",
                    "Al - Hijr Ayat 10",
                    "Al - Hijr Ayat 11",
                    "Al - Hijr Ayat 12",
                    "Al - Hijr Ayat 13",
                    "Al - Hijr Ayat 14",
                    "Al - Hijr Ayat 15",},
            {"Al - Hijr Ayat 16",
                    "Al - Hijr Ayat 17",
                    "Al - Hijr Ayat 18",
                    "Al - Hijr Ayat 19",
                    "Al - Hijr Ayat 20",
                    "Al - Hijr Ayat 21",
                    "Al - Hijr Ayat 22",
                    "Al - Hijr Ayat 23",
                    "Al - Hijr Ayat 24",
                    "Al - Hijr Ayat 25",
                    "Al - Hijr Ayat 26",
                    "Al - Hijr Ayat 27",
                    "Al - Hijr Ayat 28",
                    "Al - Hijr Ayat 29",
                    "Al - Hijr Ayat 30",
                    "Al - Hijr Ayat 31",},
            {"Al - Hijr Ayat 32",
                    "Al - Hijr Ayat 33",
                    "Al - Hijr Ayat 34",
                    "Al - Hijr Ayat 35",
                    "Al - Hijr Ayat 36",
                    "Al - Hijr Ayat 37",
                    "Al - Hijr Ayat 38",
                    "Al - Hijr Ayat 39",
                    "Al - Hijr Ayat 40",
                    "Al - Hijr Ayat 41",
                    "Al - Hijr Ayat 42",
                    "Al - Hijr Ayat 43",
                    "Al - Hijr Ayat 44",
                    "Al - Hijr Ayat 45",
                    "Al - Hijr Ayat 46",
                    "Al - Hijr Ayat 47",
                    "Al - Hijr Ayat 48",
                    "Al - Hijr Ayat 49",
                    "Al - Hijr Ayat 50",
                    "Al - Hijr Ayat 51",},
            {"Al - Hijr Ayat 52",
                    "Al - Hijr Ayat 53",
                    "Al - Hijr Ayat 54",
                    "Al - Hijr Ayat 55",
                    "Al - Hijr Ayat 56",
                    "Al - Hijr Ayat 57",
                    "Al - Hijr Ayat 58",
                    "Al - Hijr Ayat 59",
                    "Al - Hijr Ayat 60",
                    "Al - Hijr Ayat 61",
                    "Al - Hijr Ayat 62",
                    "Al - Hijr Ayat 63",
                    "Al - Hijr Ayat 64",
                    "Al - Hijr Ayat 65",
                    "Al - Hijr Ayat 66",
                    "Al - Hijr Ayat 67",
                    "Al - Hijr Ayat 68",
                    "Al - Hijr Ayat 69",
                    "Al - Hijr Ayat 70",},
            {"Al - Hijr Ayat 71",
                    "Al - Hijr Ayat 72",
                    "Al - Hijr Ayat 73",
                    "Al - Hijr Ayat 74",
                    "Al - Hijr Ayat 75",
                    "Al - Hijr Ayat 76",
                    "Al - Hijr Ayat 77",
                    "Al - Hijr Ayat 78",
                    "Al - Hijr Ayat 79",
                    "Al - Hijr Ayat 80",
                    "Al - Hijr Ayat 81",
                    "Al - Hijr Ayat 82",
                    "Al - Hijr Ayat 83",
                    "Al - Hijr Ayat 84",
                    "Al - Hijr Ayat 85",
                    "Al - Hijr Ayat 86",
                    "Al - Hijr Ayat 87",
                    "Al - Hijr Ayat 88",
                    "Al - Hijr Ayat 89",
                    "Al - Hijr Ayat 90",},
            {"Al - Hijr Ayat 91",
                    "Al - Hijr Ayat 92",
                    "Al - Hijr Ayat 93",
                    "Al - Hijr Ayat 94",
                    "Al - Hijr Ayat 95",
                    "Al - Hijr Ayat 96",
                    "Al - Hijr Ayat 97",
                    "Al - Hijr Ayat 98",
                    "Al - Hijr Ayat 99",
                    "An - Nahl Ayat 1",
                    "An - Nahl Ayat 2",
                    "An - Nahl Ayat 3",
                    "An - Nahl Ayat 4",
                    "An - Nahl Ayat 5",
                    "An - Nahl Ayat 6",},
            {"An - Nahl Ayat 7",
                    "An - Nahl Ayat 8",
                    "An - Nahl Ayat 9",
                    "An - Nahl Ayat 10",
                    "An - Nahl Ayat 11",
                    "An - Nahl Ayat 12",
                    "An - Nahl Ayat 13",
                    "An - Nahl Ayat 14",},
            {"An - Nahl Ayat 15",
                    "An - Nahl Ayat 16",
                    "An - Nahl Ayat 17",
                    "An - Nahl Ayat 18",
                    "An - Nahl Ayat 19",
                    "An - Nahl Ayat 20",
                    "An - Nahl Ayat 21",
                    "An - Nahl Ayat 22",
                    "An - Nahl Ayat 23",
                    "An - Nahl Ayat 24",
                    "An - Nahl Ayat 25",
                    "An - Nahl Ayat 26",},
            {"An - Nahl Ayat 27",
                    "An - Nahl Ayat 28",
                    "An - Nahl Ayat 29",
                    "An - Nahl Ayat 30",
                    "An - Nahl Ayat 31",
                    "An - Nahl Ayat 32",
                    "An - Nahl Ayat 33",
                    "An - Nahl Ayat 34",},
            {"An - Nahl Ayat 35",
                    "An - Nahl Ayat 36",
                    "An - Nahl Ayat 37",
                    "An - Nahl Ayat 38",
                    "An - Nahl Ayat 39",
                    "An - Nahl Ayat 40",
                    "An - Nahl Ayat 41",
                    "An - Nahl Ayat 42",},
            {"An - Nahl Ayat 43",
                    "An - Nahl Ayat 44",
                    "An - Nahl Ayat 45",
                    "An - Nahl Ayat 46",
                    "An - Nahl Ayat 47",
                    "An - Nahl Ayat 48",
                    "An - Nahl Ayat 49",
                    "An - Nahl Ayat 50",
                    "An - Nahl Ayat 51",
                    "An - Nahl Ayat 52",
                    "An - Nahl Ayat 53",
                    "An - Nahl Ayat 54",},
            {"An - Nahl Ayat 55",
                    "An - Nahl Ayat 56",
                    "An - Nahl Ayat 57",
                    "An - Nahl Ayat 58",
                    "An - Nahl Ayat 59",
                    "An - Nahl Ayat 60",
                    "An - Nahl Ayat 61",
                    "An - Nahl Ayat 62",
                    "An - Nahl Ayat 63",
                    "An - Nahl Ayat 64",},
            {"An - Nahl Ayat 65",
                    "An - Nahl Ayat 66",
                    "An - Nahl Ayat 67",
                    "An - Nahl Ayat 68",
                    "An - Nahl Ayat 69",
                    "An - Nahl Ayat 70",
                    "An - Nahl Ayat 71",
                    "An - Nahl Ayat 72",},
            {"An - Nahl Ayat 73",
                    "An - Nahl Ayat 74",
                    "An - Nahl Ayat 75",
                    "An - Nahl Ayat 76",
                    "An - Nahl Ayat 77",
                    "An - Nahl Ayat 78",
                    "An - Nahl Ayat 79",},
            {"An - Nahl Ayat 80",
                    "An - Nahl Ayat 81",
                    "An - Nahl Ayat 82",
                    "An - Nahl Ayat 83",
                    "An - Nahl Ayat 84",
                    "An - Nahl Ayat 85",
                    "An - Nahl Ayat 86",
                    "An - Nahl Ayat 87",},
            {"An - Nahl Ayat 88",
                    "An - Nahl Ayat 89",
                    "An - Nahl Ayat 90",
                    "An - Nahl Ayat 91",
                    "An - Nahl Ayat 92",
                    "An - Nahl Ayat 93",},
            {"An - Nahl Ayat 94",
                    "An - Nahl Ayat 95",
                    "An - Nahl Ayat 96",
                    "An - Nahl Ayat 97",
                    "An - Nahl Ayat 98",
                    "An - Nahl Ayat 99",
                    "An - Nahl Ayat 100",
                    "An - Nahl Ayat 101",
                    "An - Nahl Ayat 102",},
            {"An - Nahl Ayat 103",
                    "An - Nahl Ayat 104",
                    "An - Nahl Ayat 105",
                    "An - Nahl Ayat 106",
                    "An - Nahl Ayat 107",
                    "An - Nahl Ayat 108",
                    "An - Nahl Ayat 109",
                    "An - Nahl Ayat 110",},
            {"An - Nahl Ayat 111",
                    "An - Nahl Ayat 112",
                    "An - Nahl Ayat 113",
                    "An - Nahl Ayat 114",
                    "An - Nahl Ayat 115",
                    "An - Nahl Ayat 116",
                    "An - Nahl Ayat 117",
                    "An - Nahl Ayat 118",},
            {"An - Nahl Ayat 119",
                    "An - Nahl Ayat 120",
                    "An - Nahl Ayat 121",
                    "An - Nahl Ayat 122",
                    "An - Nahl Ayat 123",
                    "An - Nahl Ayat 124",
                    "An - Nahl Ayat 125",
                    "An - Nahl Ayat 126",
                    "An - Nahl Ayat 127",
                    "An - Nahl Ayat 128",},
    };

    int ayat = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz14, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz14 = (ImageView) view.findViewById(R.id.imageViewJuz14);
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
                imgjuz14.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 14 Halaman " + (halaman+1) );
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
                imgjuz14.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 14 Halaman " + (halaman+1) );
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