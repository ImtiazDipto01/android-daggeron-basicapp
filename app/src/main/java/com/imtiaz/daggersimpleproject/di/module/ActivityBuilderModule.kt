package com.imtiaz.daggersimpleproject.di.module

import com.imtiaz.daggersimpleproject.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilderModule {


    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}