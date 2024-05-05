package com.example.whatsappclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    ArrayList<ContactModel> arrContact;
    Context context;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContact){
        this.context=context;
        this.arrContact=arrContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.item_design, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactModel contactModel= arrContact.get(position);
        holder.image.setImageResource(contactModel.getImg());
        holder.text_name.setText(contactModel.getName());
        holder.text_time.setText(contactModel.getTime());
        holder.text_country.setText(contactModel.getCountry());
        holder.call_icon.setImageResource(contactModel.getLogo());

    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView text_name,text_time,text_country;
        AppCompatImageView image,call_icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_name=itemView.findViewById(R.id.textview_name);
            text_time=itemView.findViewById(R.id.textview_time);
            text_country=itemView.findViewById(R.id.textview_country);
            image=itemView.findViewById(R.id.image);
            call_icon=itemView.findViewById(R.id.call_icon);


        }
    }
}
