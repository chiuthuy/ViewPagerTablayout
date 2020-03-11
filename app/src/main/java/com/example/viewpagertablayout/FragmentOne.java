package com.example.viewpagertablayout;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> data;


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment_one, container, false);

        recyclerView = view.findViewById(R.id.recyclerview1);
        data = new ArrayList<>();
        data.add("1abc");
        data.add("ads");
        data.add("13sd");
        data.add("àdaf");
        data.add("34123asd");
        data.add("ấvc");
        data.add("Tadsf");
        recyclerViewAdapter = new RecyclerViewAdapter(getActivity(),data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        // Inflate the layout for this fragment
        return view;
    }

}
