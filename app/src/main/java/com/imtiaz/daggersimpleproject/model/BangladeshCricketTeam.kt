package com.imtiaz.daggersimpleproject.model

import javax.inject.Inject


class BangladeshCricketTeam @Inject constructor(val players: Players) {

    fun getBestEleven() : String = players.getPlayersNames()

}