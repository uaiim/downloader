package id.andtree.req.util

import id.andtree.reqcore.FetchObserver

class ActiveDownloadInfo(val fetchObserver: FetchObserver<Boolean>,
                         val includeAddedDownloads: Boolean) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as ActiveDownloadInfo
        return fetchObserver == other.fetchObserver
    }

    override fun hashCode(): Int {
        return fetchObserver.hashCode()
    }

    override fun toString(): String {
        return "ActiveDownloadInfo(fetchObserver=$fetchObserver, includeAddedDownloads=$includeAddedDownloads)"
    }

}