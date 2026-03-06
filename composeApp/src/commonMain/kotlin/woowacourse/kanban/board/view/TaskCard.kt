package woowacourse.kanban.board.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.account_circle
import org.jetbrains.compose.resources.painterResource
import woowacourse.kanban.board.design.CustomColor
import woowacourse.kanban.board.design.TextSize
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Task
import woowacourse.kanban.board.model.Title

@Composable
fun TaskCard(
    task: Task,
    modifier: Modifier = Modifier,
    width: Dp = 286.dp,
    backgroundColor: Color = Color.White,
    cornerRadius: Dp = 10.dp,
    borderColor: Color = CustomColor.GRAY_TASK_CARD_BORDER,
    borderWidth: Dp = Dp.Hairline,
    padding: Dp = 17.dp
) {
    Box(
        modifier = Modifier.width(width).background(backgroundColor, RoundedCornerShape(cornerRadius))
            .border(BorderStroke(borderWidth, borderColor), RoundedCornerShape(cornerRadius))
            .padding(padding).then(modifier),
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            TitleText(title = task.title)
            if (!task.description.isEmpty()) {
                DescriptionText(description = task.description)
            }
            if (!task.tagGroup.isEmpty()) {
                TagBadgeGroup(tagGroup = task.tagGroup)
            }
            HorizontalDivider(modifier = Modifier.background(Color.Gray))
            AssigneeProfile(assignee = task.assignee)
        }
    }
}

@Composable
private fun TitleText(title: Title, modifier: Modifier = Modifier) {
    Text(
        text = title.text,
        color = CustomColor.BLUE_TASK_TITLE,
        fontWeight = FontWeight.W500,
        fontSize = TextSize.LARGE,
        overflow = TextOverflow.Ellipsis, maxLines = 1,
        modifier = modifier,
    )
}

@Composable
private fun DescriptionText(description: Description) {
    Text(
        text = description.text,
        color = CustomColor.GRAY_TASK_DESCRIPTION,
        fontSize = TextSize.MEDIUM,
        overflow = TextOverflow.Ellipsis,
        maxLines = 2,
    )
}

@Composable
private fun TagBadgeGroup(tagGroup: TagGroup, modifier: Modifier = Modifier) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier.padding(8.dp),
    ) {
        tagGroup.tags.forEach {
            TagBadge(tag = it)
        }
    }
}

@Composable
private fun AssigneeProfile(assignee: Assignee) {
    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(Res.drawable.account_circle),
            contentDescription = "사용자 기본 이미지",
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = assignee.name,
            fontSize = TextSize.MEDIUM,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis, maxLines = 1,
        )
    }
}

@Composable
@Preview
private fun PreviewTaskCard(@PreviewParameter(TaskProvider::class) task: Task) {
    TaskCard(task = task)
}

private class TaskProvider : PreviewParameterProvider<Task> {
    override val values = sequenceOf(
        Task(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
            tagGroup = TagGroup(tags = listOf(Tag("컴포넌트"), Tag("성능"))),
            assignee = Assignee(name = "다이노"),
        ),
        Task(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.empty,
            tagGroup = TagGroup(tags = listOf(Tag("컴포넌트"), Tag("성능"))),
            assignee = Assignee(name = "다이노"),
        ),
        Task(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용합니다."),
            tagGroup = TagGroup(tags = listOf()),
            assignee = Assignee(name = "다이노"),
        ),
        Task(
            title = Title(text = "LazyColumn 컴포넌트 구현"),
            description = Description.empty,
            tagGroup = TagGroup(tags = listOf()),
            assignee = Assignee(name = "다이노"),
        ),
        Task(
            title = Title(text = "너무너무 긴 제목은 한 줄까지만 노출됩니다"),
            description = Description("너무너무너무 긴 설명은 두 줄까지만 노출하고 말줄임표로 처리합니다 두 줄까지만 노출하고 말줄임표로 처리합니다"),
            tagGroup = TagGroup(tags = listOf(Tag("너무너무"), Tag("긴 태그"), Tag("최대로"), Tag("5자까지"), Tag("5개제한임"))),
            assignee = Assignee(name = "너무너무너무 긴 담당자도 한 줄까지만 노출됩니다"),
        ),
    )
}
