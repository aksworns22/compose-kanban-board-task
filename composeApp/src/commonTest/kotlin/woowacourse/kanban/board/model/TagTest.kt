package woowacourse.kanban.board.model

import org.assertj.core.api.Assertions.assertThatThrownBy
import kotlin.test.Test
import kotlin.test.assertFailsWith

class TagTest {
    @Test
    fun `태그 텍스트가 공란일 수 없다`() {
        assertFailsWith<IllegalArgumentException> {
            Tag("")
        }
    }

    @Test
    fun `태그 텍스트가 최대 길이를 넘어가면 예외가 발생한다`() {
        assertThatThrownBy {
            Tag("최대 길이를 넘어가면 안됩니다!")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
