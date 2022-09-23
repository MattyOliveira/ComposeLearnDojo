package br.com.t4.startcomposelearn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleInput() {
    var textValue by remember { mutableStateOf(TextFieldValue(" Digite seu texto aqui ")) }
    BasicTextField(
        value = textValue,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onValueChange = {
            textValue = it
        }
    )
}

@Composable
fun SampleTextField() {
    var textValue by remember { mutableStateOf(TextFieldValue("")) }

    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        label = { Text(text = "Adicione o nome") },
        maxLines = 1
    )
}

@Preview(showBackground = true)
@Composable
fun PrevSampleInput() {
    Column() {
        SampleInput()
        SampleTextField()
    }
}
