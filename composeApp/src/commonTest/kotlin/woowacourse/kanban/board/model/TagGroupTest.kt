package woowacourse.kanban.board.model

import org.assertj.core.api.Assertions.assertThatThrownBy
import kotlin.test.Test
import kotlin.test.assertFailsWith

class TagGroupTest {
    @Test
    fun `태그 개수가 최대 개수를 초과하면 예외가 발생한다`() {
        assertThatThrownBy {
            TagGroup(
                tags = listOf(
                    Tag("tag1"),
                    Tag("tag2"),
                    Tag("tag3"),
                    Tag("tag4"),
                    Tag("tag5"),
                    Tag("tag6"),
                ),
            )
        }
    }
}
