package com.example.filmoteca

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AboutActivity : AppCompatActivity() {

    var buttonWeb : Button? = null
    lateinit var buttonSuport : Button
    var buttonBack : Button? = null
    private val mode = Mode.Compose

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initUI()
    }

    private fun initUI() {
        when (mode) {
            Mode.Layouts -> initBindings()
            Mode.Compose -> initCompose()
        }
    }

    private fun initBindings() {
        setContentView(R.layout.activity_about)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonWeb = findViewById<Button>(R.id.button)
        buttonSuport = findViewById<Button>(R.id.button2)
        buttonBack = findViewById<Button>(R.id.button3)

        buttonWeb?.setOnClickListener{
            showToast("Funcionalidad  web sin implementar")
        }

        buttonSuport.setOnClickListener{
            showToast("Funcionalidad Support sin implementar")
        }

        buttonBack?.setOnClickListener{
            showToast("Funcionalidad back sin implementar")
        }
    }

    fun initCompose() {
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                titleSection(stringResource(R.string.createdBy))
                imageSection(imageResId = R.drawable.mymage)
                buttonSection(stringResource(R.string.noDisponible))
            }

        }
    }

    fun showToast(text : String){
        val toast = Toast.makeText(this,text,Toast.LENGTH_SHORT)
        toast.show()
    }

    @Composable
    fun titleSection(title: String) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 30.dp)
        )
    }

    @Composable
    fun imageSection(imageResId: Int) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "Imagen desde drawable",
            modifier = Modifier
                .size(300.dp)
        )
    }

    @Composable
    fun buttonSection(text : String) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 30.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Button(onClick = { showToast(text)}) {
                Text(stringResource(R.string.goWeb))
            }

            Button(onClick = { showToast(text)}) {
                Text(stringResource(R.string.getSupport))
            }

            Button(onClick = { showToast(text)}) {
                Text(stringResource(R.string.back))
            }
        }
    }

}