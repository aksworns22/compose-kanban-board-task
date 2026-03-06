package woowacourse.kanban.board.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import woowacourse.kanban.board.design.TextSize
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
        fontSize = TextSize.SMALL,
        modifier = modifier.background(color = backgroundColor, shape = RoundedCornerShape(cornerRadius)).padding(contentPadding),
    )
}

@Composable
@Preview
@PreviewFontScale
private fun PreviewTagBadge(@PreviewParameter(PreviewTagProvider::class) tag: Tag) {
    TagBadge(tag = tag)
}

private class PreviewTagProvider : PreviewParameterProvider<Tag> {
    override val values = sequenceOf(Tag("컴포넌트"), Tag("성능"), Tag("너무너무"), Tag("5개제한임"))
}
