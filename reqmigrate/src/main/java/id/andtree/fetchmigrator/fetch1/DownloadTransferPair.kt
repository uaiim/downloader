package id.andtree.reqmigrate.fetch1

import id.andtree.req.Download

data class DownloadTransferPair(val newDownload: Download, val oldID: Long)