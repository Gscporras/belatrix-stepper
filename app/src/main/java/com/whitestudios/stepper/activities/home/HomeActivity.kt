package com.whitestudios.stepper.activities.home

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.whitestudios.stepper.R
import com.whitestudios.stepper.components.stepper.Stepper
import com.whitestudios.stepper.components.stepper.adapter.StepperAdapter
import com.whitestudios.stepper.components.stepper.fragments.FirstFragment
import com.whitestudios.stepper.components.stepper.fragments.SecondFragment
import com.whitestudios.stepper.components.stepper.fragments.ThirdFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private val context: Context = this@HomeActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
