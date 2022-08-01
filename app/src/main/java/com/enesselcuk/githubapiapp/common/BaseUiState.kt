package com.enesselcuk.githubapiapp.common

import android.view.View


open class BaseUiState {
    fun getViewVisibility(isVisible: Boolean?) = if (isVisible == true) View.VISIBLE else View.GONE
}
