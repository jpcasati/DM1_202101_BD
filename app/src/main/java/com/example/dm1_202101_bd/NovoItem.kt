package com.example.dm1_202101_bd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.RoomDatabase
import kotlinx.android.synthetic.main.activity_novo_item.*

class NovoItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_item)

        btnSalvar.setOnClickListener {

            val texto = edtTexto.text.toString()

            val i = Item(texto)

            ItemDatabase.getInstance(this)!!.itemDao().salvar(i)

            Toast.makeText(this, "Item salvo com sucesso!", Toast.LENGTH_LONG).show()

            finish()
        }

    }
}