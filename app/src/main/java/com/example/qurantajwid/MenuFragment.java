package com.example.qurantajwid;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

//    private MenuFragmentListener listener;

    public MenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
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

//    public interface MenuFragmentListener {
//        void onInputASent(CharSequence input);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton btnQuran = (ImageButton)view.findViewById(R.id.btnQuran);
        ImageButton btnTajwid = (ImageButton) view.findViewById(R.id.btnTajwid);
        ImageButton btnAU = (ImageButton) view.findViewById(R.id.btnAU);
        MainActivity ma = (MainActivity)getActivity();
        btnQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, QuranFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Al - Quran");
            }
        });
        btnTajwid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, TajwidFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("Tajwid");
            }
        });
        btnAU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragmentFrame, AboutUsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
                ma.setHeadline("About Us");
            }
        });

        return view;
    }
//    public void onAttach(Context context){
//        super.onAttach(context);
//        if (context instanceof MenuFragmentListener){
//            listener = (MenuFragmentListener) context;
//        } else {
//            throw new RuntimeException(context.toString() + " must implement MenuFragmentListener");
//        }
//    }
//    public void onDetach() {
//        super.onDetach();
//        listener = null;
//    }
}