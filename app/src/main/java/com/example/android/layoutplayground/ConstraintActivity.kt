package com.example.android.layoutplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.ConstraintActivityBinding

class ConstraintActivity: AppCompatActivity() {

    private lateinit var binding: ConstraintActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstraintActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenConstraintButton.setOnClickListener {
            binding.farbflaecheConstraintTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterConstraintButton.setOnClickListener {
            val i = Intent(this, HorizontalActivity::class.java)
            startActivity(i)
        }
    }
}