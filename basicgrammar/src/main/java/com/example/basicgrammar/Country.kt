package com.example.basicgrammar

import java.util.*

data class Country(
    val name: String,
    val continient: String,
    val population: Int
)

class CountryApp {
    fun filterCountries(countries:List<Country>,continient: String,population: Int):List<Country>{
        val res = mutableListOf<Country>()
        for(c in countries){
            if(c.continient == continient && c.population > population){
                res.add(c)
            }
        }
        return res
    }
}