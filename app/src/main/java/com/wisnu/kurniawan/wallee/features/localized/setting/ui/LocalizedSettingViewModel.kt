package com.wisnu.kurniawan.wallee.features.localized.setting.ui

import androidx.lifecycle.viewModelScope
import com.wisnu.kurniawan.wallee.R
import com.wisnu.kurniawan.wallee.features.localized.setting.data.ILocalizedSettingEnvironment
import com.wisnu.kurniawan.wallee.foundation.extension.select
import com.wisnu.kurniawan.wallee.foundation.viewmodel.StatefulViewModel
import com.wisnu.kurniawan.wallee.model.Language
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class LocalizedSettingViewModel @Inject constructor(localizedSettingEnvironment: ILocalizedSettingEnvironment) :
    StatefulViewModel<LocalizedSettingState, LocalizedEffect, LocalizedSettingAction, ILocalizedSettingEnvironment>(LocalizedSettingState(), localizedSettingEnvironment) {

    init {
        initLanguage()
    }

    override fun dispatch(action: LocalizedSettingAction) {
        when (action) {
            is LocalizedSettingAction.SelectLanguage -> {
                viewModelScope.launch {
                    environment.setLanguage(action.selected.language)
                }
            }
        }
    }

    private fun initLanguage() {
        viewModelScope.launch(environment.dispatcherMain) {
            environment.getLanguage()
                .collect {
                    if (state.value.items.isNotEmpty()) {
                        setEffect(LocalizedEffect.ApplyLanguage(it))
                    }

                    setState { copy(items = initial().select(it)) }
                }
        }
    }

    private fun initial() = listOf(
        LanguageItem(
            title = R.string.setting_language_english,
            language = Language.ENGLISH,
            applied = false
        ),
        LanguageItem(
            title = R.string.setting_language_indonesia,
            language = Language.INDONESIA,
            applied = false
        ),
    )

}
