package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.database.DownloadDatabase
import id.andtree.req.util.DEFAULT_AUTO_RETRY_ATTEMPTS

class MigrationSixToSeven : Migration(6, 7) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_AUTO_RETRY_MAX_ATTEMPTS}' INTEGER NOT NULL DEFAULT '$DEFAULT_AUTO_RETRY_ATTEMPTS'")
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_AUTO_RETRY_ATTEMPTS}' INTEGER NOT NULL DEFAULT '$DEFAULT_AUTO_RETRY_ATTEMPTS'")
    }

}