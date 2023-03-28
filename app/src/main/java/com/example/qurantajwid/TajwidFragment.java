package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tajwid, container, false);;
        MainActivity ma = (MainActivity)getActivity();
        ImageView img = (ImageView)view.findViewById(R.id.imageViewTajwid);
        Button btnTajwid1 = (Button)view.findViewById(R.id.btnTajwid1);
        Button btnTajwid2 = (Button)view.findViewById(R.id.btnTajwid2);
        Button btnTajwid3 = (Button)view.findViewById(R.id.btnTajwid3);
        Button btnTajwid4 = (Button)view.findViewById(R.id.btnTajwid4);
        Button btnTajwid5 = (Button)view.findViewById(R.id.btnTajwid5);

        img.setVisibility(View.GONE);

        btnTajwid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.albaqarah1);
                img.setVisibility(View.VISIBLE);
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                ma.setHeadline("Ghunnah");
            }
        });

        btnTajwid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.albaqarah2);
                img.setVisibility(View.VISIBLE);
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                ma.setHeadline("Idhghom");
            }
        });
        btnTajwid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.albaqarah3);
                img.setVisibility(View.VISIBLE);
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                ma.setHeadline("Tajwid 3");
            }
        });
        btnTajwid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.albaqarah4);
                img.setVisibility(View.VISIBLE);
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                ma.setHeadline("Tajwid 4");
            }
        });
        btnTajwid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.albaqarah5);
                img.setVisibility(View.VISIBLE);
                btnTajwid1.setVisibility(View.GONE);
                btnTajwid2.setVisibility(View.GONE);
                btnTajwid3.setVisibility(View.GONE);
                btnTajwid4.setVisibility(View.GONE);
                btnTajwid5.setVisibility(View.GONE);
                ma.setHeadline("Tajwid 5");
            }
        });

        return view;
    }
}