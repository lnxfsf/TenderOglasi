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

public class aparati_elektronika extends AppCompatActivity {


    private Toolbar mTopToolbar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aparati_elektronika);


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

            Intent add_post = new Intent(aparati_elektronika.this, add_posts.class);
            startActivity(add_post);



        }
        if (id == R.id.action_search) {
            Intent search = new Intent(aparati_elektronika.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }


    private void setuponclicklisteners() {

        findViewById(R.id.mobilni_telefoni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mobilni_telefoni = new Intent(aparati_elektronika.this, posts.class);
                mobilni_telefoni.putExtra("menuId","Mobilni_telefoni_i_oprema");
                startActivity(mobilni_telefoni);


            }
        });


        findViewById(R.id.uredaji_domacinstvo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent uredaji_domacinstvo = new Intent(aparati_elektronika.this, posts.class);
                uredaji_domacinstvo.putExtra("menuId","Uredaji_za_domaćinstvo");
                startActivity(uredaji_domacinstvo);


            }
        });


        findViewById(R.id.racunari_oprema).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent racunari_oprema = new Intent(aparati_elektronika.this, posts.class);
                racunari_oprema.putExtra("menuId","Računari_i_oprema");
                startActivity(racunari_oprema);

            }
        });


        findViewById(R.id.audio_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent audio_tv = new Intent(aparati_elektronika.this, posts.class);
                audio_tv.putExtra("menuId","Audio_TV_Video_CD");
                startActivity(audio_tv);


            }
        });


        findViewById(R.id.foto_optika).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent foto_optika = new Intent(aparati_elektronika.this, posts.class);
                foto_optika.putExtra("menuId","Foto_i_optika");
                startActivity(foto_optika);


            }
        });


        findViewById(R.id.climato).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent climato = new Intent(aparati_elektronika.this, posts.class);
                climato.putExtra("menuId","Climato");
                startActivity(climato);


            }
        });



    }
}