package com.dev.shopapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Profile extends Fragment {

    View view;
    FrameLayout photos, posts;
    TextView photoText, postText;

    public Profile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_profile, container, false);
        photos = view.findViewById(R.id.photos);
        posts = view.findViewById(R.id.posts);
        postText = view.findViewById(R.id.postText);
        photoText = view.findViewById(R.id.photosText);
        postText.setTextColor(Color.parseColor("#5DB075"));
        photoText.setTextColor(Color.parseColor("#BDBDBD"));
        posts.setBackgroundResource(R.drawable.social_media_button);
        photos.setBackgroundResource(R.drawable.grey_selector);
        changeFragment(new PostList());

        photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new PhotosFragment());
                postText.setTextColor(Color.parseColor("#BDBDBD"));
                photoText.setTextColor(Color.parseColor("#5DB075"));
                posts.setBackgroundResource(R.drawable.grey_selector);
                photos.setBackgroundResource(R.drawable.social_media_button);
            }
        });

        posts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFragment(new PostList());
                postText.setTextColor(Color.parseColor("#5DB075"));
                photoText.setTextColor(Color.parseColor("#BDBDBD"));
                posts.setBackgroundResource(R.drawable.social_media_button);
                photos.setBackgroundResource(R.drawable.grey_selector);
            }
        });

        return view;
    }

    private void changeFragment(Fragment fragment) {
        getChildFragmentManager().beginTransaction().replace(R.id.innerContainer, fragment).commit();
    }
}