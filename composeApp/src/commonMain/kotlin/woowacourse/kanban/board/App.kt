package woowacourse.kanban.board

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Title
import woowacourse.kanban.board.view.TaskCardView

@Composable
@Preview
fun App() {

    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.DescriptionText.of("아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트"),
            tagGroup = TagGroup.None,
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )

        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.None,
            tagGroup = TagGroup.Items(tags = listOf(Tag("철수"), Tag("영희"), Tag("길123동"), Tag("퉁123퉁"), Tag("진123구"))),
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )

        TaskCardView(
            title = Title(text = "너무너무 긴 제목은 한 줄까지만 노출됩니다"),
            description = Description.None,
            tagGroup = TagGroup.None,
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )

        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.DescriptionText.of("아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트"),
            tagGroup = TagGroup.Items(tags = listOf(Tag("철수"), Tag("영희"), Tag("길123동"), Tag("퉁123퉁"), Tag("진123구"))),
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )
    }

}
