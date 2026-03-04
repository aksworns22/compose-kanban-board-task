package woowacourse.kanban.board.view

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.account_circle_icon
import org.jetbrains.compose.resources.painterResource
import woowacourse.kanban.board.model.Assignee

@Composable
fun AssigneeView(assignee: Assignee) {
    Row(modifier = Modifier.padding(8.dp, 8.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(Res.drawable.account_circle_icon),
            contentDescription = "사용자 기본 이미지",
        )
        Text(
            assignee.name,
            overflow = TextOverflow.Ellipsis, maxLines = 1,
        )
    }
}
