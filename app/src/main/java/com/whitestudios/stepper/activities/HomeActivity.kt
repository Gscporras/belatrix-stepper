package com.whitestudios.stepper.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.whitestudios.stepper.R
import com.whitestudios.stepper.components.stepper.Stepper
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    private val context: Context = this@HomeActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        stepper.listener = object : Stepper.Listener {
            override fun onBackFirstPass(view: View) {
                navigation.backFirstPass()
            }

            override fun onOneCompleted(view: View) {
                navigation.passOneCompleted(true)
            }

            override fun onTwoCompleted(view: View) {
                navigation.passTwoCompleted(true)
            }

            override fun onBackSecondPass(view: View) {
                navigation.backSecondPass()
            }

            override fun onThreeCompleted(view: View) {
                navigation.passThreeCompleted(true)
            }
        }
    }
}
