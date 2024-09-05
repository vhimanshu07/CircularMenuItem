package com.example.circularmenuitem

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ramotion.circlemenu.CircleMenuView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val menu = findViewById<CircleMenuView>(R.id.circle_menu)
        menu.eventListener = object : CircleMenuView.EventListener() {
            override fun onMenuOpenAnimationStart(view: CircleMenuView) {
                Log.d("D", "onMenuOpenAnimationStart")
            }

            override fun onMenuOpenAnimationEnd(view: CircleMenuView) {
                Log.d("D", "onMenuOpenAnimationEnd")
            }

            override fun onMenuCloseAnimationStart(view: CircleMenuView) {
                Log.d("D", "onMenuCloseAnimationStart")
            }

            override fun onMenuCloseAnimationEnd(view: CircleMenuView) {
                Log.d("D", "onMenuCloseAnimationEnd")
            }

            override fun onButtonClickAnimationStart(view: CircleMenuView, index: Int) {
                Log.d("D", "onButtonClickAnimationStart|index: $index")
            }

            override fun onButtonClickAnimationEnd(view: CircleMenuView, index: Int) {
                Log.d("D", "onButtonClickAnimationEnd|index: $index")
            }

            override fun onButtonLongClick(view: CircleMenuView, buttonIndex: Int): Boolean {
                Log.d("D", "onButtonLongClick|index: $buttonIndex")
                return true
            }

            override fun onButtonLongClickAnimationStart(view: CircleMenuView, buttonIndex: Int) {
                Log.d("D", "onButtonLongClickAnimationStart|index: $buttonIndex")
            }

            override fun onButtonLongClickAnimationEnd(view: CircleMenuView, buttonIndex: Int) {
                Log.d("D", "onButtonLongClickAnimationEnd|index: $buttonIndex")
            }
        }

    }
}