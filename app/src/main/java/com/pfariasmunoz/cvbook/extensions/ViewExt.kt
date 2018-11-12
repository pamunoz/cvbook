package com.pfariasmunoz.cvbook.extensions

import android.view.View

fun View.dpToPixels(dp: Int) = (dp * resources.displayMetrics.density + 0.5).toInt()

fun View.pixelsToDp(pixels: Int) = (pixels / resources.displayMetrics.density + 0.5).toInt()