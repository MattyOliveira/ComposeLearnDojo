package br.com.t4.startcomposelearn

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SampleButton(
    action: () -> Unit
) {
   Button(
       modifier = Modifier.fillMaxWidth(),
       onClick = { action() }
   ) {
       Text(text = "Sou um Botão")
   }
}

@Composable
fun SampleOutlineButton(
    action: () -> Unit
) {
    OutlinedButton(
        modifier = Modifier.fillMaxWidth(),
        onClick = { action() },
    ) {
        Text(text = "Sou um Botão")
    }
}

@Composable
fun SampleBasicButton(
    action: () -> Unit
) {
    TextButton(
        onClick = { action() },
    ) {
        Text(text = "Sou um Botão")
    }
}

@Preview(showBackground = true)
@Composable
fun ShowSampleButton() {
    SampleButton({})
    SampleBasicButton({})
    OutlinedButton(
        onClick = {}
    ){

    }
}