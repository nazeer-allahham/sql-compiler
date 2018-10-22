
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton interface for Bison's Yacc-like parsers in C
   
      Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     NAME = 258,
     STRING = 259,
     INTNUM = 260,
     BOOL = 261,
     APPROXNUM = 262,
     USERVAR = 263,
     ASSIGN = 264,
     OR = 265,
     XOR = 266,
     ANDOP = 267,
     REGEXP = 268,
     LIKE = 269,
     IS = 270,
     IN = 271,
     NOT = 272,
     BETWEEN = 273,
     COMPARISON = 274,
     SHIFT = 275,
     MOD = 276,
     UMINUS = 277,
     ADD = 278,
     ALL = 279,
     ALTER = 280,
     ANALYZE = 281,
     AND = 282,
     ANY = 283,
     AS = 284,
     ASC = 285,
     AUTO_INCREMENT = 286,
     BEFORE = 287,
     INT8 = 288,
     BIGINT = 289,
     BINARY = 290,
     BIT = 291,
     BLOB = 292,
     BOTH = 293,
     BY = 294,
     CALL = 295,
     CASCADE = 296,
     CASE = 297,
     CHANGE = 298,
     CHAR = 299,
     CHECK = 300,
     COLLATE = 301,
     COLUMN = 302,
     COMMENT = 303,
     CONDITION = 304,
     CONSTRAINT = 305,
     CONTINUE = 306,
     CONVERT = 307,
     CREATE = 308,
     CROSS = 309,
     CURRENT_DATE = 310,
     CURRENT_TIME = 311,
     CURRENT_TIMESTAMP = 312,
     CURRENT_USER = 313,
     CURSOR = 314,
     DATABASE = 315,
     DATABASES = 316,
     DATE = 317,
     DATETIME = 318,
     DAY_HOUR = 319,
     DAY_MICROSECOND = 320,
     DAY_MINUTE = 321,
     DAY_SECOND = 322,
     NUMERIC = 323,
     DEC = 324,
     DECIMAL = 325,
     DECLARE = 326,
     DEFAULT = 327,
     DELAYED = 328,
     DELETE = 329,
     DESC = 330,
     DESCRIBE = 331,
     DETERMINISTIC = 332,
     DISTINCT = 333,
     DISTINCTROW = 334,
     DIV = 335,
     ONDUPLICATE = 336,
     DOUBLE = 337,
     DROP = 338,
     DUAL = 339,
     EACH = 340,
     ELSE = 341,
     ELSEIF = 342,
     END = 343,
     ENUM = 344,
     EXIT = 345,
     EXPLAIN = 346,
     FETCH = 347,
     FLOAT = 348,
     FOR = 349,
     FORCE = 350,
     FOREIGN = 351,
     FROM = 352,
     FULLTEXT = 353,
     GRANT = 354,
     GROUP = 355,
     HAVING = 356,
     HIGH_PRIORITY = 357,
     HOUR_MICROSECOND = 358,
     HOUR_MINUTE = 359,
     HOUR_SECOND = 360,
     IF = 361,
     IGNORE = 362,
     INFILE = 363,
     INNER = 364,
     INOUT = 365,
     INSENSITIVE = 366,
     INSERT = 367,
     INT = 368,
     INTEGER = 369,
     INTERVAL = 370,
     INTO = 371,
     ITERATE = 372,
     JOIN = 373,
     INDEX = 374,
     KEY = 375,
     KEYS = 376,
     KILL = 377,
     LEADING = 378,
     LEAVE = 379,
     LEFT = 380,
     LIMIT = 381,
     LINES = 382,
     LOAD = 383,
     LOCALTIME = 384,
     LOCALTIMESTAMP = 385,
     LOCK = 386,
     LONG = 387,
     LONGBLOB = 388,
     LONGTEXT = 389,
     LOOP = 390,
     LOW_PRIORITY = 391,
     MATCH = 392,
     MEDIUMBLOB = 393,
     MIDDLEINT = 394,
     MEDIUMINT = 395,
     MEDIUMTEXT = 396,
     MINUTE_MICROSECOND = 397,
     MINUTE_SECOND = 398,
     MODIFIES = 399,
     NATURAL = 400,
     NO_WRITE_TO_BINLOG = 401,
     NULLX = 402,
     NUMBER = 403,
     ON = 404,
     OPTIMIZE = 405,
     OPTION = 406,
     OPTIONALLY = 407,
     ORDER = 408,
     OUT = 409,
     OUTER = 410,
     OUTFILE = 411,
     PRECISION = 412,
     PRIMARY = 413,
     PROCEDURE = 414,
     PURGE = 415,
     QUICK = 416,
     READ = 417,
     READS = 418,
     REAL = 419,
     REFERENCES = 420,
     RLIKE = 421,
     RELEASE = 422,
     RENAME = 423,
     REPEAT = 424,
     REPLACE = 425,
     REQUIRE = 426,
     RESTRICT = 427,
     RETURN = 428,
     REVOKE = 429,
     RIGHT = 430,
     ROLLUP = 431,
     SCHEMA = 432,
     SCHEMAS = 433,
     SECOND_MICROSECOND = 434,
     SELECT = 435,
     SENSITIVE = 436,
     SEPARATOR = 437,
     SET = 438,
     SHOW = 439,
     INT2 = 440,
     SMALLINT = 441,
     SOME = 442,
     SONAME = 443,
     SPATIAL = 444,
     SPECIFIC = 445,
     SQL = 446,
     SQLEXCEPTION = 447,
     SQLSTATE = 448,
     SQLWARNING = 449,
     SQL_BIG_RESULT = 450,
     SQL_CALC_FOUND_ROWS = 451,
     SQL_SMALL_RESULT = 452,
     SSL = 453,
     STARTING = 454,
     STRAIGHT_JOIN = 455,
     TABLE = 456,
     TEMPORARY = 457,
     TERMINATED = 458,
     TEXT = 459,
     THEN = 460,
     TIME = 461,
     TIMESTAMP = 462,
     INT1 = 463,
     TINYINT = 464,
     TINYTEXT = 465,
     TINYBLOB = 466,
     TO = 467,
     TRAILING = 468,
     TRIGGER = 469,
     UNDO = 470,
     UNION = 471,
     UNIQUE = 472,
     UNLOCK = 473,
     UNSIGNED = 474,
     UPDATE = 475,
     USAGE = 476,
     USE = 477,
     USING = 478,
     UTC_DATE = 479,
     UTC_TIME = 480,
     UTC_TIMESTAMP = 481,
     VALUES = 482,
     VARBINARY = 483,
     VARCHAR = 484,
     VARYING = 485,
     WHEN = 486,
     WHERE = 487,
     WHILE = 488,
     WITH = 489,
     WRITE = 490,
     YEAR = 491,
     YEAR_MONTH = 492,
     ZEROFILL = 493,
     ESCAPED = 494,
     EXISTS = 495,
     FSUBSTRING = 496,
     FTRIM = 497,
     FDATE_ADD = 498,
     FDATE_SUB = 499,
     FCOUNT = 500
   };
#endif



#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
{

/* Line 1676 of yacc.c  */
#line 22 "pmysql.y"

    int		intval;
    double	floatval;
    char*	strval;
    int		subtok;



/* Line 1676 of yacc.c  */
#line 306 "pmysql.tab.h"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif

extern YYSTYPE yylval;


