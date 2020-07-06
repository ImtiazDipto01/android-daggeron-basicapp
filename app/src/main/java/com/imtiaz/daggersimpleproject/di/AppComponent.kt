package com.imtiaz.daggersimpleproject.di

import android.app.Application
import com.imtiaz.daggersimpleproject.App
import com.imtiaz.daggersimpleproject.di.module.ActivityBuilderModule
import com.imtiaz.daggersimpleproject.di.module.CoachModule
import com.imtiaz.daggersimpleproject.di.module.TeamCoachModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        CoachModule::class,
        TeamCoachModule::class
    ]
)
interface AppComponent : AndroidInjector<App>