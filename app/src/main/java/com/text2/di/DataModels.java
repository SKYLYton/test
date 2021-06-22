package com.text2.di;

import com.text2.models.user.User;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModels {

    @Provides
    public User provideUser(){
        return new User();
    }
}
