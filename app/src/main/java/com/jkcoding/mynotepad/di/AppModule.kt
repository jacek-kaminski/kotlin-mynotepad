package com.jkcoding.mynotepad.di

import android.app.Application
import androidx.room.Room
import com.jkcoding.mynotepad.feature_note.data.data_source.NoteDao
import com.jkcoding.mynotepad.feature_note.data.data_source.NoteDatabase
import com.jkcoding.mynotepad.feature_note.data.repository.NoteRepositoryImpl
import com.jkcoding.mynotepad.feature_note.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application) =
        Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()

    @Provides
    @Singleton
    fun provideNoteRepository(dao: NoteDao): NoteRepository = NoteRepositoryImpl(dao)
}