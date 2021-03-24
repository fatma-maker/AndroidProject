package com.example.sujet5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class History extends Fragment {
    NewGameFragment NewGameFragment;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView=  inflater.inflate(R.layout.history,container,false) ;
        Animation a = AnimationUtils.loadAnimation(History.super.getContext(), R.anim.anim);
        a.reset();
        TextView  tv= (TextView) rootView.findViewById(R.id.yy);
        tv.startAnimation(a);
        TextView  tv1= (TextView) rootView.findViewById(R.id.yy1);
        tv1.startAnimation(a);
        return rootView;
    }

}
