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
import woowacourse.kanban.board.model.Title
import woowacourse.kanban.board.view.TaskCardView

@Composable
@Preview
fun App() {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier.padding(20.dp),
    ) {
        TaskCardView(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.DescriptionText.of("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
            tagGroup = TagGroup.Items(tags = listOf(Tag("컴포넌트"), Tag("성능"))),
            assignee = Assignee(name = "다이노"),
        )

        TaskCardView(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.None,
            tagGroup = TagGroup.Items(tags = listOf(Tag("컴포넌트"), Tag("성능"))),
            assignee = Assignee(name = "다이노"),
        )

        TaskCardView(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.DescriptionText.of("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
            tagGroup = TagGroup.None,
            assignee = Assignee(name = "다이노"),
        )

        TaskCardView(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.None,
            tagGroup = TagGroup.None,
            assignee = Assignee(name = "다이노"),
        )

        TaskCardView(
            title = Title(text = "너무너무 긴 제목은 한 줄까지만 노출됩니다"),
            description = Description.DescriptionText.of("너무너무너무 긴 설명은 두 줄까지만 노출하고 말줄임표로 처리합니다 두 줄까지만 노출하고 말줄임표로 처리합니다"),
            tagGroup = TagGroup.Items(tags = listOf(Tag("너무너무"), Tag("긴 태그"), Tag("최대로"), Tag("5자까지"), Tag("5개제한임"))),
            assignee = Assignee(name = "너무너무너무 긴 담당자도 한 줄까지만 노출됩니다"),
        )
    }

}
