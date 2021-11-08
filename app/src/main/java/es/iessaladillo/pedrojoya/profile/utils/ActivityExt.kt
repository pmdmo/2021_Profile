package es.iessaladillo.pedrojoya.profile.utils

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar
import es.iessaladillo.pedrojoya.profile.R

fun Activity.hideSoftKeyboard(): Boolean {
    val imm = getSystemService(
        Context.INPUT_METHOD_SERVICE) as? InputMethodManager
    return imm?.hideSoftInputFromWindow(currentFocus?.windowToken, 0) ?: false
}

fun Activity.showSnackbar(
    message: String,
    length: Int = Snackbar.LENGTH_SHORT,
) {
    Snackbar.make(currentFocus!!, message, length).show()
}

inline fun Activity.tryStartActivity(
    intent: Intent,
    onError: () -> Unit = { }
) {
    try {
        startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        onError()
    }
}