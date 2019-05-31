select(table,
       columns,
       wheres,
       subWheres,
       joins,
       groupBy,
       orderBy,
       combineType,
       combineSource,
       distinct,
       purpose) ::=
<<
Handler.select(table = <table>,
               columns = arrayListOf(<columns: {column | DesiredColumn("<column.columnName>","<column.tableName>","<column.columnAlias>","<column.functionName>",<column.distinct>,arrayListOf(<column.transforms: {transform | Transform("<transform.name>", arrayListOf(<transform.params: {param | "<param>"}; separator=",">)) }; separator=",">))}; separator=",">),
               wheres = arrayListOf(
               <wheres: {
               where | Where("<where.expression>", arrayListOf(<where.definitions: {
                   condition | Condition("<condition.variable>", "<condition.left>", "<condition.right>", "<condition.operator>", "<condition.type>")
                }; separator=",">))
               }; separator=",">
               <if(subWheres)>,<subWheres><endif>),
               join = arrayListOf(<joins: {join | Join("<join.type>", "<join.tableName>", "<join.tableAlias>", "<join.condition>", arrayListOf(<join.definitions: {definition | Condition("<definition.variable>", "<definition.left>", "<definition.right>", "<definition.operator>", "<definition.type>") }; separator=",">))}; separator=",">),
               groupBy = arrayListOf(<groupBy: {item | "<item>"}; separator=",">),
               orderBy = arrayListOf(<orderBy: {item | "<item>"}; separator=",">),
               <if (combineSource)>combine = "<combineType>" to <combineSource> as ArrayList\<Row>,<endif>
               distinct = <distinct>,
               purpose = <purpose>)
>>