package tenderoglasi.me;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class add_posts extends AppCompatActivity {


    private Toolbar mTopToolbar;
    ArrayList<subsection_spinner> spinner_models;
    public String subsection, descri, place, price, phone, formattedDate;


    EditText opis, cena, telefon;

    FirebaseDatabase database;
    DatabaseReference add_posts;

    Button submit_post;

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_posts);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("Tender Oglasi");



        mAdView = findViewById(R.id.adView);


        MobileAds.initialize(this, "ca-app-pub-7799603437316055/4944438446");

        AdRequest adrequest = new AdRequest.Builder().build();
        mAdView.loadAd(adrequest);



        //subsekcija
        subsection = "Vozila_prodaja";

        //opis
        opis = (EditText) findViewById(R.id.opisa);


        //mesto
        place = "";

        //cena
        cena = (EditText) findViewById(R.id.cena);


        //telefon
        telefon = (EditText) findViewById(R.id.telefon);


        //get date
        Date c = Calendar.getInstance().getTime();
        System.out.println("Current time => " + c);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        formattedDate = df.format(c);

        submit_post = (Button) findViewById(R.id.submit_post);





        spinner_data();

        spinner_for_place();






        submit_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //Firebase
                database = FirebaseDatabase.getInstance();
                add_posts = database.getReference("Posts");

                //add data some
                descri = opis.getText().toString();
                price = cena.getText().toString() + " €";
                phone = telefon.getText().toString();


                if( descri != null && !descri.trim().isEmpty()
                        &&  price != null && !price.trim().isEmpty()
                        &&  phone != null && !phone.trim().isEmpty()
                        &&  place != null && !place.trim().isEmpty())

                {

                    add_posts_model model = new add_posts_model();

                    //adding values
                    model.setDate_created(formattedDate);
                    model.setDescription(descri);
                    model.setMenuId(subsection);
                    model.setPhone(phone);
                    model.setPlace(place);
                    model.setPrice(price);

                    add_posts.push().setValue(model);




                    finish();
                    //take me back home...
                 //   Intent home = new Intent(add_posts.this,MainActivity.class);
                  //  startActivity(home);

                    Toast.makeText(add_posts.this, "Oglas je objavljen", Toast.LENGTH_LONG).show();




                }else{
                    Toast.makeText(add_posts.this, "Popunite sva polja, izaberite grad", Toast.LENGTH_LONG).show();




                }





            }
        });










    }

    private void spinner_for_place() {


        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.mesto);

        String[] items = new String[]{"Izaberite grad",
                "Andrijevica",
                "Bar",
                "Berane",
                "Bijelo Polje",
                "Budva",
                "Cetinje",
                "Danilovgrad",
                "Golubovci",
                "Herceg Novi",
                "Kolašin",
                "Kotor",
                "Mojkovac",
                "Nikšić",
                "Petrovac",
                "Plav",
                "Pljevlja",
                "Plužine",
                "Podgorica",
                "Rožaje",
                "Tivat",
                "Tuzi",
                "Ulcinj",
                "Šavnik",
                "Žabljak"};



        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {



                switch(position) {
                    case 1:
                        place = "Andrijevica";
                        break;

                    case 2:
                        place = "Bar";
                        break;
                    case 3:
                        place = "Berane";
                        break;
                    case 4:
                        place = "Bijelo Polje";
                        break;
                    case 5:
                        place = "Budva";
                        break;
                    case 6:
                        place = "Cetinje";
                        break;
                    case 7:
                        place = "Danilovgrad";
                        break;
                    case 8:
                        place = "Golubovci";
                        break;
                    case 9:
                        place = "Herceg Novi";
                        break;
                    case 10:
                        place = "Kolašin";
                        break;
                    case 11:
                        place = "Kotor";
                        break;
                    case 12:
                        place = "Mojkovac";
                        break;
                    case 13:
                        place = "Nikšić";
                        break;
                    case 14:
                        place = "Petrovac";
                        break;
                    case 15:
                        place = "Plav";
                        break;
                    case 16:
                        place = "Pljevlja";
                        break;
                    case 17:
                        place = "Plužine";
                        break;
                    case 18:
                        place = "Podgorica";
                        break;
                    case 19:
                        place = "Rožaje";
                        break;
                    case 20:
                        place = "Tivat";
                        break;
                    case 21:
                        place = "Tuzi";
                        break;
                    case 22:
                        place = "Ulcinj";
                        break;
                    case 23:
                        place = "Šavnik";
                        break;
                    case 24:
                        place = "Žabljak";
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });







        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);




    }


    private void spinner_data() {

        AppCompatSpinner spinner = findViewById(R.id.spinner2);
        spinner_models = new ArrayList<>();



        //auto oglasi
        spinner_models.add(new subsection_spinner(true,"Auto oglasi",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Vozila prodaja",R.drawable.ic_round_directions_car_24));
        spinner_models.add(new subsection_spinner(false,"Auto djelovi prodaja",R.drawable.ic_round_directions_car_24));
        spinner_models.add(new subsection_spinner(false,"Teretna vozila",R.drawable.ic_round_directions_car_24));
        spinner_models.add(new subsection_spinner(false,"Motori i bicikli",R.drawable.ic_round_directions_car_24));
        spinner_models.add(new subsection_spinner(false,"Autobusi i prikolice",R.drawable.ic_round_directions_car_24));
        spinner_models.add(new subsection_spinner(false,"Potražnja/Kompenzacija",R.drawable.ic_round_directions_car_24));

        //posao oglasi
        spinner_models.add(new subsection_spinner(true,"Posao oglasi",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Poslovi",R.drawable.work));
        spinner_models.add(new subsection_spinner(false,"Rezime",R.drawable.work));

        //nekretnine oglasi
        spinner_models.add(new subsection_spinner(true,"Nekretnine oglasi",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Stanovi i sobe izdavanje",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Stanovi prodaja",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Potražnja/Kompenzacija",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Odmori i putovanja",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Kuće prodaja",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Placevi prodaja",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Poslovni prostori izdavanje",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Poslovni prostori prodaja",R.drawable.real_estate));
        spinner_models.add(new subsection_spinner(false,"Vikendici prodaja",R.drawable.real_estate));

        //Uslužne djelatnosti
        spinner_models.add(new subsection_spinner(true,"Uslužne djelatnosti",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Obrazovanje i nastava",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Kućni servis",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Pomoć u kući",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Stolarske usluge",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Transportne usluge",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Auto servis",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Računar pomoć",R.drawable.usluzne_delatnosti));
        spinner_models.add(new subsection_spinner(false,"Finansija i računovodstvo",R.drawable.usluzne_delatnosti));


        //Aparati i elektronika
        spinner_models.add(new subsection_spinner(true,"Aparati i elektronika",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Mobilni telefoni i oprema",R.drawable.appliances));
        spinner_models.add(new subsection_spinner(false,"Uredaji za domaćinstvo",R.drawable.appliances));
        spinner_models.add(new subsection_spinner(false,"Računari i oprema",R.drawable.appliances));
        spinner_models.add(new subsection_spinner(false,"Audio, TV, Video i CD",R.drawable.appliances));
        spinner_models.add(new subsection_spinner(false,"Foto i optika",R.drawable.appliances));
        spinner_models.add(new subsection_spinner(false,"Climato",R.drawable.appliances));


        //Zdravlje sport i hobi
        spinner_models.add(new subsection_spinner(true,"Zdravlje sport i hobi",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Lov i ribolov",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Kućni ljubimci",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Zdravstvo",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Literatura",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Sportska i kamp oprema",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Njega lica i tijela",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Hobi, akvaristika, antikviteti",R.drawable.ic_round_directions_bike_24));
        spinner_models.add(new subsection_spinner(false,"Muzički instrumenti i oprema",R.drawable.ic_round_directions_bike_24));

        //Odjeca i obuća
        spinner_models.add(new subsection_spinner(true,"Odjeca i obuća",R.drawable.transparent));
        spinner_models.add(new subsection_spinner(false,"Odjeca",R.drawable.ic_round_accessibility_new_24));
        spinner_models.add(new subsection_spinner(false,"Obuća",R.drawable.ic_round_accessibility_new_24));
        spinner_models.add(new subsection_spinner(false,"Vjenčanice",R.drawable.ic_round_accessibility_new_24));






        ArrayAdapter<subsection_spinner> spinnerAdapter = new ArrayAdapter<subsection_spinner>(this, android.R.layout.simple_spinner_dropdown_item, spinner_models) {

            @Override
            public boolean isEnabled(int position) {
                return !spinner_models.get(position).isHeader();
            }

            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View v = convertView;

                if (v == null) {
                    Context mContext = this.getContext();
                    LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = vi.inflate(R.layout.row2, null);
                }

                TextView tvName = v.findViewById(R.id.tvName);
                ImageView ivDrink = v.findViewById(R.id.ivDrink);
                subsection_spinner model = spinner_models.get(position);
                tvName.setText(model.getName());
                ivDrink.setImageDrawable(ContextCompat.getDrawable(getContext(), model.getDrawable()));


                return v;
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View v = convertView;

                if (v == null) {
                    Context mContext = this.getContext();
                    LayoutInflater vi = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = vi.inflate(R.layout.row, null);
                }

                TextView tvName = v.findViewById(R.id.tvName);
                TextView tvDescription = v.findViewById(R.id.tvDescription);
                TextView tvPrice = v.findViewById(R.id.tvPrice);
                ImageView ivDrink = v.findViewById(R.id.ivDrink);
                subsection_spinner model = spinner_models.get(position);
                tvName.setText(model.getName());
             //   tvDescription.setText(model.getDescription());
            //    tvPrice.setText(model.getPrice() + " €");
                if (model.getDrawable() > 0) {
                    ivDrink.setImageDrawable(ContextCompat.getDrawable(getContext(), model.getDrawable()));
                }


                if (model.isHeader()) {
                    ivDrink.setVisibility(View.GONE);
                    // tvDescription.setVisibility(View.GONE);
                    // tvPrice.setVisibility(View.GONE);

                }

                else {
                    ivDrink.setVisibility(View.VISIBLE);
                    // tvDescription.setVisibility(View.VISIBLE);
                    // tvPrice.setVisibility(View.VISIBLE);

                }





                return v;
            }
        };




        spinner.setAdapter(spinnerAdapter);
        spinner.setSelection(1);//Header should not be selected



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {


                switch(position){
                    case 1:
                        subsection = "Vozila_prodaja";
                        break;

                    case 2:
                        subsection = "Auto_djelovi_prodaja";
                        break;
                    case 3:
                        subsection = "Teretna_vozila";
                        break;
                    case 4:
                        subsection = "Motori_i_bicikli";
                        break;
                    case 5:
                        subsection = "Autobusi_i_prikolice";
                        break;
                    case 6:
                        subsection = "Potražnja_Kompenzacija";
                        break;
                    case 8:
                        subsection = "Poslovi";
                        break;
                    case 9:
                        subsection = "Rezime";
                        break;
                    case 11:
                        subsection = "Stanovi_sobe_izdavanje";
                        break;
                    case 12:
                        subsection = "Stanovi_prodaja";
                        break;
                    case 13:
                        subsection = "Potražnja_Kompenzaci";
                        break;
                    case 14:
                        subsection = "Odmori_i_putovanja";
                        break;
                    case 15:
                        subsection = "Kuće_prodaja";
                        break;
                    case 16:
                        subsection = "Placevi_prodaja";
                        break;
                    case 17:
                        subsection = "Poslovni_prostori_izdavanje";
                        break;
                    case 18:
                        subsection = "Poslovni_prostori_prodaja";
                        break;
                    case 19:
                        subsection = "Vikendici_prodaja";
                        break;
                    case 21:
                        subsection = "Obrazovanje_i_nastava";
                        break;
                    case 22:
                        subsection = "Kucni_servis";
                        break;
                    case 23:
                        subsection = "Pomoc_u_kuci";
                        break;
                    case 24:
                        subsection = "Stolarske_usluge";
                        break;
                    case 25:
                        subsection = "Transportne_usluge";
                        break;
                    case 26:
                        subsection = "Auto_servis";
                        break;
                    case 27:
                        subsection = "Racunar_pomoc";
                        break;
                    case 28:
                        subsection = "Finansija_i_racunovodstvo";
                        break;
                    case 30:
                        subsection = "Mobilni_telefoni_i_oprema";
                        break;
                    case 31:
                        subsection = "Uredaji_za_domaćinstvo";
                        break;
                    case 32:
                        subsection = "Računari_i_oprema";
                        break;
                    case 33:
                        subsection = "Audio_TV_Video_CD";
                        break;
                    case 34:
                        subsection = "Foto_i_optika";
                        break;
                    case 35:
                        subsection = "Climato";
                        break;
                    case 37:
                        subsection = "Lov_i_ribolov";
                        break;
                    case 38:
                        subsection = "Kucni_ljubimci";
                        break;
                    case 39:
                        subsection = "Zdravstvo";
                        break;
                    case 40:
                        subsection = "Literatura";
                        break;
                    case 41:
                        subsection = "Sportska_i_kamp_oprema";
                        break;
                    case 42:
                        subsection = "Njega_lica_i_tijela";
                        break;
                    case 43:
                        subsection = "Hobi_akvaristika_antikviteti";
                        break;
                    case 44:
                        subsection = "Muzicki_instrumenti_i_ioprema";
                        break;
                    case 46:
                        subsection = "Odjeca";
                        break;
                    case 47:
                        subsection = "Obuca";
                        break;
                    case 48:
                        subsection = "Vjencanice";
                        break;










                }




            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });



    }


}