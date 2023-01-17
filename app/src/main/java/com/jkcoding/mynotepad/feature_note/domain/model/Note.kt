package com.jkcoding.mynotepad.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    //todo add category
    @PrimaryKey val id: Int? = null
) {
}