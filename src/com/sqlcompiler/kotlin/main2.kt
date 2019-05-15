import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(DesiredColumn("c_id", "", "sss", false), DesiredColumn("_name", "min", "", true)),
            where = "" to arrayListOf(),
            join = arrayListOf(),
            groupBy = arrayListOf("c_name"),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}