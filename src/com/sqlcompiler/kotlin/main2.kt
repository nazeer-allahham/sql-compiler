import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Table

fun main() {
    Handler.select(table = Handler.select(table = "c",
            columns = arrayListOf(DesiredColumn("c_id", "c", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Pair("", arrayListOf())),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 2) as Table,
            columns = arrayListOf(),
            wheres = arrayListOf(
                    Pair("", arrayListOf())),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}