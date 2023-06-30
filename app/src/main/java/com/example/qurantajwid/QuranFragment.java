package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuranFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuranFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuranFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuranFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuranFragment newInstance(String param1, String param2) {
        QuranFragment fragment = new QuranFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_quran, container, false);

        MainActivity ma = (MainActivity)getActivity();
        Button btnJuz1 = (Button)view.findViewById(R.id.btnJuz1);
        Button btnJuz2 = (Button)view.findViewById(R.id.btnJuz2);
        Button btnJuz3 = (Button)view.findViewById(R.id.btnJuz3);
        Button btnJuz4 = (Button)view.findViewById(R.id.btnJuz4);
        Button btnJuz5 = (Button)view.findViewById(R.id.btnJuz5);
        Button btnJuz6 = (Button)view.findViewById(R.id.btnJuz6);
        Button btnJuz7 = (Button)view.findViewById(R.id.btnJuz7);
        Button btnJuz8 = (Button)view.findViewById(R.id.btnJuz8);
        Button btnJuz9 = (Button)view.findViewById(R.id.btnJuz9);
        Button btnJuz10 = (Button)view.findViewById(R.id.btnJuz10);
        Button btnJuz11 = (Button)view.findViewById(R.id.btnJuz11);
        Button btnJuz12 = (Button)view.findViewById(R.id.btnJuz12);
        Button btnJuz13 = (Button)view.findViewById(R.id.btnJuz13);
        Button btnJuz14 = (Button)view.findViewById(R.id.btnJuz14);
        Button btnJuz15 = (Button)view.findViewById(R.id.btnJuz15);
        Button btnJuz16 = (Button)view.findViewById(R.id.btnJuz16);
        Button btnJuz17 = (Button)view.findViewById(R.id.btnJuz17);
        Button btnJuz18 = (Button)view.findViewById(R.id.btnJuz18);
        Button btnJuz19 = (Button)view.findViewById(R.id.btnJuz19);
        Button btnJuz20 = (Button)view.findViewById(R.id.btnJuz20);
        Button btnJuz21 = (Button)view.findViewById(R.id.btnJuz21);
        Button btnJuz22 = (Button)view.findViewById(R.id.btnJuz22);
        Button btnJuz23 = (Button)view.findViewById(R.id.btnJuz23);
        Button btnJuz24 = (Button)view.findViewById(R.id.btnJuz24);
        Button btnJuz25 = (Button)view.findViewById(R.id.btnJuz25);
        Button btnJuz26 = (Button)view.findViewById(R.id.btnJuz26);
        Button btnJuz27 = (Button)view.findViewById(R.id.btnJuz27);
        Button btnJuz28 = (Button)view.findViewById(R.id.btnJuz28);
        Button btnJuz29 = (Button)view.findViewById(R.id.btnJuz29);
        Button btnJuz30 = (Button)view.findViewById(R.id.btnJuz30);

        ImageButton back = (ImageButton)view.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setHeadline("Menu");
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, MenuFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
        btnJuz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(0);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 1 Halaman 1");
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        btnJuz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(1);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 2 Halaman 1");
            }
        });

        btnJuz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(2);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 3 Halaman 1");
            }
        });

        btnJuz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(3);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 4 Halaman 1");
            }
        });

        btnJuz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(4);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 5 Halaman 1");
            }
        });

        btnJuz6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(5);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 6 Halaman 1");
            }
        });

        btnJuz7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(6);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 7 Halaman 1");
            }
        });

        btnJuz8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(7);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 8 Halaman 1");
            }
        });

        btnJuz9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(8);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 9 Halaman 1");
            }
        });

        btnJuz10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(9);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 10 Halaman 1");
            }
        });

        btnJuz11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(10);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 11 Halaman 1");
            }
        });

        btnJuz12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(11);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 12 Halaman 1");
            }
        });

        btnJuz13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(12);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 13 Halaman 1");
            }
        });

        btnJuz14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(13);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 14 Halaman 1");
            }
        });

        btnJuz15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(14);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 15 Halaman 1");
            }
        });

        btnJuz16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(15);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 16 Halaman 1");
            }
        });

        btnJuz17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(16);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 17 Halaman 1");
            }
        });

        btnJuz18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(17);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 18 Halaman 1");
            }
        });

        btnJuz19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(18);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 19 Halaman 1");
            }
        });

        btnJuz20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(19);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 20 Halaman 1");
            }
        });

        btnJuz21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(20);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 21 Halaman 1");
            }
        });

        btnJuz22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(21);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 22 Halaman 1");
            }
        });

        btnJuz23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(22);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 23 Halaman 1");
            }
        });

        btnJuz24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(23);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 24 Halaman 1");
            }
        });

        btnJuz25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(24);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 25 Halaman 1");
            }
        });

        btnJuz26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(25);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 26 Halaman 1");
            }
        });

        btnJuz27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(26);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 27 Halaman 1");
            }
        });

        btnJuz28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(27);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 28 Halaman 1");
            }
        });

        btnJuz29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(28);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 29 Halaman 1");
            }
        });

        btnJuz30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setJuz(29);
                ma.setAyat(0);
                ma.setHalaman(0);
                ma.setHeadline("Juz 30 Halaman 1");
            }
        });

        return view;
    }
}