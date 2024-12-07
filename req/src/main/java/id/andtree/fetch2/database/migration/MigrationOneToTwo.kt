package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.database.DownloadDatabase


class MigrationOneToTwo: Migration(1, 2) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_TAG}' TEXT NULL DEFAULT NULL")
    }

}