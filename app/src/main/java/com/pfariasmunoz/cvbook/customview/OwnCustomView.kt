package com.pfariasmunoz.cvbook.customview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.pfariasmunoz.cvbook.R
import com.pfariasmunoz.cvbook.extensions.TAG
import com.pfariasmunoz.cvbook.extensions.getMeasurementSize

class OwnCustomView(ctx: Context, attrs: AttributeSet) : View(ctx, attrs) {

    companion object {
        private const val DEFAULT_SIZE = 1000

        private const val DEFAULT_FILL_COLOR = Color.RED
    }



    private val backgroundPaint : Paint = Paint()
    var fillColor: Int = DEFAULT_FILL_COLOR

    init {

        // get the parameterised color
        val ta: TypedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.OwnCustomView, 0, 0)
        try {
            fillColor = ta.getColor(R.styleable.OwnCustomView_fillColor, DEFAULT_FILL_COLOR)
        } finally {
            ta.recycle()
        }

        backgroundPaint.apply {
            color = fillColor
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