create (name, columns, locations, delimiter) ::=
<<
Handler.createTable(Table(<name>,
            arrayListOf(<columns : {column | Column("<column.name>", "<column.type>")}; separator=",">),
            arrayListOf(<locations : {location | <location>}; separator=",">),
            <delimiter>))
>>