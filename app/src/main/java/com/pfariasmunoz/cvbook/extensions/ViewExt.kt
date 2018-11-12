package com.pfariasmunoz.cvbook.extensions

import android.view.View

fun View.dpToPixels(dp: Int) = (dp * resources.displayMetrics.density + 0.5).toInt()

fun View.pixelsToDp(pixels: Int) = (pixels / resources.displayMetrics.density + 0.5).toInt()

fun View.getMeasurementSize(measureSpec: Int, defaultSize: Int): Int {
    val mode: Int = View.MeasureSpec.getMode(measureSpec)
    val size: Int = View.MeasureSpec.getSize(measureSpec)
    return when(mode) {
        View.MeasureSpec.EXACTLY -> size
        View.MeasureSpec.AT_MOST -> Math.min(defaultSize, size)
        View.MeasureSpec.UNSPECIFIED -> defaultSize
        else -> defaultSize
    }
}