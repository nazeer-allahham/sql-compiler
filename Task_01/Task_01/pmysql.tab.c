
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison's Yacc-like parsers in C
   
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

/* C LALR(1) parser skeleton written by Richard Stallman, by
   simplifying the original so-called "semantic" parser.  */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */
#define YYBISON 1

/* Bison version.  */
#define YYBISON_VERSION "2.4.1"

/* Skeleton name.  */
#define YYSKELETON_NAME "yacc.c"

/* Pure parsers.  */
#define YYPURE 0

/* Push parsers.  */
#define YYPUSH 0

/* Pull parsers.  */
#define YYPULL 1

/* Using locations.  */
#define YYLSP_NEEDED 0



/* Copy the first part of user declarations.  */

/* Line 189 of yacc.c  */
#line 5 "pmysql.y"

	#include <stdlib.h>
	#include <stdarg.h>
	#include <string.h>
    #include <stdio.h>

    // this function will be generated
	// by flex
	extern int yylex(); // lexical analyzer
    extern int yylineno;
    
    int yydebug;

	void yyerror(const char *s, ...);
	void emit(const char *s, ...);


/* Line 189 of yacc.c  */
#line 91 "pmysql.tab.c"

/* Enabling traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif

/* Enabling verbose error messages.  */
#ifdef YYERROR_VERBOSE
# undef YYERROR_VERBOSE
# define YYERROR_VERBOSE 1
#else
# define YYERROR_VERBOSE 0
#endif

/* Enabling the token table.  */
#ifndef YYTOKEN_TABLE
# define YYTOKEN_TABLE 0
#endif


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

/* Line 214 of yacc.c  */
#line 22 "pmysql.y"

    int		intval;
    double	floatval;
    char*	strval;
    int		subtok;



/* Line 214 of yacc.c  */
#line 381 "pmysql.tab.c"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif


/* Copy the second part of user declarations.  */


/* Line 264 of yacc.c  */
#line 393 "pmysql.tab.c"

#ifdef short
# undef short
#endif

#ifdef YYTYPE_UINT8
typedef YYTYPE_UINT8 yytype_uint8;
#else
typedef unsigned char yytype_uint8;
#endif

#ifdef YYTYPE_INT8
typedef YYTYPE_INT8 yytype_int8;
#elif (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
typedef signed char yytype_int8;
#else
typedef short int yytype_int8;
#endif

#ifdef YYTYPE_UINT16
typedef YYTYPE_UINT16 yytype_uint16;
#else
typedef unsigned short int yytype_uint16;
#endif

#ifdef YYTYPE_INT16
typedef YYTYPE_INT16 yytype_int16;
#else
typedef short int yytype_int16;
#endif

#ifndef YYSIZE_T
# ifdef __SIZE_TYPE__
#  define YYSIZE_T __SIZE_TYPE__
# elif defined size_t
#  define YYSIZE_T size_t
# elif ! defined YYSIZE_T && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#  include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  define YYSIZE_T size_t
# else
#  define YYSIZE_T unsigned int
# endif
#endif

#define YYSIZE_MAXIMUM ((YYSIZE_T) -1)

#ifndef YY_
# if YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> /* INFRINGES ON USER NAME SPACE */
#   define YY_(msgid) dgettext ("bison-runtime", msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(msgid) msgid
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YYUSE(e) ((void) (e))
#else
# define YYUSE(e) /* empty */
#endif

/* Identity function, used to suppress warnings about constant conditions.  */
#ifndef lint
# define YYID(n) (n)
#else
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static int
YYID (int yyi)
#else
static int
YYID (yyi)
    int yyi;
#endif
{
  return yyi;
}
#endif

#if ! defined yyoverflow || YYERROR_VERBOSE

/* The parser invokes alloca or malloc; define the necessary symbols.  */

# ifdef YYSTACK_USE_ALLOCA
#  if YYSTACK_USE_ALLOCA
#   ifdef __GNUC__
#    define YYSTACK_ALLOC __builtin_alloca
#   elif defined __BUILTIN_VA_ARG_INCR
#    include <alloca.h> /* INFRINGES ON USER NAME SPACE */
#   elif defined _AIX
#    define YYSTACK_ALLOC __alloca
#   elif defined _MSC_VER
#    include <malloc.h> /* INFRINGES ON USER NAME SPACE */
#    define alloca _alloca
#   else
#    define YYSTACK_ALLOC alloca
#    if ! defined _ALLOCA_H && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
#     include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#     ifndef _STDLIB_H
#      define _STDLIB_H 1
#     endif
#    endif
#   endif
#  endif
# endif

# ifdef YYSTACK_ALLOC
   /* Pacify GCC's `empty if-body' warning.  */
#  define YYSTACK_FREE(Ptr) do { /* empty */; } while (YYID (0))
#  ifndef YYSTACK_ALLOC_MAXIMUM
    /* The OS might guarantee only one guard page at the bottom of the stack,
       and a page size can be as small as 4096 bytes.  So we cannot safely
       invoke alloca (N) if N exceeds 4096.  Use a slightly smaller number
       to allow for a few compiler-allocated temporary stack slots.  */
#   define YYSTACK_ALLOC_MAXIMUM 4032 /* reasonable circa 2006 */
#  endif
# else
#  define YYSTACK_ALLOC YYMALLOC
#  define YYSTACK_FREE YYFREE
#  ifndef YYSTACK_ALLOC_MAXIMUM
#   define YYSTACK_ALLOC_MAXIMUM YYSIZE_MAXIMUM
#  endif
#  if (defined __cplusplus && ! defined _STDLIB_H \
       && ! ((defined YYMALLOC || defined malloc) \
	     && (defined YYFREE || defined free)))
#   include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#   ifndef _STDLIB_H
#    define _STDLIB_H 1
#   endif
#  endif
#  ifndef YYMALLOC
#   define YYMALLOC malloc
#   if ! defined malloc && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void *malloc (YYSIZE_T); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
#  ifndef YYFREE
#   define YYFREE free
#   if ! defined free && ! defined _STDLIB_H && (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
void free (void *); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
# endif
#endif /* ! defined yyoverflow || YYERROR_VERBOSE */


#if (! defined yyoverflow \
     && (! defined __cplusplus \
	 || (defined YYSTYPE_IS_TRIVIAL && YYSTYPE_IS_TRIVIAL)))

/* A type that is properly aligned for any stack member.  */
union yyalloc
{
  yytype_int16 yyss_alloc;
  YYSTYPE yyvs_alloc;
};

/* The size of the maximum gap between one aligned stack and the next.  */
# define YYSTACK_GAP_MAXIMUM (sizeof (union yyalloc) - 1)

/* The size of an array large to enough to hold all stacks, each with
   N elements.  */
# define YYSTACK_BYTES(N) \
     ((N) * (sizeof (yytype_int16) + sizeof (YYSTYPE)) \
      + YYSTACK_GAP_MAXIMUM)

/* Copy COUNT objects from FROM to TO.  The source and destination do
   not overlap.  */
# ifndef YYCOPY
#  if defined __GNUC__ && 1 < __GNUC__
#   define YYCOPY(To, From, Count) \
      __builtin_memcpy (To, From, (Count) * sizeof (*(From)))
#  else
#   define YYCOPY(To, From, Count)		\
      do					\
	{					\
	  YYSIZE_T yyi;				\
	  for (yyi = 0; yyi < (Count); yyi++)	\
	    (To)[yyi] = (From)[yyi];		\
	}					\
      while (YYID (0))
#  endif
# endif

/* Relocate STACK from its old location to the new one.  The
   local variables YYSIZE and YYSTACKSIZE give the old and new number of
   elements in the stack, and YYPTR gives the new location of the
   stack.  Advance YYPTR to a properly aligned location for the next
   stack.  */
# define YYSTACK_RELOCATE(Stack_alloc, Stack)				\
    do									\
      {									\
	YYSIZE_T yynewbytes;						\
	YYCOPY (&yyptr->Stack_alloc, Stack, yysize);			\
	Stack = &yyptr->Stack_alloc;					\
	yynewbytes = yystacksize * sizeof (*Stack) + YYSTACK_GAP_MAXIMUM; \
	yyptr += yynewbytes / sizeof (*yyptr);				\
      }									\
    while (YYID (0))

#endif

/* YYFINAL -- State number of the termination state.  */
#define YYFINAL  31
/* YYLAST -- Last index in YYTABLE.  */
#define YYLAST   1469

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  260
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  74
/* YYNRULES -- Number of rules.  */
#define YYNRULES  300
/* YYNRULES -- Number of states.  */
#define YYNSTATES  620

/* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
#define YYUNDEFTOK  2
#define YYMAXUTOK   500

#define YYTRANSLATE(YYX)						\
  ((unsigned int) (YYX) <= YYMAXUTOK ? yytranslate[YYX] : YYUNDEFTOK)

/* YYTRANSLATE[YYLEX] -- Bison symbol number corresponding to YYLEX.  */
static const yytype_uint16 yytranslate[] =
{
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    17,     2,     2,     2,    28,    22,     2,
     257,   258,    26,    24,   259,    25,   256,    27,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,   255,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,    30,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,    21,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    18,    19,    20,    23,    29,    31,    32,    33,
      34,    35,    36,    37,    38,    39,    40,    41,    42,    43,
      44,    45,    46,    47,    48,    49,    50,    51,    52,    53,
      54,    55,    56,    57,    58,    59,    60,    61,    62,    63,
      64,    65,    66,    67,    68,    69,    70,    71,    72,    73,
      74,    75,    76,    77,    78,    79,    80,    81,    82,    83,
      84,    85,    86,    87,    88,    89,    90,    91,    92,    93,
      94,    95,    96,    97,    98,    99,   100,   101,   102,   103,
     104,   105,   106,   107,   108,   109,   110,   111,   112,   113,
     114,   115,   116,   117,   118,   119,   120,   121,   122,   123,
     124,   125,   126,   127,   128,   129,   130,   131,   132,   133,
     134,   135,   136,   137,   138,   139,   140,   141,   142,   143,
     144,   145,   146,   147,   148,   149,   150,   151,   152,   153,
     154,   155,   156,   157,   158,   159,   160,   161,   162,   163,
     164,   165,   166,   167,   168,   169,   170,   171,   172,   173,
     174,   175,   176,   177,   178,   179,   180,   181,   182,   183,
     184,   185,   186,   187,   188,   189,   190,   191,   192,   193,
     194,   195,   196,   197,   198,   199,   200,   201,   202,   203,
     204,   205,   206,   207,   208,   209,   210,   211,   212,   213,
     214,   215,   216,   217,   218,   219,   220,   221,   222,   223,
     224,   225,   226,   227,   228,   229,   230,   231,   232,   233,
     234,   235,   236,   237,   238,   239,   240,   241,   242,   243,
     244,   245,   246,   247,   248,   249,   250,   251,   252,   253,
     254
};

#if YYDEBUG
/* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
   YYRHS.  */
static const yytype_uint16 yyprhs[] =
{
       0,     0,     3,     6,    10,    12,    16,    18,    20,    22,
      24,    26,    30,    34,    38,    42,    46,    50,    53,    57,
      61,    65,    69,    73,    77,    81,    84,    87,    91,    97,
     104,   111,   118,   122,   127,   131,   136,   140,   146,   148,
     152,   153,   155,   161,   168,   174,   181,   186,   191,   196,
     201,   206,   213,   222,   227,   235,   237,   239,   241,   248,
     255,   259,   263,   267,   271,   275,   279,   283,   287,   291,
     296,   303,   307,   313,   318,   324,   328,   333,   337,   342,
     344,   346,   348,   351,   353,   357,   369,   370,   373,   374,
     379,   382,   387,   388,   390,   392,   393,   396,   397,   400,
     401,   405,   406,   409,   414,   415,   418,   420,   424,   425,
     428,   431,   434,   437,   440,   443,   446,   449,   451,   455,
     457,   460,   463,   465,   466,   468,   472,   474,   476,   480,
     486,   490,   494,   496,   497,   503,   507,   513,   520,   526,
     527,   529,   531,   532,   534,   536,   538,   541,   544,   545,
     546,   548,   551,   556,   563,   570,   577,   578,   581,   582,
     584,   588,   592,   594,   602,   605,   608,   611,   612,   619,
     622,   627,   628,   631,   639,   641,   650,   651,   656,   657,
     660,   663,   666,   669,   671,   672,   673,   677,   681,   687,
     689,   691,   695,   699,   707,   711,   715,   721,   727,   735,
     737,   746,   754,   762,   764,   773,   774,   777,   780,   784,
     790,   796,   804,   806,   811,   816,   817,   820,   822,   831,
     842,   852,   859,   871,   880,   881,   883,   885,   889,   895,
     900,   905,   911,   917,   918,   923,   924,   928,   931,   935,
     939,   943,   947,   950,   956,   960,   964,   967,   971,   972,
     976,   982,   983,   985,   986,   989,   992,   993,   998,  1002,
    1005,  1009,  1013,  1017,  1021,  1025,  1029,  1033,  1037,  1041,
    1045,  1047,  1049,  1051,  1053,  1055,  1059,  1065,  1068,  1073,
    1075,  1077,  1079,  1081,  1085,  1089,  1093,  1097,  1103,  1109,
    1111,  1115,  1119,  1120,  1122,  1124,  1126,  1129,  1131,  1135,
    1139
};

/* YYRHS -- A `-1'-separated list of the rules' RHS.  */
static const yytype_int16 yyrhs[] =
{
     261,     0,    -1,   268,   255,    -1,   261,   268,   255,    -1,
       3,    -1,     3,   256,     3,    -1,     8,    -1,     4,    -1,
       5,    -1,     7,    -1,     6,    -1,   262,    24,   262,    -1,
     262,    25,   262,    -1,   262,    26,   262,    -1,   262,    27,
     262,    -1,   262,    28,   262,    -1,   262,    29,   262,    -1,
      25,   262,    -1,   262,    12,   262,    -1,   262,    10,   262,
      -1,   262,    11,   262,    -1,   262,    21,   262,    -1,   262,
      22,   262,    -1,   262,    30,   262,    -1,   262,    23,   262,
      -1,    18,   262,    -1,    17,   262,    -1,   262,    20,   262,
      -1,   262,    20,   257,   269,   258,    -1,   262,    20,    37,
     257,   269,   258,    -1,   262,    20,   196,   257,   269,   258,
      -1,   262,    20,    33,   257,   269,   258,    -1,   262,    15,
     156,    -1,   262,    15,    18,   156,    -1,   262,    15,     6,
      -1,   262,    15,    18,     6,    -1,     8,     9,   262,    -1,
     262,    19,   262,    36,   262,    -1,   262,    -1,   262,   259,
     263,    -1,    -1,   263,    -1,   262,    16,   257,   263,   258,
      -1,   262,    18,    16,   257,   263,   258,    -1,   262,    16,
     257,   269,   258,    -1,   262,    18,    16,   257,   269,   258,
      -1,   249,   257,   269,   258,    -1,     3,   257,   264,   258,
      -1,   254,   257,    26,   258,    -1,   254,   257,   262,   258,
      -1,   250,   257,   263,   258,    -1,   250,   257,   262,   106,
     262,   258,    -1,   250,   257,   262,   106,   262,   103,   262,
     258,    -1,   251,   257,   263,   258,    -1,   251,   257,   265,
     262,   106,   263,   258,    -1,   132,    -1,   222,    -1,    47,
      -1,   252,   257,   262,   259,   266,   258,    -1,   253,   257,
     262,   259,   266,   258,    -1,   124,   262,    73,    -1,   124,
     262,    74,    -1,   124,   262,    75,    -1,   124,   262,    76,
      -1,   124,   262,   246,    -1,   124,   262,   245,    -1,   124,
     262,   112,    -1,   124,   262,   113,    -1,   124,   262,   114,
      -1,    51,   262,   267,    97,    -1,    51,   262,   267,    95,
     262,    97,    -1,    51,   267,    97,    -1,    51,   267,    95,
     262,    97,    -1,   240,   262,   214,   262,    -1,   267,   240,
     262,   214,   262,    -1,   262,    14,   262,    -1,   262,    18,
      14,   262,    -1,   262,    13,   262,    -1,   262,    18,    13,
     262,    -1,    66,    -1,    64,    -1,    65,    -1,    44,   262,
      -1,   269,    -1,   189,   280,   281,    -1,   189,   280,   281,
     106,   284,   270,   271,   275,   276,   277,   278,    -1,    -1,
     241,   262,    -1,    -1,   109,    48,   272,   274,    -1,   262,
     273,    -1,   272,   259,   262,   273,    -1,    -1,    39,    -1,
      84,    -1,    -1,   243,   185,    -1,    -1,   110,   262,    -1,
      -1,   162,    48,   272,    -1,    -1,   135,   262,    -1,   135,
     262,   259,   262,    -1,    -1,   125,   279,    -1,     3,    -1,
     279,   259,     3,    -1,    -1,   280,    33,    -1,   280,    87,
      -1,   280,    88,    -1,   280,   111,    -1,   280,   209,    -1,
     280,   206,    -1,   280,   204,    -1,   280,   205,    -1,   282,
      -1,   281,   259,   282,    -1,    26,    -1,   262,   283,    -1,
      38,     3,    -1,     3,    -1,    -1,   285,    -1,   284,   259,
     285,    -1,   286,    -1,   288,    -1,     3,   283,   295,    -1,
       3,   256,     3,   283,   295,    -1,   298,   287,     3,    -1,
     257,   284,   258,    -1,    38,    -1,    -1,   285,   289,   127,
     286,   293,    -1,   285,   209,   286,    -1,   285,   209,   286,
     158,   262,    -1,   285,   291,   290,   127,   286,   294,    -1,
     285,   154,   292,   127,   286,    -1,    -1,   118,    -1,    63,
      -1,    -1,   164,    -1,   134,    -1,   184,    -1,   134,   290,
      -1,   184,   290,    -1,    -1,    -1,   294,    -1,   158,   262,
      -1,   232,   257,   279,   258,    -1,   231,   129,   296,   257,
     297,   258,    -1,   116,   129,   296,   257,   297,   258,    -1,
     104,   129,   296,   257,   297,   258,    -1,    -1,   103,   127,
      -1,    -1,     3,    -1,   297,   259,     3,    -1,   257,   269,
     258,    -1,   299,    -1,    83,   300,   106,     3,   270,   276,
     277,    -1,   300,   145,    -1,   300,   170,    -1,   300,   116,
      -1,    -1,    83,   300,   301,   106,   284,   270,    -1,     3,
     302,    -1,   301,   259,     3,   302,    -1,    -1,   256,    26,
      -1,    83,   300,   106,   301,   232,   284,   270,    -1,   303,
      -1,   121,   305,   306,     3,   307,   236,   308,   304,    -1,
      -1,    90,   129,   229,   310,    -1,    -1,   305,   145,    -1,
     305,    82,    -1,   305,   111,    -1,   305,   116,    -1,   125,
      -1,    -1,    -1,   257,   279,   258,    -1,   257,   309,   258,
      -1,   308,   259,   257,   309,   258,    -1,   262,    -1,    81,
      -1,   309,   259,   262,    -1,   309,   259,    81,    -1,   121,
     305,   306,     3,   192,   310,   304,    -1,     3,    20,   262,
      -1,     3,    20,    81,    -1,   310,   259,     3,    20,   262,
      -1,   310,   259,     3,    20,    81,    -1,   121,   305,   306,
       3,   307,   269,   304,    -1,   311,    -1,   179,   305,   306,
       3,   307,   236,   308,   304,    -1,   179,   305,   306,     3,
     192,   310,   304,    -1,   179,   305,   306,     3,   307,   269,
     304,    -1,   312,    -1,   229,   313,   284,   192,   314,   270,
     276,   277,    -1,    -1,   305,   145,    -1,   305,   116,    -1,
       3,    20,   262,    -1,     3,   256,     3,    20,   262,    -1,
     314,   259,     3,    20,   262,    -1,   314,   259,     3,   256,
       3,    20,   262,    -1,   315,    -1,    62,    69,   316,     3,
      -1,    62,   186,   316,     3,    -1,    -1,   115,   249,    -1,
     317,    -1,    62,   318,   210,   316,     3,   257,   319,   258,
      -1,    62,   318,   210,   316,     3,   256,     3,   257,   319,
     258,    -1,    62,   318,   210,   316,     3,   257,   319,   258,
     329,    -1,    62,   318,   210,   316,     3,   329,    -1,    62,
     318,   210,   316,     3,   256,     3,   257,   319,   258,   329,
      -1,    62,   318,   210,   316,     3,   256,     3,   329,    -1,
      -1,   211,    -1,   320,    -1,   319,   259,   320,    -1,   167,
     129,   257,   279,   258,    -1,   129,   257,   279,   258,    -1,
     128,   257,   279,   258,    -1,   107,   128,   257,   279,   258,
      -1,   107,   129,   257,   279,   258,    -1,    -1,   321,     3,
     327,   322,    -1,    -1,   322,    18,   156,    -1,   322,   156,
      -1,   322,    81,     4,    -1,   322,    81,     5,    -1,   322,
      81,     7,    -1,   322,    81,     6,    -1,   322,    40,    -1,
     322,   226,   257,   279,   258,    -1,   322,   226,   129,    -1,
     322,   167,   129,    -1,   322,   129,    -1,   322,    57,     4,
      -1,    -1,   257,     5,   258,    -1,   257,     5,   259,     5,
     258,    -1,    -1,    44,    -1,    -1,   325,   228,    -1,   325,
     247,    -1,    -1,   326,    53,   192,     4,    -1,   326,    55,
       4,    -1,    45,   323,    -1,   218,   323,   325,    -1,   195,
     323,   325,    -1,   149,   323,   325,    -1,   122,   323,   325,
      -1,   123,   323,   325,    -1,    43,   323,   325,    -1,   173,
     323,   325,    -1,    91,   323,   325,    -1,   102,   323,   325,
      -1,    79,   323,   325,    -1,    71,    -1,   215,    -1,   216,
      -1,    72,    -1,   245,    -1,    53,   323,   326,    -1,   238,
     257,     5,   258,   326,    -1,    44,   323,    -1,   237,   257,
       5,   258,    -1,   220,    -1,    46,    -1,   147,    -1,   142,
      -1,   219,   324,   326,    -1,   213,   324,   326,    -1,   150,
     324,   326,    -1,   143,   324,   326,    -1,    98,   257,   328,
     258,   326,    -1,   192,   257,   328,   258,   326,    -1,     4,
      -1,   328,   259,     4,    -1,   330,   287,   269,    -1,    -1,
     116,    -1,   179,    -1,   331,    -1,   192,   332,    -1,   333,
      -1,   332,   259,   333,    -1,     8,    20,   262,    -1,     8,
       9,   262,    -1
};

