program (instructions) ::=
<<
import com.sqlcompiler.kotlin.*;
import com.sqlcompiler.kotlin.Utils.smartSplit;

fun main() {
<instructions : {instruction | <instruction>}; separator=";\n">
}
>>