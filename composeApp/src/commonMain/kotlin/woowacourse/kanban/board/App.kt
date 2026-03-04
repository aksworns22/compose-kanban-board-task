package woowacourse.kanban.board

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Title

@Composable
@Preview
fun App() {
    TaskCardView(
        title = Title(text = "안녕하세요"),
        description = Description.None,
        tagGroup = TagGroup.None,
        assignee = Assignee(name = "김철수"),
    )
}

@Composable
fun TaskCardView(
    title: Title,
    description: Description,
    tagGroup: TagGroup,
    assignee: Assignee,
) {
    Box(
        modifier = Modifier.border(
            border = BorderStroke(2.dp, Color.Red),
            shape = RoundedCornerShape(8.dp),
        ).width(200.dp).padding(8.dp),
    ) {
        Column {
            Text(title.text)
            when (description) {
                is Description.DescriptionText -> {
                    Text(description.text)
                }

                Description.None -> {}
            }
            when (tagGroup) {
                is TagGroup.Items -> {
                    Text(tagGroup.tags.joinToString { it.text })
                }

                TagGroup.None -> {}
            }
            Text(assignee.name)
        }
    }

}
