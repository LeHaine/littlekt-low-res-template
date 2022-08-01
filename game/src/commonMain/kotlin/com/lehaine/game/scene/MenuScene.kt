package com.lehaine.game.scene

import com.lehaine.game.Assets
import com.lehaine.game.Config
import com.lehaine.littlekt.Context
import com.lehaine.littlekt.graph.node.Node
import com.lehaine.littlekt.graph.node.component.HAlign
import com.lehaine.littlekt.graph.node.component.InputEvent
import com.lehaine.littlekt.graph.node.ui.centerContainer
import com.lehaine.littlekt.graph.node.ui.label
import com.lehaine.littlekt.graph.node.viewport
import com.lehaine.littlekt.util.viewport.FitViewport
import com.lehaine.rune.engine.RuneScene


class MenuScene(
    context: Context
) : RuneScene(context) {

    override suspend fun Node.initialize() {
        viewport {
            viewport = FitViewport(Config.VIRTUAL_WIDTH, Config.VIRTUAL_HEIGHT)
            viewport.apply(this@MenuScene.context, true)

            centerContainer {
                anchorRight = 1f
                anchorBottom = 1f
                label {
                    text = "PRESS\nTO\nSTART"
                    font = Assets.pixelFont
                    horizontalAlign = HAlign.CENTER

                    var startingGame = false
                    onInput += {
                        if (it.type == InputEvent.Type.TOUCH_DOWN) {
                            if (!startingGame) {
                                startingGame = true
                                changeTo(GameScene(context))
                            }
                        }
                    }
                }
            }
        }
    }
}