package com.whitestudios.stepper.components.stepper

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.whitestudios.stepper.components.stepper.adapter.StepperAdapter
import com.whitestudios.stepper.components.stepper.fragments.FirstFragment
import com.whitestudios.stepper.components.stepper.fragments.SecondFragment
import com.whitestudios.stepper.components.stepper.fragments.ThirdFragment

class Stepper : ViewPager,
        FirstFragment.Listener,
        SecondFragment.Listener,
        ThirdFragment.Listener {

    internal var enabled: Boolean = false
    var listener: Listener? = null

    constructor(context: Context): super(context) {
        setupUI()
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        setupAttrs(context, attrs)
        setupUI()
    }

    fun setupAttrs(context: Context, attrs: AttributeSet) {

    }

    fun setupUI() {
        this.enabled = true
        setPagingEnabled(false)

        val adapter = StepperAdapter(
                (context as FragmentActivity).supportFragmentManager,
                this,
                this,
                this
        )
        setAdapter(adapter)
    }

    fun setAdapter(adapter: StepperAdapter) {
        this.adapter = adapter
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return if (this.enabled) {
            super.onTouchEvent(event)
        } else false
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return if (this.enabled) {
            super.onInterceptTouchEvent(event)
        } else false
    }

    fun setPagingEnabled(enabled: Boolean) {
        this.enabled = enabled
    }

    override fun onBackFirstPass(view: View) {
        this.currentItem = 0
        listener?.onBackFirstPass(view)
    }

    override fun onOneCompleted(view: View) {
        this.currentItem = 1
        listener?.onOneCompleted(view)
    }

    override fun onTwoCompleted(view: View) {
        this.currentItem = 2
        listener?.onTwoCompleted(view)
    }

    override fun onBackSecondPass(view: View) {
        this.currentItem = 1
        listener?.onBackSecondPass(view)
    }

    override fun onThreeCompleted(view: View) {
        listener?.onThreeCompleted(view)
    }

    interface Listener {
        fun onBackFirstPass(view: View)
        fun onOneCompleted(view: View)
        fun onTwoCompleted(view: View)
        fun onBackSecondPass(view: View)
        fun onThreeCompleted(view: View)
    }
}