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

public class FragmentPlace extends Fragment {

    private InfoAdapter infoAdapter;
    private RecyclerView recyclerView;
    private List<String> infoList;

    public static FragmentPlace newInstance() {
        return new FragmentPlace();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        builData();
        setRecylerView();
    }

    private void builData() {
            infoList = new ArrayList<>();
            for (int i=0; i<3; i++) {
                infoList.add("Jalgaon");
                infoList.add("Nashik");
                infoList.add("Pune");
                infoList.add("Banglore");
                infoList.add("Delhi");
                infoList.add("Mumbai");
                infoList.add("Kolhapur");
                infoList.add("Alwar");
                infoList.add("Manglore");
                infoList.add("Kanpur");
        }
    }

    private void setRecylerView() {
        infoAdapter = new InfoAdapter(infoList);
        recyclerView.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycler_place);
    }
}