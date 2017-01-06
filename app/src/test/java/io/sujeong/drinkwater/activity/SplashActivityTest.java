package io.sujeong.drinkwater.activity;

import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import io.sujeong.drinkwater.BuildConfig;
import io.sujeong.drinkwater.R;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashActivityTest {

    SplashActivity subject;

    @Before
    public void setUp() throws Exception {
        subject = Robolectric.setupActivity(SplashActivity.class);
    }

    @Test
    public void whenLaunchApp_thenShowSplashActivity_containsImage() throws Exception {
        ImageView splashImageView = (ImageView) subject.findViewById(R.id.splash_img);
        assertThat(splashImageView.getDrawable()).isNotNull();
    }

}
