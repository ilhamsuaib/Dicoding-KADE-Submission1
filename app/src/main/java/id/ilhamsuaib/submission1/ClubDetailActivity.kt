package id.ilhamsuaib.submission1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import id.ilhamsuaib.submission1.dsl.ClubDetailUI
import id.ilhamsuaib.submission1.model.Club
import org.jetbrains.anko.find
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.setContentView

/**
 * Created by @ilhamsuaib on 21/09/18.
 * github.com/ilhamsuaib
 */

class ClubDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ClubDetailUI().setContentView(this))
        val club = intent.getParcelableExtra<Club>("club")
        println(club)

        val imgClub = find<ImageView>(R.id.imgClub)
        val tvClubName = find<TextView>(R.id.tvClubName)
        val tvDescription = find<TextView>(R.id.tvClubDescription)

        imgClub.imageResource = club.image
        tvClubName.text = club.clubName
        tvDescription.text = club.description
    }
}