package com.example.android.layoutplayground.fragments

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.layoutplayground.databinding.ConstraintFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class ConstraintFragment: AppCompatActivity() {

    private lateinit var binding: ConstraintFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConstraintFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.faerbenConstraintButton.setOnClickListener {
            binding.farbflaecheConstraintTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterConstraintButton.setOnClickListener {
            val i = Intent(this, HorizontalFragment::class.java)
            startActivity(i)
        }
    }
}