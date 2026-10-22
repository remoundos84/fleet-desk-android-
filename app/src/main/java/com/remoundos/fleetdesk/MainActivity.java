package com.remoundos.fleetdesk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;

/**
 * Opens Fleet Desk full screen in a dark Chrome Custom Tab, using the
 * Claude sign-in already saved in Chrome. The launcher itself has no UI.
 */
public class MainActivity extends Activity {

    private static final String FLEET_DESK_URL = "https://claude.ai/artifact/3WKLQ4Ui9hz1ja8ThM4RXt";
    private static final int DARK = 0xFF0B1119;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri uri = Uri.parse(FLEET_DESK_URL);
        try {
            CustomTabColorSchemeParams dark = new CustomTabColorSchemeParams.Builder()
                    .setToolbarColor(DARK)
                    .setNavigationBarColor(DARK)
                    .build();
            CustomTabsIntent tab = new CustomTabsIntent.Builder()
                    .setDefaultColorSchemeParams(dark)
                    .setColorSchemeParams(CustomTabsIntent.COLOR_SCHEME_DARK, dark)
                    .setColorScheme(CustomTabsIntent.COLOR_SCHEME_DARK)
                    .setShowTitle(false)
                    .setUrlBarHidingEnabled(true)
                    .build();
            tab.launchUrl(this, uri);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
        }
        finish();
    }
}
