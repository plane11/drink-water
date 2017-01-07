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

    @BindView(R.id.drink_status_total_percentage)
    TextView drinkStatusTotalPercentageTextView;

    @BindView(R.id.drink_status_total_quantity)
    TextView drinkStatusTotalQuantityTextView;

    @Before
    public void setUp() throws Exception {
        subject = Robolectric.setupActivity(DailyStatusActivity.class);
        ButterKnife.bind(this, subject);
    }

    @Test
    public void whenLoadActivity_thenShowDrinkTotalPercentage() throws Exception {
        assertThat(drinkStatusTotalPercentageTextView.getText().toString()).endsWith("%");
    }

    @Test
    public void whenLoadActivity_thenShowDrinkTotalQuantity() throws Exception {
        assertThat(drinkStatusTotalQuantityTextView.getText().toString()).endsWith("mL");
    }
}
