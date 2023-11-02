package com.day.myprovince

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.day.myprovince.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvProvinceList.layoutManager = GridLayoutManager(this@MainActivity,3)
        binding.rvProvinceList.adapter = ProvinceAdapter(utils.provinceList){
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("latitude",it.latitude)
            intent.putExtra("longitude",it.longitude)
            intent.putExtra("name",it.name)
            startActivity(intent)
        }
    }
}