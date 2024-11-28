package io.sujeong.drinkwater;

import android.app.Application;

import io.sujeong.drinkwater.component.DaggerDrinkComponent;
import io.sujeong.drinkwater.component.DrinkComponent;
import io.sujeong.drinkwater.module.DrinkModule;


public class DrinkApplication extends Application {

    private DrinkComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeComponents();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void initializeComponents() {
        this.component = DaggerDrinkComponent.builder()
                .drinkModule(new DrinkModule(this))
                .build();
    }
}
