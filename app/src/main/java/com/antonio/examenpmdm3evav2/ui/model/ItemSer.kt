package com.antonio.examenpmdm3evav2.ui.model

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import java.io.EOFException
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable

data class ItemSer(val nombre: String, val descr: String, var selecionado: Boolean) : Serializable
    var itemsSer = mutableStateListOf<ItemSer>(

    )
        private set

    var itemsSerAux = mutableStateListOf<ItemSer>(

    )
        private set






    fun getListaclass(): MutableList<ItemSer> {
        return itemsSer
    }

    fun getListaAuxclass(): MutableList<ItemSer> {
      return itemsSerAux
    }







