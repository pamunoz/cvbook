package com.pfariasmunoz.cvbook.customview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.TextView

class OwnTextView(context: Context, attrs: AttributeSet) : TextView(context, attrs) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}