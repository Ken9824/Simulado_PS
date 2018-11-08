package com.example.logonrmlocal.simulado_ps.model

import com.google.gson.annotations.SerializedName

data class Teste(
        @SerializedName("name") val nome: String,
        @SerializedName("hair_color") val corCabelo: String,
        @SerializedName("skin_color") val corPele: String,
        @SerializedName("birth_year") val aniversario: String,
        @SerializedName("gender") val genero: String)