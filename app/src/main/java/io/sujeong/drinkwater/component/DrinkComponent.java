package io.sujeong.drinkwater.component;


import javax.inject.Singleton;

import dagger.Component;
import io.sujeong.drinkwater.module.DrinkModule;

@Singleton
@Component(
        modules = {
                DrinkModule.class
        }
)
public interface DrinkComponent {

}
