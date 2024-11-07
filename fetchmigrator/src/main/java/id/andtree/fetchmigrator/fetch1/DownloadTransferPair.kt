package id.andtree.fetchmigrator.fetch1

import id.andtree.fetch2.Download

data class DownloadTransferPair(val newDownload: Download, val oldID: Long)