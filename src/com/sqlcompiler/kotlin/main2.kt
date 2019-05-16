import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Transform

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(DesiredColumn("c_salary", "c", "", "", false, arrayListOf(Transform("type_cast", arrayListOf("c_salary", "int")))),
                    DesiredColumn("c_id", "c", "", "", false, arrayListOf()),
                    DesiredColumn("c_name", "c", "", "", false, arrayListOf())),
            where = Pair("", arrayListOf()),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)

}