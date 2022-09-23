package br.com.t4.startcomposelearn

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.t4.startcomposelearn.ui.theme.StartComposeLearnTheme

private val viewModel = AppViewModel()

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartComposeLearnTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TODO("Adicionar tela")
                }
            }
        }
    }
}

/*
* União de todos os outros components
*/
@Composable
fun MainScreen() {
    TODO("Screen")
}

/*
* Implementação de uma Toolbar com nome do usuário.
* Utilizando um TopAppBar vamos montar essa visualização.
*/
@Composable
fun Toolbar(name: String) {
    TODO("Toolbar")
}

/*
* Implementação de uma imagem de perfil.
* Utilizando um Image vamos montar essa visualização.
*/
@Composable
fun ImageProfile() {
    TODO("Imagem")
}


/*
* Implementação de uma lista de cards com algumas ações.
* Utilizando um LazyRow() vamos montar essa visualização.
*/
@Composable
fun ActionsWidgets(list: List<String>) {
    TODO("Lista de cards")
}

/*
* Implementação de um card com algumas informações da conta
* Utilizando um Image vamos montar essa visualização.
*/
@Composable
fun ContentCard() {
    TODO("Card com conteudo")
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StartComposeLearnTheme {
        TODO()
    }
}