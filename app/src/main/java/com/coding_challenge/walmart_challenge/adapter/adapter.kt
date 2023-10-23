package com.coding_challenge.walmart_challenge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coding_challenge.walmart_challenge.databinding.CountriesItemBinding
import com.coding_challenge.walmart_challenge.model.CountriesDetails

class CountriesAdapter(
    private val countriesList: MutableList<CountriesDetails> = mutableListOf()
) : RecyclerView.Adapter<CountriesViewHolder>(){

    fun addCountries(countries: List<CountriesDetails>){
        countriesList.clear()
        countriesList.addAll(countries)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder =
        CountriesViewHolder(
            CountriesItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) =
        holder.bind(countriesList[position])

    override fun getItemCount(): Int = countriesList.size
}

class CountriesViewHolder(
    private val binding: CountriesItemBinding
) : RecyclerView.ViewHolder(binding.root){

    fun bind (countries: CountriesDetails){
        binding.apply {
            countryName.text = String.format(countries.name)
            countryRegion.text = countries.region
            countryCode.text = countries.code
            countryCapital.text = countries.capital
        }
    }

}