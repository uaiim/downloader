package id.andtree.req.downloader

import id.andtree.req.Download
import id.andtree.req.Error
import id.andtree.req.database.DownloadInfo
import id.andtree.reqcore.DownloadBlock

interface FileDownloader : Runnable {

    var interrupted: Boolean
    var terminated: Boolean
    val completedDownload: Boolean
    var delegate: Delegate?
    val download: Download

    interface Delegate {

        val interrupted: Boolean

        fun onStarted(download: Download, downloadBlocks: List<DownloadBlock>, totalBlocks: Int)

        fun onDownloadBlockUpdated(download: Download, downloadBlock: DownloadBlock, totalBlocks: Int)

        fun onProgress(download: Download, etaInMilliSeconds: Long, downloadedBytesPerSecond: Long)

        fun onError(download: Download, error: Error, throwable: Throwable?)

        fun onComplete(download: Download)

        fun saveDownloadProgress(download: Download)

        fun getNewDownloadInfoInstance(): DownloadInfo

    }

}