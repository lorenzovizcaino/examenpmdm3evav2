package com.antonio.examenpmdm3evav2.ui.viewmodel

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.antonio.examenpmdm3evav2.ui.model.Login
import com.antonio.examenpmdm3evav2.ui.model.getListaLoginclass

import java.text.DecimalFormat

class LoginViewModel : ViewModel() {
    var email by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var loginenabled by mutableStateOf(false)
        private set



    var usuarioCorrecto by mutableStateOf(false)
        private set

    var contadorIntentos by mutableStateOf(3)
        private set




    var format = DecimalFormat("#,###.00")
        private set

    fun getListaLogin():MutableList<Login>{
        return  getListaLoginclass()
    }

    fun set_Email(email: String) {
        this.email = email
    }

    fun set_Password(password: String) {
        this.password = password
    }

    fun set_Loginenabled(loginenabled: Boolean) {
        this.loginenabled = Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 5
    }

    fun set_UsuarioCorrecto(usuarioCorrecto: Boolean){
        this.usuarioCorrecto=usuarioCorrecto;
    }

    fun set_ContadorIntentos(){
        this.contadorIntentos--
    }

    fun restablecerContadorIntentos(){
        this.contadorIntentos=3
    }









}