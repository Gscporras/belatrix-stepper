package com.whitestudios.stepper.components.stepper.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.whitestudios.stepper.fragments.base.fragments.FirstFragment
import com.whitestudios.stepper.fragments.base.fragments.SecondFragment
import com.whitestudios.stepper.fragments.base.fragments.ThirdFragment

class StepperAdapter (
        fm: FragmentManager,
        private val listenerFromFirst: FirstFragment.Listener,
        private val listenerFromSecond: SecondFragment.Listener,
        private val listenerFromThird: ThirdFragment.Listener)
    : FragmentPagerAdapter(fm) {

    private var firstFragment = FirstFragment.newInstance()
    private var secondFragment = SecondFragment.newInstance()
    private var thirdFragment = ThirdFragment.newInstance()

    override fun getItem(position: Int): Fragment {
        return when (position) {
            FIRST_FRAGMENT -> {
                firstFragment.listener = this.listenerFromFirst
                firstFragment
            }
            SECOND_FRAGMENT -> {
                secondFragment.listener = this.listenerFromSecond
                secondFragment
            }
            THIRD_FRAGMENT -> {
                thirdFragment.listener = this.listenerFromThird
                thirdFragment
            }
            else -> {
                firstFragment.listener = this.listenerFromFirst
                firstFragment
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }

    companion object {
        const val FIRST_FRAGMENT = 0
        const val SECOND_FRAGMENT = 1
        const val THIRD_FRAGMENT = 2
    }

}