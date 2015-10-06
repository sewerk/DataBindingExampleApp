package pl.srw.example.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment, DetailsFragment.newInstance())
                .commit();
    }
}
