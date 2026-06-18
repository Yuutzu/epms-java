# EPMS — Employee's Payroll Management System

A Java Swing desktop payroll management application built for a restaurant called Bite Delight. Developed features allowing admins to register employees, record deductions and overtime, compute bonuses, search records, and generate PDF payslips for streamlined payroll processing.

The app uses an **embedded SQLite database** (`epms.db`), created automatically
on first launch — there is no database server to install or configure.

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Build](https://img.shields.io/badge/build-Maven-blue)
![DB](https://img.shields.io/badge/database-SQLite-green)

---

## Features

| Screen | What it does |
| --- | --- |
| **Login** | Admin authentication (default `admin` / `1234`). |
| **Add Employee** | Register, update, delete and list employees in the database. |
| **Deduction** | Record money lost, machinery/equipment damage, tardiness, SSS and PhilHealth, with running totals. |
| **Overtime** | Compute regular-day and holiday/rest-day overtime pay and persist totals. |
| **Bonus** | Search an employee, compute a yearly bonus from years of service, and save it. |
| **Payment** | Look up an employee by ID and generate a PDF payslip. |
| **Search** | Live search/list of all employee records. |

---

## Requirements

- **JDK 17 or newer** (developed against JDK 26). That's the only hard
  requirement — Maven is fetched automatically by the wrapper.

## Run it

### Option A — double-click (Windows)

Just run **`run-epms.cmd`**. The first run builds the app (downloads Maven and
dependencies), then launches it. Subsequent runs start instantly.

### Option B — Maven wrapper (any OS, JDK only)

```bash
# Windows
mvnw.cmd clean package
java -jar target/EPMS.jar

# macOS / Linux
./mvnw clean package
java -jar target/EPMS.jar
```

### Option C — installed Maven / IDE

If you already have Maven, or open the project in an IDE with Maven support
(e.g. VS Code "Extension Pack for Java", IntelliJ, Eclipse):

```bash
mvn clean package        # build the runnable jar
mvn exec:java            # or run directly without packaging
```

The build produces a single self-contained jar at **`target/EPMS.jar`**
(dependencies bundled via the Maven Shade plugin).

---

## Default login

```
Username: admin
Password: 1234
```

## Project structure

```
epms-java/
├── pom.xml                     # Maven build (SQLite + iText, shade plugin)
├── mvnw / mvnw.cmd             # Maven wrapper (no Maven install needed)
├── run-epms.cmd                # Double-click launcher (Windows)
├── src/main/java/EPMS_Package/
│   ├── Conn_DB.java            # SQLite connection + auto schema creation
│   ├── LoginAdmin_JFrame.java  # entry point (main)
│   ├── MenuAdmin_JFrame.java   # admin menu / navigation
│   ├── AddEmployee_JFrame.java
│   ├── DeductionClass.java
│   ├── OvertimeClass.java
│   ├── Bonus_JFrame.java
│   ├── Payment_JFrame.java     # PDF payslip (iText)
│   └── Search_JFrame.java
└── README.md
```

## Tech stack

- **Java Swing** — desktop UI
- **JDBC + SQLite** (`org.xerial:sqlite-jdbc`) — embedded persistence
- **iText 5** (`com.itextpdf:itextpdf`) — PDF payslip generation
- **Maven** — build & dependency management

## Notes

- The database file `epms.db` is created in the working directory on first run
  and is intentionally git-ignored.
- This started as a student project and was completed/modernized: the broken
  MySQL connection layer was replaced with embedded SQLite, SQL was
  parameterized, dead buttons were wired up, and several data-handling bugs
  were fixed.
