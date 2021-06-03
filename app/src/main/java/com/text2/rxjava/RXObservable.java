package com.text2.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RXObservable {
    public static Observable<Integer> getObservable() {
        return Observable
                .create((ObservableOnSubscribe<Integer>) emitter -> {
                    for (int i = 1; i < 11; i++) {
                        emitter.onNext(i);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ignored){
                        }
                    }
                    emitter.onComplete();
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
