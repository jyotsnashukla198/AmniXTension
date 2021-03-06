/*
 * Copyright (c) 2019, AmniX
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *                            http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *  either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.amnix.xtension.extensions

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.inputmethod.InputMethodManager

/**
 * Create a Screnshot of the view and returns it as a Bitmap
 */
fun View.screenshot(): Bitmap {
    val bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bmp)
    draw(canvas)
    canvas.save()
    return bmp
}

/**
 * Set On Single Click Listener,
 * It will allow user to click on the button after the specified tolerance. So no multiClick Or FastClick From Now
 *
 * @property tolerance the Millis to Skip the User Click
 */
fun View.setOnSingleClickListener(tolerance : Long = 500, onClick:(v:View)->Unit){
    var lastClicked = 0L
    setOnClickListener {
        if(currentTimeMillis - lastClicked > tolerance){
            onClick(it)
            lastClicked = currentTimeMillis
        }
    }
}

/**
 * Start The FadeIn Animation on This View
 */
fun View.fadeIn(duration: Int = 400) {
    clearAnimation()
    val alphaAnimation = AlphaAnimation(this.alpha, 1.0f)
    alphaAnimation.duration = duration.toLong()
    startAnimation(alphaAnimation)
}

/**
 * Start the FadeOut Animation on This View
 */
fun View.fadeOut(duration: Int = 400) {
    clearAnimation()
    val alphaAnimation = AlphaAnimation(this.alpha, 0.0f)
    alphaAnimation.duration = duration.toLong()
    startAnimation(alphaAnimation)
}

/**
 * show KeyBoard
 */
fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    this.requestFocus()
    imm.showSoftInput(this, 0)
}

/**
 * hide Keyboard
 */
fun View.hideKeyboard(): Boolean {
    try {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        return inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    } catch (ignored: RuntimeException) { }
    return false
}

/**
 * set View Padding From Left
 */
fun View.setPaddingLeft(value: Int) = setPadding(value, paddingTop, paddingRight, paddingBottom)

/**
 * set View Padding From Right
 */
fun View.setPaddingRight(value: Int) = setPadding(paddingLeft, paddingTop, value, paddingBottom)

/**
 * set View Padding From Top
 */
fun View.setPaddingTop(value: Int) = setPaddingRelative(paddingStart, value, paddingEnd, paddingBottom)

/**
 * set View Padding From Bottom
 */
fun View.setPaddingBottom(value: Int) = setPaddingRelative(paddingStart, paddingTop, paddingEnd, value)

/**
 * set View Padding From Start
 */
fun View.setPaddingStart(value: Int) = setPaddingRelative(value, paddingTop, paddingEnd, paddingBottom)

/**
 * set View Padding From End
 */
fun View.setPaddingEnd(value: Int) = setPaddingRelative(paddingStart, paddingTop, value, paddingBottom)

/**
 * set View Padding On Horizontal Edges
 */
fun View.setPaddingHorizontal(value: Int) = setPaddingRelative(value, paddingTop, value, paddingBottom)

/**
 * set View Padding From Vertical Edges
 */
fun View.setPaddingVertical(value: Int) = setPaddingRelative(paddingStart, value, paddingEnd, value)

/**
 * set height
 */
fun View.setHeight(value: Int) {
    val lp = layoutParams
    lp?.let {
        lp.height = value
        layoutParams = lp
    }
}

/**
 * set Width
 */
fun View.setWidth(value: Int) {
    val lp = layoutParams
    lp?.let {
        lp.width = value
        layoutParams = lp
    }
}

/**
 * resize the View Width Height
 */
fun View.resize(width: Int, height: Int) {
    val lp = layoutParams
    lp?.let {
        lp.width = width
        lp.height = height
        layoutParams = lp
    }
}

/**
 * check if View is Visible to User Or Not
 */
fun View.isVisible() = visibility == View.VISIBLE

/**
 * Check if View Visiblity == GONE
 */
fun View.isGone() = visibility == View.GONE

/**
 * Check if View is Invisible to User
 */
fun View.isInvisible() = visibility == View.INVISIBLE

/**
 * get Activity On Which View is inflated to
 */
fun View.getActivity(): Activity? {
    if(context is Activity)
        return context as Activity
    return null
}