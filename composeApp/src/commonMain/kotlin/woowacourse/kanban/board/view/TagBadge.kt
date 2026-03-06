package woowacourse.kanban.board.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.design.FontSize
import woowacourse.kanban.board.model.Tag

@Composable
fun TagBadge(
    tag: Tag,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFDEDEDE),
    cornerRadius: Dp = 10.dp,
    contentPadding: Dp = 4.dp,
) {
    Text(
        text = tag.text,
        fontSize = FontSize.TAG.size,
        modifier = modifier.background(color = backgroundColor, shape = RoundedCornerShape(cornerRadius)).padding(contentPadding),
    )
}
