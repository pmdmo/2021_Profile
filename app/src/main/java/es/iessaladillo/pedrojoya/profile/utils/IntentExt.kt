package es.iessaladillo.pedrojoya.profile.utils

import android.content.Intent
import android.net.Uri

fun newViewUriIntent(uri: Uri): Intent {
    return Intent(Intent.ACTION_VIEW, uri)
}

fun newEmailIntent(email: String): Intent {
    return Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
}

fun newDialIntent(phoneNumber: String): Intent {
    return Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber.trim { it <= ' ' }))
}

fun newSearchInMapIntent(text: String): Intent {
    return Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=$text"))
}

