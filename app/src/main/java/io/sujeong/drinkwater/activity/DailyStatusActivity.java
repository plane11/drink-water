package io.sujeong.drinkwater.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.sujeong.drinkwater.R;

public class DailyStatusActivity extends Activity {

    @BindView(R.id.drink_status_total_percentage)
    TextView drinkStatusTotalPercentageTextView;

    @BindView(R.id.drink_status_total_quantity)
    TextView drinkStatusTotalQuantityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_status);

        ButterKnife.bind(this);

        drinkStatusTotalPercentageTextView.setText("100%");
        drinkStatusTotalQuantityTextView.setText("2000mL");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
