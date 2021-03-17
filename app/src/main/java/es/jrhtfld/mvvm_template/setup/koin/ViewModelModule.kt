package es.jrhtfld.mvvm_template.setup.koin

import es.jrhtfld.mvvm_template.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModuleModule = module {

    viewModel { HomeViewModel(get()) }

}
