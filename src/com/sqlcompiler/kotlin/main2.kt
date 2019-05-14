import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler

fun main() {
//    Handler.select(name = "c",
//            columns = arrayListOf(DesiredColumn("id", "", ""), DesiredColumn("name", "", "")),
//            where = "id < 2" to arrayListOf(),
//            join = arrayListOf(Join(tableName = "xx", condition = "xx_id = c_id", conditionColumns = arrayListOf("c_id", "c_id"))),
//            groupBy = arrayListOf("name"),
//            orderBy = arrayListOf(),
//            combine = "" to Handler.select(name = "c",
//                    columns = arrayListOf(DesiredColumn("id", "", ""), DesiredColumn("name", "", "")),
//                    where = "id < 2" to arrayListOf(),
//                    join = arrayListOf(),
//                    groupBy = arrayListOf("name"),
//                    orderBy = arrayListOf(),
//                    purpose = 1) as ArrayList<Row>,
//            purpose = 1)

//    Handler.select(name = "c",
//            columns = arrayListOf(),
//            where = "" to arrayListOf(),
//            join = arrayListOf(Join(joinType = "FULL_OUTER", tableName = "users", condition = "users_id == c_id", conditionColumns = arrayListOf("users_id", "c_id"))),
//            groupBy = arrayListOf("name"),
//            orderBy = arrayListOf(),
//            distinct = true,
//            purpose = 1)

    Handler.select(name = "c",
            columns = arrayListOf(DesiredColumn("c_id"), DesiredColumn("c_name")),
            where = "" to arrayListOf(),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = true,
            purpose = 1)
}
