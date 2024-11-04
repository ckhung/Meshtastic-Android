package com.geeksville.mesh.ui.map

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.geeksville.mesh.R
import com.geeksville.mesh.ui.theme.AppTheme

@Composable
fun MapButton(
    icon: ImageVector,
    @StringRes contentDescription: Int,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit = {}
) {
    MapButton(
        icon = icon,
        contentDescription = stringResource(contentDescription),
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
    )
}

@Composable
fun MapButton(
    icon: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.size(48.dp),
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.surface.copy(alpha = 1f),
            contentColor = MaterialTheme.colors.onSurface,
        ),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.scale(scale = 1.5f),
        )
    }
}

@PreviewLightDark
@Composable
private fun MapButtonPreview() {
    AppTheme {
        MapButton(
            icon = Icons.Outlined.Layers,
            contentDescription = R.string.map_style_selection,
        )
    }
}
