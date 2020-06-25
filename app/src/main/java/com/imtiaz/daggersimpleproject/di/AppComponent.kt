package com.imtiaz.daggersimpleproject.di

import android.app.Application
import com.imtiaz.daggersimpleproject.App
import com.imtiaz.daggersimpleproject.di.module.ActivityBuilderModule
import com.imtiaz.daggersimpleproject.di.module.CoachModule
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
        CoachModule::class
    ]
)
interface AppComponent : AndroidInjector<App>