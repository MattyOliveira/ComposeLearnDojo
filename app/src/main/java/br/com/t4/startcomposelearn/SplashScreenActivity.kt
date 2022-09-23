package br.com.t4.startcomposelearn

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import br.com.t4.startcomposelearn.ui.theme.StartComposeLearnTheme
import kotlinx.coroutines.delay

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartComposeLearnTheme {
                lifecycleScope.launchWhenCreated {
                    delay(3000)

                    startActivity(
                        Intent(this@SplashScreenActivity, LoginActivity::class.java)
                    ).also { finish() }
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TODO()
                }
            }
        }
    }
}

/*
* Implementação de uma imagem na slash.
* Utilizando um Image vamos montar essa visualização.
*/
@Composable
fun ImageSplash() {
    TODO("Imagem")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    StartComposeLearnTheme {
        TODO()
    }
}