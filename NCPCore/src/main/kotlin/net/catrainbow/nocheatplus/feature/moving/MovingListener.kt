/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in thCut even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.catrainbow.nocheatplus.feature.moving

import cn.nukkit.event.Event
import net.catrainbow.nocheatplus.NoCheatPlus
import net.catrainbow.nocheatplus.feature.ITickListener
import net.catrainbow.nocheatplus.feature.wrapper.WrapperInputPacket
import net.catrainbow.nocheatplus.feature.wrapper.WrapperPacketEvent

/**
 * 移动监听器
 *
 * @author Catrainbow
 */
class MovingListener : ITickListener {

    override fun onTick(event: Event) {
        if (event is WrapperPacketEvent) this.verifyInputPacket(event)
    }

    private fun verifyInputPacket(event: WrapperPacketEvent) {
        val player = event.player
        val data = NoCheatPlus.instance.getPlayerProvider(player)
        if (event.packet is WrapperInputPacket) data.update(event.packet as WrapperInputPacket)
    }

    override fun onEnabled() {

    }

    override fun onDisabled() {
    }
}