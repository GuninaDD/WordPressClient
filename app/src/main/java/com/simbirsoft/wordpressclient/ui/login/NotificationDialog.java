package com.simbirsoft.wordpressclient.ui.login;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;

import com.simbirsoft.wordpressclient.R;

public class NotificationDialog extends Dialog {
    private final String signin_url;

    NotificationDialog(@NonNull Context context) {
        super(context);
        this.signin_url = context.getResources().getString(R.string.redirect_signin);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.screen_authorization);

        WebView webView = findViewById(R.id.wv_authorization);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(signin_url);
        webView.setWebViewClient(webViewClient);
    }

    private WebViewClient webViewClient = new WebViewClient() {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith(signin_url)) {
                NotificationDialog.this.dismiss();
                return true;
            }
            return false;
        }

    };
}
