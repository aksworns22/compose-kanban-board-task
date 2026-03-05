package woowacourse.kanban.board.model

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertIs

class DescriptionTest {
    @Test
    fun `빈 텍스트인 경우 None으로 간주된다`() {
        val description = Description.Content.of("")
        assertIs<Description.None>(description)
    }

    @Test
    fun `공백만 있는 경우 Content로 생성된다`() {
        val description = Description.Content.of("   ")
        assertIs<Description.Content>(description)
    }

    @Test
    fun `유효한 텍스트인 경우 Content로 생성된다`() {
        val description = Description.Content.of("Description text")
        assertIs<Description.Content>(description)
        val content = description as Description.Content
        assert(content.text == "Description text")
    }
}
