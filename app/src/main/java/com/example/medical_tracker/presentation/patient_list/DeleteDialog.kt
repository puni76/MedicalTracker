package com.example.medical_tracker.presentation.patient_list

import android.os.Message
import android.widget.AutoCompleteTextView.OnDismissListener
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.room.Delete

@Composable
fun DeleteDialog(
    title:String,
    message: String,
    onDialogDismiss : ()-> Unit,
        onConfirmButtonClicked : ()-> Unit,
){
    AlertDialog(
        title = {
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyLarge
                )
        },
        text = {
            Text(
                text = message,
                style = MaterialTheme.typography.bodyLarge
            )
        },
        onDismissRequest = { onDialogDismiss() },
        confirmButton = {
            TextButton(
                onClick = {onConfirmButtonClicked }
            ) {
            Text(text = "Yes")
        }
    },
        dismissButton = {
            TextButton(
                onClick = {onDialogDismiss }
            ) {
                Text(text = "No")
            }
        }
    )
}