package id.andtree.fetch2.helper

import id.andtree.fetch2.database.DownloadInfo
import id.andtree.fetch2.database.FetchDatabaseManagerWrapper


class DownloadInfoUpdater(private val fetchDatabaseManagerWrapper: FetchDatabaseManagerWrapper) {

    fun updateFileBytesInfoAndStatusOnly(downloadInfo: DownloadInfo) {
        fetchDatabaseManagerWrapper.updateFileBytesInfoAndStatusOnly(downloadInfo)
    }

    fun update(downloadInfo: DownloadInfo) {
        fetchDatabaseManagerWrapper.update(downloadInfo)
    }

    fun getNewDownloadInfoInstance(): DownloadInfo {
        return fetchDatabaseManagerWrapper.getNewDownloadInfoInstance()
    }

}