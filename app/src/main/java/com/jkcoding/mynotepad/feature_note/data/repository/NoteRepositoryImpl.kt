package com.jkcoding.mynotepad.feature_note.data.repository

import com.jkcoding.mynotepad.feature_note.data.data_source.NoteDao
import com.jkcoding.mynotepad.feature_note.domain.model.Note
import com.jkcoding.mynotepad.feature_note.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
  private val dao: NoteDao
) : NoteRepository {

  override fun getNotes() = dao.getNotes()

  override suspend fun getNoteById(id: Int) = dao.getNoteById(id)

  override suspend fun insertNote(note: Note) {
    dao.insertNote(note)
  }

  override suspend fun deleteNote(note: Note) {
    dao.deleteNote(note)
  }
}