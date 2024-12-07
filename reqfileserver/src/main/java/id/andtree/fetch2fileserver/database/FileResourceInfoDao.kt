package id.andtree.reqfileserver.database

import androidx.room.*
import id.andtree.reqfileserver.database.FileResourceInfoDatabase.Companion.COLUMN_ID
import id.andtree.reqfileserver.database.FileResourceInfoDatabase.Companion.COLUMN_NAME
import id.andtree.reqfileserver.database.FileResourceInfoDatabase.Companion.TABLE_NAME

@Dao
interface FileResourceInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(fileResourceInfo: FileResourceInfo): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(fileResourceInfoList: List<FileResourceInfo>): List<Long>

    @Delete
    fun delete(fileResourceInfo: FileResourceInfo)

    @Delete
    fun delete(fileResourceInfoList: List<FileResourceInfo>)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteAll()

    @Query("SELECT * FROM $TABLE_NAME")
    fun get(): List<FileResourceInfo>

    @Query("SELECT * FROM $TABLE_NAME WHERE $COLUMN_ID = :id")
    fun get(id: Long): FileResourceInfo?

    @Query("SELECT * FROM $TABLE_NAME WHERE $COLUMN_NAME = :fileName LIMIT 1")
    fun get(fileName: String): FileResourceInfo?

    @Query("SELECT * FROM $TABLE_NAME WHERE $COLUMN_ID IN (:ids)")
    fun get(ids: List<Long>): List<FileResourceInfo>

    @Query("SELECT * FROM $TABLE_NAME LIMIT :count OFFSET :offset")
    fun getPage(count: Int, offset: Int): List<FileResourceInfo>

}