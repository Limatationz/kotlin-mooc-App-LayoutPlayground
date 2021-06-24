package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.layoutplayground.databinding.ConstraintFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class ConstraintFragment: Fragment() {

    private lateinit var binding: ConstraintFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = ConstraintFragmentBinding.inflate(layoutInflater, container, false)

        var color = ConstraintFragmentArgs.fromBundle(arguments!!).color
        if(color != -1)
            binding.farbflaecheConstraintTextView.setBackgroundResource(color)

        binding.faerbenConstraintButton.setOnClickListener {
            color = getRandomColor()
            binding.farbflaecheConstraintTextView.setBackgroundResource(color)
        }

        binding.weiterConstraintButton.setOnClickListener {
            findNavController().navigate(ConstraintFragmentDirections.actionConstraintFragmentToHorizontalFragment(color))
        }

        return binding.root
    }
}