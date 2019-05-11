import com.sqlcompiler.kotlin.*

fun main() {
    Handler.select(names = arrayListOf("c"),
            columns = arrayListOf(),
            where = "id < 2" to arrayListOf("id", "2"),
            groupBy = arrayListOf("name"),
            orderBy = arrayListOf(),
            purpose = 1)
}