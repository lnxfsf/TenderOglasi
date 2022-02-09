package tenderoglasi.me;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import tenderoglasi.me.R;

public class postviewholder extends RecyclerView.ViewHolder  {

    public TextView description, place, price, phone, date_created;



    public postviewholder(@NonNull View itemView) {
        super(itemView);

        description = (TextView)itemView.findViewById(R.id.description);
        place = (TextView)itemView.findViewById(R.id.place);
        price = (TextView)itemView.findViewById(R.id.price);
        phone = (TextView)itemView.findViewById(R.id.phone);
        date_created = (TextView)itemView.findViewById(R.id.date_created);


    }




}
