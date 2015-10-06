package pl.srw.example.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pl.srw.example.databinding.databinding.ContentMainBinding;
import pl.srw.example.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentMainBinding binding = DataBindingUtil.setContentView(this, R.layout.content_main);
        User user = new User("Test", "User");
        binding.setUser(user);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


    }

}
