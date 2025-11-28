package com.mstf.cmp_memecreator.meme_editor.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import cmpmemecreator.composeapp.generated.resources.Res
import cmpmemecreator.composeapp.generated.resources.meme_template_01
import com.mstf.cmp_memecreator.core.presentation.MemeTemplate
import com.mstf.cmp_memecreator.core.theme.MemeCreatorTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MemeEditorScreen(
    memeTemplate: MemeTemplate,
    viewModel: MemeEditorViewModel = viewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    MemeEditorView(
        template = memeTemplate,
        state = state,
        onAction = viewModel::onAction,
    )
}

@Composable
private fun MemeEditorView(
    template: MemeTemplate,
    state: MemeEditorState,
    onAction: (MemeEditorAction) -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(template.drawable),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth,
        )

    }
}

@Preview
@Composable
private fun Preview() {
    MemeCreatorTheme {
        MemeEditorView(
            template = MemeTemplate(
                id = "meme_template_01",
                drawable = Res.drawable.meme_template_01,
            ),
            state = MemeEditorState(),
            onAction = {},
        )
    }
}