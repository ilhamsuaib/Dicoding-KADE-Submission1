package id.ilhamsuaib.submission1.dsl

import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import id.ilhamsuaib.submission1.R
import org.jetbrains.anko.*

/**
 * Created by @ilhamsuaib on 21/09/18.
 * github.com/ilhamsuaib
 */

class ClubAdapterUI : AnkoComponent<ViewGroup> {

    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            backgroundColor = Color.WHITE
            padding = dip(16)
            isFocusable = true
            gravity = Gravity.CENTER_VERTICAL
            lparams {
                width = matchParent
                height = wrapContent
            }

            imageView {
                id = R.id.imgClub
            }.lparams {
                width = dip(48)
                height = dip(48)
            }

            textView{
                id = R.id.tvClubName
                textSize = 16f
            }.lparams {
                marginStart = dip(16)
            }
        }
    }
}