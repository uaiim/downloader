package id.andtree.req.database.migration

import androidx.room.migration.Migration


abstract class Migration constructor(startVersion: Int, endVersion: Int)
    : Migration(startVersion, endVersion)