/* YYRLINE[YYN] -- source line where rule number YYN was defined.  */
static const yytype_uint16 yyrline[] =
{
       0,   313,   313,   313,   317,   318,   319,   320,   321,   322,
     323,   326,   327,   328,   329,   330,   331,   332,   333,   334,
     335,   336,   337,   338,   339,   340,   341,   342,   345,   346,
     347,   348,   351,   352,   353,   354,   356,   358,   360,   361,
     363,   364,   366,   367,   368,   369,   370,   373,   377,   378,
     380,   381,   382,   384,   385,   388,   389,   390,   393,   394,
     396,   397,   398,   399,   400,   401,   402,   403,   404,   406,
     407,   408,   409,   412,   413,   416,   417,   420,   421,   424,
     425,   426,   429,   433,   436,   439,   444,   445,   447,   448,
     451,   453,   457,   458,   459,   462,   463,   466,   467,   469,
     470,   473,   473,   474,   477,   478,   481,   482,   484,   485,
     487,   489,   491,   493,   495,   497,   499,   504,   505,   506,
     509,   511,   512,   513,   516,   517,   520,   521,   525,   526,
     528,   529,   532,   533,   537,   539,   541,   543,   545,   549,
     550,   551,   554,   555,   558,   559,   562,   563,   564,   567,
     568,   571,   572,   576,   578,   580,   582,   585,   586,   589,
     590,   593,   597,   601,   606,   607,   608,   609,   613,   618,
     619,   623,   623,   626,   633,   636,   642,   643,   646,   647,
     648,   649,   650,   653,   653,   656,   657,   660,   661,   664,
     665,   666,   667,   670,   677,   680,   683,   686,   690,   695,
     698,   704,   710,   715,   718,   725,   726,   727,   731,   734,
     737,   740,   747,   751,   753,   757,   758,   764,   767,   771,
     776,   781,   785,   791,   796,   797,   800,   801,   803,   804,
     805,   806,   807,   809,   809,   812,   813,   814,   815,   817,
     819,   821,   823,   825,   827,   828,   829,   830,   833,   834,
     835,   838,   839,   842,   843,   844,   847,   848,   849,   853,
     854,   855,   856,   857,   858,   859,   860,   861,   862,   863,
     864,   865,   866,   867,   868,   869,   870,   871,   872,   873,
     874,   875,   876,   877,   878,   879,   880,   881,   882,   885,
     886,   888,   891,   892,   893,   897,   900,   902,   902,   905,
     907
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || YYTOKEN_TABLE
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "NAME", "STRING", "INTNUM", "BOOL",
  "APPROXNUM", "USERVAR", "ASSIGN", "OR", "XOR", "ANDOP", "REGEXP", "LIKE",
  "IS", "IN", "'!'", "NOT", "BETWEEN", "COMPARISON", "'|'", "'&'", "SHIFT",
  "'+'", "'-'", "'*'", "'/'", "'%'", "MOD", "'^'", "UMINUS", "ADD", "ALL",
  "ALTER", "ANALYZE", "AND", "ANY", "AS", "ASC", "AUTO_INCREMENT",
  "BEFORE", "INT8", "BIGINT", "BINARY", "BIT", "BLOB", "BOTH", "BY",
  "CALL", "CASCADE", "CASE", "CHANGE", "CHAR", "CHECK", "COLLATE",
  "COLUMN", "COMMENT", "CONDITION", "CONSTRAINT", "CONTINUE", "CONVERT",
  "CREATE", "CROSS", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP",
  "CURRENT_USER", "CURSOR", "DATABASE", "DATABASES", "DATE", "DATETIME",
  "DAY_HOUR", "DAY_MICROSECOND", "DAY_MINUTE", "DAY_SECOND", "NUMERIC",
  "DEC", "DECIMAL", "DECLARE", "DEFAULT", "DELAYED", "DELETE", "DESC",
  "DESCRIBE", "DETERMINISTIC", "DISTINCT", "DISTINCTROW", "DIV",
  "ONDUPLICATE", "DOUBLE", "DROP", "DUAL", "EACH", "ELSE", "ELSEIF", "END",
  "ENUM", "EXIT", "EXPLAIN", "FETCH", "FLOAT", "FOR", "FORCE", "FOREIGN",
  "FROM", "FULLTEXT", "GRANT", "GROUP", "HAVING", "HIGH_PRIORITY",
  "HOUR_MICROSECOND", "HOUR_MINUTE", "HOUR_SECOND", "IF", "IGNORE",
  "INFILE", "INNER", "INOUT", "INSENSITIVE", "INSERT", "INT", "INTEGER",
  "INTERVAL", "INTO", "ITERATE", "JOIN", "INDEX", "KEY", "KEYS", "KILL",
  "LEADING", "LEAVE", "LEFT", "LIMIT", "LINES", "LOAD", "LOCALTIME",
  "LOCALTIMESTAMP", "LOCK", "LONG", "LONGBLOB", "LONGTEXT", "LOOP",
  "LOW_PRIORITY", "MATCH", "MEDIUMBLOB", "MIDDLEINT", "MEDIUMINT",
  "MEDIUMTEXT", "MINUTE_MICROSECOND", "MINUTE_SECOND", "MODIFIES",
  "NATURAL", "NO_WRITE_TO_BINLOG", "NULLX", "NUMBER", "ON", "OPTIMIZE",
  "OPTION", "OPTIONALLY", "ORDER", "OUT", "OUTER", "OUTFILE", "PRECISION",
  "PRIMARY", "PROCEDURE", "PURGE", "QUICK", "READ", "READS", "REAL",
  "REFERENCES", "RLIKE", "RELEASE", "RENAME", "REPEAT", "REPLACE",
  "REQUIRE", "RESTRICT", "RETURN", "REVOKE", "RIGHT", "ROLLUP", "SCHEMA",
  "SCHEMAS", "SECOND_MICROSECOND", "SELECT", "SENSITIVE", "SEPARATOR",
  "SET", "SHOW", "INT2", "SMALLINT", "SOME", "SONAME", "SPATIAL",
  "SPECIFIC", "SQL", "SQLEXCEPTION", "SQLSTATE", "SQLWARNING",
  "SQL_BIG_RESULT", "SQL_CALC_FOUND_ROWS", "SQL_SMALL_RESULT", "SSL",
  "STARTING", "STRAIGHT_JOIN", "TABLE", "TEMPORARY", "TERMINATED", "TEXT",
  "THEN", "TIME", "TIMESTAMP", "INT1", "TINYINT", "TINYTEXT", "TINYBLOB",
  "TO", "TRAILING", "TRIGGER", "UNDO", "UNION", "UNIQUE", "UNLOCK",
  "UNSIGNED", "UPDATE", "USAGE", "USE", "USING", "UTC_DATE", "UTC_TIME",
  "UTC_TIMESTAMP", "VALUES", "VARBINARY", "VARCHAR", "VARYING", "WHEN",
  "WHERE", "WHILE", "WITH", "WRITE", "YEAR", "YEAR_MONTH", "ZEROFILL",
  "ESCAPED", "EXISTS", "FSUBSTRING", "FTRIM", "FDATE_ADD", "FDATE_SUB",
  "FCOUNT", "';'", "'.'", "'('", "')'", "','", "$accept", "stmt_list",
  "expr", "val_list", "opt_val_list", "trim_ltb", "interval_exp",
  "case_list", "stmt", "select_stmt", "opt_where", "opt_groupby",
  "groupby_list", "opt_asc_desc", "opt_with_rollup", "opt_having",
  "opt_orderby", "opt_limit", "opt_into_list", "column_list",
  "select_opts", "select_expr_list", "select_expr", "opt_as_alias",
  "table_references", "table_reference", "table_factor", "opt_as",
  "join_table", "opt_inner_cross", "opt_outer", "left_or_right",
  "opt_left_or_right_outer", "opt_join_condition", "join_condition",
  "index_hint", "opt_for_join", "index_list", "table_subquery",
  "delete_stmt", "delete_opts", "delete_list", "opt_dot_star",
  "insert_stmt", "opt_ondupupdate", "insert_opts", "opt_into",
  "opt_col_names", "insert_vals_list", "insert_vals", "insert_asgn_list",
  "replace_stmt", "update_stmt", "update_opts", "update_asgn_list",
  "create_database_stmt", "opt_if_not_exists", "create_table_stmt",
  "opt_temporary", "create_col_list", "create_definition", "$@1",
  "column_atts", "opt_length", "opt_binary", "opt_uz", "opt_csc",
  "data_type", "enum_list", "create_select_statement",
  "opt_ignore_replace", "set_stmt", "set_list", "set_expr", 0
};
#endif

# ifdef YYPRINT
/* YYTOKNUM[YYLEX-NUM] -- Internal token number corresponding to
   token YYLEX-NUM.  */
static const yytype_uint16 yytoknum[] =
{
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,    33,   272,   273,
     274,   124,    38,   275,    43,    45,    42,    47,    37,   276,
      94,   277,   278,   279,   280,   281,   282,   283,   284,   285,
     286,   287,   288,   289,   290,   291,   292,   293,   294,   295,
     296,   297,   298,   299,   300,   301,   302,   303,   304,   305,
     306,   307,   308,   309,   310,   311,   312,   313,   314,   315,
     316,   317,   318,   319,   320,   321,   322,   323,   324,   325,
     326,   327,   328,   329,   330,   331,   332,   333,   334,   335,
     336,   337,   338,   339,   340,   341,   342,   343,   344,   345,
     346,   347,   348,   349,   350,   351,   352,   353,   354,   355,
     356,   357,   358,   359,   360,   361,   362,   363,   364,   365,
     366,   367,   368,   369,   370,   371,   372,   373,   374,   375,
     376,   377,   378,   379,   380,   381,   382,   383,   384,   385,
     386,   387,   388,   389,   390,   391,   392,   393,   394,   395,
     396,   397,   398,   399,   400,   401,   402,   403,   404,   405,
     406,   407,   408,   409,   410,   411,   412,   413,   414,   415,
     416,   417,   418,   419,   420,   421,   422,   423,   424,   425,
     426,   427,   428,   429,   430,   431,   432,   433,   434,   435,
     436,   437,   438,   439,   440,   441,   442,   443,   444,   445,
     446,   447,   448,   449,   450,   451,   452,   453,   454,   455,
     456,   457,   458,   459,   460,   461,   462,   463,   464,   465,
     466,   467,   468,   469,   470,   471,   472,   473,   474,   475,
     476,   477,   478,   479,   480,   481,   482,   483,   484,   485,
     486,   487,   488,   489,   490,   491,   492,   493,   494,   495,
     496,   497,   498,   499,   500,    59,    46,    40,    41,    44
};
# endif

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static const yytype_uint16 yyr1[] =
{
       0,   260,   261,   261,   262,   262,   262,   262,   262,   262,
     262,   262,   262,   262,   262,   262,   262,   262,   262,   262,
     262,   262,   262,   262,   262,   262,   262,   262,   262,   262,
     262,   262,   262,   262,   262,   262,   262,   262,   263,   263,
     264,   264,   262,   262,   262,   262,   262,   262,   262,   262,
     262,   262,   262,   262,   262,   265,   265,   265,   262,   262,
     266,   266,   266,   266,   266,   266,   266,   266,   266,   262,
     262,   262,   262,   267,   267,   262,   262,   262,   262,   262,
     262,   262,   262,   268,   269,   269,   270,   270,   271,   271,
     272,   272,   273,   273,   273,   274,   274,   275,   275,   276,
     276,   277,   277,   277,   278,   278,   279,   279,   280,   280,
     280,   280,   280,   280,   280,   280,   280,   281,   281,   281,
     282,   283,   283,   283,   284,   284,   285,   285,   286,   286,
     286,   286,   287,   287,   288,   288,   288,   288,   288,   289,
     289,   289,   290,   290,   291,   291,   292,   292,   292,   293,
     293,   294,   294,   295,   295,   295,   295,   296,   296,   297,
     297,   298,   268,   299,   300,   300,   300,   300,   299,   301,
     301,   302,   302,   299,   268,   303,   304,   304,   305,   305,
     305,   305,   305,   306,   306,   307,   307,   308,   308,   309,
     309,   309,   309,   303,   310,   310,   310,   310,   303,   268,
     311,   311,   311,   268,   312,   313,   313,   313,   314,   314,
     314,   314,   268,   315,   315,   316,   316,   268,   317,   317,
     317,   317,   317,   317,   318,   318,   319,   319,   320,   320,
     320,   320,   320,   321,   320,   322,   322,   322,   322,   322,
     322,   322,   322,   322,   322,   322,   322,   322,   323,   323,
     323,   324,   324,   325,   325,   325,   326,   326,   326,   327,
     327,   327,   327,   327,   327,   327,   327,   327,   327,   327,
     327,   327,   327,   327,   327,   327,   327,   327,   327,   327,
     327,   327,   327,   327,   327,   327,   327,   327,   327,   328,
     328,   329,   330,   330,   330,   268,   331,   332,   332,   333,
     333
};

/* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
static const yytype_uint8 yyr2[] =
{
       0,     2,     2,     3,     1,     3,     1,     1,     1,     1,
       1,     3,     3,     3,     3,     3,     3,     2,     3,     3,
       3,     3,     3,     3,     3,     2,     2,     3,     5,     6,
       6,     6,     3,     4,     3,     4,     3,     5,     1,     3,
       0,     1,     5,     6,     5,     6,     4,     4,     4,     4,
       4,     6,     8,     4,     7,     1,     1,     1,     6,     6,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     4,
       6,     3,     5,     4,     5,     3,     4,     3,     4,     1,
       1,     1,     2,     1,     3,    11,     0,     2,     0,     4,
       2,     4,     0,     1,     1,     0,     2,     0,     2,     0,
       3,     0,     2,     4,     0,     2,     1,     3,     0,     2,
       2,     2,     2,     2,     2,     2,     2,     1,     3,     1,
       2,     2,     1,     0,     1,     3,     1,     1,     3,     5,
       3,     3,     1,     0,     5,     3,     5,     6,     5,     0,
       1,     1,     0,     1,     1,     1,     2,     2,     0,     0,
       1,     2,     4,     6,     6,     6,     0,     2,     0,     1,
       3,     3,     1,     7,     2,     2,     2,     0,     6,     2,
       4,     0,     2,     7,     1,     8,     0,     4,     0,     2,
       2,     2,     2,     1,     0,     0,     3,     3,     5,     1,
       1,     3,     3,     7,     3,     3,     5,     5,     7,     1,
       8,     7,     7,     1,     8,     0,     2,     2,     3,     5,
       5,     7,     1,     4,     4,     0,     2,     1,     8,    10,
       9,     6,    11,     8,     0,     1,     1,     3,     5,     4,
       4,     5,     5,     0,     4,     0,     3,     2,     3,     3,
       3,     3,     2,     5,     3,     3,     2,     3,     0,     3,
       5,     0,     1,     0,     2,     2,     0,     4,     3,     2,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       1,     1,     1,     1,     1,     3,     5,     2,     4,     1,
       1,     1,     1,     3,     3,     3,     3,     5,     5,     1,
       3,     3,     0,     1,     1,     1,     2,     1,     3,     3,
       3
};

/* YYDEFACT[STATE-NAME] -- Default rule to reduce with in state
   STATE-NUM when YYTABLE doesn't specify something else to do.  Zero
   means the default is an error.  */
