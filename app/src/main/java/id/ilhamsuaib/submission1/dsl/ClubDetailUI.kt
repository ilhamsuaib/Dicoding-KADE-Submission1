package id.ilhamsuaib.submission1.dsl

import android.view.Gravity
import android.view.View
import id.ilhamsuaib.submission1.ClubDetailActivity
import id.ilhamsuaib.submission1.R
import org.jetbrains.anko.*

/**
 * Created by @ilhamsuaib on 03/10/18.
 * github.com/ilhamsuaib
 */

class ClubDetailUI : AnkoComponent<ClubDetailActivity> {
    override fun createView(ui: AnkoContext<ClubDetailActivity>): View = with(ui) {
        scrollView {
            relativeLayout {
                padding = dip(16)

                val imgClub = imageView {
                    id = R.id.imgClub
                }.lparams {
                    width = dip(80)
                    height = dip(80)
                    centerHorizontally()
                    bottomMargin = dip(8)
                }

                val tvClubName = textView {
                    id = R.id.tvClubName
                    textSize = 16f
                }.lparams {
                    below(imgClub)
                    centerHorizontally()
                    bottomMargin = dip(16)
                }

                textView {
                    id = R.id.tvClubDescription
                }.lparams {
                    below(tvClubName)
                    width = matchParent
                    height = wrapContent
                }
            }
        }
    }
}