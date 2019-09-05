package com.whitestudios.stepper.fragments.base.fragments

import android.os.Bundle
import android.view.View
import com.whitestudios.stepper.R
import com.whitestudios.stepper.components.button.Button
import com.whitestudios.stepper.fragments.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : BaseFragment() {

    var listener: Listener? = null

    override val layout: Int
        get() = R.layout.fragment_second

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_back_first.setTextAction("Atrás")
        button_back_first.listener = object : Button.Listener {
            override fun onClick(view: View) {
                listener?.onBackFirstPass(view)
            }
        }

        button_second.setTextAction("Siguiente")
        button_second.listener = object : Button.Listener {
            override fun onClick(view: View) {
                listener?.onTwoCompleted(view)
            }
        }
    }

    companion object {
        fun newInstance(): SecondFragment = SecondFragment()
    }

    interface Listener {
        fun onBackFirstPass(view: View)
        fun onTwoCompleted(view: View)
    }
}