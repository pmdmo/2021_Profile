package es.iessaladillo.pedrojoya.profile.utils

import com.google.android.material.textfield.TextInputLayout

inline fun TextInputLayout.checkValid(errorMessage: String, validation: () -> Boolean): Boolean {
    val valid = validation()
    if (valid) {
        error = null
    } else {
        error = errorMessage
    }
    return valid
}

