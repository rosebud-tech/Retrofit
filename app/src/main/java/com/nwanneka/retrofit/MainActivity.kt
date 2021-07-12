package com.nwanneka.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nwanneka.retrofit.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()
        val service: TodoService= retrofit. create (TodoService:: class.java)
        val todos: Call<List<Todo>>=service.getAllTodos()
        todos.enqueue(object : Callback <List<Todo>

        })

        })

    }
}