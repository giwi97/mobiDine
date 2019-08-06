package com.example.giwantha.mobiDine.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.giwantha.mobiDine.R;
import com.example.giwantha.mobiDine.adapter.ForYouAdapter;
import com.example.giwantha.mobiDine.helper.Data;


public class NewProductFragment extends Fragment {
    RecyclerView nRecyclerView;
    Data data;
    private ForYouAdapter pAdapter;

    public NewProductFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        data = new Data();
        nRecyclerView = view.findViewById(R.id.new_product_rv);
        pAdapter = new ForYouAdapter(data.getNewList(), getContext(), "new");
        RecyclerView.LayoutManager pLayoutManager = new LinearLayoutManager(getContext());
        nRecyclerView.setLayoutManager(pLayoutManager);
        nRecyclerView.setItemAnimator(new DefaultItemAnimator());
        nRecyclerView.setAdapter(pAdapter);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("New");
    }
}
