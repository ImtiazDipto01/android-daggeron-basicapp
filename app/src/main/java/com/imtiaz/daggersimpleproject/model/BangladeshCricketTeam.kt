package com.imtiaz.daggersimpleproject.model

import javax.inject.Inject


class BangladeshCricketTeam @Inject constructor(val players: Players, val coach: CoachRussel) {

    fun getBestEleven() : String = players.getPlayersNames()

    fun getCoachName() : String = coach.getName()

}