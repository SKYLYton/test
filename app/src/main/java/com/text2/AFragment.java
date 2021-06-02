package com.text2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.text2.observer.Updater;

public class AFragment extends Fragment {

   private Button button;
   private EditText editText;
   private Updater updater;

    public static AFragment newInstance(Updater updater) {
        AFragment fragment = new AFragment();
        fragment.updater = updater;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(v -> {
            if(updater != null) {
                updater.update(editText.getText().toString());
            }
        });

        return view;
    }

    public void setUpdater(Updater updater) {
        this.updater = updater;
    }
}