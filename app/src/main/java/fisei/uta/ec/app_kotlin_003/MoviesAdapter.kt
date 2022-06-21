package fisei.uta.ec.app_kotlin_003

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fisei.uta.ec.app_kotlin_003.databinding.ViewMovieItemBinding

class MoviesAdapter (private val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    // primer metodo
    /*al view = LayoutInflater.
                    from(parent.context).
                    inflate(R.layout.view_movie_item, parent, false)

        return ViewHolder(view)*/

        // segundo metodo (usando binding)
        val binding = ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // actualizar (enlazar) la fila cual referencia (el titulo y la imagen actual)
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }
    // override fun getItemCount() = movies.size


    // primer metodo
    //class ViewHolder (view: View) : RecyclerView.ViewHolder (view)

    // segundo metodo (usando binding)
    class ViewHolder (private val binding: ViewMovieItemBinding) : RecyclerView.ViewHolder (binding.root) {

        // recuperar una registro
        fun bind (movie: Movie) {
            // asignar el titulo y la imagen de la pelicula
            binding.textViewTitle.text = movie.title

            //cargar la pelicula del sitio web
            Glide.with(binding.root.context).load(movie.cover).into(binding.imageViewCover)

            /*
            Glide
                .with(binding.root.context)
                .load(movie.cover)
                .into(binding.imageViewCover)
             */

        }

        /*
        fun bind (movie: Movie) : Unit {
            // asignar el titulo y la imagen de la pelicula
        }
         */
    }
}

