package com.mstf.cmp_memecreator.meme_editor.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mstf.cmp_memecreator.core.theme.MemeCreatorTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MemeEditorScreen(
    viewModel: MemeEditorViewModel = viewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    MemeEditorView(
        state = state,
        onAction = viewModel::onAction,
    )


}

@Composable
private fun MemeEditorView(
    state: MemeEditorState,
    onAction: (MemeEditorAction) -> Unit,
) {

}

@Preview
@Composable
private fun Preview() {
    MemeCreatorTheme {
        MemeEditorView(
            state = MemeEditorState(),
            onAction = {},
        )
    }
}