@file:JvmName("FetchIntent")

package id.andtree.req

const val ACTION_QUEUE_BACKOFF_RESET = "id.andtree.req.action.QUEUE_BACKOFF_RESET"

const val ACTION_TYPE_INVALID = -1
const val ACTION_TYPE_PAUSE = 0
const val ACTION_TYPE_RESUME = 1
const val ACTION_TYPE_DELETE = 2
const val ACTION_TYPE_CANCEL = 4
const val ACTION_TYPE_RETRY = 5
const val ACTION_TYPE_PAUSE_ALL = 6
const val ACTION_TYPE_RESUME_ALL = 7
const val ACTION_TYPE_CANCEL_ALL = 8
const val ACTION_TYPE_DELETE_ALL = 9
const val ACTION_TYPE_RETRY_ALL = 10

const val DOWNLOAD_ID_INVALID = -1
const val NOTIFICATION_GROUP_ID_INVALID = -1
const val NOTIFICATION_ID_INVALID = -1

const val EXTRA_NAMESPACE = "id.andtree.req.extra.NAMESPACE"
const val EXTRA_DOWNLOAD_ID = "id.andtree.req.extra.DOWNLOAD_ID"
const val EXTRA_DOWNLOAD_NOTIFICATIONS = "con.tonyodev.req.extra.DOWNLOAD_NOTIFICATIONS"
const val EXTRA_NOTIFICATION_ID = "id.andtree.req.extra.NOTIFICATION_ID"
const val EXTRA_NOTIFICATION_GROUP_ID = "id.andtree.req.extra.NOTIFICATION_GROUP_ID"
const val EXTRA_ACTION_TYPE = "id.andtree.req.extra.ACTION_TYPE"
const val EXTRA_GROUP_ACTION = "id.andtree.req.extra.GROUP_ACTION"
