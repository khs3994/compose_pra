package khs.compose.compose_pra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import khs.compose.compose_pra.ui.theme.Compose_praTheme

class BoxActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box( // 전체 속성
                modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Box( // 텍스트 1의 속성
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Text("텍스트 1입니다")
                }
                Box( //텍스트 2의 속성
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text("텍스트 2입니다")
                }
            }
        }
    }
}