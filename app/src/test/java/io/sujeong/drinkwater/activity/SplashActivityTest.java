package io.sujeong.drinkwater.activity;

import android.widget.ImageView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.sujeong.drinkwater.BuildConfig;
import io.sujeong.drinkwater.R;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class SplashActivityTest {

    private SplashActivity subject;

    @BindView(R.id.splash_img)
    ImageView splashImageView;

    @Before
    public void setUp() throws Exception {
        subject = Robolectric.setupActivity(SplashActivity.class);
        ButterKnife.bind(this, subject);
    }

    @Test
    public void whenLaunchApp_thenShowSplashActivity_containsImage() throws Exception {
        assertThat(splashImageView.getDrawable()).isNotNull();
    }

}
