package com.example.arcdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_custom_thumb.*
import kotlinx.android.synthetic.main.fragment_custom_thumb.view.*

class FragmentCustomThumb : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_custom_thumb, container, false)
        view.progress.progressChangedCallback = {
            progressText.text = String.format("%.2f", it)
        }
        return view
    }
}