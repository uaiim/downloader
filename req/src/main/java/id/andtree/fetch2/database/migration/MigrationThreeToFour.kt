package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.database.DownloadDatabase
import id.andtree.req.util.DEFAULT_UNIQUE_IDENTIFIER

class MigrationThreeToFour : Migration(3, 4) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_IDENTIFIER}' INTEGER NOT NULL DEFAULT $DEFAULT_UNIQUE_IDENTIFIER")
    }

}