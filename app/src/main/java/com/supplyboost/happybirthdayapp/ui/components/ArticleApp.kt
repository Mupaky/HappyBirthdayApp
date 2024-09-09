package com.supplyboost.happybirthdayapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supplyboost.happybirthdayapp.R

class ArticleApp {



    @Composable
    fun ComposeArticleApp(){
        val image = painterResource(id = R.drawable.bg_compose_background) // Replace with your actual image resource

        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = image,
                contentDescription = null, // Provide a meaningful description if possiblemodifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
            Text(
                text = stringResource(R.string.jetpack_compose_tutorial_title), // Replace with your actual string resource
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = stringResource(R.string.jetpack_compose_tutorial_first_text), // Replace with your actual string resource
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = stringResource(R.string.jetpack_compose_tutorial_exmplanation), // Replace with your actual string resource
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ComposeArticleAppPreview() {
        ComposeArticleApp()
    }

}