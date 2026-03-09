package woowacourse.kanban.board.view

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test
import woowacourse.kanban.board.model.Assignee
import woowacourse.kanban.board.model.Description
import woowacourse.kanban.board.model.Tag
import woowacourse.kanban.board.model.TagGroup
import woowacourse.kanban.board.model.Task
import woowacourse.kanban.board.model.Title

@OptIn(ExperimentalTestApi::class)
class TaskCardTest {
    @Test
    fun `제목, 설명, 태그 그룹, 담당자가 모두 입력된 카드라면 화면에 모두 노출한다`() = runComposeUiTest {
        val titleText = "LazyColumn 컴포넌트 구현"
        val descriptionText = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용"
        val tagTextGroup = listOf("컴포넌트", "성능")
        val assigneeName = "다이노"
        val expectedTextGroup = listOf(titleText, descriptionText, assigneeName) + tagTextGroup

        setContent {
            TaskCard(
                task = Task(
                    title = Title(text = titleText),
                    description = Description(descriptionText),
                    tagGroup = TagGroup(tags = tagTextGroup.map { Tag(it) }),
                    assignee = Assignee(name = assigneeName),
                ),
            )
        }

        for (expectedText in expectedTextGroup) {
            onNodeWithText(expectedText).assertIsDisplayed()
        }
    }

    @Test
    fun `설명과 태그 그룹이 각각 빈 값으로 입력된 경우라면 제목, 담당자만 노출한다`() = runComposeUiTest {
        val titleText = "LazyColumn 컴포넌트 구현"
        val assigneeName = "다이노"
        val expectedTextGroup = listOf(titleText, assigneeName)

        setContent {
            TaskCard(
                task = Task(
                    title = Title(text = titleText),
                    description = Description.empty,
                    tagGroup = TagGroup(tags = listOf()),
                    assignee = Assignee(name = assigneeName),
                ),
            )
        }

        onNodeWithTag("DescriptionText").assertDoesNotExist()
        onNodeWithTag("TagBadgeGroup").assertDoesNotExist()

        for (expectedText in expectedTextGroup) {
            onNodeWithText(expectedText).assertIsDisplayed()
        }
    }

    @Test
    fun `설명이 빈 값으로 입력된 경우라면 제목, 태그, 담당자만 노출한다`() = runComposeUiTest {
        val titleText = "LazyColumn 컴포넌트 구현"
        val tagTextGroup = listOf("컴포넌트", "성능")
        val assigneeName = "다이노"
        val expectedTextGroup = listOf(titleText, assigneeName) + tagTextGroup

        setContent {
            TaskCard(
                task = Task(
                    title = Title(text = titleText),
                    description = Description.empty,
                    tagGroup = TagGroup(tags = tagTextGroup.map { Tag(it) }),
                    assignee = Assignee(name = assigneeName),
                ),
            )
        }

        onNodeWithTag("DescriptionText").assertDoesNotExist()

        for (expectedText in expectedTextGroup) {
            onNodeWithText(expectedText).assertIsDisplayed()
        }
    }

    @Test
    fun `태그 그룹이 빈 값으로 입력된 경우라면 제목, 설명, 담당자만 노출한다`() = runComposeUiTest {
        val titleText = "LazyColumn 컴포넌트 구현"
        val descriptionText = "세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용"
        val assigneeName = "다이노"
        val expectedTextGroup = listOf(titleText, assigneeName)

        setContent {
            TaskCard(
                task = Task(
                    title = Title(text = titleText),
                    description = Description(descriptionText),
                    tagGroup = TagGroup(tags = listOf()),
                    assignee = Assignee(name = assigneeName),
                ),
            )
        }

        onNodeWithTag("TagBadgeGroup").assertDoesNotExist()

        for (expectedText in expectedTextGroup) {
            onNodeWithText(expectedText).assertIsDisplayed()
        }
    }

    @Test
    fun `태스크 카드의 태그 그룹은 태그를 최대 5개까지만 노출한다`() = runComposeUiTest {
        val visibleTagText = listOf("tag1", "tag2", "tag3", "tag4", "tag5")
        val invisibleTagText = "tag6"
        val tagTextGroup = visibleTagText + invisibleTagText

        setContent {
            TaskCard(
                task = Task(
                    title = Title(text = "LazyColumn 컴포넌트 구현"),
                    description = Description("세로 스크롤 가능한 리스트 컴포넌트를 만들고 성능 최적화를 적용"),
                    tagGroup = TagGroup(tags = tagTextGroup.map { Tag(it) }),
                    assignee = Assignee(name = "다이노"),
                ),
            )
        }

        onNodeWithText(invisibleTagText).assertDoesNotExist()

        for (tagText in visibleTagText) {
            onNodeWithText(tagText).assertIsDisplayed()
        }
    }
}
