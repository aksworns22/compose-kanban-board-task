package woowacourse.kanban.board.model

sealed class Description {
    data class DescriptionText private constructor(val text: String) : Description() {
        companion object {
            fun of(text: String): Description {
                if(text.isNotEmpty()) return DescriptionText(text)
                return None
            }
        }
    }
    object None : Description()
}
