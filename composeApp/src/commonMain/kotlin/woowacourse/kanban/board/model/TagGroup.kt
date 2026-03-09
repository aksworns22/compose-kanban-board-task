package woowacourse.kanban.board.model

data class TagGroup(val tags: List<Tag>) {
    fun isEmpty(): Boolean {
        return tags.isEmpty()
    }
}
