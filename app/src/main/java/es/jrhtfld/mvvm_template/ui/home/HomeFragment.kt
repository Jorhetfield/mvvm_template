package es.jrhtfld.mvvm_template.ui.home

import es.jrhtfld.mvvm_template.databinding.*
import es.jrhtfld.mvvm_template.setup.extension.*
import es.jrhtfld.mvvm_template.ui.base.BaseFragment
import es.jrhtfld.mvvm_template.ui.base.BaseViewModel
import es.jrhtfld.mvvm_template.ui.customview.CustomToolbar
import kotlinx.android.synthetic.main.home_layout.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeLayoutBinding>() {

    private val homeViewModel by viewModel<HomeViewModel>()

    override fun initializeBinding(): HomeLayoutBinding {
        binding = HomeLayoutBinding.inflate(layoutInflater, constraintContainer, false)
        return binding
    }

    override fun setToolbar() {
        provideCustomToolbar().apply {
            initToolbar(CustomToolbar.ToolbarItemMenu.EmptyItem)
            visible()
            hideDoneCancelButtons()
        }
    }

    override fun initView() {
        homeViewModel.init()

        with(binding) {

        }

    }

}
