package com.example.firebasepam.reopository

import com.example.firebasepam.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository {


        suspend fun getMahasiswa(): Flow<List<Mahasiswa>>

        suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

        suspend fun updateMahasiswa(nim:String, mahasiswa: Mahasiswa)

        suspend fun deleteMahasiswa(nim: Mahasiswa)

        suspend fun getMahasiswaById(nim: String): Flow<Mahasiswa>


}