package com.jkcoding.mynotepad.feature_note.domain.use_case

import com.jkcoding.mynotepad.feature_note.domain.model.Note
import com.jkcoding.mynotepad.feature_note.domain.repository.NoteRepository
import com.jkcoding.mynotepad.feature_note.domain.util.NoteOrder
import com.jkcoding.mynotepad.feature_note.domain.util.NoteOrder.*
import com.jkcoding.mynotepad.feature_note.domain.util.OrderType.Ascending
import com.jkcoding.mynotepad.feature_note.domain.util.OrderType.Descending
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetNotesUseCase @Inject constructor(
  private val repository: NoteRepository
) {
  operator fun invoke(noteOrder: NoteOrder = ByDate(Descending)) =
    repository.getNotes().map { it.sortAccordingly(noteOrder) }
}

fun List<Note>.sortAccordingly(noteOrder: NoteOrder) = when (noteOrder.orderType) {
  is Ascending -> when (noteOrder) {
    is ByColor -> this.sortedBy { it.title.lowercase() }
    is ByDate -> this.sortedBy { it.timestamp }
    is ByTitle -> this.sortedBy { it.color }
  }
  is Descending -> when (noteOrder) {
    is ByColor -> this.sortedByDescending { it.title.lowercase() }
    is ByDate -> this.sortedByDescending { it.timestamp }
    is ByTitle -> this.sortedByDescending { it.color }
  }
}