static const yytype_uint16 yydefact[] =
{
       0,   224,   167,   178,   178,   108,     0,   178,     0,     0,
      83,   162,   174,   199,   203,   212,   217,   295,   215,   215,
     225,     0,     0,   184,   184,     0,     0,   296,   297,     0,
       0,     1,     0,     2,     0,     0,     0,   215,   171,     0,
     166,   164,   165,     0,   180,   181,   182,   183,   179,     0,
       0,     4,     7,     8,    10,     9,     6,     0,     0,     0,
     119,   109,     0,     0,    80,    81,    79,   110,   111,   112,
     115,   116,   114,   113,     0,     0,     0,     0,     0,     0,
     123,    84,   117,     0,     0,     0,   182,   179,   123,     0,
       0,   124,   126,   127,   133,     3,   216,   213,   214,     0,
       0,   169,    86,     0,     0,     0,   185,   185,     0,    40,
       0,    26,    25,    17,    82,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   122,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,   120,     0,     0,   300,
     299,   298,     0,   156,     0,     0,     0,     0,   141,   140,
     144,   148,   145,     0,     0,   142,   132,     0,   292,   172,
       0,    99,     0,    86,   171,     0,     0,     0,     0,     0,
       5,    38,    41,     0,    36,     0,     0,     0,    71,     0,
       0,    38,     0,    57,    55,    56,     0,     0,     0,     0,
       0,     0,    19,    20,    18,    77,    75,    34,     0,    32,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    27,
      21,    22,    24,    11,    12,    13,    14,    15,    16,    23,
     121,    86,   118,   123,     0,     0,     0,   128,   161,   131,
       0,    86,   125,   142,   142,     0,   135,     0,   143,     0,
     130,   293,   294,     0,   233,   221,   133,    87,     0,   101,
      86,   168,   170,     0,   176,   106,     0,     0,   176,   176,
       0,   176,     0,    47,     0,     0,    69,     0,     0,    46,
       0,    50,    53,     0,     0,     0,    48,    49,    35,    33,
       0,     0,    78,    76,     0,     0,     0,     0,     0,     0,
      88,   156,   158,   158,   158,     0,     0,     0,    99,   146,
     147,     0,     0,   149,     0,   292,     0,     0,     0,     0,
       0,   226,     0,     0,     0,     0,   163,   173,     0,     0,
       0,   193,   186,     0,     0,   176,   198,   201,   176,   202,
      39,    73,     0,    72,     0,     0,     0,     0,     0,     0,
      42,    44,     0,     0,    37,     0,     0,     0,    28,     0,
      97,   129,     0,     0,     0,     0,   208,     0,     0,   101,
     138,   136,     0,     0,   134,   150,     0,   233,   223,     0,
       0,     0,     0,     0,   292,   233,     0,   291,    92,   100,
     102,   195,   194,     0,     0,   107,   190,   189,     0,     0,
     175,   200,    70,    74,     0,    51,     0,     0,    58,    59,
      43,    45,    31,    29,    30,     0,     0,    99,   157,     0,
       0,     0,     0,     0,     0,   204,   151,     0,   137,     0,
       0,     0,     0,     0,     0,   220,   227,   248,   248,   248,
     280,   248,   270,   273,   248,   248,     0,   248,   248,   248,
     282,   251,   281,   248,   251,   248,     0,   248,   251,   271,
     272,   248,   251,   279,     0,     0,   274,   235,    93,    94,
      90,     0,     0,     0,     0,   187,     0,     0,     0,    54,
      60,    61,    62,    63,    66,    67,    68,    65,    64,    95,
      98,   101,   159,     0,     0,     0,   209,   210,     0,     0,
     292,     0,     0,   230,   229,     0,     0,   253,   277,   259,
     256,   253,   253,     0,   253,   253,   253,   252,   256,   253,
     256,   253,     0,   253,   256,   253,   256,     0,     0,   234,
      92,   103,   177,   197,   196,   192,   191,     0,    52,     0,
      89,   104,   155,     0,   154,   153,     0,   152,   222,   231,
     232,   228,     0,   265,   275,   269,   267,   289,     0,   268,
     263,   264,   286,   262,   285,   266,     0,   261,   284,   260,
     283,     0,     0,     0,   242,     0,     0,   246,   237,     0,
       0,    91,   188,    96,     0,    85,   160,   211,   249,     0,
     254,   255,     0,     0,   256,     0,   256,   278,   256,   236,
     247,   238,   239,   241,   240,   245,   244,     0,   105,     0,
       0,   258,   287,   290,   288,   276,     0,   250,   257,   243
};

/* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,     8,   181,   182,   183,   197,   348,   117,     9,    10,
     171,   360,   389,   470,   540,   417,   259,   326,   585,   266,
      25,    81,    82,   146,    90,    91,    92,   167,    93,   164,
     249,   165,   245,   374,   375,   237,   363,   493,    94,    11,
      22,    43,   101,    12,   331,    23,    49,   177,   335,   398,
     264,    13,    14,    30,   241,    15,    35,    16,    21,   320,
     321,   322,   529,   507,   518,   553,   554,   467,   558,   255,
     256,    17,    27,    28
};

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
#define YYPACT_NINF -325
static const yytype_int16 yypact[] =
{
     -26,    18,  -325,  -325,  -325,  -325,    64,     0,    22,  -175,
    -325,  -325,  -325,  -325,  -325,  -325,  -325,  -325,    15,    15,
    -325,  -121,   131,   172,   172,   132,    62,  -107,  -325,    91,
       1,  -325,   -94,  -325,   -74,   182,   197,    15,   -39,   219,
    -325,  -325,  -325,   -99,  -325,  -325,  -325,  -325,  -325,   250,
     271,  -131,  -325,  -325,  -325,  -325,   268,   618,   618,   618,
    -325,  -325,   618,   227,  -325,  -325,  -325,  -325,  -325,  -325,
    -325,  -325,  -325,  -325,    32,    45,    59,    61,    66,    69,
    1418,   -75,  -325,   618,   618,    64,     8,     9,    17,    -1,
    -111,   397,  -325,  -325,   257,  -325,  -325,  -325,  -325,   318,
     308,  -325,   200,  -192,     1,   336,  -136,  -128,   342,   618,
     618,   651,   651,  -325,  -325,   618,   989,   -35,   161,   618,
     174,   618,   618,   307,  -325,   618,   618,   618,   618,   618,
      33,   108,   315,   618,    10,   618,   618,   618,   618,   618,
     618,   618,   618,   618,   618,   374,  -325,     1,   618,  1439,
    1439,  -325,   377,    38,   134,  -103,   386,     1,  -325,  -325,
    -325,   -85,  -325,     1,   272,   242,  -325,   436,   -33,  -325,
     618,   283,     1,  -193,   -39,   447,   450,  -145,   447,    39,
    -325,   696,  -325,   217,  1439,  1054,   -32,   618,  -325,   618,
     226,   675,   251,  -325,  -325,  -325,   252,   618,   734,   764,
     253,   834,  1013,  1162,  1182,  1232,  1232,  -325,     3,  -325,
     349,   618,   618,   259,  1373,   260,   261,   262,   161,   921,
     743,  1022,  1107,   334,   334,   482,   482,   482,   482,  -325,
    -325,  -193,  -325,    50,   391,   393,   394,  -325,  -325,  -325,
     -15,  -189,   397,   242,   242,   398,   368,     1,  -325,   401,
    -325,  -325,  -325,   527,   179,  -325,   257,  1439,   481,   400,
    -193,  -325,  -325,   512,   -69,  -325,   -49,   279,   451,   -69,
     279,   451,   618,  -325,   618,   618,  -325,  1309,  1083,  -325,
     618,  -325,  -325,  1212,   418,   418,  -325,  -325,  -325,  -325,
     286,   288,  1232,  1232,   349,   618,   161,   161,   161,   292,
     443,    38,   459,   459,   459,   618,   560,   562,   283,  -325,
    -325,     1,   618,  -112,     1,  -106,    98,   309,   310,   439,
      26,  -325,   566,   161,   618,   618,  -325,  -325,   404,   448,
     575,  -325,  -325,   576,   483,   -64,  -325,  -325,   -64,  -325,
    -325,  1439,  1330,  -325,   618,   813,   618,   618,   322,   324,
    -325,  -325,   325,   326,   897,   329,   330,   331,  -325,   542,
     484,  -325,   464,   335,   338,   339,  1439,   577,   -14,   400,
    -325,  1439,   618,   347,  -325,  -325,  -112,   179,  -325,   348,
     350,   450,   450,   351,   -87,   179,  1071,  -325,  1351,   352,
     785,  -325,  1439,   380,   590,  -325,  -325,  1439,    84,   357,
    -325,  -325,  -325,  1439,   618,  -325,   358,   884,  -325,  -325,
    -325,  -325,  -325,  -325,  -325,   618,   618,   283,  -325,   615,
     615,   615,   618,   618,   617,  -325,  1439,   450,  -325,    90,
     450,   450,   111,   117,   450,  -325,  -325,   370,   370,   370,
    -325,   370,  -325,  -325,   370,   370,   371,   370,   370,   370,
    -325,   585,  -325,   370,   585,   370,   373,   370,   585,  -325,
    -325,   370,   585,  -325,   381,   382,  -325,  -325,  -325,  -325,
    -325,   618,   618,   447,   489,  -325,   568,   483,   863,  -325,
    -325,  -325,  -325,  -325,  -325,  -325,  -325,  -325,  -325,  -137,
    1439,   400,  -325,   129,   136,   143,  1439,  1439,   611,   146,
     -86,   178,   199,  -325,  -325,   203,   632,  -325,  -325,  -325,
    -325,  -325,  -325,   636,  -325,  -325,  -325,  -325,  -325,  -325,
    -325,  -325,   636,  -325,  -325,  -325,  -325,   637,   639,   287,
    1351,  1439,   387,  -325,  1439,  -325,  1439,   205,  -325,   456,
    -325,   520,  -325,   644,  -325,  -325,   618,  -325,  -325,  -325,
    -325,  -325,   207,  -178,   193,  -178,  -178,  -325,   213,  -178,
    -178,  -178,   193,  -178,   193,  -178,   215,  -178,   193,  -178,
     193,   390,   392,   495,  -325,   648,   413,  -325,  -325,   530,
    -110,  -325,  -325,  -325,   450,  -325,  -325,  1439,  -325,   655,
    -325,  -325,   469,   659,  -325,   660,  -325,  -325,  -325,  -325,
    -325,  -325,  -325,  -325,  -325,  -325,  -325,   450,   406,   408,
     663,  -325,   193,  -325,   193,   193,   224,  -325,  -325,  -325
};

/* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -325,  -325,   -25,   -78,  -325,  -325,   383,   597,   684,   762,
      99,  -325,   312,   198,  -325,  -325,  -284,  -324,  -325,  -303,
    -325,  -325,   581,   -63,   231,   573,  -140,   475,  -325,  -325,
     255,  -325,  -325,  -325,   375,   501,   201,    82,  -325,  -325,
    -325,   777,   656,  -325,   -56,   137,   841,   759,   631,   438,
    -177,  -325,  -325,  -325,  -325,  -325,    49,  -325,  -325,   551,
     544,  -325,  -325,   526,  -164,   -81,    19,  -325,   409,  -307,
    -325,  -325,  -325,   845
};

/* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule which
   number is the opposite.  If zero, do what YYDEFACT says.
   If YYTABLE_NINF, syntax error.  */
#define YYTABLE_NINF -220
static const yytype_int16 yytable[] =
{
      80,   269,    88,  -205,    88,   305,   423,   104,   378,   288,
     251,  -207,  -206,    51,    52,    53,    54,    55,    56,   606,
     124,   329,    31,   246,   369,   153,   329,    57,    58,   251,
     251,   147,   111,   112,   113,    59,     1,   114,   116,   207,
     172,   192,   196,   215,     5,   425,   372,   216,   170,   243,
     590,   208,   170,   124,    62,   145,   175,     2,   149,   150,
     187,    63,   188,   275,   178,   276,   157,   105,    36,   591,
     307,    83,    26,   252,    64,    65,    66,   435,   432,   433,
      33,   156,    84,   251,     1,   184,    99,    18,   145,    37,
     185,   267,   252,   252,   191,     3,   198,   199,   201,   244,
     202,   203,   204,   205,   206,     2,   539,   313,   214,   219,
     220,   221,   222,   223,   224,   225,   226,   227,   228,   229,
     373,   176,   471,    80,   499,   108,   109,   501,   502,   176,
      34,   505,   290,   491,    38,    51,    52,    53,    54,    55,
      56,    24,   234,     3,    29,   257,   252,   607,   157,    57,
      58,   377,    85,     4,   235,   239,   157,    59,    60,   289,
     105,    95,   277,     5,   278,    61,     6,   541,  -218,  -219,
     301,   370,   283,    44,   376,    96,    62,    51,    52,    53,
      54,    55,    56,    63,   148,    97,   292,   293,     5,   209,
     330,    57,    58,   548,   340,   399,    64,    65,    66,    59,
      98,     4,    45,     7,    19,   189,   217,    86,   189,   332,
     333,     5,   336,   337,     6,   339,   352,   100,    62,    67,
      68,   193,   102,   253,   254,    63,   379,   380,     5,    20,
      51,    52,    53,    54,    55,    56,    87,    39,    64,    65,
      66,   306,   424,    69,    57,    58,   592,    40,   593,   341,
     342,     7,    59,   106,    44,   345,    89,  -205,    89,    74,
      75,    76,    77,    78,    79,  -207,  -206,   218,   406,   236,
     354,    62,   261,   152,   107,   270,    41,   110,    63,   400,
     366,   608,   401,    45,   384,   385,   316,   371,    46,   118,
     520,    64,    65,    66,   524,   166,   532,    47,   526,   388,
     390,    42,   119,   392,   616,   573,   194,   317,   318,   397,
      51,    52,    53,    54,    55,    56,   120,    48,   121,   403,
     155,   168,   407,   122,    57,    58,   123,   574,   211,   212,
     300,   213,    59,   200,   169,   173,    70,    71,    72,   174,
     308,    73,   475,   476,   575,   180,   319,   426,   500,   385,
       5,    62,    51,    52,    53,    54,    55,    56,    63,   327,
     140,   141,   142,   143,   144,   210,    57,    58,   576,   503,
     333,    64,    65,    66,    59,   504,   333,   230,   231,   478,
     233,    74,    75,    76,    77,    78,    79,   542,   543,   240,
     388,   490,   238,    62,   544,   543,   195,   496,   497,   247,
      63,   545,   543,   260,   547,   333,   248,    51,    52,    53,
      54,    55,    56,    64,    65,    66,   577,   601,   602,   603,
     604,    57,    58,    74,    75,    76,    77,    78,    79,    59,
     555,   556,  -171,   559,   560,   561,   549,   333,   563,   250,
     565,   170,   567,   578,   569,   258,   530,   531,    62,   534,
     263,   536,   397,   265,   579,    63,   100,   550,   333,  -171,
     158,   551,   333,   582,   476,   588,   589,   115,    64,    65,
      66,   594,   595,   596,   595,   273,    74,    75,    76,    77,
      78,    79,   619,   333,   279,   391,    51,    52,    53,    54,
      55,    56,    51,    52,    53,    54,    55,    56,   309,   310,
      57,    58,   494,   495,   364,   365,    57,    58,    59,   281,
     282,   286,   144,   580,    59,   159,   294,   296,   297,   298,
     302,   587,   303,   304,  -139,   311,   312,    62,   314,   324,
     315,   160,   328,    62,    63,   325,   334,   562,     5,   564,
      63,   329,   347,   568,   350,   570,   351,    64,    65,    66,
     358,   161,   359,    64,    65,    66,    74,    75,    76,    77,
      78,    79,   362,   367,   396,   368,   381,   382,   383,   386,
     533,    51,    52,    53,    54,    55,    56,   393,   394,   395,
     408,   162,   409,   410,   411,    57,    58,   412,   413,   414,
     415,   418,   419,    59,   416,   420,   421,   422,    74,    75,
      76,    77,    78,    79,   427,   430,   163,   431,   434,   473,
     474,   471,    62,   612,   477,   614,   479,   615,   492,    63,
     498,    51,    52,    53,    54,    55,    56,   506,   513,   517,
     522,   546,    64,    65,    66,    57,    58,   552,   527,   528,
     557,   583,   571,    59,   572,   584,   330,   586,   597,   535,
     598,   599,   600,    74,    75,    76,    77,    78,    79,   605,
     609,   610,    62,   611,   613,   333,   617,   618,   349,    63,
     133,   134,   135,   136,   137,   138,   139,   140,   141,   142,
     143,   144,    64,    65,    66,   125,   126,   127,   128,   129,
     130,   131,    32,   132,   133,   134,   135,   136,   137,   138,
     139,   140,   141,   142,   143,   144,   125,   126,   127,   128,
     129,   130,   131,   186,   132,   133,   134,   135,   136,   137,
     138,   139,   140,   141,   142,   143,   144,   489,   581,   232,
     242,   323,    74,    75,    76,    77,    78,    79,    74,    75,
      76,    77,    78,    79,   125,   126,   127,   128,   129,   130,
     131,   428,   132,   133,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   144,   136,   137,   138,   139,   140,
     141,   142,   143,   144,   125,   126,   127,   128,   129,   130,
     131,   280,   132,   133,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   144,   125,   126,   127,   128,   129,
     130,   131,   361,   132,   133,   134,   135,   136,   137,   138,
     139,   140,   141,   142,   143,   144,   103,    74,    75,    76,
      77,    78,    79,   125,   126,   127,   128,   129,   130,   131,
     262,   132,   133,   134,   135,   136,   137,   138,   139,   140,
     141,   142,   143,   144,   125,   126,   127,   128,   129,   130,
     131,   154,   132,   133,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   144,    50,   179,    74,    75,    76,
      77,    78,    79,   125,   126,   127,   128,   129,   130,   131,
     190,   132,   133,   134,   135,   136,   137,   138,   139,   140,
     141,   142,   143,   144,   125,   126,   127,   128,   129,   130,
     131,   338,   132,   133,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   144,   537,   404,   134,   135,   136,
     137,   138,   139,   140,   141,   142,   143,   144,   429,   436,
     151,   566,     0,     0,   272,     0,     0,     0,     0,   268,
       0,   271,   135,   136,   137,   138,   139,   140,   141,   142,
     143,   144,     0,     0,     0,   272,     0,   480,   481,   482,
     483,     0,     0,     0,   508,   509,     0,   510,     0,     0,
     511,   512,   291,   514,   515,   516,     0,     0,     0,   519,
     299,   521,     0,   523,     0,     0,     0,   525,     0,     0,
       0,     0,     0,   284,     0,     0,   484,   485,   486,   125,
     126,   127,   128,   129,   130,   131,     0,   132,   133,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144,
       0,     0,     0,   285,   126,   127,   128,   129,   130,   131,
       0,   132,   133,   134,   135,   136,   137,   138,   139,   140,
     141,   142,   143,   144,   472,   137,   138,   139,   140,   141,
     142,   143,   144,     0,     0,     0,   353,     0,   355,   356,
     357,     0,     0,     0,   125,   126,   127,   128,   129,   130,
     131,   405,   132,   133,   134,   135,   136,   137,   138,   139,
     140,   141,   142,   143,   144,   387,     0,     0,     0,     0,
       0,     0,   287,   125,   126,   127,   128,   129,   130,   131,
       0,   132,   133,   134,   135,   136,   137,   138,   139,   140,
     141,   142,   143,   144,   437,   438,   439,   440,     0,     0,
       0,   538,     0,     0,   441,     0,     0,     0,     0,   487,
     488,   138,   139,   140,   141,   142,   143,   144,     0,     0,
       0,     0,   442,   443,     0,     0,     0,     0,     0,     0,
     444,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   445,     0,     0,     0,     0,     0,     0,   446,
       0,     0,     0,   447,   127,   128,   129,   130,   131,     0,
     132,   133,   134,   135,   136,   137,   138,   139,   140,   141,
     142,   143,   144,   448,   449,   128,   129,   130,   131,     0,
     132,   133,   134,   135,   136,   137,   138,   139,   140,   141,
     142,   143,   144,   450,   451,     0,     0,     0,   452,     0,
     453,   454,   125,   126,   127,   128,   129,   130,   131,   115,
     132,   133,   134,   135,   136,   137,   138,   139,   140,   141,
     142,   143,   144,     0,   455,  -220,  -220,  -220,  -220,     0,
     132,   133,   134,   135,   136,   137,   138,   139,   140,   141,
     142,   143,   144,   456,     0,     0,   457,     0,   274,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   458,     0,   459,   460,     0,   461,
     462,   463,     0,     0,     0,     0,     0,   344,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   464,   465,
       0,     0,     0,     0,     0,     0,   466,     0,   346,   125,
     126,   127,   128,   129,   130,   131,     0,   132,   133,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144,
     125,   126,   127,   128,   129,   130,   131,     0,   132,   133,
     134,   135,   136,   137,   138,   139,   140,   141,   142,   143,
     144,   125,   126,   127,   128,   129,   130,   131,     0,   132,
     133,   134,   135,   136,   137,   138,   139,   140,   141,   142,
     143,   144,     0,   125,   126,   127,   128,   129,   130,   131,
     468,   132,   133,   134,   135,   136,   137,   138,   139,   140,
     141,   142,   143,   144,     0,     0,   343,     0,     0,   295,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   124,     0,     0,     0,     0,     0,   402,   125,   126,
     127,   128,   129,   130,   131,   469,   132,   133,   134,   135,
     136,   137,   138,   139,   140,   141,   142,   143,   144,   125,
     126,   127,   128,   129,   130,   131,   145,   132,   133,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144
};

