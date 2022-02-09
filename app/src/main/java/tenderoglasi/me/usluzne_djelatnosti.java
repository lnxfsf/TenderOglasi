package tenderoglasi.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class usluzne_djelatnosti extends AppCompatActivity {

    public Toolbar mTopToolbar;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usluzne_djelatnosti);


        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);

        mAdView = findViewById(R.id.adView);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest = new AdRequest.Builder().build();
        mAdView.loadAd(adrequest);


        setuponclicklisteners();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            Intent add_post = new Intent(usluzne_djelatnosti.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(usluzne_djelatnosti.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }


    private void setuponclicklisteners() {


        findViewById(R.id.obrazovanje_nastava).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obrazovanje_nastava = new Intent(usluzne_djelatnosti.this, posts.class);
                obrazovanje_nastava.putExtra("menuId","Obrazovanje_i_nastava");
                startActivity(obrazovanje_nastava);

            }
        });


        findViewById(R.id.kucni_servis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kucni_servis = new Intent(usluzne_djelatnosti.this, posts.class);
                kucni_servis.putExtra("menuId","Kucni_servis");
                startActivity(kucni_servis);

            }
        });


        findViewById(R.id.pomoc_kuci).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pomoc_kuci = new Intent(usluzne_djelatnosti.this, posts.class);
                pomoc_kuci.putExtra("menuId","Pomoc_u_kuci");
                startActivity(pomoc_kuci);

            }
        });


        findViewById(R.id.stolarske_usluge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent stolarske_usluge = new Intent(usluzne_djelatnosti.this, posts.class);
                stolarske_usluge.putExtra("menuId","Stolarske_usluge");
                startActivity(stolarske_usluge);

            }
        });


        findViewById(R.id.transportne_usluge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent transportne_usluge = new Intent(usluzne_djelatnosti.this, posts.class);
                transportne_usluge.putExtra("menuId","Transportne_usluge");
                startActivity(transportne_usluge);

            }
        });


        findViewById(R.id.auto_servis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent auto_servis = new Intent(usluzne_djelatnosti.this, posts.class);
                auto_servis.putExtra("menuId","Auto_servis");
                startActivity(auto_servis);


            }
        });
        findViewById(R.id.racunar_pomoc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent racunar_pomoc = new Intent(usluzne_djelatnosti.this, posts.class);
                racunar_pomoc.putExtra("menuId","Racunar_pomoc");
                startActivity(racunar_pomoc);

            }
        });


        findViewById(R.id.finansija_racunovodstvo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent finansija_racunovodstvo = new Intent(usluzne_djelatnosti.this, posts.class);
                finansija_racunovodstvo.putExtra("menuId","Finansija_i_racunovodstvo");
                startActivity(finansija_racunovodstvo);

            }
        });


    }
}