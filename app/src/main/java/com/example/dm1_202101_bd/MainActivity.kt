package com.example.dm1_202101_bd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNovo.setOnClickListener {
            startActivity(Intent(this, NovoItem::class.java))
        }

    }

    override fun onResume() {
        super.onResume()

        listarItens()

    }

    fun listarItens() {

        val itens = ItemDatabase.getInstance(this)!!.itemDao().listar()

        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, itens)

        lstItem.adapter = adp
    }
}