package com.example.notesappmvvm.dataBase.room.dao.repository

import androidx.lifecycle.LiveData
import com.example.notesappmvvm.dataBase.DataBaseRepository
import com.example.notesappmvvm.dataBase.room.dao.AppRoomDatabase
import com.example.notesappmvvm.dataBase.room.dao.NoteRoomDao
import com.example.notesappmvvm.model.Note

class RoomRepository(private val noteRoomDao: NoteRoomDao) : DataBaseRepository {
    override val readAll: LiveData<List<Note>>
        get() = noteRoomDao.getAllNotes()

    override suspend fun create(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.addNote(note = note)
        onSuccess()
    }

    override suspend fun update(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.updateNote(note = note)
        onSuccess()
    }

    override suspend fun delete(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.deleteNote(note = note)
        onSuccess()
    }


}