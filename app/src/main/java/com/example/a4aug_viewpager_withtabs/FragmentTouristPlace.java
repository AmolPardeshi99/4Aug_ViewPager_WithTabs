package com.example.a4aug_viewpager_withtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentTouristPlace extends Fragment {

    private List<String> infoList;
    private InfoAdapter infoAdapter;
    private RecyclerView recyclerView;

    public static FragmentTouristPlace newInstance() {
        return new FragmentTouristPlace();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tourist_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_TouristPlace);
        builData();
        setRecylerview();
    }

    private void setRecylerview() {
        infoAdapter = new InfoAdapter(infoList);
        recyclerView.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();
    }

    private void builData() {
        infoList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            infoList.add("Pink City");
            infoList.add("Lakshmi Vilas Palace");
            infoList.add("Nakki Lake");
            infoList.add("Naizara Fall");
            infoList.add("Shiv Temple");
            infoList.add("GuruShikhar");
            infoList.add("Mansrovar Lake");
            infoList.add("SUnset Point");
        }
    }
}