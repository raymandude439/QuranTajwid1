package com.example.qurantajwid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboutUsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboutUsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AboutUsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AboutUsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AboutUsFragment newInstance(String param1, String param2) {
        AboutUsFragment fragment = new AboutUsFragment();
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

    public int counter=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_about_us, container, false);

        MainActivity ma = (MainActivity)getActivity();
        Button lr = (Button) view.findViewById(R.id.lastread);
        Button bm = (Button) view.findViewById(R.id.bookmark);
        ImageButton back = (ImageButton)view.findViewById(R.id.back);
        ImageButton back1 = (ImageButton)view.findViewById(R.id.back1);
        ImageButton next = (ImageButton)view.findViewById(R.id.next);
        ImageButton prev = (ImageButton)view.findViewById(R.id.prev);

        ImageButton go = (ImageButton)view.findViewById(R.id.go);
        TextView txt = (TextView)view.findViewById(R.id.textbm);
        ImageButton go1 = (ImageButton)view.findViewById(R.id.go1);
        TextView txt1 = (TextView)view.findViewById(R.id.textbm1);
        ImageButton go2 = (ImageButton)view.findViewById(R.id.go2);
        TextView txt2 = (TextView)view.findViewById(R.id.textbm2);
        ImageButton go3 = (ImageButton)view.findViewById(R.id.go3);
        TextView txt3 = (TextView)view.findViewById(R.id.textbm3);
        ImageButton go4 = (ImageButton)view.findViewById(R.id.go4);
        TextView txt4 = (TextView)view.findViewById(R.id.textbm4);
        ImageButton go5 = (ImageButton)view.findViewById(R.id.go5);
        TextView txt5 = (TextView)view.findViewById(R.id.textbm5);
        ImageButton go6 = (ImageButton)view.findViewById(R.id.go6);
        TextView txt6 = (TextView)view.findViewById(R.id.textbm6);
        ImageButton go7 = (ImageButton)view.findViewById(R.id.go7);
        TextView txt7 = (TextView)view.findViewById(R.id.textbm7);
        ImageButton go8 = (ImageButton)view.findViewById(R.id.go8);
        TextView txt8 = (TextView)view.findViewById(R.id.textbm8);
        ImageButton go9 = (ImageButton)view.findViewById(R.id.go9);
        TextView txt9 = (TextView)view.findViewById(R.id.textbm9);
        ImageButton go10 = (ImageButton)view.findViewById(R.id.go10);
        TextView txt10 = (TextView)view.findViewById(R.id.textbm10);
        ImageButton go11 = (ImageButton)view.findViewById(R.id.go11);
        TextView txt11 = (TextView)view.findViewById(R.id.textbm11);
        ImageButton go12 = (ImageButton)view.findViewById(R.id.go12);
        TextView txt12 = (TextView)view.findViewById(R.id.textbm12);
        ImageButton go13 = (ImageButton)view.findViewById(R.id.go13);
        TextView txt13 = (TextView)view.findViewById(R.id.textbm13);
        ImageButton go14 = (ImageButton)view.findViewById(R.id.go14);
        TextView txt14 = (TextView)view.findViewById(R.id.textbm14);
        ImageButton go15 = (ImageButton)view.findViewById(R.id.go15);
        TextView txt15 = (TextView)view.findViewById(R.id.textbm15);
        ImageButton go16 = (ImageButton)view.findViewById(R.id.go16);
        TextView txt16 = (TextView)view.findViewById(R.id.textbm16);
        ImageButton go17 = (ImageButton)view.findViewById(R.id.go17);
        TextView txt17 = (TextView)view.findViewById(R.id.textbm17);
        ImageButton go18 = (ImageButton)view.findViewById(R.id.go18);
        TextView txt18 = (TextView)view.findViewById(R.id.textbm18);
        ImageButton go19 = (ImageButton)view.findViewById(R.id.go19);
        TextView txt19 = (TextView)view.findViewById(R.id.textbm19);


        back.setVisibility(View.GONE);
        next.setVisibility(View.GONE);
        prev.setVisibility(View.GONE);

        go.setVisibility(View.GONE);
        txt.setVisibility(View.GONE);
        go1.setVisibility(View.GONE);
        txt1.setVisibility(View.GONE);
        go2.setVisibility(View.GONE);
        txt2.setVisibility(View.GONE);
        go3.setVisibility(View.GONE);
        txt3.setVisibility(View.GONE);
        go4.setVisibility(View.GONE);
        txt4.setVisibility(View.GONE);
        go5.setVisibility(View.GONE);
        txt5.setVisibility(View.GONE);
        go6.setVisibility(View.GONE);
        txt6.setVisibility(View.GONE);
        go7.setVisibility(View.GONE);
        txt7.setVisibility(View.GONE);
        go8.setVisibility(View.GONE);
        txt8.setVisibility(View.GONE);
        go9.setVisibility(View.GONE);
        txt9.setVisibility(View.GONE);
        go10.setVisibility(View.GONE);
        txt10.setVisibility(View.GONE);
        go11.setVisibility(View.GONE);
        txt11.setVisibility(View.GONE);
        go12.setVisibility(View.GONE);
        txt12.setVisibility(View.GONE);
        go13.setVisibility(View.GONE);
        txt13.setVisibility(View.GONE);
        go14.setVisibility(View.GONE);
        txt14.setVisibility(View.GONE);
        go15.setVisibility(View.GONE);
        txt15.setVisibility(View.GONE);
        go16.setVisibility(View.GONE);
        txt16.setVisibility(View.GONE);
        go17.setVisibility(View.GONE);
        txt17.setVisibility(View.GONE);
        go18.setVisibility(View.GONE);
        txt18.setVisibility(View.GONE);
        go19.setVisibility(View.GONE);
        txt19.setVisibility(View.GONE);

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        lr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                int lastjuz = sharedPref.getInt(getString(R.string.lastjuz), 0);
                int lasthal = sharedPref.getInt(getString(R.string.lasthal), 0);
                int lastayat = sharedPref.getInt(getString(R.string.lastayat), 0);
                ma.setHeadline("Juz " + (lastjuz+1) + " Halaman " + (lasthal+1));
                ma.setJuz(lastjuz);
                ma.setHalaman(lasthal);
                ma.setAyat(lastayat);
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lr.setVisibility(View.GONE);
                bm.setVisibility(View.GONE);
                back.setVisibility(View.VISIBLE);
