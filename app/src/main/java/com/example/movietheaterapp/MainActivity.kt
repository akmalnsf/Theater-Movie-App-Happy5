package com.example.movietheaterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = arrayOf<Movie>(
            Movie(
                R.drawable.high_low,
                "High & Low: The Worst X",
                "High and Low The Worst X Cross is a sequel to High and Low The Worst which was released in 2019. This film still tells the story of Oya High School which is full of competition to become the strongest. Oya High School or Oya Koukou which is still in the SWORD area is fighting against Senomon Technical High School.",
                R.drawable.kawamura_kazuma,
                "Kawamura Kazuma (KK)"
            ),
            Movie(
                R.drawable.one_piece,
                "One Piece Film: Red",
                "For the first time, Uta - the most beloved singer will reveal himself to the world at his live concert. The voice the whole world had been waiting for was about to resound.",
                R.drawable.mayumi_tanaka,
                "Mayumi Tanaka (MT)"
            ),
            Movie(
                R.drawable.contorted,
                "Contorted",
                "The intention of a family moving to a quiet and comfortable place is not as easy as imagined. Their new home turns out to have a dark and dangerous mystery.The family's nightmare is getting worse because they can't tell the difference between dream and reality.",
                R.drawable.seo_young_hee,
                "Seo Young Hee (SYH)"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_movies)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MovieAdapter(this, movieList){

        }

    }
}


