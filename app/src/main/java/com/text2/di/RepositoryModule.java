package com.text2.di;

import com.text2.models.RepositoryDBImpl;
import com.text2.models.RepositoryRestImpl;
import com.text2.models.user.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public RepositoryDBImpl provideRepositoryDb(User user){
        return new RepositoryDBImpl(user);
    }

    @Provides
    @Singleton
    public RepositoryRestImpl provideRepositoryRest(User user){
        return new RepositoryRestImpl(user);
    }
}
