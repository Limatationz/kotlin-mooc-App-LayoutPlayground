package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.layoutplayground.databinding.ConstraintFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class ConstraintFragment: Fragment() {

    private lateinit var binding: ConstraintFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = ConstraintFragmentBinding.inflate(layoutInflater, container, false)

        binding.faerbenConstraintButton.setOnClickListener {
            binding.farbflaecheConstraintTextView.setBackgroundResource(getRandomColor())
        }

        binding.weiterConstraintButton.setOnClickListener {
            //val i = Intent(this, HorizontalFragment::class.java)
            //startActivity(i)
        }

        return binding.root
    }
}