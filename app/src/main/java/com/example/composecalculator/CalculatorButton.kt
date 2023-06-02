package com.example.composecalculator

import android.icu.text.SymbolTable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
//    content of the button
    symbol: String,
//    change the attributes, width, color of button
    modifier: Modifier,
//    for on click
    onClick: () -> Unit,
){
    Box(
        //Inner content (numbers) will be centered
        contentAlignment = Alignment.Center,
        // Attributes. New modifier.
        modifier = Modifier
            //"clip" the shape to a circle.
            .clip(CircleShape)
            //onClick function from the args used.
            .clickable { onClick() }
            //mod from the args then used.
            //this can also be used at the beginning, but this way it is applied at the end.
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White,
        )
    }
}