package id.ilhamsuaib.submission1.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by @ilhamsuaib on 21/09/18.
 * github.com/ilhamsuaib
 */

@Parcelize
data class Club(val clubName: String,
                val image: Int,
                val description: String): Parcelable