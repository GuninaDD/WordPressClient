package com.simbirsoft.wordpressclient.ui.login;

public interface AuthenticationListener {
    void onTokenReceived(String auth_token);
}
