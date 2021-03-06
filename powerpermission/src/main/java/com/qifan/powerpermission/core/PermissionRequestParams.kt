package com.qifan.powerpermission.core

import com.qifan.powerpermission.Permission
import com.qifan.powerpermission.PermissionCallback
import com.qifan.powerpermission.RequestCode
import com.qifan.powerpermission.rationale.delegate.RationaleDelegate

/**
 * Default Permission request code
 */
const val PERMISSION_REQUEST_CODE = 1

internal typealias CleanCallback = () -> Unit

internal data class PermissionParams(
    val permissions: List<Permission>,
    val requestCode: RequestCode,
    val callback: PermissionCallback,
    val rationaleDelegate: RationaleDelegate?,
    val cleanCallback: CleanCallback
)
