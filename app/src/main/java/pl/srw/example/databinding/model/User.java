package pl.srw.example.databinding.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import pl.srw.example.databinding.DetailsActivity;

/**
 * Created by kseweryn on 06.10.15.
 */
public class User {
    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public View.OnClickListener detailsButtonClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Context context = v.getContext();
                context.startActivity(new Intent(context, DetailsActivity.class));
            }
        };
    }
}
