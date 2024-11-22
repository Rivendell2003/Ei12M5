package com.example.ei12m5

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

import com.bumptech.glide.Glide

class ImageDetailFragment : Fragment(R.layout.fragment_image_detail) {

    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView = view.findViewById(R.id.image_view_detail)
        textView = view.findViewById(R.id.text_view_detail)

        val args = ImageDetailFragmentArgs.fromBundle(requireArguments())

        Glide.with(this)
            .load(args.imageUrl)
            .into(imageView)

        textView.text = args.name
    }
}
