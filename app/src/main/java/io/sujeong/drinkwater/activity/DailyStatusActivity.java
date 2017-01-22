package io.sujeong.drinkwater.activity;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.sujeong.drinkwater.R;

public class DailyStatusActivity extends AppCompatActivity {

    @BindView(R.id.drink_status_total_percentage)
    TextView drinkStatusTotalPercentageTextView;

    @BindView(R.id.drink_status_total_quantity)
    TextView drinkStatusTotalQuantityTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_status);

        ButterKnife.bind(this);

        initActionBar();

        loadData();

    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void loadData() {
        drinkStatusTotalPercentageTextView.setText("100%");
        drinkStatusTotalQuantityTextView.setText("2000mL");
    }
}
