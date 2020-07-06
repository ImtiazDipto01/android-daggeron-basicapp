package com.imtiaz.daggersimpleproject.model

class CoachRussel private constructor() : TeamCoach {

    companion object {
        fun getCoachRusselInstance() = CoachRussel()
    }

    override fun getName(): String  = "Russle Domingo"

    override fun getSpeciality(): String  = "Batting & Junior player development"

}