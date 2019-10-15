package com.simbirsoft.wordpressclient.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.simbirsoft.wordpressclient.R;
import com.simbirsoft.wordpressclient.WordpressActivity;

public class LoginFragment extends Fragment implements AuthenticationListener {
    private String token = null;
    private AppPreferences appPreferences = null;
    View view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.screen_login, container, false);

        appPreferences = new AppPreferences(getContext());
        token = appPreferences.getString();

        Button btn_login = view.findViewById(R.id.btn_login);
        Button btn_signin = view.findViewById(R.id.btn_notification);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AuthenticationDialog authenticationDialog = new AuthenticationDialog(getContext(), LoginFragment.this);
                authenticationDialog.setCancelable(true);
                authenticationDialog.show();
            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationDialog notificationDialog = new NotificationDialog(getContext());
                notificationDialog.setCancelable(true);
                notificationDialog.show();
            }
        });

        return view;
    }

    @Override
    public void onTokenReceived(String auth_token) {
        if (auth_token == null)
            return;
        appPreferences.putString(auth_token);
        token = auth_token;
        Intent intent = new Intent(getContext(), WordpressActivity.class);
        startActivity(intent);
    }
}
