package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.layoutplayground.databinding.HorizontalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class HorizontalFragment: Fragment() {

    private lateinit var binding: HorizontalFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = HorizontalFragmentBinding.inflate(layoutInflater, container, false)

        var color = -1

        try {
            color = HorizontalFragmentArgs.fromBundle(arguments!!).color
            if (color != -1)
                binding.farbflaecheHorizontalTextView.setBackgroundResource(color)
        }
        catch (e: Exception){}

        binding.faerbenHorizontalButton.setOnClickListener {
            color = getRandomColor()
            binding.farbflaecheHorizontalTextView.setBackgroundResource(color)
        }

        binding.weiterHorizontalButton.setOnClickListener {
            findNavController().navigate(HorizontalFragmentDirections.actionHorizontalFragmentToVerticalFragment(color))
        }

        return binding.root
    }
}