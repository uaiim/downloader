package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.database.DownloadDatabase

class MigrationFourToFive : Migration(4, 5) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_DOWNLOAD_ON_ENQUEUE}' INTEGER NOT NULL DEFAULT 1")
    }

}