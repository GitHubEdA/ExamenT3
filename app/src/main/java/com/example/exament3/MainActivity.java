package com.example.exament3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.exament3.adapters.AnimeAdapter;
import com.example.exament3.personaje.PersonajeAnime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<PersonajeAnime> listaPersonajes;
    private RecyclerView recyclerView;
    private ImageView imageView;
    private Context context;
    private RatingBar ratingBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvPersonajes);
        imageView = findViewById(R.id.idImagen);
        ratingBar = findViewById(R.id.idStar);
        textView = findViewById(R.id.idFavorito);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listaPersonajes = new ArrayList<>();
        context = this.getApplicationContext();

        llenarPersonajes();
        recyclerView.setAdapter(new AnimeAdapter(listaPersonajes,context));


    }


    private void llenarPersonajes() {

        listaPersonajes.add(new PersonajeAnime("Gokuu Son","Es el protagonista de la serie animada Dragón Ball Z que nació en el año 1989, una tira con gran difusión entre niños y adolescentes.", "https://st-listas.20minutos.es/images/2015-11/404070/4839437_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Yuno Gasai","Yuno Gasai es la protagonista femenina de Mirai Nikki y la usuaria del Diario del amor.", "https://st-listas.20minutos.es/images/2015-11/404070/4839402_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("L Lawliet","Es un personaje ficticio perteneciente a la serie de manga Death Note, la cual ha sido también adaptada al anime.", "https://st-listas.20minutos.es/images/2015-11/404070/4839393_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Naruto Uzumaki","Es una serie de manga escrita e ilustrada por Masashi Kishimoto. Salió el 18 de agosto de 2005 en Japón", "https://st-listas.20minutos.es/images/2015-11/404070/4839400_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Mikasa Ackerman","Es una de los personajes de la serie anime Shingeki no Kyojin, es la hermana adoptiva de Eren y amiga de la infancia mutua de Armin.", "https://st-listas.20minutos.es/images/2015-11/404070/4839426_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Lucy","Es el personaje principal, protagonista y anti-héroe de la serie Elfen Lied. La llamada Reina Diclonius, Kaede.", "https://st-listas.20minutos.es/images/2015-11/404070/4839431_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Kakashi Hatake","Es un ninja de la aldea oculta de Konoha, y es el líder del Equipo 7, que está compuesto por Naruto Uzumaki, Sasuke Uchiha y Sakura Haruno.", "https://st-listas.20minutos.es/images/2015-11/404070/4839420_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Levi Ackerman","Levi es una antigua prostituta de la Ciudad Subterránea que optó por ese trabajo luego de las seguidas persecuciones de la familia Ackerman.", "https://st-listas.20minutos.es/images/2015-11/404070/4839409_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Ken Kaneki","Ken Kaneki es el protagonista de la serie Tokyo Ghoul. Anteriormente era un estudiante de literatura japonesa en la Universidad Kamii.", "https://st-listas.20minutos.es/images/2015-11/404070/4839433_640px.jpg?1447357037"));
        listaPersonajes.add(new PersonajeAnime("Itachi Uchiha","Itachi al principio demuestra ser un ninja muy frío y serio pero con un gran don en el manejo del Ninjutsu, Genjutsu y Mangekyou Sharingan. ", "https://st-listas.20minutos.es/images/2015-11/404070/4839412_640px.jpg?1447357037"));

    }

}