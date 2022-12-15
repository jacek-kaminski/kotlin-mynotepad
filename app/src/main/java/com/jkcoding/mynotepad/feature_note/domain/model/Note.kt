package com.jkcoding.mynotepad.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    @PrimaryKey val id: Int? = null
) {
}