package com.simbirsoft.wordpressclient.ui.login;

import android.content.Context;
import android.content.SharedPreferences;

class AppPreferences {
    private static final String APP_PREFERENCES_FILE_NAME = "userdata";
    private static final String TOKEN = "token";
    private SharedPreferences preferences;

    AppPreferences(Context context) {
        this.preferences = context.getSharedPreferences(APP_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
    }

    String getString() {
        return preferences.getString(AppPreferences.TOKEN, null);
    }

    void putString(String value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(AppPreferences.TOKEN, value);
        editor.apply();
    }
}
