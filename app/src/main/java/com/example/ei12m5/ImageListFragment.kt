package com.example.ei12m5

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ei12m5.adapter.ImageAdapter

class ImageListFragment : Fragment(R.layout.fragment_image_list) {

    private lateinit var recyclerView: RecyclerView
    private lateinit var imageAdapter: ImageAdapter
    private val items = returnItemList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        imageAdapter = ImageAdapter(items) { item ->

            val action = ImageListFragmentDirections.actionImageListFragmentToImageDetailFragment(
                item.name,
                item.imageUrl
            )


            findNavController().navigate(action)
        }

        recyclerView.adapter = imageAdapter
    }

    private fun returnItemList(): List<Item> {
        return listOf(
            Item("Zhuo Chengyou", "https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640"),
            Item("billow926", "https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640"),
            Item("Philipp Deiß", "https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640"),
            Item("Huper by Joshua Earle", "https://unsplash.com/photos/_p8gVNNsWw4/download?force=true&w=640"),
            Item("Melnychuk Nataliya", "https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640"),
            Item("Teagan Maddux", "https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640"),
            Item("Chen Liu", "https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640"),
            Item("John Fornander", "https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640"),
            Item("Parker Coffman", "https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640"),
            Item("XPS", "https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640"),
            Item("Daniel J. Schwarz", "https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640"),
            Item("Wesley Armstrong", "https://unsplash.com/photos/q0wqYpyWDpc/download?force=true&w=640")
        )
    }
}