static const yytype_int16 yycheck[] =
{
      25,   178,     3,     3,     3,    20,    20,   106,   315,     6,
     116,     3,     3,     3,     4,     5,     6,     7,     8,   129,
       3,    90,     0,   163,   308,    88,    90,    17,    18,   116,
     116,   106,    57,    58,    59,    25,    62,    62,    63,     6,
     232,   119,   120,    33,   189,   369,   158,    37,   241,   134,
     228,    18,   241,     3,    44,    38,   192,    83,    83,    84,
      95,    51,    97,    95,   192,    97,   259,   259,    19,   247,
     259,     9,     8,   179,    64,    65,    66,   384,   381,   382,
     255,   192,    20,   116,    62,   110,    37,    69,    38,   210,
     115,   236,   179,   179,   119,   121,   121,   122,   123,   184,
     125,   126,   127,   128,   129,    83,   243,   247,   133,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144,
     232,   257,   259,   148,   427,   256,   257,   430,   431,   257,
     115,   434,   210,   417,     3,     3,     4,     5,     6,     7,
       8,     4,   104,   121,     7,   170,   179,   257,   259,    17,
      18,   257,   259,   179,   116,   258,   259,    25,    26,   156,
     259,   255,   187,   189,   189,    33,   192,   491,   255,   255,
     233,   311,   197,    82,   314,   249,    44,     3,     4,     5,
       6,     7,     8,    51,   259,     3,   211,   212,   189,   156,
     259,    17,    18,   500,   272,   259,    64,    65,    66,    25,
       3,   179,   111,   229,   186,   240,   196,   116,   240,   258,
     259,   189,   268,   269,   192,   271,   294,   256,    44,    87,
      88,    47,     3,   256,   257,    51,   128,   129,   189,   211,
       3,     4,     5,     6,     7,     8,   145,   106,    64,    65,
      66,   256,   256,   111,    17,    18,    53,   116,    55,   274,
     275,   229,    25,     3,    82,   280,   257,   257,   257,   249,
     250,   251,   252,   253,   254,   257,   257,   257,   346,   231,
     295,    44,   173,   256,     3,   236,   145,     9,    51,   335,
     305,   584,   338,   111,   258,   259,   107,   312,   116,   257,
     454,    64,    65,    66,   458,    38,   473,   125,   462,   324,
     325,   170,   257,   328,   607,    18,   132,   128,   129,   334,
       3,     4,     5,     6,     7,     8,   257,   145,   257,   344,
      89,     3,   347,   257,    17,    18,   257,    40,    13,    14,
     231,    16,    25,    26,    26,   104,   204,   205,   206,     3,
     241,   209,   258,   259,    57,     3,   167,   372,   258,   259,
     189,    44,     3,     4,     5,     6,     7,     8,    51,   260,
      26,    27,    28,    29,    30,   257,    17,    18,    81,   258,
     259,    64,    65,    66,    25,   258,   259,     3,   147,   404,
       3,   249,   250,   251,   252,   253,   254,   258,   259,     3,
     415,   416,   258,    44,   258,   259,   222,   422,   423,   127,
      51,   258,   259,   172,   258,   259,   164,     3,     4,     5,
       6,     7,     8,    64,    65,    66,   129,     4,     5,     6,
       7,    17,    18,   249,   250,   251,   252,   253,   254,    25,
     511,   512,   232,   514,   515,   516,   258,   259,   519,     3,
     521,   241,   523,   156,   525,   162,   471,   472,    44,   474,
       3,   476,   477,     3,   167,    51,   256,   258,   259,   259,
      63,   258,   259,   258,   259,   258,   259,   240,    64,    65,
      66,   258,   259,   258,   259,   258,   249,   250,   251,   252,
     253,   254,   258,   259,   258,    81,     3,     4,     5,     6,
       7,     8,     3,     4,     5,     6,     7,     8,   243,   244,
      17,    18,   420,   421,   303,   304,    17,    18,    25,   258,
     258,   258,    30,   226,    25,   118,   257,   257,   257,   257,
     129,   546,   129,   129,   127,   127,   158,    44,   127,    48,
       3,   134,    20,    44,    51,   135,   257,   518,   189,   520,
      51,    90,   124,   524,   258,   526,   258,    64,    65,    66,
     258,   154,   109,    64,    65,    66,   249,   250,   251,   252,
     253,   254,   103,     3,    81,     3,   257,   257,   129,     3,
      81,     3,     4,     5,     6,     7,     8,   129,     3,     3,
     258,   184,   258,   258,   258,    17,    18,   258,   258,   258,
      48,   127,   257,    25,   110,   257,   257,    20,   249,   250,
     251,   252,   253,   254,   257,   257,   209,   257,   257,   229,
      20,   259,    44,   594,   257,   596,   258,   598,     3,    51,
       3,     3,     4,     5,     6,     7,     8,   257,   257,    44,
     257,    20,    64,    65,    66,    17,    18,     5,   257,   257,
       4,   185,     5,    25,     5,   125,   259,     3,   258,    81,
     258,   156,     4,   249,   250,   251,   252,   253,   254,   129,
       5,   192,    44,     4,     4,   259,   258,     4,   285,    51,
      19,    20,    21,    22,    23,    24,    25,    26,    27,    28,
      29,    30,    64,    65,    66,    10,    11,    12,    13,    14,
      15,    16,     8,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    10,    11,    12,    13,
      14,    15,    16,   116,    18,    19,    20,    21,    22,    23,
      24,    25,    26,    27,    28,    29,    30,   415,   530,   148,
     157,   256,   249,   250,   251,   252,   253,   254,   249,   250,
     251,   252,   253,   254,    10,    11,    12,    13,    14,    15,
      16,   376,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    10,    11,    12,    13,    14,    15,
      16,   106,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    10,    11,    12,    13,    14,
      15,    16,   301,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    39,   249,   250,   251,
     252,   253,   254,    10,    11,    12,    13,    14,    15,    16,
     174,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    10,    11,    12,    13,    14,    15,
      16,    89,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    24,   107,   249,   250,   251,
     252,   253,   254,    10,    11,    12,    13,    14,    15,    16,
     118,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    10,    11,    12,    13,    14,    15,
      16,   270,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,   477,   103,    20,    21,    22,
      23,    24,    25,    26,    27,    28,    29,    30,   377,   385,
      85,   522,    -1,    -1,   259,    -1,    -1,    -1,    -1,   177,
      -1,   179,    21,    22,    23,    24,    25,    26,    27,    28,
      29,    30,    -1,    -1,    -1,   259,    -1,    73,    74,    75,
      76,    -1,    -1,    -1,   438,   439,    -1,   441,    -1,    -1,
     444,   445,   210,   447,   448,   449,    -1,    -1,    -1,   453,
     218,   455,    -1,   457,    -1,    -1,    -1,   461,    -1,    -1,
      -1,    -1,    -1,   259,    -1,    -1,   112,   113,   114,    10,
      11,    12,    13,    14,    15,    16,    -1,    18,    19,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30,
      -1,    -1,    -1,   259,    11,    12,    13,    14,    15,    16,
      -1,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,   259,    23,    24,    25,    26,    27,
      28,    29,    30,    -1,    -1,    -1,   294,    -1,   296,   297,
     298,    -1,    -1,    -1,    10,    11,    12,    13,    14,    15,
      16,   258,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,   323,    -1,    -1,    -1,    -1,
      -1,    -1,   258,    10,    11,    12,    13,    14,    15,    16,
      -1,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    43,    44,    45,    46,    -1,    -1,
      -1,   258,    -1,    -1,    53,    -1,    -1,    -1,    -1,   245,
     246,    24,    25,    26,    27,    28,    29,    30,    -1,    -1,
      -1,    -1,    71,    72,    -1,    -1,    -1,    -1,    -1,    -1,
      79,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    91,    -1,    -1,    -1,    -1,    -1,    -1,    98,
      -1,    -1,    -1,   102,    12,    13,    14,    15,    16,    -1,
      18,    19,    20,    21,    22,    23,    24,    25,    26,    27,
      28,    29,    30,   122,   123,    13,    14,    15,    16,    -1,
      18,    19,    20,    21,    22,    23,    24,    25,    26,    27,
      28,    29,    30,   142,   143,    -1,    -1,    -1,   147,    -1,
     149,   150,    10,    11,    12,    13,    14,    15,    16,   240,
      18,    19,    20,    21,    22,    23,    24,    25,    26,    27,
      28,    29,    30,    -1,   173,    13,    14,    15,    16,    -1,
      18,    19,    20,    21,    22,    23,    24,    25,    26,    27,
      28,    29,    30,   192,    -1,    -1,   195,    -1,   214,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   213,    -1,   215,   216,    -1,   218,
     219,   220,    -1,    -1,    -1,    -1,    -1,   214,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,   237,   238,
      -1,    -1,    -1,    -1,    -1,    -1,   245,    -1,   106,    10,
      11,    12,    13,    14,    15,    16,    -1,    18,    19,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30,
      10,    11,    12,    13,    14,    15,    16,    -1,    18,    19,
      20,    21,    22,    23,    24,    25,    26,    27,    28,    29,
      30,    10,    11,    12,    13,    14,    15,    16,    -1,    18,
      19,    20,    21,    22,    23,    24,    25,    26,    27,    28,
      29,    30,    -1,    10,    11,    12,    13,    14,    15,    16,
      39,    18,    19,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    -1,    -1,    97,    -1,    -1,    36,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,     3,    -1,    -1,    -1,    -1,    -1,    97,    10,    11,
      12,    13,    14,    15,    16,    84,    18,    19,    20,    21,
      22,    23,    24,    25,    26,    27,    28,    29,    30,    10,
      11,    12,    13,    14,    15,    16,    38,    18,    19,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30
};

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
static const yytype_uint16 yystos[] =
{
       0,    62,    83,   121,   179,   189,   192,   229,   261,   268,
     269,   299,   303,   311,   312,   315,   317,   331,    69,   186,
     211,   318,   300,   305,   305,   280,     8,   332,   333,   305,
     313,     0,   268,   255,   115,   316,   316,   210,     3,   106,
     116,   145,   170,   301,    82,   111,   116,   125,   145,   306,
     306,     3,     4,     5,     6,     7,     8,    17,    18,    25,
      26,    33,    44,    51,    64,    65,    66,    87,    88,   111,
     204,   205,   206,   209,   249,   250,   251,   252,   253,   254,
     262,   281,   282,     9,    20,   259,   116,   145,     3,   257,
     284,   285,   286,   288,   298,   255,   249,     3,     3,   316,
     256,   302,     3,   301,   106,   259,     3,     3,   256,   257,
       9,   262,   262,   262,   262,   240,   262,   267,   257,   257,
     257,   257,   257,   257,     3,    10,    11,    12,    13,    14,
      15,    16,    18,    19,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    38,   283,   106,   259,   262,
     262,   333,   256,   283,   269,   284,   192,   259,    63,   118,
     134,   154,   184,   209,   289,   291,    38,   287,     3,    26,
     241,   270,   232,   284,     3,   192,   257,   307,   192,   307,
       3,   262,   263,   264,   262,   262,   267,    95,    97,   240,
     269,   262,   263,    47,   132,   222,   263,   265,   262,   262,
      26,   262,   262,   262,   262,   262,   262,     6,    18,   156,
     257,    13,    14,    16,   262,    33,    37,   196,   257,   262,
     262,   262,   262,   262,   262,   262,   262,   262,   262,   262,
       3,   284,   282,     3,   104,   116,   231,   295,   258,   258,
       3,   314,   285,   134,   184,   292,   286,   127,   164,   290,
       3,   116,   179,   256,   257,   329,   330,   262,   162,   276,
     284,   270,   302,     3,   310,     3,   279,   236,   269,   310,
     236,   269,   259,   258,   214,    95,    97,   262,   262,   258,
     106,   258,   258,   262,   259,   259,   258,   258,     6,   156,
     263,   269,   262,   262,   257,    36,   257,   257,   257,   269,
     270,   283,   129,   129,   129,    20,   256,   259,   270,   290,
     290,   127,   158,   286,   127,     3,   107,   128,   129,   167,
     319,   320,   321,   287,    48,   135,   277,   270,    20,    90,
     259,   304,   258,   259,   257,   308,   304,   304,   308,   304,
     263,   262,   262,    97,   214,   262,   106,   124,   266,   266,
     258,   258,   263,   269,   262,   269,   269,   269,   258,   109,
     271,   295,   103,   296,   296,   296,   262,     3,     3,   276,
     286,   262,   158,   232,   293,   294,   286,   257,   329,   128,
     129,   257,   257,   129,   258,   259,     3,   269,   262,   272,
     262,    81,   262,   129,     3,     3,    81,   262,   309,   259,
     304,   304,    97,   262,   103,   258,   263,   262,   258,   258,
     258,   258,   258,   258,   258,    48,   110,   275,   127,   257,
     257,   257,    20,    20,   256,   277,   262,   257,   294,   319,
     257,   257,   279,   279,   257,   329,   320,    43,    44,    45,
      46,    53,    71,    72,    79,    91,    98,   102,   122,   123,
     142,   143,   147,   149,   150,   173,   192,   195,   213,   215,
     216,   218,   219,   220,   237,   238,   245,   327,    39,    84,
     273,   259,   259,   229,    20,   258,   259,   257,   262,   258,
      73,    74,    75,    76,   112,   113,   114,   245,   246,   272,
     262,   276,     3,   297,   297,   297,   262,   262,     3,   279,
     258,   279,   279,   258,   258,   279,   257,   323,   323,   323,
     323,   323,   323,   257,   323,   323,   323,    44,   324,   323,
     324,   323,   257,   323,   324,   323,   324,   257,   257,   322,
     262,   262,   310,    81,   262,    81,   262,   309,   258,   243,
     274,   277,   258,   259,   258,   258,    20,   258,   329,   258,
     258,   258,     5,   325,   326,   325,   325,     4,   328,   325,
     325,   325,   326,   325,   326,   325,   328,   325,   326,   325,
     326,     5,     5,    18,    40,    57,    81,   129,   156,   167,
     226,   273,   258,   185,   125,   278,     3,   262,   258,   259,
     228,   247,    53,    55,   258,   259,   258,   258,   258,   156,
       4,     4,     5,     6,     7,   129,   129,   257,   279,     5,
     192,     4,   326,     4,   326,   326,   279,   258,     4,   258
};

