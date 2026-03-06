package woowacourse.kanban.board.model

import org.assertj.core.api.Assertions.assertThatThrownBy
import kotlin.test.Test

class AssigneeTest {
    @Test
    fun `담당자는 빈 텍스트일 수 없다`() {
        assertThatThrownBy {
            Assignee("")
        }
    }
}
