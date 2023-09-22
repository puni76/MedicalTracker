package com.example.medical_tracker.presentation.patient_details

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class PatientDetailsViewModel(): ViewModel() {

    var state by mutableStateOf(PatientDetailsUiState())

    fun onEvent(event: PatientDetailsEvent){
        when(event){
            is PatientDetailsEvent.EnteredAge -> {
                state = state.copy(age = event.age)
            }
            is PatientDetailsEvent.EnteredAssignedDoctor ->{
                state = state.copy(doctorAssigned = event.doctor)
            }
            is PatientDetailsEvent.EnteredName -> {
                state = state.copy(name = event.name)
            }
            is PatientDetailsEvent.EnteredPrescription -> {
                state = state.copy(prescription = event.prescription)
            }
            PatientDetailsEvent.SelectedFemale -> {
                state = state.copy(gender =2)
            }
            PatientDetailsEvent.SelectedMale -> {
                state = state.copy(gender = 1)
            }
            PatientDetailsEvent.SaveButton -> TODO()

        }
    }

}

