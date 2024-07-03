package com.example.kmmapp

import kotlinx.datetime.*



class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!" +
                "There are only ${daysUntilNewYear()} days left"
    }
}

fun daysUntilNewYear(): Int {
  val today = Clock.System.todayAt(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year+ 1,1,1)
    return today.daysUntil(closestNewYear)
}