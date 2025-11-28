package com.mstf.cmp_memecreator

import androidx.compose.runtime.Composable
import com.mstf.cmp_memecreator.core.presentation.NavigationRoot
import com.mstf.cmp_memecreator.core.theme.MemeCreatorTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MemeCreatorTheme {
        NavigationRoot()
    }
}