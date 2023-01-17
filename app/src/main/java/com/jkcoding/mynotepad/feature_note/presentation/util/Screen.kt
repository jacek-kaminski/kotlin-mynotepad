package com.jkcoding.mynotepad.feature_note.presentation.util

sealed class Screen(val route: String) {
  object NoteListScreen: Screen("note_list_screen")
  object AddEditNoteScreen: Screen("add_edit_note_Screen")
}
