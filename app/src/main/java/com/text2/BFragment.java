package com.text2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.text2.observer.EventListener;

public class BFragment extends Fragment implements EventListener {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        textView = view.findViewById(R.id.textView);

        return view;
    }

    @Override
    public void update(String text) {
        textView.setText(text);
    }
}