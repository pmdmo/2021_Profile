package es.iessaladillo.pedrojoya.profile.data.local

import es.iessaladillo.pedrojoya.profile.data.local.entity.Avatar

interface DataSource {
    fun queryAllAvatars(): List<Avatar>
}