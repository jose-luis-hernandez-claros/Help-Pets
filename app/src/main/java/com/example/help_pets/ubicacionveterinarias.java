package com.example.help_pets;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ubicacionveterinarias extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacionveterinarias);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        getLocalizacion();
    }

    private void getLocalizacion() {
        int permiso = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (permiso == PackageManager.PERMISSION_DENIED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            }
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission
                (this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);

        mMap.getUiSettings().setMyLocationButtonEnabled(false);

        LocationManager locationManager = (LocationManager) ubicacionveterinarias.this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                LatLng miUbicacion = new LatLng(location.getLatitude(), location.getLongitude());
                mMap.addMarker(new MarkerOptions().position(miUbicacion).title("ubicación actual"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(miUbicacion));
                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(miUbicacion)
                        .zoom(14)
                        .bearing(90)
                        .tilt(45)
                        .build();
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);



//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        //Ubicacion Colombia
//        LatLng colombia = new LatLng(2.8894434, -73.783892);
//        mMap.addMarker(new MarkerOptions().position(colombia).title("Colombia"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colombia, 3));
//
//        //Botones Zoom
//        mMap.getUiSettings().setZoomControlsEnabled(false);
//    }

//
//        import org.apache.http.client.HttpResponseException;
//        import android.util.Log;
//        import com.google.api.client.googleapis.GoogleHeaders;
//        import com.google.api.client.http.GenericUrl;
//        import com.google.api.client.http.HttpRequest;
//        import com.google.api.client.http.HttpRequestFactory;
//        import com.google.api.client.http.HttpRequestInitializer;
//        import com.google.api.client.http.HttpTransport;
//        import com.google.api.client.http.javanet.NetHttpTransport;
//        import com.google.api.client.http.json.JsonHttpParser;
//        import com.google.api.client.json.jackson.JacksonFactory;
//        @SuppressWarnings("deprecation")
//        public class GooglePlaces { /** Global instance of the HTTP transport. */ private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
//        // Google API Key private static final String API_KEY = "<Your KEY>"; // Google Places serach url's
//            // private static final String PLACES_SEARCH_URL = "https://maps.googleapis.com/maps/api/place/search/json?";
//            // private static final String PLACES_TEXT_SEARCH_URL = "https://maps.googleapis.com/maps/api/place/search/json?";
//            // private static final String PLACES_DETAILS_URL = "https://maps.googleapis.com/maps/api/place/details/json?";
//            // private double _latitude;
//            // private double _longitude;
//            // private double _radius;
//            // /** * Searching places
//            // * @param latitude - latitude of place * @params longitude - longitude of place * @param radius - radius of searchable area * @param types - type of place to search * @return list of places *
//            // */ public PlacesList search(double latitude, double longitude, double radius, String types) throws Exception
//            // { this._latitude = latitude;
//            // this._longitude = longitude;
//            // this._radius = radius;
//            // try { HttpRequestFactory httpRequestFactory = createRequestFactory(HTTP_TRANSPORT);
//            // HttpRequest request = httpRequestFactory .buildGetRequest(new GenericUrl(PLACES_SEARCH_URL));
//            // request.getUrl().put("key", API_KEY);
//            // request.getUrl().put("location", _latitude + "," + _longitude);
//            // request.getUrl().put("radius", _radius);
//            // in meters request.getUrl().put("sensor", "false");
//            // if(types != null) request.getUrl().put("types", types);
//            // PlacesList list = request.execute().parseAs(PlacesList.class);
//            // Check log cat for places response status Log.d("Places Status", "" + list.status);
//            // return list; } catch (HttpResponseException e) { Log.e("Error:", e.getMessage()); return null; } }
//            // /** * Searching single place full details * @param refrence - reference id of place * - which you will get in search api request * */ public PlaceDetails
//            // getPlaceDetails(String reference)
//            // throws Exception { try { HttpRequestFactory httpRequestFactory = createRequestFactory(HTTP_TRANSPORT);
//            // HttpRequest request = httpRequestFactory .buildGetRequest(new GenericUrl(PLACES_DETAILS_URL));
//            // request.getUrl().put("key", API_KEY);
//            // request.getUrl().put("reference", reference);
//            // request.getUrl().put("sensor", "false");
//            // PlaceDetails place = request.execute().parseAs(PlaceDetails.class);
//            // return place; } catch (HttpResponseException e) { Log.e("Error in Perform Details", e.getMessage()); throw e; } }
//            // /** * Creating http request Factory * */
//            // public static HttpRequestFactory createRequestFactory( final HttpTransport transport) {
//            // return transport.createRequestFactory(new HttpRequestInitializer() {
//            // public void initialize(HttpRequest request) { GoogleHeaders headers = new GoogleHeaders();
//            // headers.setApplicationName("AndroidHive-Places-Test");
//            // request.setHeaders(headers);
//            // JsonHttpParser parser = new JsonHttpParser(new JacksonFactory());
//            // request.addParser(parser); } }); } }

    }
}