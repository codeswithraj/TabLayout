package com.example.tablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.RecyclerViewAdapter
import com.example.recyclerview.setOnClick
import com.example.sample.DataModel
import java.text.FieldPosition


class ChatFragment : Fragment(),setOnClick {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rowView= inflater.inflate(R.layout.fragment_chat, container, false)
        val text =rowView.findViewById<RecyclerView>(R.id.recyclerview)

        val arr= arrayListOf<DataModel>(
            DataModel("Android Traning 😊","This message is deleted","https://happymarathi.com/wp-content/uploads/2021/11/Jokor-2.png"),
            DataModel("Abhimanyu","Abhimanyu: 📽️ Video","https://cdn.statusqueen.com/dpimages/thumbnail/Joker_dp-1662.jpg"),
            DataModel("Nitesh","This message is deleted","https://goodmorningimagesforlover.com/wp-content/uploads/2019/04/joker-photo-with-devil-images.jpg"),
            DataModel("Yogesh","😊😊😊😊😊😊😊","https://photosfile.com/wp-content/uploads/2022/04/Joker-DP-13.jpeg"),
            DataModel("Krishna","This message is deleted","https://images.unsplash.com/photo-1620510625142-b45cbb784397?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8am9rZXIlMjBtYXNrfGVufDB8fDB8fA%3D%3D&w=1000&q=80"),
            DataModel("Priyanshu","Priyanshu: 📃 Document","https://cutedp.in/wp-content/uploads/2022/10/joker_dp-1483.jpg"),
            DataModel("Bobby","This message is deleted","https://cutedp.in/wp-content/uploads/2022/10/Joker_dp-1707.jpg"),
            DataModel("Anurag","This message is deleted","https://www.hindilive2.com/wp-content/uploads/2022/08/20220804_150727-768x1024.jpg"),
            DataModel("Aditya","This message is deleted","https://i0.wp.com/bioinshort.com/wp-content/uploads/2022/10/image-40.png?resize=300%2C300&ssl=1"),
            DataModel("Android Traning 😊","This message is deleted","https://happymarathi.com/wp-content/uploads/2021/11/Jokor-2.png"),
            DataModel("Abhimanyu","Abhimanyu: 📽️ Video","https://cdn.statusqueen.com/dpimages/thumbnail/Joker_dp-1662.jpg"),
            DataModel("Abhi","This message is deleted","https://goodmorningimagesforlover.com/wp-content/uploads/2019/04/joker-photo-with-devil-images.jpg"),
            DataModel("Yogesh","😊😊😊😊😊😊😊","https://photosfile.com/wp-content/uploads/2022/04/Joker-DP-13.jpeg"),
            DataModel("Krishna","This message is deleted","https://images.unsplash.com/photo-1620510625142-b45cbb784397?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8am9rZXIlMjBtYXNrfGVufDB8fDB8fA%3D%3D&w=1000&q=80"),
            DataModel("Priyanshu","This message is deleted","https://cutedp.in/wp-content/uploads/2022/10/joker_dp-1483.jpg"),
            DataModel("Bobby","This message is deleted","https://cutedp.in/wp-content/uploads/2022/10/Joker_dp-1707.jpg"),
            DataModel("Anurag","This message is deleted","https://www.hindilive2.com/wp-content/uploads/2022/08/20220804_150727-768x1024.jpg"),
            DataModel("Aditya","This message is deleted","https://i0.wp.com/bioinshort.com/wp-content/uploads/2022/10/image-40.png?resize=300%2C300&ssl=1")
        )

        val adapter=activity ?.let { RecyclerViewAdapter(it,arr,this) }
        text.layoutManager=GridLayoutManager(activity,1)
        text.adapter=adapter
        return rowView
    }


    override fun onClick( position: Int ) {
        when(position){
            position->startActivity(Intent(activity,MainActivity2::class.java))
        }
    }
}

