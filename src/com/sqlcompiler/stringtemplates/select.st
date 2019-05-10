select(tables,
       columns,
       where,
       conditions,
       groupBy,
       orderBy) ::=
<<
Handler.select(names = arrayListOf(<tables>),
               columns = arrayListOf(<columns : {column | DesiredColumn(<column>)}; separator=",">),
               where = <where> to arrayListOf(<conditions : {condition | <condition>}; separator=",">),
               groupBy = arrayListOf(<groupBy : {item | <item>}; separator=",">),
               orderBy = arrayListOf(<orderBy : {item | <item>}; separator=",">))
>>