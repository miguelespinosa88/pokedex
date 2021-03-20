package edu.itesm.pokedex

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(val picture:Int,
                    val nombre:String,
                   val tipo:String,
                   val descripcion:String,
                   val habilidad:String) :Parcelable