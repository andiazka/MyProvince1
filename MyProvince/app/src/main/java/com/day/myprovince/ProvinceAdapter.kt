package com.day.myprovince

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.day.myprovince.databinding.ItemProvinceLayoutBinding

class ProvinceAdapter(private val provinceList: ArrayList<Province>, private val listener: (Province) -> Unit): RecyclerView.Adapter<ProvinceAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceAdapter.ViewHolder {
    val binding = ItemProvinceLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return ViewHolder(binding)
  }

  override fun getItemCount(): Int {
    return provinceList.size
  }

  override fun onBindViewHolder(holder: ProvinceAdapter.ViewHolder, position: Int) {
    with(holder) {
      with(provinceList[position]) {
        Glide.with(holder.itemView.context)
          .load(this.url)
          .into(binding.imgProvince)
        binding.nameProvince.text = this.name
        binding.root.setOnClickListener {
          listener(this)
        }
      }
    }
  }

  inner class ViewHolder(val binding: ItemProvinceLayoutBinding) : RecyclerView.ViewHolder(binding.root)
}
