package com.pfariasmunoz.cvbook.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

class OwnTextView(context: Context, attrs: AttributeSet) : TextView(context, attrs) {

    lateinit var backgroundPaint : Paint

    init {
        backgroundPaint = Paint().apply {
            color = 0xffff0000.toInt()
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawRect(0f, 0f, width.toFloat(), height.toFloat(), backgroundPaint)
        super.onDraw(canvas)
    }
}