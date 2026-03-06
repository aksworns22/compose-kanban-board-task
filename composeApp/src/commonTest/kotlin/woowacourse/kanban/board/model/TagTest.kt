package woowacourse.kanban.board.model

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThatThrownBy

class TagTest {
    @Test
    fun `태그 텍스트는 빈 문자열일 수 없다`() {
        assertThatThrownBy {
            Tag("")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `태그 텍스트가 최대 길이를 넘어가면 예외가 발생한다`() {
        assertThatThrownBy {
            Tag("최대 길이를 넘어가면 안됩니다!")
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
