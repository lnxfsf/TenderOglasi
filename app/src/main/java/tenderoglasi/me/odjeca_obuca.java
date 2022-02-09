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

public class odjeca_obuca extends AppCompatActivity {

    public Toolbar mTopToolbar;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odjeca_obuca);

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
            Intent add_post = new Intent(odjeca_obuca.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(odjeca_obuca.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }

    private void setuponclicklisteners() {

        findViewById(R.id.odjeca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent odjeca = new Intent(odjeca_obuca.this, posts.class);
                odjeca.putExtra("menuId","Odjeca");
                startActivity(odjeca);




            }
        });


        findViewById(R.id.obuca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obuca = new Intent(odjeca_obuca.this, posts.class);
                obuca.putExtra("menuId","Obuca");
                startActivity(obuca);


            }
        });


        findViewById(R.id.vjencanice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vjencanice = new Intent(odjeca_obuca.this, posts.class);
                vjencanice.putExtra("menuId","Vjencanice");
                startActivity(vjencanice);

            }
        });



    }
}