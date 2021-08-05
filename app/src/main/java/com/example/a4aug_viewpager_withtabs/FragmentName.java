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

public class FragmentName extends Fragment {

    private List<String> infoList;
    private InfoAdapter infoAdapter;
    private RecyclerView recyclerView;


    public static FragmentName newInstance() {
        return new FragmentName();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        builData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        infoAdapter = new InfoAdapter(infoList);
        recyclerView.setAdapter(infoAdapter);
        infoAdapter.notifyDataSetChanged();
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycler_name);

    }

    private void builData() {
        infoList = new ArrayList<>();
        for (int i=0; i<3; i++) {
            infoList.add("Amol");
            infoList.add("Abhishek");
            infoList.add("Avadhut");
            infoList.add("Aditya");
            infoList.add("Sudarshan");
            infoList.add("Nalini");
            infoList.add("Akash");
            infoList.add("Lloyd");
            infoList.add("Sai");
            infoList.add("Prabhakar");
        }
    }
}