package com.jkcoding.mynotepad.feature_note.domain.repository

import com.jkcoding.mynotepad.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>
}