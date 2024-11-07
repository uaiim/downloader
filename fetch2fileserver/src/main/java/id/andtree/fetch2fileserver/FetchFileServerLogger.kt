package id.andtree.fetch2fileserver

import id.andtree.fetch2core.FetchLogger


/** Fetch File Server Default Logger*/
open class FetchFileServerLogger(enableLogging: Boolean = true,
                                 tag: String = "FetchFileServerLogger") : FetchLogger(enableLogging, tag)