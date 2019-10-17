package com.simbirsoft.wordpressclient.ui.login;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;

import com.simbirsoft.wordpressclient.R;

public class AuthenticationDialog extends Dialog {
    private final String redirect_url;
    private final String request_url;
    private AuthenticationListener listener;

    AuthenticationDialog(@NonNull Context context, AuthenticationListener listener) {
        super(context);
        this.listener = listener;
        this.redirect_url = context.getResources().getString(R.string.redirect_login);
        this.request_url = context.getResources().getString(R.string.baseURL) +
                "?client_id=" +
                context.getResources().getString(R.string.client_id) +
                "&redirect_uri=" + redirect_url +
                "&response_type=token&scope=global";
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.screen_authorization);

        WebView webView = findViewById(R.id.wv_authorization);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(request_url);
        webView.setWebViewClient(webViewClient);
    }

    private WebViewClient webViewClient = new WebViewClient() {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith(redirect_url)) {
                AuthenticationDialog.this.dismiss();
                return true;
            }
            return false;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (url.contains("access_token=")) {
                Uri uri = Uri.parse(url);
                String access_token = uri.getEncodedFragment();
                assert access_token != null;
                access_token = access_token.substring(access_token.lastIndexOf('=') + 1);
                Log.e("access_token", access_token);
                listener.onTokenReceived(access_token);
                dismiss();
            } else if (url.contains("?error")) {
                Log.e("access_token", "getting error fetching access token");
                dismiss();
            }
        }
    };
}
