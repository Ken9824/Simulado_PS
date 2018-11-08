package com.example.logonrmlocal.simulado_ps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.logonrmlocal.simulado_ps.api.SwapiService
import com.example.logonrmlocal.simulado_ps.model.Teste
import kotlinx.android.synthetic.main.activity_pesquisa.*
import kotlinx.android.synthetic.main.activity_resultado.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val numero = intent.getStringExtra("NUMERO")

        val retrofit  = Retrofit.Builder()
                .baseUrl("https://swapi.co")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(SwapiService::class.java)
        service.buscar(numero)
                .enqueue(object: Callback<Teste> {
                    override fun onFailure(call: Call<Teste>?, t: Throwable?) {

                    }

                    override fun onResponse(call: Call<Teste>?, response: Response<Teste>?) {
                        val teste = response?.body()
                        tvNome.text = teste?.nome
                        tvCabelo.text = teste?.corCabelo
                        tvPele.text = teste?.corPele
                        tvNascimento.text = teste?.aniversario
                        tvGenero.text = teste?.genero

                    }
                })


    }



}
