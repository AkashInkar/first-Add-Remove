package com.example.felix_its.bottomnavigationdemo.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.felix_its.bottomnavigationdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    Button btnSave;
    View view;
    AutoCompleteTextView actv;
    String[]state ={"maharashatra","bihar","pathan"};
    Spinner sp;
    List<String> area =new ArrayList<String>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_home, container, false);
        btnSave = view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        sp = view.findViewById(R.id.spinner);
        actv = view.findViewById(R.id.actv);


        ArrayAdapter <String>adapter = new ArrayAdapter<String>(getActivity(),R.layout.select_dialog_item,actv);


        area.add("Viman nagar");
        area.add("Ramwadi");
        area.add("Wagholi");
        area.add("Keshav Nagar");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.spinner_item,area);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);
        sp.setAdapter(adapter);
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"Save",Toast.LENGTH_SHORT).show();
    }
}
