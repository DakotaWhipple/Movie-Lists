package io.dakotawhipple.movielists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.dakotawhipple.movielists.media.MovieInfo
import io.dakotawhipple.movielists.ui.theme.MovieListsTheme
import com.google.accompanist.coil.CoilImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieListsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    PosterImage()//Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MovieListsTheme {
        Greeting("Android")
    }
}

@Composable
fun PosterImage(movie: MovieInfo? = null) {
    Surface {
        CoilImage(
            data = "https://www.themoviedb.org/t/p/original/7lyBcpYB0Qt8gYhXYaEZUNlNQAv.jpg",
            contentDescription = "movie poster",
            modifier = Modifier.fillMaxSize()
        )
    }
}