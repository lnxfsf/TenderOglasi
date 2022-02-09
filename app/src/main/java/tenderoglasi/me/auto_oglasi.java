package tenderoglasi.me;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class auto_oglasi extends AppCompatActivity {

    private Toolbar mTopToolbar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_oglasi);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("Tender Oglasi");



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
            Intent add_post = new Intent(auto_oglasi.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(auto_oglasi.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }

    private void setuponclicklisteners() {




        findViewById(R.id.vozila_prodaja).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vozila_prodaja = new Intent(auto_oglasi.this, posts.class);
                vozila_prodaja.putExtra("menuId","Vozila_prodaja");
                startActivity(vozila_prodaja);

            }
        });


        findViewById(R.id.auto_djelovi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent auto_djelovi = new Intent(auto_oglasi.this, posts.class);
                auto_djelovi.putExtra("menuId","Auto_djelovi_prodaja");
                startActivity(auto_djelovi);

            }
        });


        findViewById(R.id.teretna_vozila).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent teretna_vozila = new Intent(auto_oglasi.this, posts.class);
                teretna_vozila.putExtra("menuId","Teretna_vozila");
                startActivity(teretna_vozila);

            }
        });

        findViewById(R.id.motori_bicikli).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent motori_bicikli = new Intent(auto_oglasi.this, posts.class);
                motori_bicikli.putExtra("menuId","Motori_i_bicikli");
                startActivity(motori_bicikli);

            }
        });

        findViewById(R.id.autobusi_prikolice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent autobusi_prikolice = new Intent(auto_oglasi.this, posts.class);
                autobusi_prikolice.putExtra("menuId","Autobusi_i_prikolice");
                startActivity(autobusi_prikolice);

            }
        });

        findViewById(R.id.potraznja_kompenzacija).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent potraznja_kompenzacija = new Intent(auto_oglasi.this, posts.class);
                potraznja_kompenzacija.putExtra("menuId","Potražnja_Kompenzacija");
                startActivity(potraznja_kompenzacija);

            }
        });





    }
}