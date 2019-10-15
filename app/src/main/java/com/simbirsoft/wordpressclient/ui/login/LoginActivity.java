package com.simbirsoft.wordpressclient.ui.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.simbirsoft.wordpressclient.R;
import com.simbirsoft.wordpressclient.WordpressActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen_common);

        AppPreferences appPreferences = new AppPreferences(this);
        String token = appPreferences.getString();
        if (token != null) {
            Intent intent = new Intent(this, WordpressActivity.class);
            startActivity(intent);
            finish();
        } else {
            Fragment fragment = new LoginFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fl_common, fragment).commit();
        }
    }
}