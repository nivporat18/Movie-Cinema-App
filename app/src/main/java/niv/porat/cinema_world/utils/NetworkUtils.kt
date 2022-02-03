package niv.porat.cinema_world.utils

import android.net.ConnectivityManager
import android.net.NetworkCapabilities

fun hasInternetConnection(connectivityManager : ConnectivityManager):Boolean{
    val network = connectivityManager.activeNetwork?:return false
    val capabilities=connectivityManager.getNetworkCapabilities(network)?:return false
    return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)||
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)||
            capabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN)
}