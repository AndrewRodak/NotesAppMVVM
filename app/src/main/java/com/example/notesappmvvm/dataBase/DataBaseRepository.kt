package com.example.notesappmvvm.dataBase

import androidx.lifecycle.LiveData
import com.example.notesappmvvm.model.Note

interface DataBaseRepository {

    val readAll: LiveData<List<Note>>

    suspend fun create(note: Note, onSuccess: () -> Unit)

    suspend fun update(note: Note, onSuccess: () -> Unit)

    suspend fun delete(note: Note, onSuccess: () -> Unit)


}