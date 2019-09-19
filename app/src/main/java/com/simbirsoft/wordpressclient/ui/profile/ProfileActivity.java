package com.simbirsoft.wordpressclient.ui.profile;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.simbirsoft.wordpressclient.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_profile);
        Toolbar toolbar = findViewById(R.id.toolbar_profile);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        if (savedInstanceState == null)
        {
            //заполненный профиль - CardProfileFilledFragment, незаполненный -  CardProfileInfilledFragment

            getSupportFragmentManager().beginTransaction().add(R.id.profile_card_container, CardProfileFilledFragment.newInstance()).commit();
        }



    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }



}
