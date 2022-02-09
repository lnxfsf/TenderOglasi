package tenderoglasi.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class posts extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager  layoutManager;

    FirebaseDatabase database;
    DatabaseReference post_list;

    String menuId="";




    FirebaseRecyclerAdapter<posts_model,postviewholder> adapter;

    public Toolbar mTopToolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        mTopToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mTopToolbar);

        //Firebase
        database = FirebaseDatabase.getInstance();
        post_list = database.getReference("Posts");


        recyclerView = (RecyclerView)findViewById(R.id.posts_recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);

        recyclerView.setLayoutManager(layoutManager);



        if(getIntent() != null){

            menuId = getIntent().getStringExtra("menuId");




        }
        if (!menuId.isEmpty() && menuId != null){

            loadlistofposts(menuId);

        }



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
            Intent add_post = new Intent(posts.this, add_posts.class);
            startActivity(add_post);
        }
        if (id == R.id.action_search) {
            Intent search = new Intent(posts.this, search.class);
            startActivity(search);
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadlistofposts(String menuId) {



        adapter = new FirebaseRecyclerAdapter<posts_model, postviewholder>(posts_model.class,
                R.layout.post_item,
                postviewholder.class,
                post_list.orderByChild("menuId").equalTo(menuId)
                ) {
            @Override
            protected void populateViewHolder(postviewholder viewHolder, posts_model model, int position) {

                viewHolder.description.setText(model.getDescription());
                viewHolder.place.setText(model.getPlace());
                viewHolder.price.setText(model.getPrice());
                viewHolder.phone.setText(model.getPhone());
                viewHolder.date_created.setText(model.getDate_created());




            }


        };

        recyclerView.setAdapter(adapter);


    }


}