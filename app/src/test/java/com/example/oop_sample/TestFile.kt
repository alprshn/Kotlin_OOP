package com.example.oop_sample

import org.junit.Assert.*
import org.junit.Test

class UnitTest{

    @Test
    fun DegreesToFahrenheit_Test1(){
        val degreestofahrenheit = DegreesToFahrenheit()
        val expected:Double = 86.0
        val actual = degreestofahrenheit.convertDegress(30.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun DegreesToFahrenheit_Test2(){
        val degreestofahrenheit = DegreesToFahrenheit()
        val expected:Double = 122.0
        val actual = degreestofahrenheit.convertDegress(50.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun DegreesToFahrenheit_Test3(){
        val degreestofahrenheit = DegreesToFahrenheit()
        val expected:Double = 1472.0
        val actual = degreestofahrenheit.convertDegress(800.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun RectangularPerimeter_Test1(){
        val rectangularperimeter = RectangularPerimeter()
        val expected:Double = 164.0
        val actual = rectangularperimeter.RectangularPerimeterCalculation(80.0, 2.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun RectangularPerimeter_Test2(){
        val rectangularperimeter = RectangularPerimeter()
        val expected:Double = 44.0
        val actual = rectangularperimeter.RectangularPerimeterCalculation(20.0, 2.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun RectangularPerimeter_Test3(){
        val rectangularperimeter = RectangularPerimeter()
        val expected:Double = 244.0
        val actual = rectangularperimeter.RectangularPerimeterCalculation(120.0, 2.0)
        assertEquals(expected, actual,0.0)
    }

    @Test
    fun Factorial_Test1(){
        val factorial = Factorial()
        val expected = 6
        val actual = factorial.Factorial(3)
        assertEquals(expected, actual)
    }

    @Test
    fun Factorial_Test2(){
        val factorial = Factorial()
        val expected = 24
        val actual = factorial.Factorial(4)
        assertEquals(expected, actual)
    }


    @Test
    fun Factorial_Test3(){
        val factorial = Factorial()
        val expected = 120
        val actual = factorial.Factorial(5)
        assertEquals(expected, actual)
    }


    @Test
    fun FindCharacter_Test1(){
        val findcharacter = FindCharacter()
        val expected = 3
        val actual = findcharacter.FindCharacter("ANKARA",'A')
        assertEquals(expected, actual)
    }

    @Test
    fun FindCharacter_Test2(){
        val findcharacter = FindCharacter()
        val expected = 1
        val actual = findcharacter.FindCharacter("KAYSERİ",'E')
        assertEquals(expected, actual)
    }

    @Test
    fun FindCharacter_Test3(){
        val findcharacter = FindCharacter()
        val expected = 1
        val actual = findcharacter.FindCharacter("İSTANBUL",'B')
        assertEquals(expected, actual)
    }

}