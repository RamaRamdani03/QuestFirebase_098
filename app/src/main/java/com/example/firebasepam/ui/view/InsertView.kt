package com.example.firebasepam.ui.view

import FormErrorState
import MahasiswaEvent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormMahasiswa(
    mahasiswaEvent: MahasiswaEvent = MahasiswaEvent(),
    onValueChange: (MahasiswaEvent) -> Unit,
    errorState: FormErrorState = FormErrorState(),
    modifier: Modifier = Modifier
) {

}