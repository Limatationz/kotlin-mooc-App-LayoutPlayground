package com.example.android.layoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.HorizontalActivityBinding

class HorizontalActivity: AppCompatActivity() {

    private lateinit var binding: HorizontalActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HorizontalActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenHorizontalButton.setOnClickListener {
            binding.farbflaecheHorizontalTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterHorizontalButton.setOnClickListener {
            val i = Intent(this, VerticalActivity::class.java)
            startActivity(i)
        }
    }
}