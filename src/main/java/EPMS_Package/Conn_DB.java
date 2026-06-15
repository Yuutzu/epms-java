package EPMS_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Central database access for EPMS.
 *
 * The app uses an embedded SQLite database stored in a single file
 * ({@code epms.db}) in the working directory. This means the program can be
 * handed to an end user and run with no database server to install or
 * configure -- the schema is created automatically on first launch.
 *
 * All screens obtain their connection from {@link #connect()} instead of
 * hard-coding a JDBC URL.
 */
public class Conn_DB {

    /** JDBC URL of the embedded database file (created on first use). */
    private static final String URL = "jdbc:sqlite:epms.db";

    static {
        // Make sure the schema exists as soon as the class is loaded.
        try {
            initSchema();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** @return a live connection to the embedded SQLite database. */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    /**
     * Creates the {@code addemployee} table (and any future tables) if they do
     * not already exist. Safe to call repeatedly.
     */
    public static void initSchema() throws SQLException {
        String createEmployee =
            "CREATE TABLE IF NOT EXISTS addemployee (" +
            "  id                       INTEGER PRIMARY KEY," +
            "  first_name               TEXT," +
            "  middle_name              TEXT," +
            "  last_name                TEXT," +
            "  gender_combo             TEXT," +
            "  cstatus_combo            TEXT," +
            "  month_combo              TEXT," +
            "  day_combo                TEXT," +
            "  year_combo               TEXT," +
            "  age                      INTEGER," +
            "  street_address           TEXT," +
            "  countries_combo          TEXT," +
            "  state                    TEXT," +
            "  city                     TEXT," +
            "  zip                      INTEGER," +
            "  email                    TEXT," +
            "  contact                  TEXT," +
            "  date_hired               TEXT," +
            "  job_title                TEXT," +
            "  rate                     TEXT," +
            "  branch                   TEXT," +
            // ---- Deduction fields ----
            "  money_lost               REAL DEFAULT 0," +
            "  currentmoney_lost        REAL DEFAULT 0," +
            "  machinery_damage         REAL DEFAULT 0," +
            "  currentmachinery_damage  REAL DEFAULT 0," +
            "  equipment_lost           REAL DEFAULT 0," +
            "  currentequipment_lost    REAL DEFAULT 0," +
            "  tardiness                REAL DEFAULT 0," +
            "  currenttardiness         REAL DEFAULT 0," +
            "  sss                      REAL DEFAULT 0," +
            "  currentsss               REAL DEFAULT 0," +
            "  philhealth               REAL DEFAULT 0," +
            "  currentphilhealth        REAL DEFAULT 0," +
            "  totaldeduct              REAL DEFAULT 0," +
            // ---- Overtime fields ----
            "  regularOT                REAL DEFAULT 0," +
            "  currentregularOT         REAL DEFAULT 0," +
            "  holidayOT                REAL DEFAULT 0," +
            "  currentholidayOT         REAL DEFAULT 0," +
            "  totalOT                  REAL DEFAULT 0," +
            // ---- Bonus / payroll ----
            "  years_of_service         INTEGER DEFAULT 0," +
            "  total_salary             REAL DEFAULT 0" +
            ")";

        try (Connection con = DriverManager.getConnection(URL);
             Statement st = con.createStatement()) {
            st.executeUpdate(createEmployee);
        }
    }
}
