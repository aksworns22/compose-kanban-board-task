package woowacourse.kanban.board

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Task
import woowacourse.kanban.board.model.Title
import woowacourse.kanban.board.view.TaskCard

@Composable
@Preview
fun App() {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier.padding(20.dp),
    ) {
        TaskCard(
            task = Task(
                title = Title(text = "LazyColumn 컴포넌트 구현"),
                description = Description("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
                tagGroup = TagGroup(tags = listOf(Tag("컴포넌트"), Tag("성능"))),
                assignee = Assignee(name = "다이노"),
            ),
        )
    }
}
