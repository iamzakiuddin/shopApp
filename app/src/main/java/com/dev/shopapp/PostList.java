package com.dev.shopapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dev.shopapp.Adapters.PostAdapter;

public class PostList extends Fragment {

    View view;
    RecyclerView postList ;
    public PostList() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_post_list, container, false);
        postList = view.findViewById(R.id.postList);
        PostAdapter postAdapter = new PostAdapter();
        postList.setAdapter(postAdapter);
        postList.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        return view;
    }
}