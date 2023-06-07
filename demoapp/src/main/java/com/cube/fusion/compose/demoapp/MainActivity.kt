package com.cube.fusion.compose.demoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text

/**
 * Main activity for the demo of Fusion AndroidUi
 *
 * Created by JR Mitchell on 07/June/2023.
 * Copyright ® 3SidedCube. All rights reserved.
 */
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			Text(text = "Hello World!")
		}
	}
}