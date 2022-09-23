package br.com.t4.startcomposelearn

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SampleList(list: List<String>) {
    Column {
        list.forEach { item ->
            Text(text = item)
        }
    }
}

@Composable
fun SampleLazyList(list: List<String>) {
    LazyColumn {
        // Add a single item
        item {
            Text(text = "First item")
        }

        // Add 5 items
        items(list.size) { item ->
            Text(text = "Item: $item")
        }

        // Add another single item
        item {
            Text(text = "Last item")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun showSampleList() {
    SampleLazyList(list = listOf("Matheus", "Lucas"))
}
