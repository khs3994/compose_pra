package khs.compose.compose_pra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import khs.compose.compose_pra.ui.theme.Compose_praTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val scrollState = rememberScrollState() // 스크롤 상태를 기억해주는 객체
//            //1번째 방법 컬럼을 활용해서 list 만들기
//            Column(
//                modifier = Modifier
//                    .background(color = Color.Green)
//                    .fillMaxWidth()
//                    .verticalScroll(scrollState)
//            ) {
//                for (i in 1..50) {
//                    Text("텍스트 $i")
//                }
//            }

            LazyColumn(
                modifier = Modifier
                    .background(color = Color.Green)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                item {
                    Text("헤더")
                }
                items(50){ index ->
                    Text("강민제 $index")
                }
                item {
                    Text("못생김")
                }
            }
        }
    }
}