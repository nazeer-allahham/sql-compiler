import com.sqlcompiler.kotlin.Handler

fun main() {
    /*Handler.select(names = arrayListOf("c", "users"),
            columns = arrayListOf(),
            where = "" to arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf())*/

/*    Handler.select(names = arrayListOf("c"),
            columns = arrayListOf(DesiredColumn("c_id", "min"), DesiredColumn("c_name")),
            where = "" to arrayListOf(),
            groupBy = arrayListOf("c_name"),
            orderBy = arrayListOf())*/

    Handler.select(names = arrayListOf("c"),
            columns = arrayListOf(),
            where = "" to arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf())
}