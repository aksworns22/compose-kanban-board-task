package woowacourse.kanban.board.model

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThatThrownBy

class TitleTest {
    @Test
    fun `제목은 빈 텍스트일 수 없다`() {
        assertThatThrownBy {
            Title("")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
