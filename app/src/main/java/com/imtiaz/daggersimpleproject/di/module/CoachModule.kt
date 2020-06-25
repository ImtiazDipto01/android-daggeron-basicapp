package com.imtiaz.daggersimpleproject.di.module

import com.imtiaz.daggersimpleproject.model.CoachRussel
import dagger.Module
import dagger.Provides

@Module
class CoachModule {

    @Provides
    fun getCoachRussel() : CoachRussel {
        return CoachRussel.getCoachRusselInstance()
    }
}