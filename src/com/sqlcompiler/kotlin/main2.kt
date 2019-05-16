import com.sqlcompiler.kotlin.*
import com.sqlcompiler.kotlin.Utils.smartSplit

fun main() {
    Handler.select(name = "c",
            columns = arrayListOf(DesiredColumn("c_id", "", "", false),
                    DesiredColumn("c_name", "", "", false),
                    DesiredColumn("c_salary", "", "", false),
                    DesiredColumn("c_birth_year", "", "", false)),
            where = Triple("" + smartSplit("c_id", Handler.select(name = "users",
                    columns = arrayListOf(DesiredColumn("users_id", "", "", false)),
                    where = Triple("", arrayListOf(), arrayListOf()),
                    join = arrayListOf(),
                    groupBy = arrayListOf(),
                    orderBy = arrayListOf(),
                    distinct = false,
                    purpose = 4) as String), arrayListOf(), arrayListOf()),
            join = arrayListOf(),
            groupBy = arrayListOf(),
            orderBy = arrayListOf(),
            distinct = false,
            purpose = 1)
}