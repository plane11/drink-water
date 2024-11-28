package io.sujeong.drinkwater;


import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;

public class TestDrinkApplication extends DrinkApplication implements TestLifecycleApplication{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void beforeTest(Method method) {

    }

    @Override
    public void prepareTest(Object test) {

    }

    @Override
    public void afterTest(Method method) {

    }
}
