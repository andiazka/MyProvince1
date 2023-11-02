package com.day.myprovince

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.day.myprovince.databinding.ActivityDetailBinding
import com.day.myprovince.databinding.ActivityMainBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val latitude = intent.getDoubleExtra("latitude",0.0)
        val longitude = intent.getDoubleExtra("longitude",0.0)
        val name = intent.getStringExtra("name")
        binding.toolBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        if (name!=null && latitude!=null && longitude!=null){
            binding.toolBar.title = name

            val mapFragment =
                supportFragmentManager.findFragmentById(R.id.mapProvince) as? SupportMapFragment
            mapFragment?.getMapAsync { googleMap ->
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(latitude.toDouble(), longitude.toDouble()),7.8f))
            }
        }
    }
}