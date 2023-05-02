package com.mohammad.askar.cleanarchitecturemvvmauthmodule.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mohammad.askar.cleanarchitecturemvvmauthmodule.presentation.ui.theme.orange
import com.mohammad.askar.cleanarchitecturemvvmauthmodule.presentation.ui.theme.white

@Composable
fun AuthButton(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    isEnabled: Boolean = true,
    isLoading: Boolean,
    modifier: Modifier,
    onButtonClicked: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = { onButtonClicked() },
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor,
        contentColor = contentColor,
        ),
        enabled = isEnabled

    ) {
        if (isLoading){
            CircularProgressIndicator(
                color = contentColor,
                modifier = Modifier.size(20.dp)
            )
        } else{
            Text(
                text = text,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AuthButtonPreview() {
    AuthButton(
        text = "Login",
        backgroundColor = orange,
        contentColor = white,
        isLoading = false,
        modifier = Modifier
    ) {
        
    }
}