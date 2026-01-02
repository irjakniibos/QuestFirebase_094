package com.example.questfirebase_094.viewmodel

import com.example.questfirebase_094.modeldata.Siswa

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<Siswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}