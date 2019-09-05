package com.whitestudios.stepper.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.whitestudios.stepper.R
import com.whitestudios.stepper.fragments.base.BaseFragment

class HomeFragment: BaseFragment() {
    override val layout: Int
        get() = R.layout.home_fragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}