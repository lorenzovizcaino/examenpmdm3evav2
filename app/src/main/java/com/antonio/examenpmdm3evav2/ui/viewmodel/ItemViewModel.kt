package com.antonio.examenpmdm3evav2.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.antonio.examenpmdm3evav2.ui.model.ItemSer
import com.antonio.examenpmdm3evav2.ui.model.getListaAuxclass

import com.antonio.examenpmdm3evav2.ui.model.getListaclass

class ItemViewModel:ViewModel(){



    fun getLista():MutableList<ItemSer>{
        return  getListaclass()
    }

    fun getListaAux():MutableList<ItemSer>{
        return  getListaAuxclass()
    }



    var nombre by mutableStateOf("")
        private set

    var descr by mutableStateOf("")
        private set

    var selecionado by mutableStateOf(false)
        private set

    var objeto by mutableStateOf(ItemSer("","",false))
        private set

    var banderaFichero by mutableStateOf(true)
        private set

    var isCheckedScafold by mutableStateOf(false)
        private set
    var banderaIniciar by mutableStateOf(true)
        private set

    fun set_nombre(nombre:String){
        this.nombre=nombre
    }

    fun set_descr(descr:String){
        this.descr=descr
    }

    fun set_selecionado(selecionado:Boolean){
        this.selecionado=selecionado
    }

    fun set_Objeto(objeto:ItemSer){
        this.objeto=objeto
    }
    fun set_banderaFichero(banderaFichero:Boolean){
        this.banderaFichero=banderaFichero
    }

    fun set_banderaIniciar(banderaIniciar:Boolean){
        this.banderaIniciar=banderaIniciar
    }
    fun set_isCheckedScafold(isCheckedScafold:Boolean){
        this.isCheckedScafold=isCheckedScafold
    }




}