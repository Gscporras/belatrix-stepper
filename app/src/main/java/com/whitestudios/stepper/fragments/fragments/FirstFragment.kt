package com.whitestudios.stepper.fragments.base.fragments

import android.os.Bundle
import android.view.View
import com.whitestudios.stepper.R
import com.whitestudios.stepper.components.button.Button
import com.whitestudios.stepper.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : BaseFragment() {

    var listener: Listener? = null

    override val layout: Int
        get() = R.layout.fragment_first

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_first.setTextAction("Siguiente")
        button_first.listener = object : Button.Listener {
            override fun onClick(view: View) {
                listener?.onOneCompleted(view)
            }
        }
    }

    companion object {
        fun newInstance(): FirstFragment = FirstFragment()
    }

    interface Listener {
        fun onOneCompleted(view: View)
    }
}