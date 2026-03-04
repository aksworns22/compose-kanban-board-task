package woowacourse.kanban.board.model

sealed class Tag {
    data class TagText private constructor(val text: String) : Tag() {
        init {
            require(text.length <= MAXIMUM_TAG_LENGTH) { "[ERROR] 태그 텍스트는 5글자 이하여야 합니다." }
        }

        companion object {
            const val MAXIMUM_TAG_LENGTH = 5
            fun of(text: String): Tag {
                if(text.isNotEmpty()) return TagText(text)
                return None
            }
        }
    }
    object None : Tag()
}
