import com.sqlcompiler.kotlin.Column
import com.sqlcompiler.kotlin.DesiredColumn
import com.sqlcompiler.kotlin.Handler
import com.sqlcompiler.kotlin.Utils.smartSplit
import com.sqlcompiler.kotlin.Table

fun main() {
    Handler.select(names = arrayListOf("c"),
            desiredColumns = arrayListOf(),
            conditions = "" to arrayListOf(),
            groupBy = arrayListOf("name"),
            orderBy = arrayListOf("xx"))
}