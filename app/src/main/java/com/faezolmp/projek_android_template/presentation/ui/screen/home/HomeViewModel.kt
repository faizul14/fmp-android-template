package com.faezolmp.projek_android_template.presentation.ui.screen.home

import androidx.lifecycle.ViewModel
import com.faezolmp.projek_android_template.core.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(useCase: UseCase) : ViewModel()