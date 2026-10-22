# Fleet Desk – Android

A small Android app that opens Fleet Desk full screen in a dark Chrome tab,
using the Claude sign-in already saved in Chrome on the phone.

- Package: `com.remoundos.fleetdesk` · Android 8.0+ (API 26)
- Opens: https://claude.ai/artifact/3WKLQ4Ui9hz1ja8ThM4RXt
- Build: every push to `main` runs **Actions → Build APK**; download
  `FleetDesk-apk` from the run's Artifacts.
- Signing: `app/fleetdesk.jks` with `app/keystore.properties`. Keep this repo
  **private**, and keep the same key so updates install over the old version.

## Install on the phone
1. Sign in to claude.ai once in Chrome on the phone.
2. Open `FleetDesk.apk` and allow "Install unknown apps" for the app you opened it from.
3. Tap **Fleet Desk** on the home screen.
