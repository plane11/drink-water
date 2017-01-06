package io.sujeong.drinkwater.activity;

import android.widget.TextView;

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
public class DailyStatusActivityTest {

    private DailyStatusActivity subject;

    @BindView(R.id.drink_status_total_text)
    TextView drinkStatusTotalTextView;

    @Before
    public void setUp() throws Exception {
        subject = Robolectric.setupActivity(DailyStatusActivity.class);
        ButterKnife.bind(this, subject);
    }

    @Test
    public void whenLoadActivity_thenShowDrinkTotalText() throws Exception {
        assertThat(drinkStatusTotalTextView.getText().toString().endsWith("%"));
    }
}
