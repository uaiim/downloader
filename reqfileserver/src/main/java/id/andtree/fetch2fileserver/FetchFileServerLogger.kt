package id.andtree.reqfileserver

import id.andtree.reqcore.FetchLogger


/** Fetch File Server Default Logger*/
open class FetchFileServerLogger(enableLogging: Boolean = true,
                                 tag: String = "FetchFileServerLogger") : FetchLogger(enableLogging, tag)