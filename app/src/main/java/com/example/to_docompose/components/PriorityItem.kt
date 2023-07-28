package com.example.to_docompose.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_docompose.data.models.Priority
import com.example.to_docompose.ui.theme.MEDIUM_PADDING
import com.example.to_docompose.ui.theme.PRIORITY_INDICATOR_COLOR

@Composable
fun PriorityItem(priority: Priority) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = priority.name,
            modifier = Modifier.padding(end = MEDIUM_PADDING)
        )
        Canvas(
            modifier = Modifier
                .size(PRIORITY_INDICATOR_COLOR)
        ) {
            drawCircle(color = priority.color)
        }
    }
}

@Composable
@Preview
fun PriorityItemPreview() {
    PriorityItem(priority = Priority.HIGH)
}