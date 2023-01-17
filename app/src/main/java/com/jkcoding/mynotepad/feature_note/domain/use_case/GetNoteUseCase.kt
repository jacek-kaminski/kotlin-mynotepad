package com.jkcoding.mynotepad.feature_note.domain.use_case

import com.jkcoding.mynotepad.feature_note.domain.model.Note
import com.jkcoding.mynotepad.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteUseCase @Inject constructor(
  private val repository: NoteRepository
) {
  suspend operator fun invoke (id: Int): Note? = repository.getNoteById(id)
}
