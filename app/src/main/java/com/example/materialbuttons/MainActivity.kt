package com.example.materialbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.materialbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Навешиваем на первый тоггл груп слушатель нажатий
        binding?.toggleButton?.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->

            if (isChecked) {
                when(checkedId) {

                    // При нажатии на кнопку тогла записываем...
                    R.id.button1 -> binding?.result?.text = getString(R.string.home)
                    R.id.button2 -> binding?.result?.text = getString(R.string.shop)
                    R.id.button3 -> binding?.result?.text = getString(R.string.reception)

                }
            }
        }
    }
}