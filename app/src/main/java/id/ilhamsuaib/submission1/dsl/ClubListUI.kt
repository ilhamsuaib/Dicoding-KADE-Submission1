package id.ilhamsuaib.submission1.dsl

import android.support.v7.widget.LinearLayoutManager
import id.ilhamsuaib.submission1.ClubAdapter
import id.ilhamsuaib.submission1.ClubListActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.relativeLayout

/**
 * Created by @ilhamsuaib on 21/09/18.
 * github.com/ilhamsuaib
 */

class ClubListUI(private val clubAdapter: ClubAdapter) : AnkoComponent<ClubListActivity> {

    override fun createView(ui: AnkoContext<ClubListActivity>) = with(ui) {
        relativeLayout {
            recyclerView {
                layoutManager = LinearLayoutManager(context)
                adapter = clubAdapter
            }.lparams {
                width = matchParent
                height = matchParent
            }
        }
    }
}