package com.text2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.text2.observer.EventListener;
import com.text2.observer.EventManager;

public class MainActivity extends AppCompatActivity {

    private EventManager eventManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventManager = new EventManager();

        AFragment aFragment = new AFragment();
        BFragment bFragment = new BFragment();

        eventManager.subscribe(bFragment);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        //ft.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        ft.add(R.id.container, aFragment);
        ft.add(R.id.container, bFragment);
        ft.commit();
    }

    public void update(String string){
        eventManager.update(string);
    }
}