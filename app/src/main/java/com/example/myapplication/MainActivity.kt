package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.OneFragment
import com.example.myapplication.ui.TwoFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.frame_layout, OneFragment()).commit()

        binding.fabChat?.setOnClickListener {
            if (binding.fabChat == null) {
                Toast.makeText(this, "Ошибка null", Toast.LENGTH_LONG).show()
            }
            if (binding.fabChat == OneFragment::class.java) {
                Toast.makeText(this, "Вы уже в данном фрагменте", Toast.LENGTH_LONG).show()
            } else {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, OneFragment())
                    .commit()
            }
        }

        binding.fabContact?.setOnClickListener {
            if (binding.fabContact == null) {
                Toast.makeText(this, "Ошибка null", Toast.LENGTH_LONG).show()
            }
            if (binding.fabContact == OneFragment::class.java) {
                Toast.makeText(this, "Вы уже в данном фрагменте", Toast.LENGTH_LONG).show(
            } else {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, TwoFragment())
                    .commit()
            }
        }

    }
}