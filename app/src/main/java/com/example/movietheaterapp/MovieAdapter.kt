package com.example.movietheaterapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context, private val movie: Array<Movie>, val listener: (Movie) -> Unit)
    :RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val image = view.findViewById<ImageView>(R.id.img_item_photo)
        val title = view.findViewById<TextView>(R.id.tv_item_name)
        val detail = view.findViewById<TextView>(R.id.tv_item_desc)
        val photo = view.findViewById<ImageView>(R.id.img_cast_photo)
        val name = view.findViewById<TextView>(R.id.tv_cast_name)

        fun bindView(movie: Movie, listener: (Movie) -> Unit){
            image.setImageResource(movie.image)
            title.text = movie.title
            detail.text = movie.detail
            photo.setImageResource(movie.photo)
            name.text = movie.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_row_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindView(movie[position], listener)
    }

    override fun getItemCount(): Int = movie.size
}