package id.kotlin.declarative

import android.view.MenuItem
import android.widget.Toast
import androidx.compose.Composable
import androidx.compose.Context
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.FlexColumn
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar

@Composable
fun mainView(
    context: Context,
    message: String
) = MaterialTheme {
  FlexColumn {
    inflexible {
      TopAppBar<MenuItem>(
          title = { Text("Declarative") },
          color = Color.White
      )
    }
    Center {
      Button(
          "Click",
          onClick = {
            Toast.makeText(context, "Hello, $message!", Toast.LENGTH_SHORT).show()
          },
          style = ContainedButtonStyle(color = Color.Gray)
      )
    }
  }
}