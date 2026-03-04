package woowacourse.kanban.board

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.account_circle_icon
import org.jetbrains.compose.resources.painterResource
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Title

@Composable
@Preview
fun App() {

    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.DescriptionText.of("아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트"),
            tagGroup = TagGroup.Items(tags = listOf(Tag("철수"), Tag("영희"), Tag("길123동"), Tag("퉁123퉁"), Tag("진123구"))),
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )

        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.DescriptionText.of("아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트"),
            tagGroup = TagGroup.Items(tags = listOf(Tag("철수"), Tag("영희"), Tag("길123동"), Tag("퉁123퉁"), Tag("진123구"))),
            assignee = Assignee(name = "김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수김철수"),
        )

        TaskCardView(
            title = Title(text = "123안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요안녕하세요"),
            description = Description.DescriptionText.of("아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트아주 긴 텍스트"),
            tagGroup = TagGroup.Items(tags = listOf(Tag("철수"), Tag("영희"), Tag("길123동"), Tag("퉁123퉁"), Tag("진123구"))),
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
            TitleView(title = title)
            Spacer(modifier = Modifier.height(16.dp))
            DescriptionView(description = description)
            Spacer(modifier = Modifier.height(16.dp))
            TagGroupView(tagGroup = tagGroup)
            Spacer(modifier = Modifier.height(16.dp))
            AssigneeView(assignee = assignee)
        }
    }
}

@Composable
fun TitleView(title: Title) {
    Text(title.text,
        overflow = TextOverflow.Ellipsis, maxLines = 1)
}

@Composable
fun DescriptionView(description: Description) {
    when (description) {
        is Description.DescriptionText -> {
            Text(description.text, overflow = TextOverflow.Ellipsis, maxLines = 2)
        }

        Description.None -> {}
    }
}

@Composable
fun TagGroupView(tagGroup: TagGroup) {
    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
        when (tagGroup) {
            is TagGroup.Items -> {
                tagGroup.tags.forEach {
                    TagView(tag = it)
                }
            }
            TagGroup.None -> {}
        }
    }
}

@Composable
fun TagView(tag: Tag) {
    Text(tag.text, modifier = Modifier.background(Color.Gray))
}

@Composable
fun AssigneeView(assignee: Assignee) {
    Row {
        Icon(
            painter = painterResource(Res.drawable.account_circle_icon),
            contentDescription = "사용자 기본 이미지"
        )
        Text(assignee.name,
            overflow = TextOverflow.Ellipsis, maxLines = 1)
    }
}
