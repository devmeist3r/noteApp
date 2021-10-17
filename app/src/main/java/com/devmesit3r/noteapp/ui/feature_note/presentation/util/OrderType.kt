package com.devmesit3r.noteapp.ui.feature_note.presentation.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