#define yyerrok		(yyerrstatus = 0)
#define yyclearin	(yychar = YYEMPTY)
#define YYEMPTY		(-2)
#define YYEOF		0

#define YYACCEPT	goto yyacceptlab
#define YYABORT		goto yyabortlab
#define YYERROR		goto yyerrorlab


/* Like YYERROR except do call yyerror.  This remains here temporarily
   to ease the transition to the new meaning of YYERROR, for GCC.
   Once GCC version 2 has supplanted version 1, this can go.  */

#define YYFAIL		goto yyerrlab

#define YYRECOVERING()  (!!yyerrstatus)

#define YYBACKUP(Token, Value)					\
do								\
  if (yychar == YYEMPTY && yylen == 1)				\
    {								\
      yychar = (Token);						\
      yylval = (Value);						\
      yytoken = YYTRANSLATE (yychar);				\
      YYPOPSTACK (1);						\
      goto yybackup;						\
    }								\
  else								\
    {								\
      yyerror (YY_("syntax error: cannot back up")); \
      YYERROR;							\
    }								\
while (YYID (0))


#define YYTERROR	1
#define YYERRCODE	256


/* YYLLOC_DEFAULT -- Set CURRENT to span from RHS[1] to RHS[N].
   If N is 0, then set CURRENT to the empty location which ends
   the previous symbol: RHS[0] (always defined).  */

#define YYRHSLOC(Rhs, K) ((Rhs)[K])
#ifndef YYLLOC_DEFAULT
# define YYLLOC_DEFAULT(Current, Rhs, N)				\
    do									\
      if (YYID (N))                                                    \
	{								\
	  (Current).first_line   = YYRHSLOC (Rhs, 1).first_line;	\
	  (Current).first_column = YYRHSLOC (Rhs, 1).first_column;	\
	  (Current).last_line    = YYRHSLOC (Rhs, N).last_line;		\
	  (Current).last_column  = YYRHSLOC (Rhs, N).last_column;	\
	}								\
      else								\
	{								\
	  (Current).first_line   = (Current).last_line   =		\
	    YYRHSLOC (Rhs, 0).last_line;				\
	  (Current).first_column = (Current).last_column =		\
	    YYRHSLOC (Rhs, 0).last_column;				\
	}								\
    while (YYID (0))
#endif


/* YY_LOCATION_PRINT -- Print the location on the stream.
   This macro was not mandated originally: define only if we know
   we won't break user code: when these are the locations we know.  */

#ifndef YY_LOCATION_PRINT
# if YYLTYPE_IS_TRIVIAL
#  define YY_LOCATION_PRINT(File, Loc)			\
     fprintf (File, "%d.%d-%d.%d",			\
	      (Loc).first_line, (Loc).first_column,	\
	      (Loc).last_line,  (Loc).last_column)
# else
#  define YY_LOCATION_PRINT(File, Loc) ((void) 0)
# endif
#endif


/* YYLEX -- calling `yylex' with the right arguments.  */

#ifdef YYLEX_PARAM
# define YYLEX yylex (YYLEX_PARAM)
#else
# define YYLEX yylex ()
#endif

/* Enable debugging if requested.  */
#if YYDEBUG

# ifndef YYFPRINTF
#  include <stdio.h> /* INFRINGES ON USER NAME SPACE */
#  define YYFPRINTF fprintf
# endif

# define YYDPRINTF(Args)			\
do {						\
  if (yydebug)					\
    YYFPRINTF Args;				\
} while (YYID (0))

# define YY_SYMBOL_PRINT(Title, Type, Value, Location)			  \
do {									  \
  if (yydebug)								  \
    {									  \
      YYFPRINTF (stderr, "%s ", Title);					  \
      yy_symbol_print (stderr,						  \
		  Type, Value); \
      YYFPRINTF (stderr, "\n");						  \
    }									  \
} while (YYID (0))


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_value_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_value_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (!yyvaluep)
    return;
# ifdef YYPRINT
  if (yytype < YYNTOKENS)
    YYPRINT (yyoutput, yytoknum[yytype], *yyvaluep);
# else
  YYUSE (yyoutput);
# endif
  switch (yytype)
    {
      default:
	break;
    }
}


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_symbol_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
#else
static void
yy_symbol_print (yyoutput, yytype, yyvaluep)
    FILE *yyoutput;
    int yytype;
    YYSTYPE const * const yyvaluep;
#endif
{
  if (yytype < YYNTOKENS)
    YYFPRINTF (yyoutput, "token %s (", yytname[yytype]);
  else
    YYFPRINTF (yyoutput, "nterm %s (", yytname[yytype]);

  yy_symbol_value_print (yyoutput, yytype, yyvaluep);
  YYFPRINTF (yyoutput, ")");
}

/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_stack_print (yytype_int16 *yybottom, yytype_int16 *yytop)
#else
static void
yy_stack_print (yybottom, yytop)
    yytype_int16 *yybottom;
    yytype_int16 *yytop;
#endif
{
  YYFPRINTF (stderr, "Stack now");
  for (; yybottom <= yytop; yybottom++)
    {
      int yybot = *yybottom;
      YYFPRINTF (stderr, " %d", yybot);
    }
  YYFPRINTF (stderr, "\n");
}

# define YY_STACK_PRINT(Bottom, Top)				\
do {								\
  if (yydebug)							\
    yy_stack_print ((Bottom), (Top));				\
} while (YYID (0))


/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/

#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yy_reduce_print (YYSTYPE *yyvsp, int yyrule)
#else
static void
yy_reduce_print (yyvsp, yyrule)
    YYSTYPE *yyvsp;
    int yyrule;
#endif
{
  int yynrhs = yyr2[yyrule];
  int yyi;
  unsigned long int yylno = yyrline[yyrule];
  YYFPRINTF (stderr, "Reducing stack by rule %d (line %lu):\n",
	     yyrule - 1, yylno);
  /* The symbols being reduced.  */
  for (yyi = 0; yyi < yynrhs; yyi++)
    {
      YYFPRINTF (stderr, "   $%d = ", yyi + 1);
      yy_symbol_print (stderr, yyrhs[yyprhs[yyrule] + yyi],
		       &(yyvsp[(yyi + 1) - (yynrhs)])
		       		       );
      YYFPRINTF (stderr, "\n");
    }
}

# define YY_REDUCE_PRINT(Rule)		\
do {					\
  if (yydebug)				\
    yy_reduce_print (yyvsp, Rule); \
} while (YYID (0))

/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
#else /* !YYDEBUG */
# define YYDPRINTF(Args)
# define YY_SYMBOL_PRINT(Title, Type, Value, Location)
# define YY_STACK_PRINT(Bottom, Top)
# define YY_REDUCE_PRINT(Rule)
#endif /* !YYDEBUG */


/* YYINITDEPTH -- initial size of the parser's stacks.  */
#ifndef	YYINITDEPTH
# define YYINITDEPTH 200
#endif

/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   YYSTACK_ALLOC_MAXIMUM < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */

#ifndef YYMAXDEPTH
# define YYMAXDEPTH 10000
#endif



#if YYERROR_VERBOSE

# ifndef yystrlen
#  if defined __GLIBC__ && defined _STRING_H
#   define yystrlen strlen
#  else
/* Return the length of YYSTR.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static YYSIZE_T
yystrlen (const char *yystr)
#else
static YYSIZE_T
yystrlen (yystr)
    const char *yystr;
#endif
{
  YYSIZE_T yylen;
  for (yylen = 0; yystr[yylen]; yylen++)
    continue;
  return yylen;
}
#  endif
# endif

# ifndef yystpcpy
#  if defined __GLIBC__ && defined _STRING_H && defined _GNU_SOURCE
#   define yystpcpy stpcpy
#  else
/* Copy YYSRC to YYDEST, returning the address of the terminating '\0' in
   YYDEST.  */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static char *
yystpcpy (char *yydest, const char *yysrc)
#else
static char *
yystpcpy (yydest, yysrc)
    char *yydest;
    const char *yysrc;
#endif
{
  char *yyd = yydest;
  const char *yys = yysrc;

  while ((*yyd++ = *yys++) != '\0')
    continue;

  return yyd - 1;
}
#  endif
# endif

# ifndef yytnamerr
/* Copy to YYRES the contents of YYSTR after stripping away unnecessary
   quotes and backslashes, so that it's suitable for yyerror.  The
   heuristic is that double-quoting is unnecessary unless the string
   contains an apostrophe, a comma, or backslash (other than
   backslash-backslash).  YYSTR is taken from yytname.  If YYRES is
   null, do not copy; instead, return the length of what the result
   would have been.  */
static YYSIZE_T
yytnamerr (char *yyres, const char *yystr)
{
  if (*yystr == '"')
    {
      YYSIZE_T yyn = 0;
      char const *yyp = yystr;

      for (;;)
	switch (*++yyp)
	  {
	  case '\'':
	  case ',':
	    goto do_not_strip_quotes;

	  case '\\':
	    if (*++yyp != '\\')
	      goto do_not_strip_quotes;
	    /* Fall through.  */
	  default:
	    if (yyres)
	      yyres[yyn] = *yyp;
	    yyn++;
	    break;

	  case '"':
	    if (yyres)
	      yyres[yyn] = '\0';
	    return yyn;
	  }
    do_not_strip_quotes: ;
    }

  if (! yyres)
    return yystrlen (yystr);

  return yystpcpy (yyres, yystr) - yyres;
}
# endif

/* Copy into YYRESULT an error message about the unexpected token
   YYCHAR while in state YYSTATE.  Return the number of bytes copied,
   including the terminating null byte.  If YYRESULT is null, do not
   copy anything; just return the number of bytes that would be
   copied.  As a special case, return 0 if an ordinary "syntax error"
   message will do.  Return YYSIZE_MAXIMUM if overflow occurs during
   size calculation.  */
static YYSIZE_T
yysyntax_error (char *yyresult, int yystate, int yychar)
{
  int yyn = yypact[yystate];

  if (! (YYPACT_NINF < yyn && yyn <= YYLAST))
    return 0;
  else
    {
      int yytype = YYTRANSLATE (yychar);
      YYSIZE_T yysize0 = yytnamerr (0, yytname[yytype]);
      YYSIZE_T yysize = yysize0;
      YYSIZE_T yysize1;
      int yysize_overflow = 0;
      enum { YYERROR_VERBOSE_ARGS_MAXIMUM = 5 };
      char const *yyarg[YYERROR_VERBOSE_ARGS_MAXIMUM];
      int yyx;

# if 0
      /* This is so xgettext sees the translatable formats that are
	 constructed on the fly.  */
      YY_("syntax error, unexpected %s");
      YY_("syntax error, unexpected %s, expecting %s");
      YY_("syntax error, unexpected %s, expecting %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s");
      YY_("syntax error, unexpected %s, expecting %s or %s or %s or %s");
# endif
      char *yyfmt;
      char const *yyf;
      static char const yyunexpected[] = "syntax error, unexpected %s";
      static char const yyexpecting[] = ", expecting %s";
      static char const yyor[] = " or %s";
      char yyformat[sizeof yyunexpected
		    + sizeof yyexpecting - 1
		    + ((YYERROR_VERBOSE_ARGS_MAXIMUM - 2)
		       * (sizeof yyor - 1))];
      char const *yyprefix = yyexpecting;

      /* Start YYX at -YYN if negative to avoid negative indexes in
	 YYCHECK.  */
      int yyxbegin = yyn < 0 ? -yyn : 0;

      /* Stay within bounds of both yycheck and yytname.  */
      int yychecklim = YYLAST - yyn + 1;
      int yyxend = yychecklim < YYNTOKENS ? yychecklim : YYNTOKENS;
      int yycount = 1;

      yyarg[0] = yytname[yytype];
      yyfmt = yystpcpy (yyformat, yyunexpected);

      for (yyx = yyxbegin; yyx < yyxend; ++yyx)
	if (yycheck[yyx + yyn] == yyx && yyx != YYTERROR)
	  {
	    if (yycount == YYERROR_VERBOSE_ARGS_MAXIMUM)
	      {
		yycount = 1;
		yysize = yysize0;
		yyformat[sizeof yyunexpected - 1] = '\0';
		break;
	      }
	    yyarg[yycount++] = yytname[yyx];
	    yysize1 = yysize + yytnamerr (0, yytname[yyx]);
	    yysize_overflow |= (yysize1 < yysize);
	    yysize = yysize1;
	    yyfmt = yystpcpy (yyfmt, yyprefix);
	    yyprefix = yyor;
	  }

      yyf = YY_(yyformat);
      yysize1 = yysize + yystrlen (yyf);
      yysize_overflow |= (yysize1 < yysize);
      yysize = yysize1;

      if (yysize_overflow)
	return YYSIZE_MAXIMUM;

      if (yyresult)
	{
	  /* Avoid sprintf, as that infringes on the user's name space.
	     Don't have undefined behavior even if the translation
	     produced a string with the wrong number of "%s"s.  */
	  char *yyp = yyresult;
	  int yyi = 0;
	  while ((*yyp = *yyf) != '\0')
	    {
	      if (*yyp == '%' && yyf[1] == 's' && yyi < yycount)
		{
		  yyp += yytnamerr (yyp, yyarg[yyi++]);
		  yyf += 2;
		}
	      else
		{
		  yyp++;
		  yyf++;
		}
	    }
	}
      return yysize;
    }
}
#endif /* YYERROR_VERBOSE */


/*-----------------------------------------------.
| Release the memory associated to this symbol.  |
`-----------------------------------------------*/

/*ARGSUSED*/
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
static void
yydestruct (const char *yymsg, int yytype, YYSTYPE *yyvaluep)
#else
static void
yydestruct (yymsg, yytype, yyvaluep)
    const char *yymsg;
    int yytype;
    YYSTYPE *yyvaluep;
#endif
{
  YYUSE (yyvaluep);

  if (!yymsg)
    yymsg = "Deleting";
  YY_SYMBOL_PRINT (yymsg, yytype, yyvaluep, yylocationp);

  switch (yytype)
    {

      default:
	break;
    }
}

/* Prevent warnings from -Wmissing-prototypes.  */
#ifdef YYPARSE_PARAM
#if defined __STDC__ || defined __cplusplus
int yyparse (void *YYPARSE_PARAM);
#else
int yyparse ();
#endif
#else /* ! YYPARSE_PARAM */
#if defined __STDC__ || defined __cplusplus
int yyparse (void);
#else
int yyparse ();
#endif
#endif /* ! YYPARSE_PARAM */


/* The lookahead symbol.  */
int yychar;

/* The semantic value of the lookahead symbol.  */
YYSTYPE yylval;

/* Number of syntax errors so far.  */
int yynerrs;



/*-------------------------.
| yyparse or yypush_parse.  |
`-------------------------*/

#ifdef YYPARSE_PARAM
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void *YYPARSE_PARAM)
#else
int
yyparse (YYPARSE_PARAM)
    void *YYPARSE_PARAM;
#endif
#else /* ! YYPARSE_PARAM */
#if (defined __STDC__ || defined __C99__FUNC__ \
     || defined __cplusplus || defined _MSC_VER)
int
yyparse (void)
#else
int
yyparse ()

#endif
#endif
{


    int yystate;
    /* Number of tokens to shift before error messages enabled.  */
    int yyerrstatus;

    /* The stacks and their tools:
       `yyss': related to states.
       `yyvs': related to semantic values.

       Refer to the stacks thru separate pointers, to allow yyoverflow
       to reallocate them elsewhere.  */

    /* The state stack.  */
    yytype_int16 yyssa[YYINITDEPTH];
    yytype_int16 *yyss;
    yytype_int16 *yyssp;

    /* The semantic value stack.  */
    YYSTYPE yyvsa[YYINITDEPTH];
    YYSTYPE *yyvs;
    YYSTYPE *yyvsp;

    YYSIZE_T yystacksize;

  int yyn;
  int yyresult;
  /* Lookahead token as an internal (translated) token number.  */
  int yytoken;
  /* The variables used to return semantic value and location from the
     action routines.  */
  YYSTYPE yyval;

#if YYERROR_VERBOSE
  /* Buffer for error messages, and its allocated size.  */
  char yymsgbuf[128];
  char *yymsg = yymsgbuf;
  YYSIZE_T yymsg_alloc = sizeof yymsgbuf;
#endif

#define YYPOPSTACK(N)   (yyvsp -= (N), yyssp -= (N))

  /* The number of symbols on the RHS of the reduced rule.
     Keep to zero when no symbol should be popped.  */
  int yylen = 0;

  yytoken = 0;
  yyss = yyssa;
  yyvs = yyvsa;
  yystacksize = YYINITDEPTH;

  YYDPRINTF ((stderr, "Starting parse\n"));

  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = YYEMPTY; /* Cause a token to be read.  */

  /* Initialize stack pointers.
     Waste one element of value and location stack
     so that they stay on the same level as the state stack.
     The wasted elements are never initialized.  */
  yyssp = yyss;
  yyvsp = yyvs;

  goto yysetstate;

/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed.  So pushing a state here evens the stacks.  */
  yyssp++;

 yysetstate:
  *yyssp = yystate;

  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      YYSIZE_T yysize = yyssp - yyss + 1;

#ifdef yyoverflow
      {
	/* Give user a chance to reallocate the stack.  Use copies of
	   these so that the &'s don't force the real ones into
	   memory.  */
	YYSTYPE *yyvs1 = yyvs;
	yytype_int16 *yyss1 = yyss;

	/* Each stack pointer address is followed by the size of the
	   data in use in that stack, in bytes.  This used to be a
	   conditional around just the two extra args, but that might
	   be undefined if yyoverflow is a macro.  */
	yyoverflow (YY_("memory exhausted"),
		    &yyss1, yysize * sizeof (*yyssp),
		    &yyvs1, yysize * sizeof (*yyvsp),
		    &yystacksize);

	yyss = yyss1;
	yyvs = yyvs1;
      }
#else /* no yyoverflow */
# ifndef YYSTACK_RELOCATE
      goto yyexhaustedlab;
# else
      /* Extend the stack our own way.  */
      if (YYMAXDEPTH <= yystacksize)
	goto yyexhaustedlab;
      yystacksize *= 2;
      if (YYMAXDEPTH < yystacksize)
	yystacksize = YYMAXDEPTH;

      {
	yytype_int16 *yyss1 = yyss;
	union yyalloc *yyptr =
	  (union yyalloc *) YYSTACK_ALLOC (YYSTACK_BYTES (yystacksize));
	if (! yyptr)
	  goto yyexhaustedlab;
	YYSTACK_RELOCATE (yyss_alloc, yyss);
	YYSTACK_RELOCATE (yyvs_alloc, yyvs);
#  undef YYSTACK_RELOCATE
	if (yyss1 != yyssa)
	  YYSTACK_FREE (yyss1);
      }
# endif
#endif /* no yyoverflow */

      yyssp = yyss + yysize - 1;
      yyvsp = yyvs + yysize - 1;

      YYDPRINTF ((stderr, "Stack size increased to %lu\n",
		  (unsigned long int) yystacksize));

      if (yyss + yystacksize - 1 <= yyssp)
	YYABORT;
    }

  YYDPRINTF ((stderr, "Entering state %d\n", yystate));

  if (yystate == YYFINAL)
    YYACCEPT;

  goto yybackup;

