package com.artembakuta.lesson3

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

// Read more about classes declaration and interfaces
// https://kotlinlang.org/docs/classes.html
// https://kotlinlang.org/docs/interfaces.html
class LoginFindViewActivity : AppCompatActivity(), OnClickListener {
    lateinit var loginEditText: EditText
    lateinit var passwordEditText: EditText

    // Read more about kotlin functions
    // https://kotlinlang.org/docs/functions.html
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginEditText = findViewById(R.id.loginEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // AppCompatActivity is Inherited from Context class
        // Read more about inheritance
        // https://kotlinlang.org/docs/inheritance.html
        Toast.makeText(this, "Button is pressed", Toast.LENGTH_SHORT).show()
        // Kotlin null safety https://kotlinlang.org/docs/null-safety.html
        val login = loginEditText.text?.toString().orEmpty()
        val password = passwordEditText.text?.toString().orEmpty()
        processLogin(login, password)
    }

    private fun processLogin(login: String, password: String) {
        AlertDialog.Builder(this)
            .setTitle("Login and password")
            .setMessage("login: $login\npassword:$password")
            .setPositiveButton("OK") { dialog, which -> }
            .show()
    }

}