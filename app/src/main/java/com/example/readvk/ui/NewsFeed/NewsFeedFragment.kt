package com.example.readvk.ui.NewsFeed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.readvk.R

class NewsFeedFragment : Fragment() {

    private lateinit var newsFeedModel: NewsFeedModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        newsFeedModel =
                ViewModelProvider(this).get(NewsFeedModel::class.java)
        val root = inflater.inflate(R.layout.fragment_news_feed, container, false)
        val textView: TextView = root.findViewById(R.id.text_news_feed)
        newsFeedModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}