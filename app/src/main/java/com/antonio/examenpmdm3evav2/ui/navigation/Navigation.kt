package com.antonio.examenpmdm3evav2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.antonio.examenpmdm3evav2.ui.screens.Menu
import com.antonio.examenpmdm3evav2.ui.viewmodel.ItemViewModel
import com.antonio.examenpmdm3evav2.ui.viewmodel.LoginViewModel


@Composable
fun Navigation() {
    val navController = rememberNavController()
    val viewModelLogin=remember{LoginViewModel()}
    val viewModelObjeto=remember{ ItemViewModel() }
    NavHost(navController, startDestination = Screens.Menu.route) {
        //pantalla principal con la navegación
        composable(route = Screens.Menu.route) {
            Menu(navController, viewModelObjeto, viewModelLogin) }//Nombre del fichero .kt al que navegar

//        composable(route = Screens.Inicio.route) {
//            Inicio(navController,viewModelProducto) //Nombre de la función composable a la que navegar
//        }
//        composable(route = Screens.ResumenCompras.route) {
//            ResumenCompras(navController,viewModelProducto) //Nombre de la función composable a la que navegar
//        }
//        composable(route = Screens.Registro.route) {
//            Registro(navController,viewModelLogin) //Nombre de la función composable a la que navegar
//        }
//        composable(route = Screens.ListaEmail.route) {
//            ListaEmail(navController,viewModelLogin) //Nombre de la función composable a la que navegar
//        }



    }
}






