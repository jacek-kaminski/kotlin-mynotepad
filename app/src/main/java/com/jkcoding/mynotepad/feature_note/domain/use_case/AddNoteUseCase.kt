package com.jkcoding.mynotepad.feature_note.domain.use_case

import com.jkcoding.mynotepad.feature_note.domain.model.InvalidNoteException
import com.jkcoding.mynotepad.feature_note.domain.model.Note
import com.jkcoding.mynotepad.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
  private val repository: NoteRepository
) {
  suspend operator fun invoke(note: Note) {
    if (note.title.isBlank()) throw InvalidNoteException("The note must have a title.")
    if (note.content.isBlank()) throw InvalidNoteException("The note must have a content.") //todo move to strings

    repository.insertNote(note)
  }
}
