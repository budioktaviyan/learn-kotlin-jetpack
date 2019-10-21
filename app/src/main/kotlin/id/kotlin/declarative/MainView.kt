package id.kotlin.declarative

import android.view.MenuItem
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar

@Composable
fun mainView(message: String) = MaterialTheme {
  FlexColumn {
    inflexible {
      TopAppBar<MenuItem>(
          title = { Text("Declarative") },
          color = Color.White
      )
    }
    Center {
      Text("Hello, $message!")
    }
  }
}