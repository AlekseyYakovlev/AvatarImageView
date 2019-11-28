package ru.spb.yakovlev.avatarimageview.ui.custom

import android.content.Context

fun Context.dpToPx(dp: Int): Float =
    dp.toFloat() * this.resources.displayMetrics.density