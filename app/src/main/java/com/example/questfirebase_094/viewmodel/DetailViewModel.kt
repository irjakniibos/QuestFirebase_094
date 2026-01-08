package com.example.questfirebase_094.viewmodel

@file:OptIn(InternalSerializationApi::class)



sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(savedStateHandle: SavedStateHandle, private val repositorySiswa: RepositorySiswa) : ViewModel() {

    private val idSiswa: Long =
        checkNotNull(savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong())
            ?: error("idSiswa tidak ditemukan di SavedStateHandle")

    var statusUIDetail: StatusUIDetail by mutableStateOf(StatusUIDetail.Loading)
        private set

    init {
        getSatuSiswa()
    }


}