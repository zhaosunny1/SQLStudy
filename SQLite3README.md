### SQLITE3 基本命令学习

## 安装所需链接

1. SQLite3下载链接：[SQLite3](http://www.sqlite.org/download.html)
2. Java数据库连接：[sqlite-jdbc](https://github.com/xerial/sqlite-jdbc)
   或者使用如下配置
   
```groovy
implementation 'org.xerial:sqlite-jdbc:3.34.0'
```

### DDL 数据定义语言

#### DQL 数据查询语言

### SQLite 语句

> 所有的 SQLite 语句可以以任何关键字开始，如 SELECT、INSERT、UPDATE、DELETE、ALTER、DROP 等，所有的语句以分号（;）结束。

#### SQLite ANALYZE 语句：

> ANALYZE; or ANALYZE database_name; or ANALYZE database_name.table_name;

#### SQLite AND/OR 子句：

SELECT column1, column2....columnN FROM table_name WHERE CONDITION-1 {AND|OR} CONDITION-2;

#### SQLite ALTER TABLE 语句：

ALTER TABLE table_name ADD COLUMN column_def...;

#### SQLite ALTER TABLE 语句（Rename）：

ALTER TABLE table_name RENAME TO new_table_name;

#### SQLite ATTACH DATABASE 语句：

ATTACH DATABASE 'DatabaseName' As 'Alias-Name'; SQLite BEGIN TRANSACTION 语句： BEGIN; or BEGIN EXCLUSIVE TRANSACTION;

#### SQLite BETWEEN 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name BETWEEN val-1 AND val-2;

#### SQLite COMMIT 语句：

COMMIT;

#### SQLite CREATE INDEX 语句：

CREATE INDEX index_name ON table_name ( column_name COLLATE NOCASE );

#### SQLite CREATE UNIQUE INDEX 语句：

CREATE UNIQUE INDEX index_name ON table_name ( column1, column2,...columnN);

#### SQLite CREATE TABLE 语句：

CREATE TABLE table_name(
column1 datatype, column2 datatype, column3 datatype, ..... columnN datatype, PRIMARY KEY( one or more columns )
);

#### SQLite CREATE TRIGGER 语句：

CREATE TRIGGER database_name.trigger_name BEFORE INSERT ON table_name FOR EACH ROW BEGIN stmt1; stmt2; .... END;

#### SQLite CREATE VIEW 语句：

CREATE VIEW database_name.view_name AS SELECT statement....;

#### SQLite CREATE VIRTUAL TABLE 语句：

CREATE VIRTUAL TABLE database_name.table_name USING weblog( access.log ); or CREATE VIRTUAL TABLE
database_name.table_name USING fts3( );

#### SQLite COMMIT TRANSACTION 语句：

COMMIT;

#### SQLite COUNT 子句：

SELECT COUNT(column_name)
FROM table_name WHERE CONDITION;

#### SQLite DELETE 语句：

DELETE FROM table_name WHERE {CONDITION};

#### SQLite DETACH DATABASE 语句：

DETACH DATABASE 'Alias-Name';

#### SQLite DISTINCT 子句：

SELECT DISTINCT column1, column2....columnN FROM table_name;

#### SQLite DROP INDEX 语句：

DROP INDEX database_name.index_name;

#### SQLite DROP TABLE 语句：

DROP TABLE database_name.table_name;

#### SQLite DROP VIEW 语句：

DROP VIEW view_name;

#### SQLite DROP TRIGGER 语句：

DROP TRIGGER trigger_name

#### SQLite EXISTS 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name EXISTS (SELECT * FROM table_name );

#### SQLite EXPLAIN 语句：

EXPLAIN INSERT statement...; or EXPLAIN QUERY PLAN SELECT statement...;

#### SQLite GLOB 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name GLOB { PATTERN };

#### SQLite GROUP BY 子句：

SELECT SUM(column_name)
FROM table_name WHERE CONDITION GROUP BY column_name;

#### SQLite HAVING 子句：

SELECT SUM(column_name)
FROM table_name WHERE CONDITION GROUP BY column_name HAVING (arithematic function condition);

#### SQLite INSERT INTO 语句：

INSERT INTO table_name( column1, column2....columnN)
VALUES ( value1, value2....valueN);

#### SQLite IN 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name IN (val-1, val-2,...val-N);

#### SQLite Like 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name LIKE { PATTERN };

#### SQLite NOT IN 子句：

SELECT column1, column2....columnN FROM table_name WHERE column_name NOT IN (val-1, val-2,...val-N);

#### SQLite ORDER BY 子句：

SELECT column1, column2....columnN FROM table_name WHERE CONDITION ORDER BY column_name {ASC|DESC};

#### SQLite PRAGMA 语句：

PRAGMA pragma_name;

For example:

PRAGMA page_size; PRAGMA cache_size = 1024; PRAGMA table_info(table_name); SQLite RELEASE SAVEPOINT 语句： RELEASE
savepoint_name;

#### SQLite REINDEX 语句：

REINDEX collation_name; REINDEX database_name.index_name; REINDEX database_name.table_name;

#### SQLite ROLLBACK 语句：

ROLLBACK; or ROLLBACK TO SAVEPOINT savepoint_name;

#### SQLite SAVEPOINT 语句：

SAVEPOINT savepoint_name;

#### SQLite SELECT 语句：

SELECT column1, column2....columnN FROM table_name;

#### SQLite UPDATE 语句：

UPDATE table_name SET column1 = value1, column2 = value2....columnN=valueN
[ WHERE  CONDITION ];

#### SQLite VACUUM 语句：

VACUUM;

#### SQLite WHERE 子句：

SELECT column1, column2....columnN FROM table_name WHERE CONDITION;