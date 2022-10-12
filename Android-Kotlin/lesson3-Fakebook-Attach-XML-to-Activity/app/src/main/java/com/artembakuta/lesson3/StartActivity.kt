package com.artembakuta.lesson3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp

class StartActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.main_blue_background)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ActivityActionButton("Find view Activity", LoginFindViewActivity::class.java)
                ActivityActionButton("View Binding Activity", LoginViewBindingActivity::class.java)
                ActivityActionButton("Compose Activity", LoginComposeActivity::class.java)
            }
        }
    }

    @Composable
    fun ActivityActionButton(text: String, cls: Class<*>) = OutlinedButton(
        onClick = { startActivity(Intent(this@StartActivity, cls)) },
    ) {
        Text(text = text, color = colorResource(id = R.color.black), fontSize = 16.sp)
    }
}