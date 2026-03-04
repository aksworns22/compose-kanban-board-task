package woowacourse.kanban.board.model

sealed class TagGroup {
    data class Items(val tags: List<Tag>) : TagGroup() {
        init {
            require(tags.size <= MAXIMUM_TAG_COUNT) { "[ERROR] 태그 개수는 5개 이하여야합니다." }
        }
        companion object {
            const val MAXIMUM_TAG_COUNT = 5
        }
    }
    object None : TagGroup()
}
