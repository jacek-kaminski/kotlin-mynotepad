package com.jkcoding.mynotepad.feature_note.presentation.note_list

import com.jkcoding.mynotepad.feature_note.domain.model.Note
import com.jkcoding.mynotepad.feature_note.domain.util.NoteOrder
import com.jkcoding.mynotepad.feature_note.domain.util.NoteOrder.ByDate
import com.jkcoding.mynotepad.feature_note.domain.util.OrderType.Descending

data class NotesState(
  val notes: List<Note> = emptyList(),
  val noteOrder: NoteOrder = ByDate(Descending),
  val isOrderSectionVisible: Boolean = false
)
