package id.ilhamsuaib.submission1

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.ilhamsuaib.submission1.dsl.ClubAdapterUI
import id.ilhamsuaib.submission1.model.Club
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find
import org.jetbrains.anko.imageResource

/**
 * Created by @ilhamsuaib on 21/09/18.
 * github.com/ilhamsuaib
 */

class ClubAdapter(private val clubList: MutableList<Club>,
                  private val listener: (club: Club) -> Unit) : RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ClubViewHolder {
        val view = ClubAdapterUI().createView(AnkoContext.create(parent.context, parent))
        return ClubViewHolder(view, listener)
    }

    override fun getItemCount() = clubList.size

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        val item = clubList[holder.adapterPosition]
        holder.bind(item)
    }

    inner class ClubViewHolder(itemView: View, val listener: (club: Club) -> Unit) : RecyclerView.ViewHolder(itemView) {

        fun bind(club: Club) {
            val tvClubName = itemView.find<TextView>(R.id.tvClubName)
            val imgClub = itemView.find<ImageView>(R.id.imgClub)
            tvClubName.text = club.clubName
            Glide.with(imgClub.context)
                    .load(club.image)
                    .into(imgClub)
            itemView.setOnClickListener {
                this@ClubViewHolder.listener(club)
            }
        }
    }
}