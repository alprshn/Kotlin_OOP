package com.example.oop_sample

fun main(){
    var a = 6
    println("Mük Sayı = $a")
    var b =0

    for ( i in 1..a-1){

        if (a % i ==0){
            println("Pozitif Bölenleri = $i")
            b= i +b
        }
    }
    println("Pozitif Bölenleri Toplamı = $b")

}













