package id.andtree.reqfileserver.provider

import id.andtree.reqcore.FileResource

interface FileResourceProvider {

    val id: String

    fun execute()

    fun interrupt()

    fun isServingFileResource(fileResource: FileResource): Boolean

}