package com.whitestudios.stepper.components.navigation

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.whitestudios.stepper.R
import kotlinx.android.synthetic.main.navigation.view.*

class Navigation: LinearLayout {

    private val incomplete = ContextCompat.getColor(context, R.color.gray_500)
    private val completed = ContextCompat.getColor(context, R.color.indigo_A400)

    constructor(context: Context): super(context) {
        inflate(context, R.layout.navigation, this)
        setupUI()
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        inflate(context, R.layout.navigation, this)
        setupAttrs(context, attrs)
        setupUI()
    }

    fun setupAttrs(context: Context, attrs: AttributeSet) {

    }

    fun setupUI() {

    }

    fun backFirstPass() {
        one_pass.setCardBackgroundColor(completed)
        two_pass.setCardBackgroundColor(incomplete)
        one_text.visibility = View.VISIBLE
        check_1.visibility = View.GONE

        separator_one.setBackgroundColor(incomplete)
    }

    fun passOneCompleted(passOneCompleted: Boolean) {
        if(passOneCompleted) {
            one_pass.setCardBackgroundColor(completed)
            separator_one.setBackgroundColor(completed)

            one_text.visibility = View.GONE
            check_1.visibility = View.VISIBLE

            two_pass.setCardBackgroundColor(completed)

        }else {
            one_pass.setCardBackgroundColor(completed)
            separator_one.setBackgroundColor(incomplete)

            one_text.visibility = View.VISIBLE
            check_1.visibility = View.GONE
        }
    }

    fun passTwoCompleted(passTwoCompleted: Boolean) {
        if(passTwoCompleted) {
            two_pass.setCardBackgroundColor(completed)
            separator_two.setBackgroundColor(completed)

            two_text.visibility = View.GONE
            check_2.visibility = View.VISIBLE

            three_pass.setCardBackgroundColor(completed)

        }else {
            two_pass.setCardBackgroundColor(completed)
            separator_two.setBackgroundColor(incomplete)

            two_text.visibility = View.VISIBLE
            check_2.visibility = View.GONE
        }
    }

    fun backSecondPass() {
        two_pass.setCardBackgroundColor(completed)
        three_pass.setCardBackgroundColor(incomplete)
        two_text.visibility = View.VISIBLE
        check_2.visibility = View.GONE

        three_text.visibility = View.VISIBLE
        check_3.visibility = View.GONE

        separator_two.setBackgroundColor(incomplete)
    }

    fun passThreeCompleted(passThreeCompleted: Boolean) {

        if(passThreeCompleted) {
            three_pass.setCardBackgroundColor(completed)

            three_text.visibility = View.GONE
            check_3.visibility = View.VISIBLE

        }else {
            three_pass.setCardBackgroundColor(completed)

            three_text.visibility = View.VISIBLE
            check_3.visibility = View.GONE
        }
    }
}