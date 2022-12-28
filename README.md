Example project using Android Google maps SDK on Android with Jetpack compose.

This has changed within the last year or so. Now there's a new [compose API for Google maps](https://github.com/googlemaps/android-maps-compose). Previously we had to use an `AndroidView`. Technically this new API (`GoogleMap`) still uses an `AndroidView` under the hood, but it's easier to work with.

# Features

## Permissions
Asking for `ACCESS_FINE_LOCATION` permission. This is required to show the users location on the map.
<br>
<br>
<img src="art/location_permission.png" width="25%">

## Polygons with markers
Display polygons with markers.
<br>
<br>
<img src="art/polygon_with_marker.png" width="25%">

## Your location
Display your location (if you've accepted the permission).
<br>
<br>
<img src="art/your_location.png" width="25%">

# Notes / Gotchas
1. You will need to enable billing on your google cloud console to complete this example. You won't be charged anything as long as you stay under the daily request limit. Then add your API key to `local.properties`.
```
GOOGLE_MAPS_API_KEY=<YOUR_KEY>
```
2. If the user declines the permission request twice they will need to manually enable the permission from system settings for the app (or uninstall and reinstall). That's a whole other topic - I'm just assuming they accept in this example.
3. Need `androidx.appcompat:appcompat` dependency for `MapEffect`. I was seeing an `AppCompatTextView` exception being thrown if I didn't include it.