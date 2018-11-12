package com.pfariasmunoz.cvbook.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.pfariasmunoz.cvbook.extensions.TAG
import com.pfariasmunoz.cvbook.extensions.getMeasurementSize

class OwnCustomView(ctx: Context, attrs: AttributeSet) : View(ctx, attrs) {

    val DEFAULT_SIZE = 1000

    private val backgroundPaint : Paint = Paint()

    init {
        backgroundPaint.apply {
            color = 0xffff0000.toInt()
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawRect(0f, 0f, width.toFloat(), height.toFloat(), backgroundPaint)
        super.onDraw(canvas)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = getMeasurementSize(widthMeasureSpec, DEFAULT_SIZE)
        val height = getMeasurementSize(heightMeasureSpec, DEFAULT_SIZE)
        setMeasuredDimension(width, height)
    }


}