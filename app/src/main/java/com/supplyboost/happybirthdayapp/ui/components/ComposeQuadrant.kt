package com.supplyboost.happybirthdayapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.supplyboost.happybirthdayapp.R

class ComposeQuadrant {

    @Composable
    fun ComposableInfoScreen() {
        val composableInfoList = listOf(
            ComposableInfo(stringResource(R.string.text_composable_title),
                stringResource(R.string.text_composable_content),
                Color(0xFFEADDFF)),
            ComposableInfo(stringResource(R.string.image_composable_title),
                stringResource(R.string.image_composable_content),
                Color(0xFFD0BCFF)),
            ComposableInfo(
                stringResource(R.string.row_composable_title),
                stringResource(R.string.row_composable_content),
                Color(0xFFB69DF8)
            ),
            ComposableInfo(stringResource(R.string.column_composable_title),
                stringResource(R.string.column_composable_content),
                Color(0xFFF6EDFF))
        )

        Column(modifier = Modifier.fillMaxWidth()) { // Use a Column to arrange the rows
            Row(modifier = Modifier.weight(1f)) {
                ComposableInfoCard(composableInfoList[0],
                    modifier = Modifier.weight(1f))
                ComposableInfoCard(composableInfoList[1],
                    modifier = Modifier.weight(1f))
            }
            Row(modifier = Modifier.weight(1f)) {
                ComposableInfoCard(composableInfoList[2],
                    modifier = Modifier.weight(1f))
                ComposableInfoCard(composableInfoList[3],
                    modifier = Modifier.weight(1f))
            }
        }
    }

    @Composable
    fun ComposableInfoCard(info: ComposableInfo, modifier: Modifier = Modifier) {Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = info.backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = info.title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = info.description,
                textAlign = TextAlign.Justify
            )
        }
    }
    }

    data class ComposableInfo(
        val title: String,
        val description: String,
        val backgroundColor: Color
    )

    @Preview(showBackground = true)
    @Composable
    fun ComposableInfoScreenPreview() {
        ComposableInfoScreen()
    }
}