package woowacourse.kanban.board.model

data class TagGroup(val tags: List<Tag>) {
    init {
        require(tags.filterIsInstance<Tag.TagText>().size <= MAXIMUM_TAG_COUNT) { "[ERROR] 태그는 최대 5개 입니다." }
    }

    companion object {
        const val MAXIMUM_TAG_COUNT = 5
    }
}
