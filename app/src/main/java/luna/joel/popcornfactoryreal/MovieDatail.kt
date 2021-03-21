package luna.joel.popcornfactoryreal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_datail.*;

class MovieDatail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_datail)

        val bundle = intent.extras
        var ns = 0
        var id = -1
        var title = ""

        if (bundle != null){

            var ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")!!
            movie_header.setImageResource(bundle.getInt("Header"))
            movie_title_detail.setText(bundle.getString("titulo"))
            movie_summary.setText(bundle.getString("Sinopsis"))
            seatsLeft.setText("$ns seats available")
            id = bundle.getInt("pos")

        }

        if(ns==0){
            buy_ticket.isEnabled = false
        }else{
            buy_ticket.setOnClickListener {
                val Intent: Intent = Intent(this, SeatSelection::class.java)

                intent.putExtra("movie",id)
                intent.putExtra("name",title)

                this.startActivity(intent)

            }
        }

    }
}

