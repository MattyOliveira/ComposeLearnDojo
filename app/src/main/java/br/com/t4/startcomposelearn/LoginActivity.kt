package br.com.t4.startcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import br.com.t4.startcomposelearn.ui.theme.StartComposeLearnTheme

private val viewModel = AppViewModel()

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartComposeLearnTheme {
                TODO("Adicionar tela")
            }
        }
    }
}

/*
* União de todos os outros components
*/
@Composable
fun LoginScreen() {
    TODO("Screen")
}

/*
* Implementação de um texto para titulo da tela
* Utilizando um TopAppBar vamos montar essa visualização.
*/
@Composable
fun TituloLogin(name: String) {
    TODO("Titulo da tela")
}

/*
* Implementação do component de input.
* Utilizando um OutlineTextField ou BasicTextField vamos montar o input.
*/
@Composable
fun ComposeLearnInput() {
    TODO("Campo de texto")
}


/*
* Implementação do botão para realizar a ação de logar.
* Utilizando um Button() vamos montar essa visualização e aplicar as ações.
*/
@Composable
fun ComposeLearnButton(action: () -> Unit) {
    TODO("Botão para logar")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    val context = LocalContext.current
    StartComposeLearnTheme {
        TODO("")
    }
}