package com.example.qurantajwid;

import android.media.Image;
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
 * Use the {@link TajwidFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TajwidFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TajwidFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TajwidFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TajwidFragment newInstance(String param1, String param2) {
        TajwidFragment fragment = new TajwidFragment();
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

    private int [][] imgtajwid = {
            //idgam bilagunnah
            {R.drawable.tajwidbaqarah12,
                    R.drawable.tajwidbaqarah24,
                    R.drawable.tajwidalqariah7,
                    R.drawable.tajwidaladiyat11,
                    R.drawable.tajwidbaqarah143,},
            //idgam mutaqaribain
            {R.drawable.tajwidannisa158,
                    R.drawable.tajwidalmursalat20,
                    R.drawable.tajwidhud32,
                    R.drawable.tajwidalaraf176,
                    R.drawable.tajwidannisa158,},
            //idgam mutajanisain
            {R.drawable.tajwidaliimran69,
                    R.drawable.tajwidaliimran122,
                    R.drawable.tajwidalmaidah28,
                    R.drawable.tajwidyunus89,
                    R.drawable.tajwidbaqarah25,},
            //idgam mutamasilain
            {R.drawable.tajwidbaqarah60,
                    R.drawable.tajwidbaqarah16,
                    R.drawable.tajwidalmaidah61,
                    R.drawable.tajwidannisa78,
                    R.drawable.tajwidannahl76,},
            //ikhfa
            //madd jaiz munfasil
            {R.drawable.tajwidyasin6,
                    R.drawable.tajwidalinsyiqaq16,
                    R.drawable.tajwidalkausar1,
                    R.drawable.tajwidazzukhruf72,
                    R.drawable.tajwidalqadr1,},
            //madd silah tawilah
            {R.drawable.tajwidbaqarah90,
                    R.drawable.tajwidbaqarah93,
                    R.drawable.tajwidaliimran7,
                    R.drawable.tajwidaliimran30,
                    R.drawable.tajwidaliimran36,},
            //ikhfa
            {R.drawable.tajwidbaqarah4,
                    R.drawable.tajwidyusuf9,
                    R.drawable.tajwidalkahf22,
                    R.drawable.tajwidannur62,
                    R.drawable.tajwidluqman19,},
            //ikhfa syafawi
            {R.drawable.tajwidbaqarah8,
                    R.drawable.tajwidannisa23,
                    R.drawable.tajwidalmaidah1,
                    R.drawable.tajwidalfil4,
                    R.drawable.tajwidalkahf5,},
            //iqlab
            //iqlab
            {R.drawable.tajwidallail8,
                    R.drawable.tajwidluqman28,
                    R.drawable.tajwidalmulk13,
                    R.drawable.tajwidalanfal5,
                    R.drawable.tajwidalisra17,},
            //madd wajib muttasil
            {R.drawable.tajwidattaubah37,
                    R.drawable.tajwidalmursalat43,
                    R.drawable.tajwidalquraisy2,
                    R.drawable.tajwidalbayyinah5,
                    R.drawable.tajwidbaqarah13,},
            //qalqalah
            //sugra
            {R.drawable.tajwidalkausar3,
                    R.drawable.tajwidalquraisy3,
                    R.drawable.tajwidalqariah3,
                    R.drawable.tajwidalqariah10,
                    R.drawable.tajwidalfil2,},
            //kubra
            {R.drawable.tajwidalfalaq1,
                    R.drawable.tajwidalburuj20,
                    R.drawable.tajwidalfalaq3,
                    R.drawable.tajwidqaf5,
                    R.drawable.tajwidalikhlas1,},
            //idzhar
            //idzhar
            {R.drawable.tajwidalfalaq3,
                    R.drawable.tajwidalkausar2,
                    R.drawable.tajwidalquraisy4,
                    R.drawable.tajwidalalaq2,
                    R.drawable.tajwidalalaq9,},
            //idzhar syafawi
            {R.drawable.tajwidallahab4,
                    R.drawable.tajwidalkafirun3,
                    R.drawable.tajwidalquraisy2,
                    R.drawable.tajwidalikhlas3,
                    R.drawable.tajwidalikhlas4,},
            //ghunnah
            //gunnah
            {R.drawable.tajwidbaqarah12,
                    R.drawable.tajwidyasin31,
                    R.drawable.tajwidalkausar3,
                    R.drawable.tajwidaljatsiyah31,
                    R.drawable.tajwidbaqarah114,},
            //idgam bigunnah
            {R.drawable.tajwidalmujadilah3,
                    R.drawable.tajwidalmunafiqun10,
                    R.drawable.tajwidalhasyr14,
                    R.drawable.tajwidalmujadilah7,
                    R.drawable.tajwidalhasyr4,},
            //idgam mimi
            {R.drawable.tajwidalmuthaffifin4,
                    R.drawable.tajwidalburuj20,
                    R.drawable.tajwidalhumazah8,
                    R.drawable.tajwidbaqarah10,
                    R.drawable.tajwidaliimran91,},
            //idgam mutamasilain
            {R.drawable.tajwidbaqarah16,
                    R.drawable.tajwidalmaidah61,
                    R.drawable.tajwidannisa78,
                    R.drawable.tajwidannahl76,
                    R.drawable.tajwidalmaidah93,},
            //idgam mutajanisain
            {R.drawable.tajwidaliimran69,
                    R.drawable.tajwidaliimran122,
                    R.drawable.tajwidalmaidah28,
                    R.drawable.tajwidyunus89,
                    R.drawable.tajwidbaqarah25,},
            //madd faiq
            {R.drawable.tajwidyunus59,
                    R.drawable.tajwidannaml59,
                    R.drawable.tajwidalanam143,
                    R.drawable.tajwidalanam144,},
            //madd lazim mukhafaf kilmi
            {R.drawable.tajwidyunus51,
                    R.drawable.tajwidyunus91,},
            //madd lazim musaqal kilmi
            {R.drawable.tajwidbaqarah139,
                    R.drawable.tajwidalanam143,
                    R.drawable.tajwidannaziat34,
                    R.drawable.tajwidfatihah7,
                    R.drawable.tajwidazzumar64,},
            //madd lazim harfi musyabba
            {R.drawable.tajwidyasin1,
                    R.drawable.tajwidalaraf1,
                    R.drawable.tajwidasyuara1,
                    R.drawable.tajwidalqasas1,
                    R.drawable.tajwidaliimran1,},
    };
    private int [][] audiotajwid = {
            //idgam bilagunnah
            {R.raw.baqarah12,
                    R.raw.baqarah24,
                    R.raw.alqariah07,
                    R.raw.aladiyat11,
                    R.raw.baqarah143,},
            //idgam mutaqaribain
            {R.raw.annisa158,
                    R.raw.almursalat20,
                    R.raw.hud32,
                    R.raw.alaraf176,
                    R.raw.annisa158,},
            //idgam mutajanisain
            {R.raw.imran69,
                    R.raw.imran122,
                    R.raw.almaidah28,
                    R.raw.yunus89,
                    R.raw.baqarah25,},
            //idgam mutamasilain
            {R.raw.baqarah60,
                    R.raw.baqarah16,
                    R.raw.almaidah61,
                    R.raw.annisa78,
                    R.raw.annahl76,},
            //ikhfa
            //madd jaiz munfasil
            {R.raw.yasin06,
                    R.raw.alinsyiqaq16,
                    R.raw.alkausar1,
                    R.raw.azzukhruf72,
                    R.raw.alqadr01,},
            //madd silah tawilah
            {R.raw.baqarah90,
                    R.raw.baqarah93,
                    R.raw.imran7,
                    R.raw.imran30,
                    R.raw.imran36,},
            //ikhfa
            {R.raw.baqarah4,
                    R.raw.yusuf9,
                    R.raw.alkahf22,
                    R.raw.annur62,
                    R.raw.luqman19,},
            //ikhfa syafawi
            {R.raw.baqarah8,
                    R.raw.annisa23,
                    R.raw.almaidah1,
                    R.raw.alfil4,
                    R.raw.alkahf5,},
            //iqlab
            //iqlab
            {R.raw.allail08,
                    R.raw.luqman28,
                    R.raw.almulk13,
                    R.raw.alanfal5,
                    R.raw.alisra17,},
            //madd wajib muttasil
            {R.raw.attaubah37,
                    R.raw.almursalat43,
                    R.raw.alquraisy2,
                    R.raw.albayyinah05,
                    R.raw.baqarah13,},
            //qalqalah
            //sugra
            {R.raw.alkausar3,
                    R.raw.alquraisy3,
                    R.raw.alqariah03,
                    R.raw.alqariah10,
                    R.raw.alfil2,},
            //kubra
            {R.raw.alfalaq01,
                    R.raw.alburuj20,
                    R.raw.alfalaq03,
                    R.raw.qaf05,
                    R.raw.alikhlas01,},
            //idzhar
            //idzhar
            {R.raw.alfalaq03,
                    R.raw.alkausar2,
                    R.raw.alquraisy4,
                    R.raw.alalaq02,
                    R.raw.alalaq09,},
            //idzhar syafawi
            {R.raw.allahab4,
                    R.raw.alkafirun03,
                    R.raw.alquraisy2,
                    R.raw.alikhlas03,
                    R.raw.alikhlas04,},
            //ghunnah
            //gunnah
            {R.raw.baqarah12,
                    R.raw.yasin31,
                    R.raw.alkausar3,
                    R.raw.aljatsiyah31,
                    R.raw.baqarah114,},
            //idgam bigunnah
            {R.raw.almujadilah03,
                    R.raw.almunafiqun10,
                    R.raw.alhasyr14,
                    R.raw.almujadilah07,
                    R.raw.alhasyr04,},
            //idgam mimi
            {R.raw.almuthaffifin04,
                    R.raw.alburuj20,
                    R.raw.alhumazah08,
                    R.raw.baqarah10,
                    R.raw.imran91,},
            //idgam mutamasilain
            {R.raw.baqarah16,
                    R.raw.almaidah61,
                    R.raw.annisa78,
                    R.raw.annahl76,
                    R.raw.almaidah93,},
            //idgam mutajanisain
            {R.raw.imran69,
                    R.raw.imran122,
                    R.raw.almaidah28,
                    R.raw.yunus89,
                    R.raw.baqarah25,},
            //madd faiq
            {R.raw.yunus59,
                    R.raw.annaml59,
                    R.raw.alanam143,
                    R.raw.alanam144,},
            //madd lazim mukhafaf kilmi
            {R.raw.yunus51,
                    R.raw.yunus91,},
            //madd lazim musaqal kilmi
            {R.raw.baqarah139,
                    R.raw.alanam143,
                    R.raw.annaziat34,
                    R.raw.fatihah7,
                    R.raw.azzumar64,},
            //madd lazim harfi musyabba
            {R.raw.yasin01,
                    R.raw.alaraf1,
                    R.raw.asyuara1,
                    R.raw.alqasas1,
                    R.raw.imran1,},
    };
    private String [][] exnametajwid = {
            //idgam bilagunnah
            {"Al - Baqarah Ayat 12",
                    "Al - Baqarah Ayat 24",
                    "Al - Qariah Ayat 7",
                    "Al - 'Adiyat Ayat 11",
                    "Al - Baqarah Ayat 143",},
            //idgam mutaqaribain
            {"An - Nisa Ayat 158",
                    "Al - Mursalat Ayat 20",
                    "Hud Ayat 32",
                    "Al - Araf Ayat 176",
                    "An - Nisa Ayat 158",},
            //idgam mutajanisain
            {"Al - Imran Ayat 69",
                    "Al - Imran1 Ayat 22",
                    "Al - Maidah Ayat 28",
                    "Yunus Ayat 89",
                    "Al - Baqarah Ayat 25",},
            //idgam mutamasilain
            {"Al - Baqarah Ayat 60",
                    "Al - Baqarah Ayat 16",
                    "Al - Maidah Ayat 61",
                    "An - Nisa Ayat 78",
                    "An - Nahl Ayat 76",},
            //ikhfa
            //madd jaiz munfasil
            {"Yasin Ayat 6",
                    "Al - Insyiqaq Ayat 16",
                    "Al - Kautsar Ayat 1",
                    "Az - Zukhruf Ayat 72",
                    "Al - Qadr Ayat 1",},
            //madd silah tawilah
            {"Al - Baqarah Ayat 90",
                    "Al - Baqarah Ayat 93",
                    "Al - Imran Ayat 7",
                    "Al - Imran Ayat 30",
                    "Al - Imran Ayat 36",},
            //ikhfa
            {"Al - Baqarah Ayat 4",
                    "Yusuf Ayat 9",
                    "Al - Kahf Ayat 22",
                    "An - Nur Ayat 62",
                    "Luqman Ayat 19",},
            //ikhfa syafawi
            {"Al - Baqarah Ayat 8",
                    "An - Nisa Ayat 23",
                    "Al - Maidah Ayat 1",
                    "Al - Fil Ayat 4",
                    "Al - Kahf Ayat 5",},
            //iqlab
            //iqlab
            {"Al - Lail Ayat 8",
                    "Luqman Ayat 28",
                    "Al - Mulk Ayat 13",
                    "Al - Anfa Ayat l5",
                    "Al - Isra' Ayat 17",},
            //madd wajib muttasil
            {"At - Taubah Ayat 37",
                    "Al - Mursalat Ayat 43",
                    "Al - Quraisy Ayat 2",
                    "Al - Bayyinah Ayat 5",
                    "Al - Baqarah Ayat 13",},
            //qalqalah
            //sugra
            {"Al - Kautsar Ayat 3",
                    "Al - Quraisy Ayat 3",
                    "Al - Qariah Ayat 3",
                    "Al - Qariah Ayat 10",
                    "Al - Fil Ayat 2",},
            //kubra
            {"Al - Falaq Ayat 1",
                    "Al - Buruj Ayat 20",
                    "Al - Falaq Ayat 3",
                    "Qaf Ayat 5",
                    "Al - Ikhlas Ayat 1",},
            //idzhar
            //idzhar
            {"Al - Falaq Ayat 3",
                    "Al - Kautsar Ayat 2",
                    "Al - Quraisy Ayat 4",
                    "Al - Alaq Ayat 2",
                    "Al - Alaq Ayat 9",},
            //idzhar syafawi
            {"Al - Lahab Ayat 4",
                    "Al - Kafirun Ayat 3",
                    "Al - Quraisy Ayat 2",
                    "Al - Ikhlas Ayat 3",
                    "Al - Ikhlas Ayat 4",},
            //ghunnah
            //gunnah
            {"Al - Baqarah Ayat 12",
                    "Yasin Ayat 31",
                    "Al - Kautsar Ayat 3",
                    "Al - Jatsiyah Ayat 31",
                    "Al - Baqarah1 Ayat 14",},
            //idgam bigunnah
            {"Al - Mujadilah Ayat 3",
                    "Al - Munafiqun Ayat 10",
                    "Al - Hasyr Ayat 14",
                    "Al - Mujadilah Ayat 7",
                    "Al - Hasyr Ayat 4",},
            //idgam mAl - Imi
            {"Al - Muthaffifin Ayat 4",
                    "Al - Buruj Ayat 20",
                    "Al - Humazah Ayat 8",
                    "Al - Baqarah Ayat 10",
                    "Al - Imran Ayat 91",},
            //idgam mutamasilain
            {"Al - Baqarah Ayat 16",
                    "Al - Maidah Ayat 61",
                    "An - Nisa Ayat 78",
                    "An - Nahl Ayat 76",
                    "Al - Maidah Ayat 93",},
            //idgam mutajanisain
            {"Al - Imran Ayat 69",
                    "Al - Imran Ayat 122",
                    "Al - Maidah Ayat 28",
                    "Yunus Ayat 89",
                    "Al - Baqarah Ayat 25",},
            //madd faiq
            {"Yunus Ayat 59",
                    "An - Naml Ayat 59",
                    "Al = An'am Ayat 143",
                    "Al - An'am Ayat 144",},
            //madd lazim mukhafaf kilmi
            {"Yunus Ayat 51",
                    "Yunus Ayat 91",},
            //madd lazim musaqal kilmi
            {"Al - Baqarah Ayat 139",
                    "Al - An'am Ayat 143",
                    "An - Naziat Ayat 34",
                    "Al - Fatihah Ayat 7",
                    "Az - Zumar Ayat 64",},
            //madd lazim harfi musyabba
            {"Yasin Ayat 1",
                    "Al - A'raf Ayat 1",
                    "Asy - Syu'ara Ayat 1",
                    "Al - Qasas Ayat 1",
                    "Al - Imran Ayat 1",},
    };
    int tajwid=0;
    int contoh=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tajwid, container, false);;
        MainActivity ma = (MainActivity)getActivity();
        Button btnTajwid1 = (Button)view.findViewById(R.id.btnTajwid1);
        Button btnTajwid2 = (Button)view.findViewById(R.id.btnTajwid2);
        Button btnTajwid3 = (Button)view.findViewById(R.id.btnTajwid3);
        Button btnTajwid4 = (Button)view.findViewById(R.id.btnTajwid4);
        Button btnTajwid5 = (Button)view.findViewById(R.id.btnTajwid5);
        Button btnTajwid6 = (Button)view.findViewById(R.id.btnTajwid6);

        TextView desc = (TextView)view.findViewById(R.id.txtDesc);
        desc.setVisibility(View.GONE);

        Button btnIdzhar1 = (Button)view.findViewById(R.id.btnIdzhar1);
        Button btnIdzhar2 = (Button)view.findViewById(R.id.btnIdzhar2);
        btnIdzhar1.setVisibility(View.GONE);
        btnIdzhar2.setVisibility(View.GONE);

        Button btnIdgam1 = (Button)view.findViewById(R.id.btnIdgam1);
        Button btnIdgam2 = (Button)view.findViewById(R.id.btnIdgam2);
        Button btnIdgam3 = (Button)view.findViewById(R.id.btnIdgam3);
        Button btnIdgam4 = (Button)view.findViewById(R.id.btnIdgam4);
        btnIdgam1.setVisibility(View.GONE);
        btnIdgam2.setVisibility(View.GONE);
        btnIdgam3.setVisibility(View.GONE);
        btnIdgam4.setVisibility(View.GONE);

        Button btnIkhfa1 = (Button)view.findViewById(R.id.btnIkhfa1);
        Button btnIkhfa2 = (Button)view.findViewById(R.id.btnIkhfa2);
        Button btnIkhfa3 = (Button)view.findViewById(R.id.btnIkhfa3);
        Button btnIkhfa4 = (Button)view.findViewById(R.id.btnIkhfa4);
        btnIkhfa1.setVisibility(View.GONE);
        btnIkhfa2.setVisibility(View.GONE);
        btnIkhfa3.setVisibility(View.GONE);
        btnIkhfa4.setVisibility(View.GONE);

        Button btnIqlab1 = (Button)view.findViewById(R.id.btnIqlab1);
        Button btnIqlab2 = (Button)view.findViewById(R.id.btnIqlab2);
        btnIqlab1.setVisibility(View.GONE);
        btnIqlab2.setVisibility(View.GONE);

        Button btnQalqalah1 = (Button)view.findViewById(R.id.btnQalqalah1);
        Button btnQalqalah2 = (Button)view.findViewById(R.id.btnQalqalah2);
        btnQalqalah1.setVisibility(View.GONE);
        btnQalqalah2.setVisibility(View.GONE);

        Button btnGunnah1 = (Button)view.findViewById(R.id.btnGunnah1);
        Button btnGunnah2 = (Button)view.findViewById(R.id.btnGunnah2);
        Button btnGunnah3 = (Button)view.findViewById(R.id.btnGunnah3);
        Button btnGunnah4 = (Button)view.findViewById(R.id.btnGunnah4);
        Button btnGunnah5 = (Button)view.findViewById(R.id.btnGunnah5);
        Button btnGunnah6 = (Button)view.findViewById(R.id.btnGunnah6);
        Button btnGunnah7 = (Button)view.findViewById(R.id.btnGunnah7);
        Button btnGunnah8 = (Button)view.findViewById(R.id.btnGunnah8);
        Button btnGunnah9 = (Button)view.findViewById(R.id.btnGunnah9);
        btnGunnah1.setVisibility(View.GONE);
        btnGunnah2.setVisibility(View.GONE);
        btnGunnah3.setVisibility(View.GONE);
        btnGunnah4.setVisibility(View.GONE);
        btnGunnah5.setVisibility(View.GONE);
        btnGunnah6.setVisibility(View.GONE);
        btnGunnah7.setVisibility(View.GONE);
        btnGunnah8.setVisibility(View.GONE);
        btnGunnah9.setVisibility(View.GONE);

        ImageButton play = (ImageButton)view.findViewById(R.id.play);
        ImageButton pause = (ImageButton)view.findViewById(R.id.pause);
        ImageButton stop = (ImageButton)view.findViewById(R.id.stop);
        ImageButton sr = (ImageButton)view.findViewById(R.id.seekright);
        ImageButton sl = (ImageButton)view.findViewById(R.id.seekleft);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView tajwidImage = (ImageView) view.findViewById(R.id.tajwidImage);
        textView.setVisibility(View.GONE);
        play.setVisibility(View.GONE);
        pause.setVisibility(View.GONE);
        stop.setVisibility(View.GONE);
        sr.setVisibility(View.GONE);
        sl.setVisibility(View.GONE);
        tajwidImage.setVisibility(View.GONE);

        ImageButton back1 = (ImageButton)view.findViewById(R.id.back1);
        ImageButton back2 = (ImageButton)view.findViewById(R.id.back2);
        ImageButton back3 = (ImageButton)view.findViewById(R.id.back3);

        back2.setVisibility(View.GONE);
        back3.setVisibility(View.GONE);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, MenuFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("enu");
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.VISIBLE);
                btnTajwid2.setVisibility(View.VISIBLE);
                btnTajwid3.setVisibility(View.VISIBLE);
                btnTajwid4.setVisibility(View.VISIBLE);
                btnTajwid5.setVisibility(View.VISIBLE);
                btnTajwid6.setVisibility(View.VISIBLE);
                ma.setHeadline("Tajwid");
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                btnQalqalah1.setVisibility(View.GONE);
                btnQalqalah2.setVisibility(View.GONE);
                btnIqlab1.setVisibility(View.GONE);
                btnIqlab2.setVisibility(View.GONE);
                btnIkhfa1.setVisibility(View.GONE);
                btnIkhfa2.setVisibility(View.GONE);
                btnIkhfa3.setVisibility(View.GONE);
                btnIkhfa4.setVisibility(View.GONE);
                btnIdgam1.setVisibility(View.GONE);
                btnIdgam2.setVisibility(View.GONE);
                btnIdgam3.setVisibility(View.GONE);
                btnIdgam4.setVisibility(View.GONE);
                btnIdzhar1.setVisibility(View.GONE);
                btnIdzhar2.setVisibility(View.GONE);
                back2.setVisibility(View.GONE);
                back1.setVisibility(View.VISIBLE);
            }
        });



        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.VISIBLE);
                btnTajwid2.setVisibility(View.VISIBLE);
                btnTajwid3.setVisibility(View.VISIBLE);
                btnTajwid4.setVisibility(View.VISIBLE);
                btnTajwid5.setVisibility(View.VISIBLE);
                btnTajwid6.setVisibility(View.VISIBLE);
                desc.setVisibility(View.GONE);
                play.setVisibility(View.GONE);
                pause.setVisibility(View.GONE);
                stop.setVisibility(View.GONE);
                sr.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                tajwidImage.setVisibility(View.GONE);
                ma.setHeadline("Tajwid");
                back3.setVisibility(View.GONE);
                back1.setVisibility(View.VISIBLE);
            }
        });

        int x = audiotajwid[tajwid].length;
        if(contoh == 0){
            sl.setVisibility(View.GONE);
        }
        if(contoh == x-1){
            sr.setVisibility(View.GONE);
        }
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contoh--;
                int x = audiotajwid[tajwid].length;
                if(contoh == 0){
                    sl.setVisibility(View.GONE);
                }else{
                    sl.setVisibility(View.VISIBLE);
                }
                if(contoh == x-1){
                    sr.setVisibility(View.GONE);
                }else{
                    sr.setVisibility(View.VISIBLE);
                }
                textView.setText(exnametajwid[tajwid][contoh]);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
            }
        });

        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = audiotajwid[tajwid].length;
                contoh++;
                if(contoh == 0){
                    sl.setVisibility(View.GONE);
                }else{
                    sl.setVisibility(View.VISIBLE);
                }
                if(contoh == x-1){
                    sr.setVisibility(View.GONE);
                }else{
                    sr.setVisibility(View.VISIBLE);
                }
                textView.setText(exnametajwid[tajwid][contoh]);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma.play(audiotajwid[tajwid][contoh]);
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

        btnTajwid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnIdgam1.setVisibility(View.VISIBLE);
                btnIdgam2.setVisibility(View.VISIBLE);
                btnIdgam3.setVisibility(View.VISIBLE);
                btnIdgam4.setVisibility(View.VISIBLE);
                ma.setHeadline("Idgam");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });

        btnTajwid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnIkhfa1.setVisibility(View.VISIBLE);
                btnIkhfa2.setVisibility(View.VISIBLE);
                btnIkhfa3.setVisibility(View.VISIBLE);
                btnIkhfa4.setVisibility(View.VISIBLE);
                ma.setHeadline("Ikhfa'");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });
        btnTajwid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnIqlab1.setVisibility(View.VISIBLE);
                btnIqlab2.setVisibility(View.VISIBLE);
                ma.setHeadline("Iqlab");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });
        btnTajwid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnQalqalah1.setVisibility(View.VISIBLE);
                btnQalqalah2.setVisibility(View.VISIBLE);
                ma.setHeadline("Qalqalah");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });
        btnTajwid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnGunnah1.setVisibility(View.VISIBLE);
                btnGunnah2.setVisibility(View.VISIBLE);
                btnGunnah3.setVisibility(View.VISIBLE);
                btnGunnah4.setVisibility(View.VISIBLE);
                btnGunnah5.setVisibility(View.VISIBLE);
                btnGunnah6.setVisibility(View.VISIBLE);
                btnGunnah7.setVisibility(View.VISIBLE);
                btnGunnah8.setVisibility(View.VISIBLE);
                btnGunnah9.setVisibility(View.VISIBLE);
                ma.setHeadline("Ghunnah");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });

        btnTajwid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                btnTajwid6.setVisibility(View.GONE);
                btnIdzhar1.setVisibility(View.VISIBLE);
                btnIdzhar2.setVisibility(View.VISIBLE);
                ma.setHeadline("Idzhar");
                back1.setVisibility(View.GONE);
                back2.setVisibility(View.VISIBLE);
            }
        });
        btnIdzhar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdzhar1.setVisibility(View.GONE);
                btnIdzhar2.setVisibility(View.GONE);
                ma.setHeadline("Idzhar");
                desc.setText("Idzhar merupakan pembacaan huruf nun mati dan tanwin secara jelas dan tenang " +
                        "(tanpa mendengung) apabila bertemu dengan huruf - huruf idzhar. Enam huruf Idzhar" +
                        "yakni: ءح خ ع غ ه  . Contoh pembacaan Idzhar adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 12;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIdzhar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdzhar1.setVisibility(View.GONE);
                btnIdzhar2.setVisibility(View.GONE);
                ma.setHeadline("Idzhar Syafawi");
                desc.setText("Idzhar Syafawi merupakan pertemuan antara huruf mim mati (sukun) dengan huruf - huruf hijaiyah" +
                        "kecuali mim dan ba ( ب م ) . Contoh pembacaan Idzhar Syafawi adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 13;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIdgam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdgam1.setVisibility(View.GONE);
                btnIdgam2.setVisibility(View.GONE);
                btnIdgam3.setVisibility(View.GONE);
                btnIdgam4.setVisibility(View.GONE);
                ma.setHeadline("Idgam Bilagunnah");
                desc.setText("Idgam Bilagunnah adalah bacaan yang meleburkan/memasukkan nun mati dan tanwin (Idgam)" +
                        "tanpa disertai dengan dengung jika bertemu huruf Idgam Bilagunnah. Huruf - huruf tersebut yakni" +
                        "ل ر " +
                        "Contoh pembacaan Idgam Bilagunnah adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 0;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIdgam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdgam1.setVisibility(View.GONE);
                btnIdgam2.setVisibility(View.GONE);
                btnIdgam3.setVisibility(View.GONE);
                btnIdgam4.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mutaqaribain");
                desc.setText("Idgam Mutaqaribain adalah bacaan dimana bertemunya dua huruf yang hampir sama makhrajnya (tempat keluarnya suara)" +
                        "namun berbeda sifatnya. Pertemuan kedua huruf tersebut seperti" +
                        "ل bertemu ر , ك bertemu ق" +
                        " . Cara pembacaan Idgam Mutaqaribain adalah dengan mengabaikan huruf pertama dan membaca huruf kedua" +
                        "secara tasydid. Contoh pembacaan Idgam Mutaqaribain adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 1;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIdgam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdgam1.setVisibility(View.GONE);
                btnIdgam2.setVisibility(View.GONE);
                btnIdgam3.setVisibility(View.GONE);
                btnIdgam4.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mutajanisain");
                desc.setText("Idgam Mutajanisain adalah pertemuan antara dua huruf yang berbeda, namun memiliki makhraj (tempat keluarnya suara) yang sama." +
                        "Pertemuan kedua huruf tersebut seperti " +
                        "م bertemu ب , ظ bertemu ذ atau ث , ط bertemu د atau ت " +
                        ". Cara pembacaan Idgam Mutajanisain adalah dengan mengabaikan huruf pertama dan membaca huruf kedua" +
                        "secara tasydid. Contoh pembacaan Idgam Mutajanisain adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 2;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIdgam4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIdgam1.setVisibility(View.GONE);
                btnIdgam2.setVisibility(View.GONE);
                btnIdgam3.setVisibility(View.GONE);
                btnIdgam4.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mutamasilain");
                desc.setText("Idgam Mutamasilain adalah pertemuan antara dua huruf mati/sukun dengan huruf yang sama berharakat. " +
                        "Pertemuan kedua huruf tersebut dibaca jelas tidak mendengung, kecuali " +
                        "م dan ن " +
                        "yang dibaca dengung serta " +
                        "ا و ي " +
                        "yang dibaca panjang. Contoh pembacaan Idgam Mutamasilain adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 3;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIkhfa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIkhfa1.setVisibility(View.GONE);
                btnIkhfa2.setVisibility(View.GONE);
                btnIkhfa3.setVisibility(View.GONE);
                btnIkhfa4.setVisibility(View.GONE);
                ma.setHeadline("Madd Jaiz Munfasil");
                desc.setText("Madd Jaiz Munfasil adalah pembacaan mad selama 4 atau 5 harakat. " +
                        "Madd Jaiz Munfasil terjadi ketika mad asli atau mad thabi'i bertemu dengan hamzah" +
                        " ء " +
                        "dalam dua kata. Contoh pembacaan Madd Jaiz Munfasil adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 4;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIkhfa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIkhfa1.setVisibility(View.GONE);
                btnIkhfa2.setVisibility(View.GONE);
                btnIkhfa3.setVisibility(View.GONE);
                btnIkhfa4.setVisibility(View.GONE);
                ma.setHeadline("Madd Silah Tawilah");
                desc.setText("Madd Silah Tawilah adalah pembacaan mad selama 4 atau 5 harakat. " +
                        "Madd Silah Tawilah terjadi ketika 'Ha Dhamir' atau kata ganti bertemu dengan huruf hamzah" +
                        " ء " +
                        ". Contoh pembacaan Madd Silah Tawilah adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 5;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIkhfa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIkhfa1.setVisibility(View.GONE);
                btnIkhfa2.setVisibility(View.GONE);
                btnIkhfa3.setVisibility(View.GONE);
                btnIkhfa4.setVisibility(View.GONE);
                ma.setHeadline("Ikhfa'");
                desc.setText("Ikhfa' adalah pembacaan samar dan mendengung selama dua harakat ketika nun sukun/tanwin bertemu huruf ikhfa'." +
                        "Huruf - huruf ikhfa adalah " +
                        "ت ث ج د ذ ز س ش ص ض ط ظ ف ق ك " +
                        ". Contoh pembacaan Ikhfa' adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 6;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIkhfa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIkhfa1.setVisibility(View.GONE);
                btnIkhfa2.setVisibility(View.GONE);
                btnIkhfa3.setVisibility(View.GONE);
                btnIkhfa4.setVisibility(View.GONE);
                ma.setHeadline("Ikhfa' Syafawi");
                desc.setText("Ikhfa' Syafawi adalah pembacaan dengung selama dua harakat. Ikhfa' syafawi terjadi ketika mim mati bertemu ba" +
                        " م ب " +
                        ". Contoh pembacaan Ikhfa' syafawi adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 7;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIqlab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIqlab1.setVisibility(View.GONE);
                btnIqlab2.setVisibility(View.GONE);
                ma.setHeadline("Mad Wajib Muttasil");
                desc.setText("Madd Wajib Muttasil adalah pembacaan mad selama 6 harakat. Madd Wajib Muttasil terjadi ketika mad asli atau mad thabi'i bertemu dengan" +
                        "huruf hamzah ء dalam satu kata" +
                        ". Contoh pembacaan Madd Wajib Muttasil adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 8;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnIqlab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIqlab1.setVisibility(View.GONE);
                btnIqlab2.setVisibility(View.GONE);
                ma.setHeadline("Iqlab");
                desc.setText("Iqlab adalah pembacaan nun mati atau tanwin menjadi mim mati selama dua harakat. Iqlab terjadi ketika nun mati atau tanwin bertemu ba " +
                        " ب ." +
                        "Penanda Iqlab adalah tulisan mim pada huruf ba. Contoh pembacaan Iqlab adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 9;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnQalqalah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnQalqalah1.setVisibility(View.GONE);
                btnQalqalah2.setVisibility(View.GONE);
                ma.setHeadline("Qalqalah Sughra");
                desc.setText("Qalqalah Sughra adalah pembacaan huruf Qalqalah yang dibaca memantul dan tidak berhenti dikarenakan huruf tersebut mati atau sukun. Huruf Qalqalah adalah " +
                        "ب ج د ط ق " +
                        ". Contoh pembacaan Qalqalah Sughra adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 10;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnQalqalah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnQalqalah1.setVisibility(View.GONE);
                btnQalqalah2.setVisibility(View.GONE);
                ma.setHeadline("Qalqalah Kubra");
                desc.setText("Qalqalah Kubra adalah pembacaan huruf Qalqalah yang dibaca memantul dan berhenti dikarenakan waqof atau berhenti di akhir ayat. Huruf Qalqalah adalah " +
                        "ب ج د ط ق " +
                        ". Contoh pembacaan Qalqalah Kubra adalah sebagai berikut:");
                desc.setVisibility(View.VISIBLE);
                tajwid = 11;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Gunnah");
                desc.setText("Gunnah asliyah adalah pembacaan dengung nun atau mim bertasydid selama dua harakat " +
                        "ن م " +
                        ". Panjang dengung diperbanjang menjadi 2, 4 atau 6 jikalau diwaqofkan. Contoh pembacaan Gunnah adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 14;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Idgam Bigunnah");
                desc.setText("Idgam Bigunnah adalah meleburkan bacaan nun sukun atau tanwin yang dibaca dengung. " +
                        "Hal ini terjadi ketika nun sukun atau tanwin bertemu huruf Idgam Bigunnah, yakni " +
                        "ي ن م و " +
                        ". Contoh pembacaan Idgam Bigunnah adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 15;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mimi");
                desc.setText("Idgam Mimi/Mislain/Syafawi adalah pembacaan mim rangkap/ditasydidkan selama dua harakat م. Idgam Mimi" +
                        "terjadi ketika mim sukun bertemu dengan huruf mim. Contoh pembacaan Idgam Mimi adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 16;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mutamasilain (Gunnah)");
                desc.setText("Idgam Mutamasilain adalah pembacaan dengung ketika huruf sukun/mati bertemu huruf yang sama berharakat." +
                        "Idgam Mutamasilain terjadi ketika nun sukun bertemu nun berharakat dan mim sukun bertemu mim berharakat " +
                        "ن bertemu ن , م bertemu م " +
                        ". Contoh pembacaan Idgam Mutamasilain adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 17;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Idgam Mutajanisain (Gunnah)");
                desc.setText("Idgam Mutajanisain adalah pertemuan huruf ba dan mim " +
                        " ب م " +
                        "yang dibaca mendengung. Contoh pembacaan Idgam Mutajanisain adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 18;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Madd Farq");
                desc.setText("Madd Farq ialah madd yang terhasil ketika madd badal bertemu dengan huruf bertasydid. Madd Farq digunakan" +
                        " untuk membedakan hamzah Madd Farq dan hamzah bertanya 'apakah?' ء" +
                        " . Cara membacanaya yakni Madd dibaca selama 6 harakat. Contoh pembacaan Madd Farq adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 19;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Madd Lazim Mukhafaf Kilmi");
                desc.setText("Madd Lazim Mukhafaf Kilmi adalah mad yang dibaca 6 harakat ketika huruf madd bertemu dengan huruf yang berbaris sukun satu kata." +
                        "Contoh pembacaan Madd Lazim Mukhafaf Kilmi adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 20;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Madd Lazim Musaqal Kilmi");
                desc.setText("Madd Lazim Musaqal Kilmi adalah mad yang dibaca 6 harakat ketika madd asli atau madd thabi'i bertemu dengan huruf bertasydid satu kata. " +
                        "Contoh pembacaan Madd Lazim Musaqal Kilmi adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 21;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        btnGunnah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGunnah1.setVisibility(View.GONE);
                btnGunnah2.setVisibility(View.GONE);
                btnGunnah3.setVisibility(View.GONE);
                btnGunnah4.setVisibility(View.GONE);
                btnGunnah5.setVisibility(View.GONE);
                btnGunnah6.setVisibility(View.GONE);
                btnGunnah7.setVisibility(View.GONE);
                btnGunnah8.setVisibility(View.GONE);
                btnGunnah9.setVisibility(View.GONE);
                ma.setHeadline("Madd Lazim Harfi Musyabba");
                desc.setText("Madd Lazim Harfi Musyabba atau madd lazim harfi musaqal adalah pembacaan panjang mad selama 6 harakat ketika huruf fawatihus suwar (pembuka surat)." +
                        "Huruf fawatihus suwar ada 14, dan apabila dipecah terdiri atas tiga huruf, dimana ditengahnya adalah huruf madd dan huruf ketiganya diidgamkan." +
                        "Contoh pembacaan Madd Lazim Harfi Musyabba adalah sebagai berikut:" );
                desc.setVisibility(View.VISIBLE);
                tajwid = 22;
                contoh = 0;
                play.setVisibility(View.VISIBLE);
                pause.setVisibility(View.VISIBLE);
                stop.setVisibility(View.VISIBLE);
                sr.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                tajwidImage.setVisibility(View.VISIBLE);
                tajwidImage.setImageResource(imgtajwid[tajwid][contoh]);
                back2.setVisibility(View.GONE);
                back3.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }
}