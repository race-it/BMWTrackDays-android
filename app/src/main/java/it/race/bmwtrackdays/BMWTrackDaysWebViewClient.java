package it.race.bmwtrackdays;

import android.content.Intent;
import android.net.Uri;
import android.util.StringBuilderPrinter;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by johnj on 15/08/2016.
 */
public class BMWTrackDaysWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("bmwtrackdays.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
