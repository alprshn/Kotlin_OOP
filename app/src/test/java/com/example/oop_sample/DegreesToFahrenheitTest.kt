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
}