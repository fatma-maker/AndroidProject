package com.example.sujet5;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.widget.Button;
public class Erreur  extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.erreur, container, false);
        Button TrueAnswer = (Button) rootView.findViewById(R.id.button4);
        TrueAnswer.setOnClickListener(this);
        return rootView;

    }
    @Override
    public void onClick(View view) {
        Fragment fragment = null;
                fragment = new NewGameFragment();
                replaceFragment(fragment);

    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, someFragment);
        transaction.commit();
    }


}