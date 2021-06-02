package com.text2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.text2.models.Repository;
import com.text2.models.RepositoryDBImpl;
import com.text2.models.RepositoryRestImpl;
import com.text2.observer.EventManager;
import com.text2.observer.Updater;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements Updater {
    final private static String TAG = "MainActivity";

    @Inject RepositoryDBImpl repositoryDB;
    @Inject RepositoryRestImpl repositoryRest;

    private EventManager eventManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        App.getInstance().getAppComponent().inject(MainActivity.this);

        eventManager = new EventManager();

        //1
        AFragment aFragment = AFragment.newInstance(this);
        //2
        aFragment.setUpdater(this);

        BFragment bFragment = new BFragment();

        eventManager.subscribe(bFragment);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.add(R.id.container, aFragment);
        ft.add(R.id.container, bFragment);
        ft.commit();

        findViewById(R.id.button).setOnClickListener((view) ->
                startActivity(new Intent(this, SecondActivity.class)));

        repositoryDB.getUser();
        repositoryRest.getUser();

    }

    public void update(String text) {
        eventManager.notify(text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}