package woowacourse.kanban.board.design

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

enum class FontSize(val size: TextUnit) {
    TITLE(17.sp),
    DESCRIPTION(14.sp),
    TAG(12.sp),
    ASSIGNEE(14.sp),
}
