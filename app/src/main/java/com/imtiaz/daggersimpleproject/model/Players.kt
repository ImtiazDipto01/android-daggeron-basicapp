package com.imtiaz.daggersimpleproject.model

import javax.inject.Inject

class Players @Inject constructor() {

    fun getPlayersNames() : String{
        return "Tamim Iqbal, Liton Das, Shakib Al Hasan, Soumaya Sarkar, Mushfiqur Rahim, Mahmadullah, Miraz, Saifuddin, Mashrafee, Mustafiz, Rubel"
    }
}