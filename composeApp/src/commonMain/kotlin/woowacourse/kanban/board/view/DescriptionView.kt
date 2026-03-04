package woowacourse.kanban.board.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.design.FontSize

@Composable
fun DescriptionView(description: Description) {
    when (description) {
        is Description.Content -> {
            Text(
                text = description.text,
                fontSize = FontSize.DESCRIPTION.size,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(8.dp),
                color = Color.DarkGray,
            )
        }

        Description.None -> {}
    }
}
