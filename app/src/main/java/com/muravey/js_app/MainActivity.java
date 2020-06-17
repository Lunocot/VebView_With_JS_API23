package com.muravey.js_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mWeb = findViewById(R.id.LocalBrowser);
        WebSettings mSettings = mWeb.getSettings();

          mWeb.setWebViewClient(new locWebViewClient());
          mSettings.setJavaScriptEnabled(true);
          mSettings.setDomStorageEnabled(true);

          mWeb.loadUrl("file:///android_asset/JSPage.html");
    }

    private class locWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String LocalUrl)
        {
            view.loadUrl(LocalUrl);
            return true;
        }
    }

}
