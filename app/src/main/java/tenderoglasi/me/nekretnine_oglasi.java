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

public class nekretnine_oglasi extends AppCompatActivity {


    public Toolbar mTopToolbar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nekretnine_oglasi);

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
            Intent add_post = new Intent(nekretnine_oglasi.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(nekretnine_oglasi.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }

    private void setuponclicklisteners() {



        findViewById(R.id.stanovi_izdavanje).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent stanovi_izdavanje = new Intent(nekretnine_oglasi.this, posts.class);
                stanovi_izdavanje.putExtra("menuId","Stanovi_sobe_izdavanje");
                startActivity(stanovi_izdavanje);

            }
        });


        findViewById(R.id.stanovi_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent stanovi_prodaja = new Intent(nekretnine_oglasi.this, posts.class);
                stanovi_prodaja.putExtra("menuId","Stanovi_prodaja");
                startActivity(stanovi_prodaja);


            }
        });


        findViewById(R.id.potraznja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent potraznja = new Intent(nekretnine_oglasi.this, posts.class);
                potraznja.putExtra("menuId","Potražnja_Kompenzaci");
                startActivity(potraznja);


            }
        });


        findViewById(R.id.odmori_putovanja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent odmori_putovanja = new Intent(nekretnine_oglasi.this, posts.class);
                odmori_putovanja.putExtra("menuId","Odmori_i_putovanja");
                startActivity(odmori_putovanja);

            }
        });


        findViewById(R.id.kuce_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kuce_prodaja = new Intent(nekretnine_oglasi.this, posts.class);
                kuce_prodaja.putExtra("menuId","Kuće_prodaja");
                startActivity(kuce_prodaja);

            }
        });


        findViewById(R.id.placevi_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent placevi_prodaja = new Intent(nekretnine_oglasi.this, posts.class);
                placevi_prodaja.putExtra("menuId","Placevi_prodaja");
                startActivity(placevi_prodaja);

            }
        });
        findViewById(R.id.poslovni_prostori_izdavanje).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent poslovni_prostori_izdavanje = new Intent(nekretnine_oglasi.this, posts.class);
                poslovni_prostori_izdavanje.putExtra("menuId","Poslovni_prostori_izdavanje");
                startActivity(poslovni_prostori_izdavanje);


            }
        });


        findViewById(R.id.poslovni_prostori_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent poslovni_prostori_prodaja = new Intent(nekretnine_oglasi.this, posts.class);
                poslovni_prostori_prodaja.putExtra("menuId","Poslovni_prostori_prodaja");
                startActivity(poslovni_prostori_prodaja);

            }
        });


        findViewById(R.id.vikendici_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vikendici_prodaja = new Intent(nekretnine_oglasi.this, posts.class);
                vikendici_prodaja.putExtra("menuId","Vikendici_prodaja");
                startActivity(vikendici_prodaja);


            }
        });



    }
}