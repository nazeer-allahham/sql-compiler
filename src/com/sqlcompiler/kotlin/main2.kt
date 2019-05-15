import com.sqlcompiler.kotlin.*
import com.sqlcompiler.kotlin.Utils.smartSplit

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(),
            where = "c_id = 1" to arrayListOf("c_id"),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}