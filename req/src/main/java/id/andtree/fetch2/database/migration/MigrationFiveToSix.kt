package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.database.DownloadDatabase
import id.andtree.req.util.EMPTY_JSON_OBJECT_STRING

class MigrationFiveToSix : Migration(5, 6) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_EXTRAS}' TEXT NOT NULL DEFAULT '$EMPTY_JSON_OBJECT_STRING'")
    }

}