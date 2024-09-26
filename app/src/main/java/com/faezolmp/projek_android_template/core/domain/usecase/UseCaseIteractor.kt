package com.faezolmp.projek_android_template.core.domain.usecase

import com.faezolmp.projek_android_template.core.data.Resource
import com.faezolmp.projek_android_template.core.domain.model.ExampleModel
import com.faezolmp.projek_android_template.core.domain.repository.Repository
import javax.inject.Inject

class UseCaseIteractor @Inject constructor(private val repository: Repository) : UseCase {
    override fun exampleFunction(): Resource<ExampleModel> {
        return repository.invoke()
    }
}