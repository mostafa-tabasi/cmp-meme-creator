package com.mstf.cmp_memecreator.di

import com.mstf.cmp_memecreator.meme_editor.presentation.MemeEditorViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MemeEditorViewModel)
}