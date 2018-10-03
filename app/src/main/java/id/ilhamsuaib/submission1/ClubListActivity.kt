package id.ilhamsuaib.submission1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.ilhamsuaib.submission1.dsl.ClubListUI
import id.ilhamsuaib.submission1.model.Club
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class ClubListActivity : AppCompatActivity() {

    private val data = mutableListOf<Club>()
    private lateinit var adapter: ClubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        adapter = ClubAdapter(data) {
            toast(it.clubName)
            startActivity<ClubDetailActivity>("club" to it)
        }

        setContentView(ClubListUI(adapter).setContentView(this))

        getItem()
    }

    private fun getItem() {
        val clubNames = resources.getStringArray(R.array.club_name)
        val clubImages = resources.obtainTypedArray(R.array.club_image)
        val clubDescription = resources.getStringArray(R.array.club_description)

        clubNames.forEachIndexed { i, clubName ->
            data.add(Club(
                    clubName = clubName,
                    image = clubImages.getResourceId(i, 0),
                    description = clubDescription[i]
            ))
        }

        clubImages.recycle()
        adapter.notifyDataSetChanged()
    }
}
