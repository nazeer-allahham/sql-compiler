import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler

fun main() {
    Handler.select(names = arrayListOf("c"),
            columns = arrayListOf(DesiredColumn("c_id", "min"), DesiredColumn("c_name")),
            where = "" to arrayListOf(),
            groupBy = arrayListOf("c_name"),
            orderBy = arrayListOf())
}