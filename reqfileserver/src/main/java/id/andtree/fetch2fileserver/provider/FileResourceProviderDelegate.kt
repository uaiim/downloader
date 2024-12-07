package id.andtree.reqfileserver.provider

import id.andtree.reqcore.Extras
import id.andtree.reqcore.FileResource
import id.andtree.reqcore.InputResourceWrapper
import id.andtree.reqcore.server.FileRequest
import id.andtree.reqcore.InterruptMonitor
import id.andtree.reqfileserver.database.FileResourceInfo
import id.andtree.reqcore.server.FileResourceTransporterWriter
import java.util.*

interface FileResourceProviderDelegate {

    fun getFileResource(fileResourceIdentifier: String): FileResource?

    fun onFinished(providerId: String)

    fun acceptAuthorization(sessionId: String, authorization: String, fileRequest: FileRequest): Boolean

    fun onClientDidProvideExtras(sessionId: String, extras: Extras, fileRequest: FileRequest)

    fun onClientConnected(sessionId: String, fileRequest: FileRequest)

    fun onClientDisconnected(sessionId: String, fileRequest: FileRequest)

    fun onStarted(sessionId: String, fileRequest: FileRequest, fileResource: FileResource)

    fun onProgress(sessionId: String, fileRequest: FileRequest, fileResource: FileResource, progress: Int)

    fun onComplete(sessionId: String, fileRequest: FileRequest, fileResource: FileResource)

    fun onError(sessionId: String, fileRequest: FileRequest, fileResource: FileResource, throwable: Throwable)

    fun getCatalog(page: Int, size: Int): String

    fun getFileInputResourceWrapper(sessionId: String, fileRequest: FileRequest, fileResource: FileResource, fileOffset: Long): InputResourceWrapper?

    fun onCustomRequest(sessionId: String, fileRequest: FileRequest, fileResourceTransporterWriter: FileResourceTransporterWriter, interruptMonitor: InterruptMonitor)

}