package com.linkdev.circleprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener { onSubmitClick() }

    }

    private fun onSubmitClick() {
        progress_circular.setProgress(edtProgress.text.toString().toFloat())
    }
}
