package com.mstf.cmp_memecreator.meme_editor.presentation

import androidx.compose.ui.unit.IntSize
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class MemeEditorViewModel() : ViewModel() {

    private var hasLoadedInitialData = false

    private val _state = MutableStateFlow(MemeEditorState())
    val state = _state
        .onStart {
            if (!hasLoadedInitialData) {
                // load initial data here
                hasLoadedInitialData = true
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5_000L),
            initialValue = MemeEditorState(),
        )

    fun onAction(action: MemeEditorAction) {
        when (action) {
            is MemeEditorAction.OnAddTextClick -> TODO()
            is MemeEditorAction.OnCancelLeaveWithoutSaving -> TODO()
            is MemeEditorAction.OnConfirmLeaveWithoutSaving -> TODO()
            is MemeEditorAction.OnContainerSizeChange -> updateContainerSize(action.size)
            is MemeEditorAction.OnDeleteMemeTextClick -> TODO()
            is MemeEditorAction.OnEditMemeText -> TODO()
            is MemeEditorAction.OnGoBackClick -> TODO()
            is MemeEditorAction.OnMemeTextChange -> TODO()
            is MemeEditorAction.OnMemeTextTransformChange -> TODO()
            is MemeEditorAction.OnSaveMemeClick -> TODO()
            is MemeEditorAction.OnSelectMemeText -> TODO()
            is MemeEditorAction.OnTapOutsideSelectedText -> TODO()
        }
    }

    private fun updateContainerSize(size: IntSize) {
        _state.update {
            it.copy(
                templateSize = size
            )
        }
    }
}