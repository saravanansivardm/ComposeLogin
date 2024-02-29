package com.example.compose_auth.screens.dashboard

import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.compose_auth.R
import com.example.compose_auth.common.customComposableViews.TitleText


@Composable
fun DashboardScreen() {
    val context = LocalContext.current
    var version = ""
    var versionCode = ""
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        try {
            val pInfo: PackageInfo =
                context.packageManager.getPackageInfo(context.packageName, 0)
            version = pInfo.versionName
            versionCode = pInfo.versionCode.toString()
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        TitleText(text = stringResource(id = R.string.dashboard_title_welcome_user))
        TitleText(text = "Version Name :${version}")
        TitleText(text = "Version Code :${versionCode}")
    }
}