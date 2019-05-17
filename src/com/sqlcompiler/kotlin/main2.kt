import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Utils.smartSplit

fun main() {
    Handler.select(table = Handler.select(table = "c",
            columns = arrayListOf(DesiredColumn("c_id", "c", "", "", false, arrayListOf())),
            wheres = arrayListOf(
                    Pair("", arrayListOf()), smartSplit("x_id", "-1", Handler.select(table = "users",
                    columns = arrayListOf(DesiredColumn("_users_id", "", "", "", false, arrayListOf())),
                    wheres = arrayListOf(
                            Pair("", arrayListOf())),
                    join = arrayListOf(),
                    groupBy = arrayListOf(),
                    orderBy = arrayListOf(),
                    distinct = false,
                    purpose = 4) as String)),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 2) as String,
            columns = arrayListOf(),
            wheres = arrayListOf(
                    Pair("", arrayListOf())),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}