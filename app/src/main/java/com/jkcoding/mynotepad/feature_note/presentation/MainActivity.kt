package com.jkcoding.mynotepad.feature_note.presentation

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jkcoding.mynotepad.feature_note.presentation.add_edit_note.AddEditNoteScreen
import com.jkcoding.mynotepad.feature_note.presentation.note_list.NoteListScreen
import com.jkcoding.mynotepad.feature_note.presentation.util.Screen
import com.jkcoding.mynotepad.feature_note.presentation.util.Screen.*
import com.jkcoding.mynotepad.ui.theme.MyNotepadTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyNotepadTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
          val navController = rememberNavController()
          NavHost(navController = navController, startDestination = NoteListScreen.route) {
            composable(route = NoteListScreen.route) {
              NoteListScreen(navController = navController)
            }
            composable(route = AddEditNoteScreen.route) {
              AddEditNoteScreen(navController = navController)
            }
          }
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  MyNotepadTheme {
    Greeting("Android")
  }
}