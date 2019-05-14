import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Join

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(),
            where = "" to arrayListOf(),
            join = arrayListOf(
                    Join("innerjoin", "c", "", "", arrayListOf("c_id", "c_id", "c_id", "c_id")),
                    Join("fullouterjoin", "c", "", "c_id = c_id c_id = c_id", arrayListOf("c_id", "c_id", "c_id", "c_id"))),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}