package fisei.uta.ec.app_kotlin_003

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter (private val movies: List<Movie>) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    // override fun getItemCount() = movies.size

    class ViewHolder (view: View) : RecyclerView.ViewHolder (view)
}

