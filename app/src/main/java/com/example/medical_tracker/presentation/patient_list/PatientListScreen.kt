package com.example.medical_tracker.presentation.patient_list


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.medical_tracker.domain.model.Patient


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientListScreen(

) {
    val patientList= listOf(
        Patient(
            name = "puni",
            age = "15",
            gender = 1,
            doctorAssigned = "dr.vp",
            prescription = "drink beer"
        ),
        Patient(
            name = "suni",
            age = "9",
            gender = 2,
            doctorAssigned = "dr.kp",
            prescription = "drink ot"
        )
    )

    Scaffold (
        floatingActionButton = {ListFab(onFabClick = {})},
    ) {
        LazyColumn(
           contentPadding = PaddingValues(16.dp),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(patientList){ patient ->
                PatientItem(
                    patient = patient,
                    onItemClicked = {},
                    onDeleteConfirm = {}
                )
            }
        }
        if (patientList.isEmpty()){
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Add Patients Details\n by pressing add button",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}




@Composable
fun ListFab(
    onFabClick: () -> Unit
) {
    FloatingActionButton(
        onClick = onFabClick
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Patient Button"
        )
    }
}