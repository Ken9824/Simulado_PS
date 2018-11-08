package com.example.logonrmlocal.simulado_ps.api

import com.example.logonrmlocal.simulado_ps.model.Teste
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call


interface SwapiService {
    @GET("api/people/{numero}/")
    fun buscar (@Path("numero") numero:String) : Call<Teste>

}