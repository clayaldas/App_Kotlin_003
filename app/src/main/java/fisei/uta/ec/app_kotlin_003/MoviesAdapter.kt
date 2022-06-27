package fisei.uta.ec.app_kotlin_003

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fisei.uta.ec.app_kotlin_003.databinding.ViewMovieItemBinding

/*
interface MovieClickedListener {

    // movie: para saber sobre que pelicula se presiono (clic)
    fun onMovieClicked(movie: Movie) // (Movie)-> Unit
}
*/

// primera forma: utilizando interfaces
//class MoviesAdapter (private val movies: List<Movie>, private val movieClickedListener: MovieClickedListener) :

// segunda forma: utilizando (lambdas)
class MoviesAdapter (private val movies: List<Movie>, private val movieClickedListener: (Movie) -> Unit) :
    RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

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
        // obtener la pelicula actual donde se presione
        val movie = movies[position]

        // actualizar (enlazar) la fila cual referencia (el titulo y la imagen actual)
        //holder.bind(movies[position])
        holder.loadMovie(movie)

        holder.itemView.setOnClickListener {
            // primera forma: utilizando interfaces
            //movieClickedListener.onMovieClicked(movie)

            // segunda forma: utilizando (lambdas)
            movieClickedListener(movie)
        }

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
       // fun bind (movie: Movie) {
        fun loadMovie (movie: Movie) {
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

