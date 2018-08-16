package com.julius.lttforum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ForumViewActivity extends AppCompatActivity {
    private WebView lttwebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum_view);
        Toast.makeText(ForumViewActivity.this,
                "All rights reserved to Linus Media Group. I do not own any part in this project.", Toast.LENGTH_LONG).show();
        lttwebview = (WebView) findViewById(R.id.webview);
        lttwebview.setWebViewClient(new WebViewClient());
        lttwebview.loadUrl("https://linustechtips.com/main/");
        WebSettings webSettings = lttwebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAppCacheEnabled(true);
    }


    @Override
    public void onBackPressed() {
        if (lttwebview.canGoBack()) {
            lttwebview.goBack();
        } else {
            super.onBackPressed();
        }
    }

}



//All rights reserved to Linus Media Group.