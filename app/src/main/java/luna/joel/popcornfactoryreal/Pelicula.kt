package luna.joel.popcornfactoryreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.Image
import java.util.ArrayList

data class Pelicula(var titulo: String, var image: Int, var header: Int, var sinopsis: String, var seats: ArrayList<Cliente>)


