package com.example.logonrmlocal.simulado_ps

import android.content.Intent
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

class PesquisaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        btPesquisar.setOnClickListener{

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("NUMERO", edInserir.text.toString())
            startActivity(intent)
        }


    }
}
