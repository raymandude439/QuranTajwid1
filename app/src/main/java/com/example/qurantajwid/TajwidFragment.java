package com.example.qurantajwid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
            }
        });

        return view;
    }
}