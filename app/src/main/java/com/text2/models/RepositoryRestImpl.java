package com.text2.models;

import android.util.Log;

import com.text2.models.user.User;

public class RepositoryRestImpl implements Repository {
    public static final String TAG = RepositoryRestImpl.class.getSimpleName();

    private User user;

    public RepositoryRestImpl(User user) {
        this.user = user;
    }

    @Override
    public void getUser() {
        Log.d(TAG, String.format("%s %s %d %s. From request",
                user.getName(), user.getFamily(), user.getAge(), user.getAddress()));
    }
}
