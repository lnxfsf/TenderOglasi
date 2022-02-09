package tenderoglasi.me;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.AppIndexApi;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {


   


    public Toolbar mTopToolbar;

    private AdView mAdView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mAdView = findViewById(R.id.adView);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest = new AdRequest.Builder().build();
        mAdView.loadAd(adrequest);



        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);

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
            Intent add_post = new Intent(MainActivity.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(MainActivity.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }


    private void setuponclicklisteners() {

        // da rade buttons kada se klikne na njih, da otvara novi activity

        //auto oglasi
        findViewById(R.id.auto_oglasi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent auto_oglas = new Intent(MainActivity.this,auto_oglasi.class);
                MainActivity.this.startActivity(auto_oglas);

            }
        });


        //posao oglasi
        findViewById(R.id.posao_oglasi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent posao_oglas = new Intent(MainActivity.this,posao_oglasi.class);
                MainActivity.this.startActivity(posao_oglas);


            }
        });

        //nekretnine oglasi
        findViewById(R.id.nekretnine_oglasi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nekretnine_oglas = new Intent(MainActivity.this,nekretnine_oglasi.class);
                MainActivity.this.startActivity(nekretnine_oglas);





            }
        });

        //usluzne djelatnosti
        findViewById(R.id.usluzne_djelatnosti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent usluzna_djelatnost = new Intent(MainActivity.this,usluzne_djelatnosti.class);
                MainActivity.this.startActivity(usluzna_djelatnost);



            }
        });

        //aparati i elektronika
        findViewById(R.id.aparati_elektronika).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aparat_elektronika = new Intent(MainActivity.this,aparati_elektronika.class);
                MainActivity.this.startActivity(aparat_elektronika);



            }
        });

        //zdravlje i sport
        findViewById(R.id.zdravlje_sport).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent zdravlje_sports = new Intent(MainActivity.this,zdravlje_sport.class);
                MainActivity.this.startActivity(zdravlje_sports);


            }
        });


        //odjeca i obuca
        findViewById(R.id.odjeca_obuca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent odjeca_i_obuca = new Intent(MainActivity.this,odjeca_obuca.class);
                MainActivity.this.startActivity(odjeca_i_obuca);


            }
        });


    }
}