//                next.setVisibility(View.VISIBLE);
                go.setVisibility(View.VISIBLE);
                txt.setVisibility(View.VISIBLE);
                counter=0;
                if(ma.bmcounter >= 0){
                    go.setVisibility(View.VISIBLE);
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Juz " + (ma.bookmark[0][0]+1) + " Halaman " + (ma.bookmark[0][1]+1));
                }
                if(ma.bmcounter >= 1){
                    go1.setVisibility(View.VISIBLE);
                    txt1.setVisibility(View.VISIBLE);
                    txt1.setText("Juz " + (ma.bookmark[1][0]+1) + " Halaman " + (ma.bookmark[1][1]+1));
                }
                if(ma.bmcounter >= 2){
                    go2.setVisibility(View.VISIBLE);
                    txt2.setVisibility(View.VISIBLE);
                    txt2.setText("Juz " + (ma.bookmark[2][0]+1) + " Halaman " + (ma.bookmark[2][1]+1));
                }
                if(ma.bmcounter >= 3){
                    go3.setVisibility(View.VISIBLE);
                    txt3.setVisibility(View.VISIBLE);
                    txt3.setText("Juz " + (ma.bookmark[3][0]+1) + " Halaman " + (ma.bookmark[3][1]+1));
                }
                if(ma.bmcounter >= 4){
                    go4.setVisibility(View.VISIBLE);
                    txt4.setVisibility(View.VISIBLE);
                    txt4.setText("Juz " + (ma.bookmark[4][0]+1) + " Halaman " + (ma.bookmark[4][1]+1));
                }
                if(ma.bmcounter >= 5){
                    go5.setVisibility(View.VISIBLE);
                    txt5.setVisibility(View.VISIBLE);
                    txt5.setText("Juz " + (ma.bookmark[5][0]+1) + " Halaman " + (ma.bookmark[5][1]+1));
                }
                if(ma.bmcounter >= 6){
                    go6.setVisibility(View.VISIBLE);
                    txt6.setVisibility(View.VISIBLE);
                    txt6.setText("Juz " + (ma.bookmark[6][0]+1) + " Halaman " + (ma.bookmark[6][1]+1));
                }
                if(ma.bmcounter >= 7){
                    go7.setVisibility(View.VISIBLE);
                    txt7.setVisibility(View.VISIBLE);
                    txt7.setText("Juz " + (ma.bookmark[7][0]+1) + " Halaman " + (ma.bookmark[7][1]+1));
                }
                if(ma.bmcounter >= 8){
                    go8.setVisibility(View.VISIBLE);
                    txt8.setVisibility(View.VISIBLE);
                    txt8.setText("Juz " + (ma.bookmark[8][0]+1) + " Halaman " + (ma.bookmark[8][1]+1));
                }
                if(ma.bmcounter >= 9){
                    go9.setVisibility(View.VISIBLE);
                    txt9.setVisibility(View.VISIBLE);
                    txt9.setText("Juz " + (ma.bookmark[9][0]+1) + " Halaman " + (ma.bookmark[9][1]+1));
                }
                if(ma.bmcounter >= 10){
                    go10.setVisibility(View.VISIBLE);
                    txt10.setVisibility(View.VISIBLE);
                    txt10.setText("Juz " + (ma.bookmark[10][0]+1) + " Halaman " + (ma.bookmark[10][1]+1));
                }
                if(ma.bmcounter >= 11){
                    go11.setVisibility(View.VISIBLE);
                    txt11.setVisibility(View.VISIBLE);
                    txt11.setText("Juz " + (ma.bookmark[11][0]+1) + " Halaman " + (ma.bookmark[11][1]+1));
                }
                if(ma.bmcounter >= 12){
                    go12.setVisibility(View.VISIBLE);
                    txt12.setVisibility(View.VISIBLE);
                    txt12.setText("Juz " + (ma.bookmark[12][0]+1) + " Halaman " + (ma.bookmark[12][1]+1));
                }
                if(ma.bmcounter >= 13){
                    go13.setVisibility(View.VISIBLE);
                    txt13.setVisibility(View.VISIBLE);
                    txt13.setText("Juz " + (ma.bookmark[13][0]+1) + " Halaman " + (ma.bookmark[13][1]+1));
                }
                if(ma.bmcounter >= 14){
                    go14.setVisibility(View.VISIBLE);
                    txt14.setVisibility(View.VISIBLE);
                    txt14.setText("Juz " + (ma.bookmark[14][0]+1) + " Halaman " + (ma.bookmark[14][1]+1));
                }
                if(ma.bmcounter >= 15){
                    go15.setVisibility(View.VISIBLE);
                    txt15.setVisibility(View.VISIBLE);
                    txt15.setText("Juz " + (ma.bookmark[15][0]+1) + " Halaman " + (ma.bookmark[15][1]+1));
                }
                if(ma.bmcounter >= 16){
                    go16.setVisibility(View.VISIBLE);
                    txt16.setVisibility(View.VISIBLE);
                    txt16.setText("Juz " + (ma.bookmark[16][0]+1) + " Halaman " + (ma.bookmark[16][1]+1));
                }
                if(ma.bmcounter >= 17){
                    go17.setVisibility(View.VISIBLE);
                    txt17.setVisibility(View.VISIBLE);
                    txt17.setText("Juz " + (ma.bookmark[17][0]+1) + " Halaman " + (ma.bookmark[17][1]+1));
                }
                if(ma.bmcounter >= 18){
                    go18.setVisibility(View.VISIBLE);
                    txt18.setVisibility(View.VISIBLE);
                    txt18.setText("Juz " + (ma.bookmark[18][0]+1) + " Halaman " + (ma.bookmark[18][1]+1));
                }
                if(ma.bmcounter >= 19){
                    go19.setVisibility(View.VISIBLE);
                    txt19.setVisibility(View.VISIBLE);
                    txt19.setText("Juz " + (ma.bookmark[19][0]+1) + " Halaman " + (ma.bookmark[19][1]+1));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lr.setVisibility(View.VISIBLE);
                bm.setVisibility(View.VISIBLE);
                back.setVisibility(View.GONE);
                next.setVisibility(View.GONE);
                prev.setVisibility(View.GONE);
                go.setVisibility(View.GONE);
                txt.setVisibility(View.GONE);
            }
        });

