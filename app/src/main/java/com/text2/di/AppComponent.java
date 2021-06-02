package com.text2.di;

import com.text2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DataModels.class, RepositoryModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