/*-----------.
| yybackup.  |
`-----------*/
yybackup:

  /* Do appropriate processing given the current state.  Read a
     lookahead token if we need one and don't already have one.  */

  /* First try to decide what to do without reference to lookahead token.  */
  yyn = yypact[yystate];
  if (yyn == YYPACT_NINF)
    goto yydefault;

  /* Not known => get a lookahead token if don't already have one.  */

  /* YYCHAR is either YYEMPTY or YYEOF or a valid lookahead symbol.  */
  if (yychar == YYEMPTY)
    {
      YYDPRINTF ((stderr, "Reading a token: "));
      yychar = YYLEX;
    }

  if (yychar <= YYEOF)
    {
      yychar = yytoken = YYEOF;
      YYDPRINTF ((stderr, "Now at end of input.\n"));
    }
  else
    {
      yytoken = YYTRANSLATE (yychar);
      YY_SYMBOL_PRINT ("Next token is", yytoken, &yylval, &yylloc);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || YYLAST < yyn || yycheck[yyn] != yytoken)
    goto yydefault;
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yyn == 0 || yyn == YYTABLE_NINF)
	goto yyerrlab;
      yyn = -yyn;
      goto yyreduce;
    }

  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus)
    yyerrstatus--;

  /* Shift the lookahead token.  */
  YY_SYMBOL_PRINT ("Shifting", yytoken, &yylval, &yylloc);

  /* Discard the shifted token.  */
  yychar = YYEMPTY;

  yystate = yyn;
  *++yyvsp = yylval;

  goto yynewstate;


/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    goto yyerrlab;
  goto yyreduce;


