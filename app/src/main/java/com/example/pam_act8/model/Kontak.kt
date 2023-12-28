package com.example.pam_act8.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val name: String,
    @SerialName("email")
    val alamat: String,
    @SerialName("nohp")
    val telpon: String,
)
