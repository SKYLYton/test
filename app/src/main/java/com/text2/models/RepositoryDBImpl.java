package com.text2.models;

import android.util.Log;

import com.text2.models.user.User;

public class RepositoryDBImpl implements Repository {
    public static final String TAG = RepositoryDBImpl.class.getSimpleName();

    private User user;

    public RepositoryDBImpl(User user) {
        this.user = user;
    }

    @Override
    public void getUser() {
        Log.d(TAG, String.format("%s %s %d %s. From DB",
                user.getName(), user.getFamily(), user.getAge(), user.getAddress()));
    }
}
