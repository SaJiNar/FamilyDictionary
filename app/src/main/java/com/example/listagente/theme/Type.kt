/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.listagente.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.listagente.R


val Typography:androidx.compose.material.Typography

get() = Typography(
        h1 = TextStyle(
            fontFamily = Arial,
            fontWeight = FontWeight.Normal,
            fontSize = 30.sp
        ),
        h2 = TextStyle(
            fontFamily = Roboto,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        ),
        h3 = TextStyle(
            fontFamily = Roboto,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        ),
        body1 = TextStyle(
            fontFamily = Roboto,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )
    )

val Arial = FontFamily(
    Font(R.font.arial)
)

val Roboto = FontFamily(
    Font(R.font.roboto),
    Font(R.font.roboto_bold, FontWeight.Bold)
)
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

