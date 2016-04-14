package gr.academic.city.sdmd.appbar;

import android.os.Bundle;

/**
 * Created by trumpets on 4/14/16.
 */
public class SecondActivity extends ToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_second;
    }

    @Override
    protected int getTitleResource() {
        return R.string.second_screen;
    }
}
