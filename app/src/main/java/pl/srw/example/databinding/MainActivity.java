package pl.srw.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import pl.srw.example.databinding.databinding.UserBinding;
import pl.srw.example.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("John", "Smith");
        binding.setUser(user);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
