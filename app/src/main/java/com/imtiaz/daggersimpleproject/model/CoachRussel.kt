package com.imtiaz.daggersimpleproject.model

class CoachRussel private constructor() {

    fun getCoachRusselInstance() = CoachRussel()

    fun getName() : String = "Russle Domingo"

    fun getSpeciality() : String = "Batting & Junior player development"
}