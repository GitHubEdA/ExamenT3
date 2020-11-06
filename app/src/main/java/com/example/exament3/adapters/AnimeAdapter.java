package com.example.exament3.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.exament3.MainActivity;
import com.example.exament3.R;
import com.example.exament3.personaje.PersonajeAnime;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ContactViewHolder>{

    private ArrayList<PersonajeAnime> listaPersonajes;
    private Context context;
    private RatingBar ratingBar;
    private TextView nombre;
    private TextView descripcion;
    private ImageView imagen;
    private TextView textView;
    private String imagenURL;
    private Button buttonP;

    public AnimeAdapter(ArrayList<PersonajeAnime> listaPersonajes, Context context) {
        this.listaPersonajes = listaPersonajes;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anime, parent, false);
        ContactViewHolder vh = new ContactViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        nombre = holder.itemView.findViewById(R.id.idNmbre);
        descripcion = holder.itemView.findViewById(R.id.idDescripcion);
        imagen = holder.itemView.findViewById(R.id.idImagen);
        textView = holder.itemView.findViewById(R.id.idFavorito);
        ratingBar = holder.itemView.findViewById(R.id.idStar);
        buttonP = holder.itemView.findViewById(R.id.idPuntuacion);

        nombre.setText(listaPersonajes.get(position).getNombre());
        descripcion.setText(listaPersonajes.get(position).getInformacion());
        imagenURL = listaPersonajes.get(position).getFoto();

        Glide.with(context).load(imagenURL).into(imagen);
        favorito();
    }

    private void favorito() {
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ratingBar.getRating() > 0){
                    textView.setText("  Fav");
                } else {
                    textView.setText("  No Fav");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
