package com.lucasjacintho.organizzeclone

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide
import com.lucasjacintho.organizzeclone.auth.LoginActivity
import com.lucasjacintho.organizzeclone.auth.SignupActivity

class MainActivity : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isButtonBackVisible = false
        isButtonNextVisible = false

        addSlide(FragmentSlide.Builder().background(R.color.bg_color_slider1).fragment(R.layout.intro_slide_organize).build())
        addSlide(FragmentSlide.Builder().background(R.color.bg_color_slider4).fragment(R.layout.intro_slide_dont_stress).build())
        addSlide(FragmentSlide.Builder().background(R.color.white).fragment(R.layout.intro_slide_notify).build())
        addSlide(FragmentSlide.Builder().background(R.color.white).fragment(R.layout.intro_slide_more_money).build())
        addSlide(FragmentSlide.Builder().background(R.color.bg_color_slider4).fragment(R.layout.intro_slide_signup_or_login).canGoForward(false).build())
    }

    fun login(view : View){
        startActivity(Intent(this, LoginActivity::class.java))
    }


    fun signup(view: View) {
        startActivity(Intent(this, SignupActivity::class.java))
    }
}