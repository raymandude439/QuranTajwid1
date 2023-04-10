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
 * Use the {@link Juz2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz2Fragment newInstance(String param1, String param2) {
        Juz2Fragment fragment = new Juz2Fragment();
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
            R.drawable.albaqarah21,
            R.drawable.albaqarah22,
            R.drawable.albaqarah23,
            R.drawable.albaqarah24,
            R.drawable.albaqarah25,
            R.drawable.albaqarah26,
            R.drawable.albaqarah27,
            R.drawable.albaqarah28,
            R.drawable.albaqarah29,
            R.drawable.albaqarah30,
            R.drawable.albaqarah31,
            R.drawable.albaqarah32,
            R.drawable.albaqarah33,
            R.drawable.albaqarah34,
            R.drawable.albaqarah35,
            R.drawable.albaqarah36,
            R.drawable.albaqarah37,
            R.drawable.albaqarah38,
            R.drawable.albaqarah39,
            R.drawable.albaqarah40};

    private int [][] mp3ayat = {
            {R.raw.baqarah142,
                    R.raw.baqarah143,
                    R.raw.baqarah144,
                    R.raw.baqarah145,},
            {R.raw.baqarah146,
                    R.raw.baqarah147,
                    R.raw.baqarah148,
                    R.raw.baqarah149,
                    R.raw.baqarah150,
                    R.raw.baqarah151,
                    R.raw.baqarah152,
                    R.raw.baqarah153,},
            {R.raw.baqarah154,
                    R.raw.baqarah155,
                    R.raw.baqarah156,
                    R.raw.baqarah157,
                    R.raw.baqarah158,
                    R.raw.baqarah159,
                    R.raw.baqarah160,
                    R.raw.baqarah161,
                    R.raw.baqarah162,
                    R.raw.baqarah163,},
            {R.raw.baqarah164,
                    R.raw.baqarah165,
                    R.raw.baqarah166,
                    R.raw.baqarah167,
                    R.raw.baqarah168,
                    R.raw.baqarah169,},
            {R.raw.baqarah170,
                    R.raw.baqarah171,
                    R.raw.baqarah172,
                    R.raw.baqarah173,
                    R.raw.baqarah174,
                    R.raw.baqarah175,
                    R.raw.baqarah176,},
            {R.raw.baqarah177,
                    R.raw.baqarah178,
                    R.raw.baqarah179,
                    R.raw.baqarah180,
                    R.raw.baqarah181,},
            {R.raw.baqarah182,
                    R.raw.baqarah183,
                    R.raw.baqarah184,
                    R.raw.baqarah185,
                    R.raw.baqarah186,},
            {R.raw.baqarah187,
                    R.raw.baqarah188,
                    R.raw.baqarah189,
                    R.raw.baqarah190,},
            {R.raw.baqarah191,
                    R.raw.baqarah192,
                    R.raw.baqarah193,
                    R.raw.baqarah194,
                    R.raw.baqarah195,
                    R.raw.baqarah196,},
            {R.raw.baqarah197,
                    R.raw.baqarah198,
                    R.raw.baqarah199,
                    R.raw.baqarah200,
                    R.raw.baqarah201,
                    R.raw.baqarah202,},
            {R.raw.baqarah203,
                    R.raw.baqarah204,
                    R.raw.baqarah205,
                    R.raw.baqarah206,
                    R.raw.baqarah207,
                    R.raw.baqarah208,
                    R.raw.baqarah209,
                    R.raw.baqarah210,},
            {R.raw.baqarah211,
                    R.raw.baqarah212,
                    R.raw.baqarah213,
                    R.raw.baqarah214,
                    R.raw.baqarah215,},
            {R.raw.baqarah216,
                    R.raw.baqarah217,
                    R.raw.baqarah218,
                    R.raw.baqarah219,},
            {R.raw.baqarah220,
                    R.raw.baqarah221,
                    R.raw.baqarah222,
                    R.raw.baqarah223,
                    R.raw.baqarah224,},
            {R.raw.baqarah225,
                    R.raw.baqarah226,
                    R.raw.baqarah227,
                    R.raw.baqarah228,
                    R.raw.baqarah229,
                    R.raw.baqarah230,},
            {R.raw.baqarah231,
                    R.raw.baqarah232,
                    R.raw.baqarah233,},
            {R.raw.baqarah234,
                    R.raw.baqarah235,
                    R.raw.baqarah236,
                    R.raw.baqarah237,},
            {R.raw.baqarah238,
                    R.raw.baqarah239,
                    R.raw.baqarah240,
                    R.raw.baqarah241,
                    R.raw.baqarah242,
                    R.raw.baqarah243,
                    R.raw.baqarah244,
                    R.raw.baqarah245,},
            {R.raw.baqarah246,
                    R.raw.baqarah247,
                    R.raw.baqarah248,},
            {R.raw.baqarah249,
                    R.raw.baqarah250,
                    R.raw.baqarah251,
                    R.raw.baqarah252,},
    };

    private String [][] judulayat = {
            {"Al - Baqarah Ayat 142",
                    "Al - Baqarah Ayat 143",
                    "Al - Baqarah Ayat 144",
                    "Al - Baqarah Ayat 145",},
            {"Al - Baqarah Ayat 146",
                    "Al - Baqarah Ayat 147",
                    "Al - Baqarah Ayat 148",
                    "Al - Baqarah Ayat 149",
                    "Al - Baqarah Ayat 150",
                    "Al - Baqarah Ayat 151",
                    "Al - Baqarah Ayat 152",
                    "Al - Baqarah Ayat 153",},
            {"Al - Baqarah Ayat 154",
                    "Al - Baqarah Ayat 155",
                    "Al - Baqarah Ayat 156",
                    "Al - Baqarah Ayat 157",
                    "Al - Baqarah Ayat 158",
                    "Al - Baqarah Ayat 159",
                    "Al - Baqarah Ayat 160",
                    "Al - Baqarah Ayat 161",
                    "Al - Baqarah Ayat 162",
                    "Al - Baqarah Ayat 163",},
            {"Al - Baqarah Ayat 164",
                    "Al - Baqarah Ayat 165",
                    "Al - Baqarah Ayat 166",
                    "Al - Baqarah Ayat 167",
                    "Al - Baqarah Ayat 168",
                    "Al - Baqarah Ayat 169",},
            {"Al - Baqarah Ayat 170",
                    "Al - Baqarah Ayat 171",
                    "Al - Baqarah Ayat 172",
                    "Al - Baqarah Ayat 173",
                    "Al - Baqarah Ayat 174",
                    "Al - Baqarah Ayat 175",
                    "Al - Baqarah Ayat 176",},
            {"Al - Baqarah Ayat 177",
                    "Al - Baqarah Ayat 178",
                    "Al - Baqarah Ayat 179",
                    "Al - Baqarah Ayat 180",
                    "Al - Baqarah Ayat 181",},
            {"Al - Baqarah Ayat 182",
                    "Al - Baqarah Ayat 183",
                    "Al - Baqarah Ayat 184",
                    "Al - Baqarah Ayat 185",
                    "Al - Baqarah Ayat 186",},
            {"Al - Baqarah Ayat 187",
                    "Al - Baqarah Ayat 188",
                    "Al - Baqarah Ayat 189",
                    "Al - Baqarah Ayat 190",},
            {"Al - Baqarah Ayat 191",
                    "Al - Baqarah Ayat 192",
                    "Al - Baqarah Ayat 193",
                    "Al - Baqarah Ayat 194",
                    "Al - Baqarah Ayat 195",
                    "Al - Baqarah Ayat 196",},
            {"Al - Baqarah Ayat 197",
                    "Al - Baqarah Ayat 198",
                    "Al - Baqarah Ayat 199",
                    "Al - Baqarah Ayat 200",
                    "Al - Baqarah Ayat 201",
                    "Al - Baqarah Ayat 202",},
            {"Al - Baqarah Ayat 203",
                    "Al - Baqarah Ayat 204",
                    "Al - Baqarah Ayat 205",
                    "Al - Baqarah Ayat 206",
                    "Al - Baqarah Ayat 207",
                    "Al - Baqarah Ayat 208",
                    "Al - Baqarah Ayat 209",
                    "Al - Baqarah Ayat 210",},
            {"Al - Baqarah Ayat 211",
                    "Al - Baqarah Ayat 212",
                    "Al - Baqarah Ayat 213",
                    "Al - Baqarah Ayat 214",
                    "Al - Baqarah Ayat 215",},
            {"Al - Baqarah Ayat 216",
                    "Al - Baqarah Ayat 217",
                    "Al - Baqarah Ayat 218",
                    "Al - Baqarah Ayat 219",},
            {"Al - Baqarah Ayat 220",
                    "Al - Baqarah Ayat 221",
                    "Al - Baqarah Ayat 222",
                    "Al - Baqarah Ayat 223",
                    "Al - Baqarah Ayat 224",},
            {"Al - Baqarah Ayat 225",
                    "Al - Baqarah Ayat 226",
                    "Al - Baqarah Ayat 227",
                    "Al - Baqarah Ayat 228",
                    "Al - Baqarah Ayat 229",
                    "Al - Baqarah Ayat 230",},
            {"Al - Baqarah Ayat 231",
                    "Al - Baqarah Ayat 232",
                    "Al - Baqarah Ayat 233",},
            {"Al - Baqarah Ayat 234",
                    "Al - Baqarah Ayat 235",
                    "Al - Baqarah Ayat 236",
                    "Al - Baqarah Ayat 237",},
            {"Al - Baqarah Ayat 238",
                    "Al - Baqarah Ayat 239",
                    "Al - Baqarah Ayat 240",
                    "Al - Baqarah Ayat 241",
                    "Al - Baqarah Ayat 242",
                    "Al - Baqarah Ayat 243",
                    "Al - Baqarah Ayat 244",
                    "Al - Baqarah Ayat 245",},
            {"Al - Baqarah Ayat 246",
                    "Al - Baqarah Ayat 247",
                    "Al - Baqarah Ayat 248",},
            {"Al - Baqarah Ayat 249",
                    "Al - Baqarah Ayat 250",
                    "Al - Baqarah Ayat 251",
                    "Al - Baqarah Ayat 252",},
    };

    int ayat = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_juz2, container, false);

        MainActivity ma = (MainActivity)getActivity();
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageView imgjuz2 = (ImageView) view.findViewById(R.id.imageViewJuz2);
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
                imgjuz2.setImageResource(imghal[halaman]);
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
                ma.setHeadline("Juz 2 Halaman " + (halaman+1) );
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
                imgjuz2.setImageResource(imghal[halaman]);

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
                ma.setHeadline("Juz 2 Halaman " + (halaman+1) );
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