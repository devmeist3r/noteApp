package com.devmesit3r.noteapp.ui.feature_note.domain.use_case

import com.devmesit3r.noteapp.ui.feature_note.domain.repository.NoteRepository
import com.devmesit3r.noteapp.ui.feature_note.domain.model.Note

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}