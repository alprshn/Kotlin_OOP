package com.example.oop_sample

class DegreesToFahrenheit {
    fun convertDegress(degress:Double):Double{
        val fahrenheit = degress * 1.8 +32
        return fahrenheit
    }
}

class RectangularPerimeter{
    fun RectangularPerimeterCalculation(width:Double, height:Double):Double{
        val perimeter = 2 * (width + height)
        return perimeter
    }
}


class Factorial{
    fun Factorial(number:Int):Int{
        var result:Int = 1
        for ( i in 1..number){
            result = result*i
        }
        return result
    }
}


class FindCharacter {
    fun FindCharacter(word:String, character:Char):Int{
        var sonuc = 0
        for (k in word){
            if (k== character ){
                sonuc = sonuc+1
            }
        }
        return sonuc
    }


}