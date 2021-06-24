package com.example.android.layoutplayground.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.layoutplayground.databinding.VerticalFragmentBinding
import com.example.android.layoutplayground.getRandomColor

class VerticalFragment: Fragment() {

    private lateinit var binding: VerticalFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        super.onCreate(savedInstanceState)
        binding = VerticalFragmentBinding.inflate(layoutInflater, container, false)

        var color = VerticalFragmentArgs.fromBundle(arguments!!).color
        if(color != -1)
            binding.farbflaecheVerticalTextView.setBackgroundResource(color)

        binding.faerbenVerticalButton.setOnClickListener {
            color = getRandomColor()
            binding.farbflaecheVerticalTextView.setBackgroundResource(color)
        }

        binding.weiterVerticalButton.setOnClickListener {
            findNavController().navigate(VerticalFragmentDirections.actionVerticalFragmentToConstraintFragment(color))
        }

        return binding.root
    }
}