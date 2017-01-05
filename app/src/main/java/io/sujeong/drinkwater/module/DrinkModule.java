package io.sujeong.drinkwater.module;

import android.content.Context;

import dagger.Module;

@Module
public class DrinkModule {

    private Context context;

    public DrinkModule(Context context) {
        this.context = context;
    }

}
