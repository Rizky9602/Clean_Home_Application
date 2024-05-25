package com.muriz.clean_home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.MuRiz.clean_home.R

class LoginFormActivity : AppCompatActivity() {
    private lateinit var userName : EditText
    private lateinit var password : EditText
    private lateinit var btnMasuk : Button
    private lateinit var btnBuatAkun : Button
    private lateinit var warningText : TextView

    private fun init(){
        userName = findViewById(R.id.login_username)
        password = findViewById(R.id.login_password)
        btnMasuk = findViewById(R.id.login_btn_masuk)
        btnBuatAkun = findViewById(R.id.login_btn_buat_akun)
        warningText = findViewById(R.id.login_warning_text)
    }

    override fun onCreate(savedInstanceState: Bundle?, ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)

        init()

        password.setOnEditorActionListener(TextView.OnEditorActionListener{
            v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_DONE ||
                (event != null && event.action == KeyEvent.ACTION_DOWN &&
                        event.keyCode == KeyEvent.KEYCODE_ENTER)){
                closeKeyboard()

                btnMasuk.performClick()
                return@OnEditorActionListener true
            }
            false
        })

        btnMasuk.setOnClickListener(){
            if(validateLogin(userName.text.toString(),password.text.toString())){
                startActivity(Intent(this,MainActivity::class.java))
            }else{
                warningText.text = resources.getString(R.string.warning_text)
                userName.text.clear()
                password.text.clear()
            }
        }

    }
    private fun validateLogin(username : String, password : String):Boolean{
        return username == "username" && password == "password"
    }

    private fun closeKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}