package com.example.pam_act8.ui.home.viewmodel

import com.example.pam_act8.model.Kontak

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val nohp: String = ""
)
fun InsertUiEvent.toKontak() : Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = nohp,
)