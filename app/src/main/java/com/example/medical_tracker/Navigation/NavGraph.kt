package com.example.medical_tracker.Navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.medical_tracker.presentation.patient_details.PatientDetailsScreen
import com.example.medical_tracker.presentation.patient_list.PatientListScreen
import com.example.medical_tracker.util.Constants.PATIENT_DETAILS_ARGUMENT_KEY
import com.example.medical_tracker.view_model.PatientDetailsViewModel

sealed class Screen(val route: String) {
    object PatientList : Screen("patient_list_screen")
    object PatientDetails : Screen(
        "patient_details_screen?$PATIENT_DETAILS_ARGUMENT_KEY=" +
                "{$PATIENT_DETAILS_ARGUMENT_KEY}"
    ) {
        fun passPatientId(patientId: Int? = null): String {
            return "patient_details_screen?$PATIENT_DETAILS_ARGUMENT_KEY=$patientId"
        }
    }
}

@Composable
fun NavGraphSetup(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.PatientList.route
    ) {
        composable(
            route = Screen.PatientList.route
        ) {
            PatientListScreen(
                onFabClick = {
                    navController.navigate(Screen.PatientDetails.route)
                },
                onItemClick = { patientId ->
                    navController.navigate(Screen.PatientDetails.passPatientId(patientId))
                }
            )
        }
        composable(
            route = Screen.PatientDetails.route,
            arguments = listOf(navArgument(name = PATIENT_DETAILS_ARGUMENT_KEY) {
                type = NavType.IntType
                defaultValue = -1
            }
            )
        ) {
            val viewModel: PatientDetailsViewModel = hiltViewModel()
            PatientDetailsScreen(
                navController = navController,
                viewModel = viewModel,
                onBackClicked = { navController.navigateUp() },
                onSuccessfullySaving = { navController.navigateUp() }
            )
        }
    }
}