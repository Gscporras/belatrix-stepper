package com.whitestudios.stepper.fragments.base.fragments

import android.os.Bundle
import android.view.View
import com.whitestudios.stepper.R
import com.whitestudios.stepper.components.button.Button
import com.whitestudios.stepper.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : BaseFragment() {

    var listener: Listener? = null

    override val layout: Int
        get() = R.layout.fragment_third

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_back_second.setTextAction("Atrás")
        button_back_second.listener = object : Button.Listener {
            override fun onClick(view: View) {
                listener?.onBackSecondPass(view)
            }
        }

        button_third.setTextAction("Finalizar")
        button_third.listener = object : Button.Listener {
            override fun onClick(view: View) {
                listener?.onThreeCompleted(view)
            }
        }
    }

    companion object {
        fun newInstance(): ThirdFragment = ThirdFragment()
    }

    interface Listener {
        fun onBackSecondPass(view: View)
        fun onThreeCompleted(view: View)
    }
}