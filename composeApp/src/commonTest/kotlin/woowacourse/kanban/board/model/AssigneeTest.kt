package woowacourse.kanban.board.model

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThatThrownBy

class AssigneeTest {
    @Test
    fun `담당자는 빈 텍스트일 수 없다`() {
        assertThatThrownBy {
            Assignee("")
        }
    }
}
