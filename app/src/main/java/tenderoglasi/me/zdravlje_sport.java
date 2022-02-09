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

public class zdravlje_sport extends AppCompatActivity {

    public Toolbar mTopToolbar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zdravlje_sport);


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
            Intent add_post = new Intent(zdravlje_sport.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(zdravlje_sport.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }


    private void setuponclicklisteners() {


        findViewById(R.id.lov_ribolov).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lov_ribolov = new Intent(zdravlje_sport.this, posts.class);
                lov_ribolov.putExtra("menuId","Lov_i_ribolov");
                startActivity(lov_ribolov);

            }
        });


        findViewById(R.id.kucni_ljubimci).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kucni_ljubimci = new Intent(zdravlje_sport.this, posts.class);
                kucni_ljubimci.putExtra("menuId","Kucni_ljubimci");
                startActivity(kucni_ljubimci);


            }
        });


        findViewById(R.id.zdravstvo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent zdravstvo = new Intent(zdravlje_sport.this, posts.class);
                zdravstvo.putExtra("menuId","Zdravstvo");
                startActivity(zdravstvo);


            }
        });


        findViewById(R.id.literatura).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent literatura = new Intent(zdravlje_sport.this, posts.class);
                literatura.putExtra("menuId","Literatura");
                startActivity(literatura);

            }
        });


        findViewById(R.id.sportska_oprema).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sportska_oprema = new Intent(zdravlje_sport.this, posts.class);
                sportska_oprema.putExtra("menuId","Sportska_i_kamp_oprema");
                startActivity(sportska_oprema);


            }
        });


        findViewById(R.id.njega_lica).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent njega_lica = new Intent(zdravlje_sport.this, posts.class);
                njega_lica.putExtra("menuId","Njega_lica_i_tijela");
                startActivity(njega_lica);


            }
        });
        findViewById(R.id.hobi_akvaristika).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent hobi_akvaristika = new Intent(zdravlje_sport.this, posts.class);
                hobi_akvaristika.putExtra("menuId","Hobi_akvaristika_antikviteti");
                startActivity(hobi_akvaristika);

            }
        });


        findViewById(R.id.muzicki_instrumenti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent muzicki_instrumenti = new Intent(zdravlje_sport.this, posts.class);
                muzicki_instrumenti.putExtra("menuId","Muzicki_instrumenti_i_ioprema");
                startActivity(muzicki_instrumenti);

            }
        });



    }
}