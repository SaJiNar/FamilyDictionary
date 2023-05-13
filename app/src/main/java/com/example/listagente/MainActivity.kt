package com.example.listagente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listagente.data.Family
import com.example.listagente.data.familiars
import com.example.listagente.theme.FamilyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FamilyTheme {
                FamilyApp()
            }
        }
    }
}

@Composable
fun FamilyApp() /*{
    Scaffold(
        topBar = {
            FamilyTopAppBar()
        }
    ) */{
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)) {
            items(familiars) {
                FamilyItem(family = it)
            }
        }
}

fun FamilyTopAppBar() {
    TODO("Not yet implemented")
}

@Composable
fun FamilyItem(family: Family, modifier: Modifier = Modifier){
    Card(modifier = modifier.padding(8.dp),
        elevation = 4.dp) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            FamilyInformation(family.name)
        }
    }
}

@Composable
fun FamilyInformation(@StringRes familyName: Int, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = stringResource(familyName),
            style = MaterialTheme.typography.h2,
            modifier = modifier.padding(top = 8.dp)
        )
    }
}


@Preview
@Composable
fun FamilyPreview() {
    FamilyTheme(darkTheme = false) {
        FamilyApp()
    }
}

@Preview
@Composable
fun DarkThemePreview() {
    FamilyTheme(darkTheme = true) {
        FamilyApp()

    }
}