package id.andtree.req.database.migration

import androidx.sqlite.db.SupportSQLiteDatabase
import id.andtree.req.EnqueueAction
import id.andtree.req.database.DownloadDatabase

class MigrationTwoToThree : Migration(2, 3) {

    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE '${DownloadDatabase.TABLE_NAME}' "
                + "ADD COLUMN '${DownloadDatabase.COLUMN_ENQUEUE_ACTION}' INTEGER NOT NULL DEFAULT ${EnqueueAction.REPLACE_EXISTING.value}")
    }

}