package woowacourse.kanban.board.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.design.FontSize

@Composable
fun TagView(tag: Tag) {
    Text(
        text = tag.text,
        fontSize = FontSize.TAG.size,
        modifier = Modifier.background(Color(0xFFDEDEDE), RoundedCornerShape(10.dp)).padding(4.dp),
    )
}
