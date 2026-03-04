package woowacourse.kanban.board.model

sealed class Description {
    data class Content(val text: String) : Description() {
        companion object {
            fun of(text: String): Description {
                if(text.isNotEmpty()) return Content(text)
                return None
            }
        }
    }
    object None : Description()
}
