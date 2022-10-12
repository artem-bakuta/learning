package com.artembakuta.lesson3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginComposeActivity : ComponentActivity() {
    private val _email = mutableStateOf(String())
    private val _password = mutableStateOf(String())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .background(colorResource(id = R.color.main_blue_background))
                    .fillMaxSize()

            ) {
                Spacer(modifier = Modifier.height(150.dp))
                Text(
                    textAlign = TextAlign.Center,
                    text = stringResource(R.string.fakebook),
                    color = colorResource(R.color.white),
                    fontSize = 32.sp,
                    fontWeight = FontWeight(800)
                )

                Spacer(modifier = Modifier.height(24.dp))
                TextField(
                    value = _email.value,
                    modifier = Modifier
                        .width(220.dp)
                        .background(colorResource(id = R.color.white)),
                    textStyle = TextStyle(
                        fontSize = (14.sp),
                        color = colorResource(id = R.color.black)
                    ),
                    label = { Text(stringResource(id = R.string.email)) },
                    placeholder = {
                        Text(
                            stringResource(id = R.string.email),
                            color = colorResource(id = R.color.grey)
                        )
                    },
                    onValueChange = { _email.value = it }
                )
                Spacer(modifier = Modifier.height(2.dp))
                TextField(
                    value = _password.value,
                    modifier = Modifier
                        .width(220.dp)
                        .background(colorResource(id = R.color.white)),
                    textStyle = TextStyle(
                        fontSize = (14.sp),
                        color = colorResource(id = R.color.black)
                    ),
                    label = {
                        Text(stringResource(id = R.string.password))
                    },
                    placeholder = {
                        Text(
                            stringResource(id = R.string.password),
                            color = colorResource(id = R.color.grey)
                        )
                    },
                    onValueChange = { _password.value = it }
                )
                Spacer(modifier = Modifier.height(24.dp))
                TextButton(
                    modifier = Modifier
                        .width(220.dp)
                        .background(colorResource(id = R.color.light_blue)),
                    onClick = {
                        Toast.makeText(
                            this@LoginComposeActivity,
                            "Button is pressed",
                            Toast.LENGTH_SHORT
                        ).show()
                    }) {
                    Text(
                        text = stringResource(id = R.string.log_in),
                        color = colorResource(id = R.color.white)
                    )
                }
            }

        }
    }
}