import com.sqlcompiler.kotlin.Condition
import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Join

fun main() {
    Handler.select(table = "c",
            columns = arrayListOf(
                    DesiredColumn("c_name", "c", "", "", false, arrayListOf()),
                    DesiredColumn("c_id", "c", "", "COUNT", true, arrayListOf()),
                    DesiredColumn("c_id", "c", "", "SUM", false, arrayListOf())),
            wheres = arrayListOf(
                    Pair("", arrayListOf())),
            join = arrayListOf(
                    Join("FULLOUTERJOIN", "users", "", "x1", arrayListOf(Condition("x1", "c_id", "users_id", "=", "number")))),
            groupBy = arrayListOf("c_name"),
            orderBy = arrayListOf("1"),
            distinct = false,
            purpose = 1)
}