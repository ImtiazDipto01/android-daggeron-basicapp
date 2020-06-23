package com.imtiaz.daggersimpleproject.di

import android.app.Application
import com.imtiaz.daggersimpleproject.App
import com.imtiaz.daggersimpleproject.di.module.ActivityBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)
interface AppComponent : AndroidInjector<App>