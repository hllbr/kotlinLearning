package com.hllbr.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hello kotlin")
        println(4*5)
    }
    fun change(view: View){
        textView.text = "Merhaba @prince"
        //burada bulunan yapı kotlin üzerinde butona basıldığında halil ibrahim koçak yazısı yerine Merhaba @prince yazacak şekilde tasarlandı
        //fun kelimesinin karşılığı function kelimesi yani türkçe anlam ve ifadesi fonksiyondur method olarakta ifade edilebir.
        //burada bulunan yapıyı sorunsuz yazabilmek için kotlinx import edilmeli bunun için gerekli bilgiyi grandle(:app) içerisinde ifade ettim.



    }
}