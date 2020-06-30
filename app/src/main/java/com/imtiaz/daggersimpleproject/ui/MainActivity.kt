package com.imtiaz.daggersimpleproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.imtiaz.daggersimpleproject.R
import com.imtiaz.daggersimpleproject.model.BangladeshCricketTeam
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bangladeshCricketTeam: BangladeshCricketTeam

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetMyTeam.setOnClickListener {
            tvPlayersName.text = bangladeshCricketTeam.getBestEleven()
            tvCoachInfo.text = bangladeshCricketTeam.getCoachName()
            Log.e("checkInstance", bangladeshCricketTeam.toString())
        }
    }
}