/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];

  /* If YYLEN is nonzero, implement the default value of the action:
     `$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsp[1-yylen];


  YY_REDUCE_PRINT (yyn);
  switch (yyn)
    {
        case 4:

/* Line 1455 of yacc.c  */
#line 317 "pmysql.y"
    { emit("NAME %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); ;}
    break;

  case 5:

/* Line 1455 of yacc.c  */
#line 318 "pmysql.y"
    { emit("FIELDNAME %s.%s", (yyvsp[(1) - (3)].strval), (yyvsp[(3) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); ;}
    break;

  case 6:

/* Line 1455 of yacc.c  */
#line 319 "pmysql.y"
    { emit("USERVAR %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); ;}
    break;

  case 7:

/* Line 1455 of yacc.c  */
#line 320 "pmysql.y"
    { emit("STRING %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); ;}
    break;

  case 8:

/* Line 1455 of yacc.c  */
#line 321 "pmysql.y"
    { emit("NUMBER %d", (yyvsp[(1) - (1)].intval)); ;}
    break;

  case 9:

/* Line 1455 of yacc.c  */
#line 322 "pmysql.y"
    { emit("FLOAT %g", (yyvsp[(1) - (1)].floatval)); ;}
    break;

  case 10:

/* Line 1455 of yacc.c  */
#line 323 "pmysql.y"
    { emit("BOOL %d", (yyvsp[(1) - (1)].intval)); ;}
    break;

  case 11:

/* Line 1455 of yacc.c  */
#line 326 "pmysql.y"
    { emit("ADD"); ;}
    break;

  case 12:

/* Line 1455 of yacc.c  */
#line 327 "pmysql.y"
    { emit("SUB"); ;}
    break;

  case 13:

/* Line 1455 of yacc.c  */
#line 328 "pmysql.y"
    { emit("MUL"); ;}
    break;

  case 14:

/* Line 1455 of yacc.c  */
#line 329 "pmysql.y"
    { emit("DIV"); ;}
    break;

  case 15:

/* Line 1455 of yacc.c  */
#line 330 "pmysql.y"
    { emit("MOD"); ;}
    break;

  case 16:

/* Line 1455 of yacc.c  */
#line 331 "pmysql.y"
    { emit("MOD"); ;}
    break;

  case 17:

/* Line 1455 of yacc.c  */
#line 332 "pmysql.y"
    { emit("NEG"); ;}
    break;

  case 18:

/* Line 1455 of yacc.c  */
#line 333 "pmysql.y"
    { emit("AND"); ;}
    break;

  case 19:

/* Line 1455 of yacc.c  */
#line 334 "pmysql.y"
    { emit("OR"); ;}
    break;

  case 20:

/* Line 1455 of yacc.c  */
#line 335 "pmysql.y"
    { emit("XOR"); ;}
    break;

  case 21:

/* Line 1455 of yacc.c  */
#line 336 "pmysql.y"
    { emit("BITOR"); ;}
    break;

  case 22:

/* Line 1455 of yacc.c  */
#line 337 "pmysql.y"
    { emit("BITAND"); ;}
    break;

  case 23:

/* Line 1455 of yacc.c  */
#line 338 "pmysql.y"
    { emit("BITXOR"); ;}
    break;

  case 24:

/* Line 1455 of yacc.c  */
#line 339 "pmysql.y"
    { emit("SHIFT %s", (yyvsp[(2) - (3)].subtok)==1?"left":"right"); ;}
    break;

  case 25:

/* Line 1455 of yacc.c  */
#line 340 "pmysql.y"
    { emit("NOT"); ;}
    break;

  case 26:

/* Line 1455 of yacc.c  */
#line 341 "pmysql.y"
    { emit("NOT"); ;}
    break;

  case 27:

/* Line 1455 of yacc.c  */
#line 342 "pmysql.y"
    { emit("CMP %d", (yyvsp[(2) - (3)].subtok)); ;}
    break;

  case 28:

/* Line 1455 of yacc.c  */
#line 345 "pmysql.y"
    { emit("CMPSELECT %d", (yyvsp[(2) - (5)].subtok)); ;}
    break;

  case 29:

/* Line 1455 of yacc.c  */
#line 346 "pmysql.y"
    { emit("CMPANYSELECT %d", (yyvsp[(2) - (6)].subtok)); ;}
    break;

  case 30:

/* Line 1455 of yacc.c  */
#line 347 "pmysql.y"
    { emit("CMPANYSELECT %d", (yyvsp[(2) - (6)].subtok)); ;}
    break;

  case 31:

/* Line 1455 of yacc.c  */
#line 348 "pmysql.y"
    { emit("CMPALLSELECT %d", (yyvsp[(2) - (6)].subtok)); ;}
    break;

  case 32:

/* Line 1455 of yacc.c  */
#line 351 "pmysql.y"
    { emit("ISNULL"); ;}
    break;

  case 33:

/* Line 1455 of yacc.c  */
#line 352 "pmysql.y"
    { emit("ISNULL"); emit("NOT"); ;}
    break;

  case 34:

/* Line 1455 of yacc.c  */
#line 353 "pmysql.y"
    { emit("ISBOOL %d", (yyvsp[(3) - (3)].intval)); ;}
    break;

  case 35:

/* Line 1455 of yacc.c  */
#line 354 "pmysql.y"
    { emit("ISBOOL %d", (yyvsp[(4) - (4)].intval)); emit("NOT"); ;}
    break;

  case 36:

/* Line 1455 of yacc.c  */
#line 356 "pmysql.y"
    { emit("ASSIGN @%s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); ;}
    break;

  case 37:

/* Line 1455 of yacc.c  */
#line 358 "pmysql.y"
    { emit("BETWEEN"); ;}
    break;

  case 38:

/* Line 1455 of yacc.c  */
#line 360 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 39:

/* Line 1455 of yacc.c  */
#line 361 "pmysql.y"
    { (yyval.intval) = 1 + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 40:

/* Line 1455 of yacc.c  */
#line 363 "pmysql.y"
    { (yyval.intval) = 0 ;}
    break;

  case 42:

/* Line 1455 of yacc.c  */
#line 366 "pmysql.y"
    { emit("ISIN %d", (yyvsp[(4) - (5)].intval)); ;}
    break;

  case 43:

/* Line 1455 of yacc.c  */
#line 367 "pmysql.y"
    { emit("ISIN %d", (yyvsp[(5) - (6)].intval)); emit("NOT"); ;}
    break;

  case 44:

/* Line 1455 of yacc.c  */
#line 368 "pmysql.y"
    { emit("CMPANYSELECT 4"); ;}
    break;

  case 45:

/* Line 1455 of yacc.c  */
#line 369 "pmysql.y"
    { emit("CMPALLSELECT 3"); ;}
    break;

  case 46:

/* Line 1455 of yacc.c  */
#line 370 "pmysql.y"
    { emit("EXISTSSELECT"); if((yyvsp[(1) - (4)].subtok))emit("NOT"); ;}
    break;

  case 47:

/* Line 1455 of yacc.c  */
#line 373 "pmysql.y"
    {  emit("CALL %d %s", (yyvsp[(3) - (4)].intval), (yyvsp[(1) - (4)].strval)); free((yyvsp[(1) - (4)].strval)); ;}
    break;

  case 48:

/* Line 1455 of yacc.c  */
#line 377 "pmysql.y"
    { emit("COUNTALL") ;}
    break;

  case 49:

/* Line 1455 of yacc.c  */
#line 378 "pmysql.y"
    { emit(" CALL 1 COUNT"); ;}
    break;

  case 50:

/* Line 1455 of yacc.c  */
#line 380 "pmysql.y"
    {  emit("CALL %d SUBSTR", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 51:

/* Line 1455 of yacc.c  */
#line 381 "pmysql.y"
    {  emit("CALL 2 SUBSTR"); ;}
    break;

  case 52:

/* Line 1455 of yacc.c  */
#line 382 "pmysql.y"
    {  emit("CALL 3 SUBSTR"); ;}
    break;

  case 53:

/* Line 1455 of yacc.c  */
#line 384 "pmysql.y"
    { emit("CALL %d TRIM", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 54:

/* Line 1455 of yacc.c  */
#line 385 "pmysql.y"
    { emit("CALL 3 TRIM"); ;}
    break;

  case 55:

/* Line 1455 of yacc.c  */
#line 388 "pmysql.y"
    { emit("NUMBER 1"); ;}
    break;

  case 56:

/* Line 1455 of yacc.c  */
#line 389 "pmysql.y"
    { emit("NUMBER 2"); ;}
    break;

  case 57:

/* Line 1455 of yacc.c  */
#line 390 "pmysql.y"
    { emit("NUMBER 3"); ;}
    break;

  case 58:

/* Line 1455 of yacc.c  */
#line 393 "pmysql.y"
    { emit("CALL 3 DATE_ADD"); ;}
    break;

  case 59:

/* Line 1455 of yacc.c  */
#line 394 "pmysql.y"
    { emit("CALL 3 DATE_SUB"); ;}
    break;

  case 60:

/* Line 1455 of yacc.c  */
#line 396 "pmysql.y"
    { emit("NUMBER 1"); ;}
    break;

  case 61:

/* Line 1455 of yacc.c  */
#line 397 "pmysql.y"
    { emit("NUMBER 2"); ;}
    break;

  case 62:

/* Line 1455 of yacc.c  */
#line 398 "pmysql.y"
    { emit("NUMBER 3"); ;}
    break;

  case 63:

/* Line 1455 of yacc.c  */
#line 399 "pmysql.y"
    { emit("NUMBER 4"); ;}
    break;

  case 64:

/* Line 1455 of yacc.c  */
#line 400 "pmysql.y"
    { emit("NUMBER 5"); ;}
    break;

  case 65:

/* Line 1455 of yacc.c  */
#line 401 "pmysql.y"
    { emit("NUMBER 6"); ;}
    break;

  case 66:

/* Line 1455 of yacc.c  */
#line 402 "pmysql.y"
    { emit("NUMBER 7"); ;}
    break;

  case 67:

/* Line 1455 of yacc.c  */
#line 403 "pmysql.y"
    { emit("NUMBER 8"); ;}
    break;

  case 68:

/* Line 1455 of yacc.c  */
#line 404 "pmysql.y"
    { emit("NUMBER 9"); ;}
    break;

  case 69:

/* Line 1455 of yacc.c  */
#line 406 "pmysql.y"
    { emit("CASEVAL %d 0", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 70:

/* Line 1455 of yacc.c  */
#line 407 "pmysql.y"
    { emit("CASEVAL %d 1", (yyvsp[(3) - (6)].intval)); ;}
    break;

  case 71:

/* Line 1455 of yacc.c  */
#line 408 "pmysql.y"
    { emit("CASE %d 0", (yyvsp[(2) - (3)].intval)); ;}
    break;

  case 72:

/* Line 1455 of yacc.c  */
#line 409 "pmysql.y"
    { emit("CASE %d 1", (yyvsp[(2) - (5)].intval)); ;}
    break;

  case 73:

/* Line 1455 of yacc.c  */
#line 412 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 74:

/* Line 1455 of yacc.c  */
#line 413 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (5)].intval)+1; ;}
    break;

  case 75:

/* Line 1455 of yacc.c  */
#line 416 "pmysql.y"
    { emit("LIKE"); ;}
    break;

  case 76:

/* Line 1455 of yacc.c  */
#line 417 "pmysql.y"
    { emit("LIKE"); emit("NOT"); ;}
    break;

  case 77:

/* Line 1455 of yacc.c  */
#line 420 "pmysql.y"
    { emit("REGEXP"); ;}
    break;

  case 78:

/* Line 1455 of yacc.c  */
#line 421 "pmysql.y"
    { emit("REGEXP"); emit("NOT"); ;}
    break;

  case 79:

/* Line 1455 of yacc.c  */
#line 424 "pmysql.y"
    { emit("NOW") ;}
    break;

  case 80:

/* Line 1455 of yacc.c  */
#line 425 "pmysql.y"
    { emit("NOW") ;}
    break;

  case 81:

/* Line 1455 of yacc.c  */
#line 426 "pmysql.y"
    { emit("NOW") ;}
    break;

  case 82:

/* Line 1455 of yacc.c  */
#line 429 "pmysql.y"
    { emit("STRTOBIN"); ;}
    break;

  case 83:

/* Line 1455 of yacc.c  */
#line 433 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 84:

/* Line 1455 of yacc.c  */
#line 437 "pmysql.y"
    { emit("SELECTNODATA %d %d", (yyvsp[(2) - (3)].intval), (yyvsp[(3) - (3)].intval)); ;}
    break;

  case 85:

/* Line 1455 of yacc.c  */
#line 442 "pmysql.y"
    { emit("SELECT %d %d %d", (yyvsp[(2) - (11)].intval), (yyvsp[(3) - (11)].intval), (yyvsp[(5) - (11)].intval)); ;}
    break;

  case 87:

/* Line 1455 of yacc.c  */
#line 445 "pmysql.y"
    { emit("WHERE"); ;}
    break;

  case 89:

/* Line 1455 of yacc.c  */
#line 449 "pmysql.y"
    { emit("GROUPBYLIST %d %d", (yyvsp[(3) - (4)].intval), (yyvsp[(4) - (4)].intval)); ;}
    break;

  case 90:

/* Line 1455 of yacc.c  */
#line 452 "pmysql.y"
    { emit("GROUPBY %d",  (yyvsp[(2) - (2)].intval)); (yyval.intval) = 1; ;}
    break;

  case 91:

/* Line 1455 of yacc.c  */
#line 454 "pmysql.y"
    { emit("GROUPBY %d",  (yyvsp[(4) - (4)].intval)); (yyval.intval) = (yyvsp[(1) - (4)].intval) + 1; ;}
    break;

  case 92:

/* Line 1455 of yacc.c  */
#line 457 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 93:

/* Line 1455 of yacc.c  */
#line 458 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 94:

/* Line 1455 of yacc.c  */
#line 459 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 95:

/* Line 1455 of yacc.c  */
#line 462 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 96:

/* Line 1455 of yacc.c  */
#line 463 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 98:

/* Line 1455 of yacc.c  */
#line 467 "pmysql.y"
    { emit("HAVING"); ;}
    break;

  case 100:

/* Line 1455 of yacc.c  */
#line 470 "pmysql.y"
    { emit("ORDERBY %d", (yyvsp[(3) - (3)].intval)); ;}
    break;

  case 102:

/* Line 1455 of yacc.c  */
#line 473 "pmysql.y"
    { emit("LIMIT 1"); ;}
    break;

  case 103:

/* Line 1455 of yacc.c  */
#line 474 "pmysql.y"
    { emit("LIMIT 2"); ;}
    break;

  case 105:

/* Line 1455 of yacc.c  */
#line 478 "pmysql.y"
    { emit("INTO %d", (yyvsp[(2) - (2)].intval)); ;}
    break;

  case 106:

/* Line 1455 of yacc.c  */
#line 481 "pmysql.y"
    { emit("COLUMN %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); (yyval.intval) = 1; ;}
    break;

  case 107:

/* Line 1455 of yacc.c  */
#line 482 "pmysql.y"
    { emit("COLUMN %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 108:

/* Line 1455 of yacc.c  */
#line 484 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 109:

/* Line 1455 of yacc.c  */
#line 486 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 01) yyerror("duplicate ALL option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 01; ;}
    break;

  case 110:

/* Line 1455 of yacc.c  */
#line 488 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 02) yyerror("duplicate DISTINCT option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 02; ;}
    break;

  case 111:

/* Line 1455 of yacc.c  */
#line 490 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 04) yyerror("duplicate DISTINCTROW option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 04; ;}
    break;

  case 112:

/* Line 1455 of yacc.c  */
#line 492 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 010) yyerror("duplicate HIGH_PRIORITY option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 010; ;}
    break;

  case 113:

/* Line 1455 of yacc.c  */
#line 494 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 020) yyerror("duplicate STRAIGHT_JOIN option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 020; ;}
    break;

  case 114:

/* Line 1455 of yacc.c  */
#line 496 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 040) yyerror("duplicate SQL_SMALL_RESULT option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 040; ;}
    break;

  case 115:

/* Line 1455 of yacc.c  */
#line 498 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 0100) yyerror("duplicate SQL_BIG_RESULT option"); (yyval.intval) = (yyvsp[(1) - (2)].intval) | 0100; ;}
    break;

  case 116:

/* Line 1455 of yacc.c  */
#line 500 "pmysql.y"
    { if((yyvsp[(1) - (2)].intval) & 0200) yyerror("duplicate SQL_CALC_FOUND_ROWS option"); (yyval.intval) = 
   (yyvsp[(1) - (2)].intval) | 0200; ;}
    break;

  case 117:

/* Line 1455 of yacc.c  */
#line 504 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 118:

/* Line 1455 of yacc.c  */
#line 505 "pmysql.y"
    {(yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 119:

/* Line 1455 of yacc.c  */
#line 506 "pmysql.y"
    { emit("SELECTALL"); (yyval.intval) = 1; ;}
    break;

  case 121:

/* Line 1455 of yacc.c  */
#line 511 "pmysql.y"
    { emit ("ALIAS %s", (yyvsp[(2) - (2)].strval)); free((yyvsp[(2) - (2)].strval)); ;}
    break;

  case 122:

/* Line 1455 of yacc.c  */
#line 512 "pmysql.y"
    { emit ("ALIAS %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); ;}
    break;

  case 124:

/* Line 1455 of yacc.c  */
#line 516 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 125:

/* Line 1455 of yacc.c  */
#line 517 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 128:

/* Line 1455 of yacc.c  */
#line 525 "pmysql.y"
    { emit("TABLE %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); ;}
    break;

  case 129:

/* Line 1455 of yacc.c  */
#line 526 "pmysql.y"
    { emit("TABLE %s.%s", (yyvsp[(1) - (5)].strval), (yyvsp[(3) - (5)].strval));
                               free((yyvsp[(1) - (5)].strval)); free((yyvsp[(3) - (5)].strval)); ;}
    break;

  case 130:

/* Line 1455 of yacc.c  */
#line 528 "pmysql.y"
    { emit("SUBQUERYAS %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); ;}
    break;

  case 131:

/* Line 1455 of yacc.c  */
#line 529 "pmysql.y"
    { emit("TABLEREFERENCES %d", (yyvsp[(2) - (3)].intval)); ;}
    break;

  case 134:

/* Line 1455 of yacc.c  */
#line 538 "pmysql.y"
    { emit("JOIN %d", 100+(yyvsp[(2) - (5)].intval)); ;}
    break;

  case 135:

/* Line 1455 of yacc.c  */
#line 540 "pmysql.y"
    { emit("JOIN %d", 200); ;}
    break;

  case 136:

/* Line 1455 of yacc.c  */
#line 542 "pmysql.y"
    { emit("JOIN %d", 200); ;}
    break;

  case 137:

/* Line 1455 of yacc.c  */
#line 544 "pmysql.y"
    { emit("JOIN %d", 300+(yyvsp[(2) - (6)].intval)+(yyvsp[(3) - (6)].intval)); ;}
    break;

  case 138:

/* Line 1455 of yacc.c  */
#line 546 "pmysql.y"
    { emit("JOIN %d", 400+(yyvsp[(3) - (5)].intval)); ;}
    break;

  case 139:

/* Line 1455 of yacc.c  */
#line 549 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 140:

/* Line 1455 of yacc.c  */
#line 550 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 141:

/* Line 1455 of yacc.c  */
#line 551 "pmysql.y"
    { (yyval.intval) = 2; ;}
    break;

  case 142:

/* Line 1455 of yacc.c  */
#line 554 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 143:

/* Line 1455 of yacc.c  */
#line 555 "pmysql.y"
    {(yyval.intval) = 4; ;}
    break;

  case 144:

/* Line 1455 of yacc.c  */
#line 558 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 145:

/* Line 1455 of yacc.c  */
#line 559 "pmysql.y"
    { (yyval.intval) = 2; ;}
    break;

  case 146:

/* Line 1455 of yacc.c  */
#line 562 "pmysql.y"
    { (yyval.intval) = 1 + (yyvsp[(2) - (2)].intval); ;}
    break;

  case 147:

/* Line 1455 of yacc.c  */
#line 563 "pmysql.y"
    { (yyval.intval) = 2 + (yyvsp[(2) - (2)].intval); ;}
    break;

  case 148:

/* Line 1455 of yacc.c  */
#line 564 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 151:

/* Line 1455 of yacc.c  */
#line 571 "pmysql.y"
    { emit("ONEXPR"); ;}
    break;

  case 152:

/* Line 1455 of yacc.c  */
#line 572 "pmysql.y"
    { emit("USING %d", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 153:

/* Line 1455 of yacc.c  */
#line 577 "pmysql.y"
    { emit("INDEXHINT %d %d", (yyvsp[(5) - (6)].intval), 10+(yyvsp[(3) - (6)].intval)); ;}
    break;

  case 154:

/* Line 1455 of yacc.c  */
#line 579 "pmysql.y"
    { emit("INDEXHINT %d %d", (yyvsp[(5) - (6)].intval), 20+(yyvsp[(3) - (6)].intval)); ;}
    break;

  case 155:

/* Line 1455 of yacc.c  */
#line 581 "pmysql.y"
    { emit("INDEXHINT %d %d", (yyvsp[(5) - (6)].intval), 30+(yyvsp[(3) - (6)].intval)); ;}
    break;

  case 157:

/* Line 1455 of yacc.c  */
#line 585 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 158:

/* Line 1455 of yacc.c  */
#line 586 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 159:

/* Line 1455 of yacc.c  */
#line 589 "pmysql.y"
    { emit("INDEX %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); (yyval.intval) = 1; ;}
    break;

  case 160:

/* Line 1455 of yacc.c  */
#line 590 "pmysql.y"
    { emit("INDEX %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 161:

/* Line 1455 of yacc.c  */
#line 593 "pmysql.y"
    { emit("SUBQUERY"); ;}
    break;

  case 162:

/* Line 1455 of yacc.c  */
#line 597 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 163:

/* Line 1455 of yacc.c  */
#line 603 "pmysql.y"
    { emit("DELETEONE %d %s", (yyvsp[(2) - (7)].intval), (yyvsp[(4) - (7)].strval)); free((yyvsp[(4) - (7)].strval)); ;}
    break;

  case 164:

/* Line 1455 of yacc.c  */
#line 606 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) + 01; ;}
    break;

  case 165:

/* Line 1455 of yacc.c  */
#line 607 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) + 02; ;}
    break;

  case 166:

/* Line 1455 of yacc.c  */
#line 608 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) + 04; ;}
    break;

  case 167:

/* Line 1455 of yacc.c  */
#line 609 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 168:

/* Line 1455 of yacc.c  */
#line 616 "pmysql.y"
    { emit("DELETEMULTI %d %d %d", (yyvsp[(2) - (6)].intval), (yyvsp[(3) - (6)].intval), (yyvsp[(5) - (6)].intval)); ;}
    break;

  case 169:

/* Line 1455 of yacc.c  */
#line 618 "pmysql.y"
    { emit("TABLE %s", (yyvsp[(1) - (2)].strval)); free((yyvsp[(1) - (2)].strval)); (yyval.intval) = 1; ;}
    break;

  case 170:

/* Line 1455 of yacc.c  */
#line 620 "pmysql.y"
    { emit("TABLE %s", (yyvsp[(3) - (4)].strval)); free((yyvsp[(3) - (4)].strval)); (yyval.intval) = (yyvsp[(1) - (4)].intval) + 1; ;}
    break;

  case 173:

/* Line 1455 of yacc.c  */
#line 629 "pmysql.y"
    { emit("DELETEMULTI %d %d %d", (yyvsp[(2) - (7)].intval), (yyvsp[(4) - (7)].intval), (yyvsp[(6) - (7)].intval)); ;}
    break;

  case 174:

/* Line 1455 of yacc.c  */
#line 633 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 175:

/* Line 1455 of yacc.c  */
#line 639 "pmysql.y"
    { emit("INSERTVALS %d %d %s", (yyvsp[(2) - (8)].intval), (yyvsp[(7) - (8)].intval), (yyvsp[(4) - (8)].strval)); free((yyvsp[(4) - (8)].strval)) ;}
    break;

  case 177:

/* Line 1455 of yacc.c  */
#line 643 "pmysql.y"
    { emit("DUPUPDATE %d", (yyvsp[(4) - (4)].intval)); ;}
    break;

  case 178:

/* Line 1455 of yacc.c  */
#line 646 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 179:

/* Line 1455 of yacc.c  */
#line 647 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 01 ; ;}
    break;

  case 180:

/* Line 1455 of yacc.c  */
#line 648 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 02 ; ;}
    break;

  case 181:

/* Line 1455 of yacc.c  */
#line 649 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 04 ; ;}
    break;

  case 182:

/* Line 1455 of yacc.c  */
#line 650 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 010 ; ;}
    break;

  case 186:

/* Line 1455 of yacc.c  */
#line 657 "pmysql.y"
    { emit("INSERTCOLS %d", (yyvsp[(2) - (3)].intval)); ;}
    break;

  case 187:

/* Line 1455 of yacc.c  */
#line 660 "pmysql.y"
    { emit("VALUES %d", (yyvsp[(2) - (3)].intval)); (yyval.intval) = 1; ;}
    break;

  case 188:

/* Line 1455 of yacc.c  */
#line 661 "pmysql.y"
    { emit("VALUES %d", (yyvsp[(4) - (5)].intval)); (yyval.intval) = (yyvsp[(1) - (5)].intval) + 1; ;}
    break;

  case 189:

/* Line 1455 of yacc.c  */
#line 664 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 190:

/* Line 1455 of yacc.c  */
#line 665 "pmysql.y"
    { emit("DEFAULT"); (yyval.intval) = 1; ;}
    break;

  case 191:

/* Line 1455 of yacc.c  */
#line 666 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 192:

/* Line 1455 of yacc.c  */
#line 667 "pmysql.y"
    { emit("DEFAULT"); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 193:

/* Line 1455 of yacc.c  */
#line 673 "pmysql.y"
    { emit("INSERTASGN %d %d %s", (yyvsp[(2) - (7)].intval), (yyvsp[(6) - (7)].intval), (yyvsp[(4) - (7)].strval)); free((yyvsp[(4) - (7)].strval)) ;}
    break;

  case 194:

/* Line 1455 of yacc.c  */
#line 678 "pmysql.y"
    { if ((yyvsp[(2) - (3)].subtok) != 4) { yyerror("bad insert assignment to %s", (yyvsp[(1) - (3)].strval)); YYERROR; }
       emit("ASSIGN %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); (yyval.intval) = 1; ;}
    break;

  case 195:

/* Line 1455 of yacc.c  */
#line 681 "pmysql.y"
    { if ((yyvsp[(2) - (3)].subtok) != 4) { yyerror("bad insert assignment to %s", (yyvsp[(1) - (3)].strval)); YYERROR; }
                 emit("DEFAULT"); emit("ASSIGN %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); (yyval.intval) = 1; ;}
    break;

  case 196:

/* Line 1455 of yacc.c  */
#line 684 "pmysql.y"
    { if ((yyvsp[(4) - (5)].subtok) != 4) { yyerror("bad insert assignment to %s", (yyvsp[(1) - (5)].intval)); YYERROR; }
                 emit("ASSIGN %s", (yyvsp[(3) - (5)].strval)); free((yyvsp[(3) - (5)].strval)); (yyval.intval) = (yyvsp[(1) - (5)].intval) + 1; ;}
    break;

  case 197:

/* Line 1455 of yacc.c  */
#line 687 "pmysql.y"
    { if ((yyvsp[(4) - (5)].subtok) != 4) { yyerror("bad insert assignment to %s", (yyvsp[(1) - (5)].intval)); YYERROR; }
                 emit("DEFAULT"); emit("ASSIGN %s", (yyvsp[(3) - (5)].strval)); free((yyvsp[(3) - (5)].strval)); (yyval.intval) = (yyvsp[(1) - (5)].intval) + 1; ;}
    break;

  case 198:

/* Line 1455 of yacc.c  */
#line 692 "pmysql.y"
    { emit("INSERTSELECT %d %s", (yyvsp[(2) - (7)].intval), (yyvsp[(4) - (7)].strval)); free((yyvsp[(4) - (7)].strval)); ;}
    break;

  case 199:

/* Line 1455 of yacc.c  */
#line 695 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 200:

/* Line 1455 of yacc.c  */
#line 701 "pmysql.y"
    { emit("REPLACEVALS %d %d %s", (yyvsp[(2) - (8)].intval), (yyvsp[(7) - (8)].intval), (yyvsp[(4) - (8)].strval)); free((yyvsp[(4) - (8)].strval)) ;}
    break;

  case 201:

/* Line 1455 of yacc.c  */
#line 707 "pmysql.y"
    { emit("REPLACEASGN %d %d %s", (yyvsp[(2) - (7)].intval), (yyvsp[(6) - (7)].intval), (yyvsp[(4) - (7)].strval)); free((yyvsp[(4) - (7)].strval)) ;}
    break;

  case 202:

/* Line 1455 of yacc.c  */
#line 712 "pmysql.y"
    { emit("REPLACESELECT %d %s", (yyvsp[(2) - (7)].intval), (yyvsp[(4) - (7)].strval)); free((yyvsp[(4) - (7)].strval)); ;}
    break;

  case 203:

/* Line 1455 of yacc.c  */
#line 715 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 204:

/* Line 1455 of yacc.c  */
#line 722 "pmysql.y"
    { emit("UPDATE %d %d %d", (yyvsp[(2) - (8)].intval), (yyvsp[(3) - (8)].intval), (yyvsp[(5) - (8)].intval)); ;}
    break;

  case 205:

/* Line 1455 of yacc.c  */
#line 725 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 206:

/* Line 1455 of yacc.c  */
#line 726 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 01 ; ;}
    break;

  case 207:

/* Line 1455 of yacc.c  */
#line 727 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 010 ; ;}
    break;

  case 208:

/* Line 1455 of yacc.c  */
#line 732 "pmysql.y"
    { if ((yyvsp[(2) - (3)].subtok) != 4) { yyerror("bad update assignment to %s", (yyvsp[(1) - (3)].strval)); YYERROR; }
	 emit("ASSIGN %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); (yyval.intval) = 1; ;}
    break;

  case 209:

/* Line 1455 of yacc.c  */
#line 735 "pmysql.y"
    { if ((yyvsp[(4) - (5)].subtok) != 4) { yyerror("bad update assignment to %s", (yyvsp[(1) - (5)].strval)); YYERROR; }
	 emit("ASSIGN %s.%s", (yyvsp[(1) - (5)].strval), (yyvsp[(3) - (5)].strval)); free((yyvsp[(1) - (5)].strval)); free((yyvsp[(3) - (5)].strval)); (yyval.intval) = 1; ;}
    break;

  case 210:

/* Line 1455 of yacc.c  */
#line 738 "pmysql.y"
    { if ((yyvsp[(4) - (5)].subtok) != 4) { yyerror("bad update assignment to %s", (yyvsp[(3) - (5)].strval)); YYERROR; }
	 emit("ASSIGN %s.%s", (yyvsp[(3) - (5)].strval)); free((yyvsp[(3) - (5)].strval)); (yyval.intval) = (yyvsp[(1) - (5)].intval) + 1; ;}
    break;

  case 211:

/* Line 1455 of yacc.c  */
#line 741 "pmysql.y"
    { if ((yyvsp[(6) - (7)].subtok) != 4) { yyerror("bad update  assignment to %s.$s", (yyvsp[(3) - (7)].strval), (yyvsp[(5) - (7)].strval)); 
          YYERROR; }
         emit("ASSIGN %s.%s", (yyvsp[(3) - (7)].strval), (yyvsp[(5) - (7)].strval)); free((yyvsp[(3) - (7)].strval)); free((yyvsp[(5) - (7)].strval)); (yyval.intval) = 1; ;}
    break;

  case 212:

/* Line 1455 of yacc.c  */
#line 747 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 213:

/* Line 1455 of yacc.c  */
#line 752 "pmysql.y"
    { emit("CREATEDATABASE %d %s", (yyvsp[(3) - (4)].intval), (yyvsp[(4) - (4)].strval)); free((yyvsp[(4) - (4)].strval)); ;}
    break;

  case 214:

/* Line 1455 of yacc.c  */
#line 754 "pmysql.y"
    { emit("CREATEDATABASE %d %s", (yyvsp[(3) - (4)].intval), (yyvsp[(4) - (4)].strval)); free((yyvsp[(4) - (4)].strval)); ;}
    break;

  case 215:

/* Line 1455 of yacc.c  */
#line 757 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 216:

/* Line 1455 of yacc.c  */
#line 759 "pmysql.y"
    { if(!(yyvsp[(2) - (2)].subtok)) { yyerror("IF EXISTS doesn't exist"); YYERROR; }
                        (yyval.intval) = (yyvsp[(2) - (2)].subtok); /* NOT EXISTS hack */ ;}
    break;

  case 217:

/* Line 1455 of yacc.c  */
#line 764 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 218:

/* Line 1455 of yacc.c  */
#line 768 "pmysql.y"
    { emit("CREATE %d %d %d %s", (yyvsp[(2) - (8)].intval), (yyvsp[(4) - (8)].intval), (yyvsp[(7) - (8)].intval), (yyvsp[(5) - (8)].strval)); free((yyvsp[(5) - (8)].strval)); ;}
    break;

  case 219:

/* Line 1455 of yacc.c  */
#line 772 "pmysql.y"
    { emit("CREATE %d %d %d %s.%s", (yyvsp[(2) - (10)].intval), (yyvsp[(4) - (10)].intval), (yyvsp[(9) - (10)].intval), (yyvsp[(5) - (10)].strval), (yyvsp[(7) - (10)].strval));
                          free((yyvsp[(5) - (10)].strval)); free((yyvsp[(7) - (10)].strval)); ;}
    break;

  case 220:

/* Line 1455 of yacc.c  */
#line 778 "pmysql.y"
    { emit("CREATESELECT %d %d %d %s", (yyvsp[(2) - (9)].intval), (yyvsp[(4) - (9)].intval), (yyvsp[(7) - (9)].intval), (yyvsp[(5) - (9)].strval)); free((yyvsp[(5) - (9)].strval)); ;}
    break;

  case 221:

/* Line 1455 of yacc.c  */
#line 782 "pmysql.y"
    { emit("CREATESELECT %d %d 0 %s", (yyvsp[(2) - (6)].intval), (yyvsp[(4) - (6)].intval), (yyvsp[(5) - (6)].strval)); free((yyvsp[(5) - (6)].strval)); ;}
    break;

  case 222:

/* Line 1455 of yacc.c  */
#line 787 "pmysql.y"
    { emit("CREATESELECT %d %d 0 %s.%s", (yyvsp[(2) - (11)].intval), (yyvsp[(4) - (11)].intval), (yyvsp[(5) - (11)].strval), (yyvsp[(7) - (11)].strval));
                              free((yyvsp[(5) - (11)].strval)); free((yyvsp[(7) - (11)].strval)); ;}
    break;

  case 223:

/* Line 1455 of yacc.c  */
#line 792 "pmysql.y"
    { emit("CREATESELECT %d %d 0 %s.%s", (yyvsp[(2) - (8)].intval), (yyvsp[(4) - (8)].intval), (yyvsp[(5) - (8)].strval), (yyvsp[(7) - (8)].strval));
                          free((yyvsp[(5) - (8)].strval)); free((yyvsp[(7) - (8)].strval)); ;}
    break;

  case 224:

/* Line 1455 of yacc.c  */
#line 796 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 225:

/* Line 1455 of yacc.c  */
#line 797 "pmysql.y"
    { (yyval.intval) = 1;;}
    break;

  case 226:

/* Line 1455 of yacc.c  */
#line 800 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 227:

/* Line 1455 of yacc.c  */
#line 801 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 228:

/* Line 1455 of yacc.c  */
#line 803 "pmysql.y"
    { emit("PRIKEY %d", (yyvsp[(4) - (5)].intval)); ;}
    break;

  case 229:

/* Line 1455 of yacc.c  */
#line 804 "pmysql.y"
    { emit("KEY %d", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 230:

/* Line 1455 of yacc.c  */
#line 805 "pmysql.y"
    { emit("KEY %d", (yyvsp[(3) - (4)].intval)); ;}
    break;

  case 231:

/* Line 1455 of yacc.c  */
#line 806 "pmysql.y"
    { emit("TEXTINDEX %d", (yyvsp[(4) - (5)].intval)); ;}
    break;

  case 232:

/* Line 1455 of yacc.c  */
#line 807 "pmysql.y"
    { emit("TEXTINDEX %d", (yyvsp[(4) - (5)].intval)); ;}
    break;

  case 233:

/* Line 1455 of yacc.c  */
#line 809 "pmysql.y"
    { emit("STARTCOL"); ;}
    break;

  case 234:

/* Line 1455 of yacc.c  */
#line 810 "pmysql.y"
    { emit("COLUMNDEF %d %s", (yyvsp[(3) - (4)].intval), (yyvsp[(2) - (4)].strval)); free((yyvsp[(2) - (4)].strval)); ;}
    break;

  case 235:

/* Line 1455 of yacc.c  */
#line 812 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 236:

/* Line 1455 of yacc.c  */
#line 813 "pmysql.y"
    { emit("ATTR NOTNULL"); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 238:

/* Line 1455 of yacc.c  */
#line 816 "pmysql.y"
    { emit("ATTR DEFAULT STRING %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 239:

/* Line 1455 of yacc.c  */
#line 818 "pmysql.y"
    { emit("ATTR DEFAULT NUMBER %d", (yyvsp[(3) - (3)].intval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 240:

/* Line 1455 of yacc.c  */
#line 820 "pmysql.y"
    { emit("ATTR DEFAULT FLOAT %g", (yyvsp[(3) - (3)].floatval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 241:

/* Line 1455 of yacc.c  */
#line 822 "pmysql.y"
    { emit("ATTR DEFAULT BOOL %d", (yyvsp[(3) - (3)].intval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 242:

/* Line 1455 of yacc.c  */
#line 824 "pmysql.y"
    { emit("ATTR AUTOINC"); (yyval.intval) = (yyvsp[(1) - (2)].intval) + 1; ;}
    break;

  case 243:

/* Line 1455 of yacc.c  */
#line 826 "pmysql.y"
    { emit("ATTR UNIQUEKEY %d", (yyvsp[(4) - (5)].intval)); (yyval.intval) = (yyvsp[(1) - (5)].intval) + 1; ;}
    break;

  case 244:

/* Line 1455 of yacc.c  */
#line 827 "pmysql.y"
    { emit("ATTR UNIQUEKEY"); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 245:

/* Line 1455 of yacc.c  */
#line 828 "pmysql.y"
    { emit("ATTR PRIKEY"); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 246:

/* Line 1455 of yacc.c  */
#line 829 "pmysql.y"
    { emit("ATTR PRIKEY"); (yyval.intval) = (yyvsp[(1) - (2)].intval) + 1; ;}
    break;

  case 247:

/* Line 1455 of yacc.c  */
#line 831 "pmysql.y"
    { emit("ATTR COMMENT %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 248:

/* Line 1455 of yacc.c  */
#line 833 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 249:

/* Line 1455 of yacc.c  */
#line 834 "pmysql.y"
    { (yyval.intval) = (yyvsp[(2) - (3)].intval); ;}
    break;

  case 250:

/* Line 1455 of yacc.c  */
#line 835 "pmysql.y"
    { (yyval.intval) = (yyvsp[(2) - (5)].intval) + 1000*(yyvsp[(4) - (5)].intval); ;}
    break;

  case 251:

/* Line 1455 of yacc.c  */
#line 838 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 252:

/* Line 1455 of yacc.c  */
#line 839 "pmysql.y"
    { (yyval.intval) = 4000; ;}
    break;

  case 253:

/* Line 1455 of yacc.c  */
#line 842 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 254:

/* Line 1455 of yacc.c  */
#line 843 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 1000; ;}
    break;

  case 255:

/* Line 1455 of yacc.c  */
#line 844 "pmysql.y"
    { (yyval.intval) = (yyvsp[(1) - (2)].intval) | 2000; ;}
    break;

  case 257:

/* Line 1455 of yacc.c  */
#line 848 "pmysql.y"
    { emit("COLCHARSET %s", (yyvsp[(4) - (4)].strval)); free((yyvsp[(4) - (4)].strval)); ;}
    break;

  case 258:

/* Line 1455 of yacc.c  */
#line 849 "pmysql.y"
    { emit("COLCOLLATE %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); ;}
    break;

  case 259:

/* Line 1455 of yacc.c  */
#line 853 "pmysql.y"
    { (yyval.intval) = 10000 + (yyvsp[(2) - (2)].intval); ;}
    break;

  case 260:

/* Line 1455 of yacc.c  */
#line 854 "pmysql.y"
    { (yyval.intval) = 10000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 261:

/* Line 1455 of yacc.c  */
#line 855 "pmysql.y"
    { (yyval.intval) = 20000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 262:

/* Line 1455 of yacc.c  */
#line 856 "pmysql.y"
    { (yyval.intval) = 30000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 263:

/* Line 1455 of yacc.c  */
#line 857 "pmysql.y"
    { (yyval.intval) = 40000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 264:

/* Line 1455 of yacc.c  */
#line 858 "pmysql.y"
    { (yyval.intval) = 50000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 265:

/* Line 1455 of yacc.c  */
#line 859 "pmysql.y"
    { (yyval.intval) = 60000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 266:

/* Line 1455 of yacc.c  */
#line 860 "pmysql.y"
    { (yyval.intval) = 70000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 267:

/* Line 1455 of yacc.c  */
#line 861 "pmysql.y"
    { (yyval.intval) = 80000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 268:

/* Line 1455 of yacc.c  */
#line 862 "pmysql.y"
    { (yyval.intval) = 90000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 269:

/* Line 1455 of yacc.c  */
#line 863 "pmysql.y"
    { (yyval.intval) = 110000 + (yyvsp[(2) - (3)].intval) + (yyvsp[(3) - (3)].intval); ;}
    break;

  case 270:

/* Line 1455 of yacc.c  */
#line 864 "pmysql.y"
    { (yyval.intval) = 100001; ;}
    break;

  case 271:

/* Line 1455 of yacc.c  */
#line 865 "pmysql.y"
    { (yyval.intval) = 100002; ;}
    break;

  case 272:

/* Line 1455 of yacc.c  */
#line 866 "pmysql.y"
    { (yyval.intval) = 100003; ;}
    break;

  case 273:

/* Line 1455 of yacc.c  */
#line 867 "pmysql.y"
    { (yyval.intval) = 100004; ;}
    break;

  case 274:

/* Line 1455 of yacc.c  */
#line 868 "pmysql.y"
    { (yyval.intval) = 100005; ;}
    break;

  case 275:

/* Line 1455 of yacc.c  */
#line 869 "pmysql.y"
    { (yyval.intval) = 120000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 276:

/* Line 1455 of yacc.c  */
#line 870 "pmysql.y"
    { (yyval.intval) = 130000 + (yyvsp[(3) - (5)].intval); ;}
    break;

  case 277:

/* Line 1455 of yacc.c  */
#line 871 "pmysql.y"
    { (yyval.intval) = 140000 + (yyvsp[(2) - (2)].intval); ;}
    break;

  case 278:

/* Line 1455 of yacc.c  */
#line 872 "pmysql.y"
    { (yyval.intval) = 150000 + (yyvsp[(3) - (4)].intval); ;}
    break;

  case 279:

/* Line 1455 of yacc.c  */
#line 873 "pmysql.y"
    { (yyval.intval) = 160001; ;}
    break;

  case 280:

/* Line 1455 of yacc.c  */
#line 874 "pmysql.y"
    { (yyval.intval) = 160002; ;}
    break;

  case 281:

/* Line 1455 of yacc.c  */
#line 875 "pmysql.y"
    { (yyval.intval) = 160003; ;}
    break;

  case 282:

/* Line 1455 of yacc.c  */
#line 876 "pmysql.y"
    { (yyval.intval) = 160004; ;}
    break;

  case 283:

/* Line 1455 of yacc.c  */
#line 877 "pmysql.y"
    { (yyval.intval) = 170000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 284:

/* Line 1455 of yacc.c  */
#line 878 "pmysql.y"
    { (yyval.intval) = 171000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 285:

/* Line 1455 of yacc.c  */
#line 879 "pmysql.y"
    { (yyval.intval) = 172000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 286:

/* Line 1455 of yacc.c  */
#line 880 "pmysql.y"
    { (yyval.intval) = 173000 + (yyvsp[(2) - (3)].intval); ;}
    break;

  case 287:

/* Line 1455 of yacc.c  */
#line 881 "pmysql.y"
    { (yyval.intval) = 200000 + (yyvsp[(3) - (5)].intval); ;}
    break;

  case 288:

/* Line 1455 of yacc.c  */
#line 882 "pmysql.y"
    { (yyval.intval) = 210000 + (yyvsp[(3) - (5)].intval); ;}
    break;

  case 289:

/* Line 1455 of yacc.c  */
#line 885 "pmysql.y"
    { emit("ENUMVAL %s", (yyvsp[(1) - (1)].strval)); free((yyvsp[(1) - (1)].strval)); (yyval.intval) = 1; ;}
    break;

  case 290:

/* Line 1455 of yacc.c  */
#line 886 "pmysql.y"
    { emit("ENUMVAL %s", (yyvsp[(3) - (3)].strval)); free((yyvsp[(3) - (3)].strval)); (yyval.intval) = (yyvsp[(1) - (3)].intval) + 1; ;}
    break;

  case 291:

/* Line 1455 of yacc.c  */
#line 888 "pmysql.y"
    { emit("CREATESELECT %d", (yyvsp[(1) - (3)].intval)) ;}
    break;

  case 292:

/* Line 1455 of yacc.c  */
#line 891 "pmysql.y"
    { (yyval.intval) = 0; ;}
    break;

  case 293:

/* Line 1455 of yacc.c  */
#line 892 "pmysql.y"
    { (yyval.intval) = 1; ;}
    break;

  case 294:

/* Line 1455 of yacc.c  */
#line 893 "pmysql.y"
    { (yyval.intval) = 2; ;}
    break;

  case 295:

/* Line 1455 of yacc.c  */
#line 897 "pmysql.y"
    { emit("STMT"); ;}
    break;

  case 299:

/* Line 1455 of yacc.c  */
#line 905 "pmysql.y"
    { if ((yyvsp[(2) - (3)].subtok) != 4) { yyerror("bad set to @%s", (yyvsp[(1) - (3)].strval)); YYERROR; }
                 emit("SET %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); ;}
    break;

  case 300:

/* Line 1455 of yacc.c  */
#line 907 "pmysql.y"
    { emit("SET %s", (yyvsp[(1) - (3)].strval)); free((yyvsp[(1) - (3)].strval)); ;}
    break;



/* Line 1455 of yacc.c  */
#line 4305 "pmysql.tab.c"
      default: break;
    }
  YY_SYMBOL_PRINT ("-> $$ =", yyr1[yyn], &yyval, &yyloc);

  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);

  *++yyvsp = yyval;

  /* Now `shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */

  yyn = yyr1[yyn];

  yystate = yypgoto[yyn - YYNTOKENS] + *yyssp;
  if (0 <= yystate && yystate <= YYLAST && yycheck[yystate] == *yyssp)
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - YYNTOKENS];

  goto yynewstate;


/*------------------------------------.
| yyerrlab -- here on detecting error |
`------------------------------------*/
yyerrlab:
  /* If not already recovering from an error, report this error.  */
  if (!yyerrstatus)
    {
      ++yynerrs;
#if ! YYERROR_VERBOSE
      yyerror (YY_("syntax error"));
#else
      {
	YYSIZE_T yysize = yysyntax_error (0, yystate, yychar);
	if (yymsg_alloc < yysize && yymsg_alloc < YYSTACK_ALLOC_MAXIMUM)
	  {
	    YYSIZE_T yyalloc = 2 * yysize;
	    if (! (yysize <= yyalloc && yyalloc <= YYSTACK_ALLOC_MAXIMUM))
	      yyalloc = YYSTACK_ALLOC_MAXIMUM;
	    if (yymsg != yymsgbuf)
	      YYSTACK_FREE (yymsg);
	    yymsg = (char *) YYSTACK_ALLOC (yyalloc);
	    if (yymsg)
	      yymsg_alloc = yyalloc;
	    else
	      {
		yymsg = yymsgbuf;
		yymsg_alloc = sizeof yymsgbuf;
	      }
	  }

	if (0 < yysize && yysize <= yymsg_alloc)
	  {
	    (void) yysyntax_error (yymsg, yystate, yychar);
	    yyerror (yymsg);
	  }
	else
	  {
	    yyerror (YY_("syntax error"));
	    if (yysize != 0)
	      goto yyexhaustedlab;
	  }
      }
#endif
    }



  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse lookahead token after an
	 error, discard it.  */

      if (yychar <= YYEOF)
	{
	  /* Return failure if at end of input.  */
	  if (yychar == YYEOF)
	    YYABORT;
	}
      else
	{
	  yydestruct ("Error: discarding",
		      yytoken, &yylval);
	  yychar = YYEMPTY;
	}
    }

  /* Else will try to reuse lookahead token after shifting the error
     token.  */
  goto yyerrlab1;


/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
yyerrorlab:

  /* Pacify compilers like GCC when the user code never invokes
     YYERROR and the label yyerrorlab therefore never appears in user
     code.  */
  if (/*CONSTCOND*/ 0)
     goto yyerrorlab;

  /* Do not reclaim the symbols of the rule which action triggered
     this YYERROR.  */
  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);
  yystate = *yyssp;
  goto yyerrlab1;


/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
yyerrlab1:
  yyerrstatus = 3;	/* Each real token shifted decrements this.  */

  for (;;)
    {
      yyn = yypact[yystate];
      if (yyn != YYPACT_NINF)
	{
	  yyn += YYTERROR;
	  if (0 <= yyn && yyn <= YYLAST && yycheck[yyn] == YYTERROR)
	    {
	      yyn = yytable[yyn];
	      if (0 < yyn)
		break;
	    }
	}

      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
	YYABORT;


      yydestruct ("Error: popping",
		  yystos[yystate], yyvsp);
      YYPOPSTACK (1);
      yystate = *yyssp;
      YY_STACK_PRINT (yyss, yyssp);
    }

  *++yyvsp = yylval;


  /* Shift the error token.  */
  YY_SYMBOL_PRINT ("Shifting", yystos[yyn], yyvsp, yylsp);

  yystate = yyn;
  goto yynewstate;


/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
yyacceptlab:
  yyresult = 0;
  goto yyreturn;

/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
yyabortlab:
  yyresult = 1;
  goto yyreturn;

#if !defined(yyoverflow) || YYERROR_VERBOSE
/*-------------------------------------------------.
| yyexhaustedlab -- memory exhaustion comes here.  |
`-------------------------------------------------*/
yyexhaustedlab:
  yyerror (YY_("memory exhausted"));
  yyresult = 2;
  /* Fall through.  */
#endif

yyreturn:
  if (yychar != YYEMPTY)
     yydestruct ("Cleanup: discarding lookahead",
		 yytoken, &yylval);
  /* Do not reclaim the symbols of the rule which action triggered
     this YYABORT or YYACCEPT.  */
  YYPOPSTACK (yylen);
  YY_STACK_PRINT (yyss, yyssp);
  while (yyssp != yyss)
    {
      yydestruct ("Cleanup: popping",
		  yystos[*yyssp], yyvsp);
      YYPOPSTACK (1);
    }
#ifndef yyoverflow
  if (yyss != yyssa)
    YYSTACK_FREE (yyss);
#endif
#if YYERROR_VERBOSE
  if (yymsg != yymsgbuf)
    YYSTACK_FREE (yymsg);
#endif
  /* Make sure YYID is used.  */
  return YYID (yyresult);
}



/* Line 1675 of yacc.c  */
#line 909 "pmysql.y"

void
emit(const char *s, ...)
{
  //extern yylineno;

  va_list ap;
  va_start(ap, s);

  printf("rpn: ");
  vfprintf(stdout, s, ap);
  printf("\n");
}

void
yyerror(const char *s, ...)
{
  //extern yylineno;

  va_list ap;
  va_start(ap, s);

  fprintf(stderr, "%d: error: ", yylineno);
  vfprintf(stderr, s, ap);
  fprintf(stderr, "\n");
}

main(int ac, char **av)
{
  extern FILE *yyin;

  if(ac > 1 && !strcmp(av[1], "-d")) {
    yydebug = 1; ac--; av++;
  }

  if(ac > 1 && (yyin = fopen(av[1], "r")) == NULL) {
    perror(av[1]);
    exit(1);
  }

  if(!yyparse())
    printf("SQL parse worked\n");
  else
    printf("SQL parse failed\n");
} /* main */
