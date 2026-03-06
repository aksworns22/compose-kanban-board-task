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
import androidx.compose.ui.unit.dp
import kanbanboard.composeapp.generated.resources.Res
import kanbanboard.composeapp.generated.resources.account_circle_icon
import org.jetbrains.compose.resources.painterResource
import woowacourse.kanban.board.design.FontSize
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Title

@Composable
fun TaskCard(title: Title, description: Description, tagGroup: TagGroup, assignee: Assignee) {
    Box(
        modifier = Modifier.border(
            border = BorderStroke(1.dp, Color.LightGray),
            shape = RoundedCornerShape(8.dp),
        ).width(250.dp).padding(8.dp),
    ) {
        Column {
            TitleText(title = title, modifier = Modifier.padding(8.dp))
            if (!description.isEmpty()) {
                DescriptionText(description = description)
            }
            if (!tagGroup.isEmpty()) {
                TagBadgeGroup(tagGroup = tagGroup)
            }
            HorizontalDivider(modifier = Modifier.background(Color.Gray))
            AssigneeProfile(assignee = assignee)
        }
    }
}

@Composable
private fun TitleText(title: Title, modifier: Modifier = Modifier) {
    Text(
        text = title.text,
        fontSize = FontSize.TITLE.size,
        overflow = TextOverflow.Ellipsis, maxLines = 1,
        modifier = modifier
    )
}

@Composable
private fun DescriptionText(description: Description) {
    Text(
        text = description.text,
        fontSize = FontSize.DESCRIPTION.size,
        overflow = TextOverflow.Ellipsis,
        maxLines = 2,
        modifier = Modifier.padding(8.dp),
        color = Color.DarkGray,
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
            painter = painterResource(Res.drawable.account_circle_icon),
            contentDescription = "사용자 기본 이미지",
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = assignee.name,
            fontSize = FontSize.ASSIGNEE.size,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis, maxLines = 1,
        )
    }
}
