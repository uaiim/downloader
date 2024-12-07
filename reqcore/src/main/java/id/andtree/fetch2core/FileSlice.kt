package id.andtree.reqcore

data class FileSlice(val id: Int = 0,
                     val position: Int = 0,
                     val startBytes: Long = 0L,
                     val endBytes: Long = 0L,
                     var downloaded: Long = 0L) {

    val isDownloaded: Boolean
        get() {
            return startBytes + downloaded == endBytes
        }
}