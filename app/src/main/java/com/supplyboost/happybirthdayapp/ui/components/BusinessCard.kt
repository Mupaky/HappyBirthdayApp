package com.supplyboost.happybirthdayapp.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supplyboost.happybirthdayapp.R


class BusinessCard {

    @SuppressLint("NotConstructor")
    @Composable
    fun BusinessCard() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top Section (Logo, Name, Title)
            TopSection()

            // Bottom Section (Contact Information)
            BottomSection()
        }
    }

    @Composable
    fun TopSection() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.87f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo), // Replace with your logo
                contentDescription = "Android Logo",
                modifier = Modifier.size(120.dp)
            )
            Text(
                text = "Your Name",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "Your Title",
                fontSize = 16.sp
            )
        }
    }

    @Composable
    fun BottomSection() {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(modifier = Modifier.padding(top = 16.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "Phone",
                    tint = Color(0xFF3ddc84) // Example color
                )
                Text(
                    text = "+359 123 4567890",
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "Share Email",
                    tint = Color(0xFF3ddc84) // Example color
                )
                Text(
                    text = "@Mupaky",
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            Row(modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email",
                    tint = Color(0xFF3ddc84) // Example color
                )
                Text(
                    text = "yourname@email.com",
                    modifier = Modifier.padding(start = 16.dp)
                )
            }// Add more contact information rows as needed
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        BusinessCard()
    }
}