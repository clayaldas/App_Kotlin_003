package fisei.uta.ec.app_kotlin_003

data class MovieDbResult(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)