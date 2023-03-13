package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Juz1H11A5Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Juz1H11A5Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Juz1H11A5Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Juz1H11A5Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Juz1H11A5Fragment newInstance(String param1, String param2) {
        Juz1H11A5Fragment fragment = new Juz1H11A5Fragment();
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
        View view=inflater.inflate(R.layout.fragment_juz1_h11_a5, container, false);

        MainActivity ma = (MainActivity)getActivity();

        ImageButton play = (ImageButton)view.findViewById(R.id.play);
        ImageButton pause = (ImageButton)view.findViewById(R.id.pause);
        ImageButton stop = (ImageButton)view.findViewById(R.id.stop);
        ImageButton sr = (ImageButton)view.findViewById(R.id.seekright);
        ImageButton sl = (ImageButton)view.findViewById(R.id.seekleft);

        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame1, Juz1H11A4Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame1, Juz1H11A6Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ma.play(R.raw.baqarah74);
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