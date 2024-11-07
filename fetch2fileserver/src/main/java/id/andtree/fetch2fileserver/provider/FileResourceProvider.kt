package id.andtree.fetch2fileserver.provider

import id.andtree.fetch2core.FileResource

interface FileResourceProvider {

    val id: String

    fun execute()

    fun interrupt()

    fun isServingFileResource(fileResource: FileResource): Boolean

}