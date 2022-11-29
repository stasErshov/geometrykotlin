package com.example.geometrykotlin

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import com.example.geometrykotlin.databinding.ActivitySquareBinding

class SquareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySquareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = Html.fromHtml("<font color = \"black\">" + getString(R.string.app_name))

    }
}