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
import com.example.giwantha.mobiDine.adapter.OfferAdapter;
import com.example.giwantha.mobiDine.helper.Data;
import com.example.giwantha.mobiDine.model.Offer;

import java.util.ArrayList;
import java.util.List;


public class OffrersFragment extends Fragment {

    Data data;
    private List<Offer> offerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private OfferAdapter mAdapter;

    public OffrersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_offer, container, false);
        recyclerView = view.findViewById(R.id.offer_rv);
        data = new Data();
        mAdapter = new OfferAdapter(data.getOfferList(), getContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Offer");
    }
}
