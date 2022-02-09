package tenderoglasi.me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class search extends AppCompatActivity {


    private Toolbar mTopToolbar;
    private AdView mAdView, adview2, adview3, adView4, adView5, adView6 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("Tender Oglasi");

        mAdView = findViewById(R.id.adView);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest = new AdRequest.Builder().build();
        mAdView.loadAd(adrequest);



        // _____________

        adview2 = findViewById(R.id.adView2);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest2 = new AdRequest.Builder().build();
        adview2.loadAd(adrequest2);

        // _____________

        adview3 = findViewById(R.id.adView3);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest3 = new AdRequest.Builder().build();
        adview3.loadAd(adrequest3);

        // _____________

        adView4 = findViewById(R.id.adView4);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest4 = new AdRequest.Builder().build();
        adView4.loadAd(adrequest4);

        // _____________

        adView5 = findViewById(R.id.adView5);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest5 = new AdRequest.Builder().build();
        adView5.loadAd(adrequest5);

        // _____________

        adView6 = findViewById(R.id.adView6);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest6 = new AdRequest.Builder().build();
        adView6.loadAd(adrequest6);

















    }
}