//        if(counter==0){
//            prev.setVisibility(View.GONE);
//        }else if(counter==ma.bmcounter){
//            next.setVisibility(View.GONE);
//        }
//
//        txt.setText("Juz " + (ma.bookmark[counter][0]+1) + " Halaman " + (ma.bookmark[counter][1]+1));
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter++;
//                prev.setVisibility(View.VISIBLE);
//                if(counter==ma.bmcounter-1){
//                    next.setVisibility(View.GONE);
//                }
//                txt.setText("Juz " + (ma.bookmark[counter][0]+1) + " Halaman " + (ma.bookmark[counter][1]+1));
//            }
//        });
//
//        prev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter--;
//                next.setVisibility(View.VISIBLE);
//                if(counter==0){
//                    prev.setVisibility(View.GONE);
//                }
//                txt.setText("Juz " + (ma.bookmark[counter][0]+1) + " Halaman " + (ma.bookmark[counter][1]+1));
//            }
//        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[0][0]);
                ma.setHalaman(ma.bookmark[0][1]);
                ma.setAyat(ma.bookmark[0][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[1][0]);
                ma.setHalaman(ma.bookmark[1][1]);
                ma.setAyat(ma.bookmark[1][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[2][0]);
                ma.setHalaman(ma.bookmark[2][1]);
                ma.setAyat(ma.bookmark[2][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[3][0]);
                ma.setHalaman(ma.bookmark[3][1]);
                ma.setAyat(ma.bookmark[3][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[4][0]);
                ma.setHalaman(ma.bookmark[4][1]);
                ma.setAyat(ma.bookmark[4][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[5][0]);
                ma.setHalaman(ma.bookmark[5][1]);
                ma.setAyat(ma.bookmark[5][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[6][0]);
                ma.setHalaman(ma.bookmark[6][1]);
                ma.setAyat(ma.bookmark[6][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[7][0]);
                ma.setHalaman(ma.bookmark[7][1]);
                ma.setAyat(ma.bookmark[7][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[8][0]);
                ma.setHalaman(ma.bookmark[8][1]);
                ma.setAyat(ma.bookmark[8][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[9][0]);
                ma.setHalaman(ma.bookmark[9][1]);
                ma.setAyat(ma.bookmark[9][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[10][0]);
                ma.setHalaman(ma.bookmark[10][1]);
                ma.setAyat(ma.bookmark[10][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[11][0]);
                ma.setHalaman(ma.bookmark[11][1]);
                ma.setAyat(ma.bookmark[11][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[12][0]);
                ma.setHalaman(ma.bookmark[12][1]);
                ma.setAyat(ma.bookmark[12][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[13][0]);
                ma.setHalaman(ma.bookmark[13][1]);
                ma.setAyat(ma.bookmark[13][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[14][0]);
                ma.setHalaman(ma.bookmark[14][1]);
                ma.setAyat(ma.bookmark[14][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[15][0]);
                ma.setHalaman(ma.bookmark[15][1]);
                ma.setAyat(ma.bookmark[15][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[16][0]);
                ma.setHalaman(ma.bookmark[16][1]);
                ma.setAyat(ma.bookmark[16][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[17][0]);
                ma.setHalaman(ma.bookmark[17][1]);
                ma.setAyat(ma.bookmark[17][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[18][0]);
                ma.setHalaman(ma.bookmark[18][1]);
                ma.setAyat(ma.bookmark[18][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        go19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setJuz(ma.bookmark[19][0]);
                ma.setHalaman(ma.bookmark[19][1]);
                ma.setAyat(ma.bookmark[19][2]);
                ma.setHeadline("Juz " + (ma.juz+1) + " Halaman " + (ma.halaman+1));
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, Juz1Fragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        return view;
    }
}