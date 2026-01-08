package com.example.questfirebase_094.viewmodel

@file:OptIn(InternalSerializationApi::class)



sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

