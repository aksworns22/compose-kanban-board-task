package woowacourse.kanban.board.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import woowacourse.kanban.board.model.Title


@Composable
fun TitleView(title: Title) {
    Text(
        text = title.text,
        fontSize = 17.sp,
        overflow = TextOverflow.Ellipsis, maxLines = 1,
        modifier = Modifier.padding(8.dp),
    )
}
