package com.example.dm1_202101_bd

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(val texto: String,
                @PrimaryKey(autoGenerate = true)
                val id: Int = 0) {
}