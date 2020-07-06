package com.imtiaz.daggersimpleproject.di.module

import com.imtiaz.daggersimpleproject.model.CoachRussel
import com.imtiaz.daggersimpleproject.model.TeamCoach
import dagger.Binds
import dagger.Module

@Module
abstract class TeamCoachModule {

    @Binds
    abstract fun teamCoach(coachRussel: CoachRussel) : TeamCoach
}